package com.apxor.androidsdk.plugins.survey;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.EventListener;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.ce.ConfigurationListener;
import com.apxor.androidsdk.core.ce.ContextEvaluator;
import com.apxor.androidsdk.core.datahandler.databases.ApxorBaseSQLiteWrapper;
import com.apxor.androidsdk.core.models.BaseApxorEvent;
import com.apxor.androidsdk.core.pluginmanager.ApxorPlugin;
import com.apxor.androidsdk.core.utils.Logger;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class SurveyPlugin extends ApxorPlugin implements EventListener {
    private static final String h = "SurveyPlugin";
    private long a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f372b;
    private boolean c;
    private Runnable d;
    private String e;
    private String f;
    private ConfigurationListener g = new a();

    /* loaded from: classes6.dex */
    class a implements ConfigurationListener {
        a() {
        }

        @Override // com.apxor.androidsdk.core.ce.ConfigurationListener
        public void applyConfig(JSONObject jSONObject) {
            SurveyPlugin.this.a(jSONObject);
        }

        @Override // com.apxor.androidsdk.core.ce.ConfigurationListener
        public String getActionType() {
            return "survey";
        }
    }

    /* loaded from: classes6.dex */
    class b implements Runnable {
        final /* synthetic */ SDKController a;

        b(SDKController sDKController) {
            this.a = sDKController;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.e(SurveyPlugin.h, "Fetching...");
            SurveyPlugin.this.b();
            SurveyPlugin surveyPlugin = SurveyPlugin.this;
            surveyPlugin.c = surveyPlugin.f372b;
            if (SurveyPlugin.this.f372b) {
                this.a.dispatchToBackgroundThread(this, SurveyPlugin.this.a * 1000);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        com.apxor.androidsdk.plugins.survey.b.b().a(jSONObject);
        ContextEvaluator.getInstance().parseConfiguration(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ContextEvaluator.getInstance().getConfigFromServer(this.e, this.f, this.g);
    }

    @Override // com.apxor.androidsdk.core.pluginmanager.ApxorPlugin
    public ArrayList<Pair<String, ? extends ApxorBaseSQLiteWrapper>> getPluginDatabasesFrom(Context context, String str) {
        return null;
    }

    @Override // com.apxor.androidsdk.core.pluginmanager.ApxorPlugin
    public boolean initialize(Context context, JSONObject jSONObject) {
        if (Build.VERSION.SDK_INT < 21) {
            Logger.e(h, "minSdkVersion supported for surveys is >= 21");
            return false;
        }
        SDKController sDKController = SDKController.getInstance();
        if (sDKController.isNetworkAvailable() && jSONObject.optBoolean("real_time_actions_enabled")) {
            String servicePathFor = sDKController.getServicePathFor("v_survey_url");
            this.e = servicePathFor;
            this.e = servicePathFor.equals(Constants.SERVER_URL) ? "/v2/sync/<app-id>/configs/validate?platform=android&userId=<user-id>&actionType=survey&version=136" : this.e.substring(25);
            String servicePathFor2 = sDKController.getServicePathFor("s_survey_url");
            this.f = servicePathFor2;
            this.f = servicePathFor2.equals(Constants.SERVER_URL) ? "/v2/sync/<app-id>/surveys?platform=android&userId=<user-id>&version=136" : this.f.substring(25);
            this.a = jSONObject.optLong("config_fetch_interval", -1L);
            start(context);
            com.apxor.androidsdk.plugins.survey.b.b().a(context, 136);
            ContextEvaluator.getInstance().initialize(context, this.g, jSONObject);
            if (this.a != -1) {
                b bVar = new b(sDKController);
                this.d = bVar;
                sDKController.dispatchToBackgroundThread(bVar, this.a * 1000);
            }
            Logger.debug(h, "Surveys Plugin version 136 initialized");
            return true;
        }
        return false;
    }

    @Override // com.apxor.androidsdk.core.EventListener
    public void onEvent(BaseApxorEvent baseApxorEvent) {
        char c;
        String eventType = baseApxorEvent.getEventType();
        eventType.hashCode();
        int hashCode = eventType.hashCode();
        if (hashCode == -1837720742) {
            if (eventType.equals("SURVEY")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1781426473) {
            if (hashCode == 1808123565 && eventType.equals(Constants.CLIENT_EVENTS)) {
                c = 2;
            }
            c = 65535;
        } else {
            if (eventType.equals(Constants.SYSTEM_EVENTS)) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            try {
                com.apxor.androidsdk.plugins.survey.b.b().b(baseApxorEvent.getJSONData());
            } catch (JSONException unused) {
            }
        } else if (c != 1) {
            if (c == 2 && baseApxorEvent.getEventName().equals(Constants.APX_FETCH)) {
                b();
            }
        } else if (baseApxorEvent.getEventName().equals(Constants.FOREGROUND)) {
            b();
            SDKController.getInstance().deregisterFromEvent(Constants.SYSTEM_EVENTS, this);
        }
    }

    @Override // com.apxor.androidsdk.core.pluginmanager.ApxorPlugin
    public boolean start(Context context) {
        SDKController sDKController = SDKController.getInstance();
        try {
            if (sDKController.isForeground()) {
                b();
            } else {
                sDKController.registerToEvent(Constants.SYSTEM_EVENTS, this);
            }
            sDKController.registerToEvent(Constants.CLIENT_EVENTS, this);
        } catch (Exception unused) {
            b();
        }
        sDKController.registerToEvent("SURVEY", this);
        sDKController.registerToEvent("FEEDBACK", this);
        sDKController.registerToEvent("RATING", this);
        this.f372b = true;
        if (!this.c && this.a != -1 && this.d != null) {
            SDKController.getInstance().dispatchToBackgroundThread(this.d, this.a * 1000);
        }
        return true;
    }

    @Override // com.apxor.androidsdk.core.pluginmanager.ApxorPlugin
    public boolean stop() {
        SDKController sDKController = SDKController.getInstance();
        sDKController.deregisterFromEvent("SURVEY", this);
        sDKController.deregisterFromEvent("FEEDBACK", this);
        sDKController.deregisterFromEvent("RATING", this);
        this.f372b = false;
        ContextEvaluator.getInstance().reset();
        return true;
    }
}
