package com.apxor.androidsdk.plugins.wysiwyg;

import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.datahandler.databases.ApxorBaseSQLiteWrapper;
import com.apxor.androidsdk.core.pluginmanager.ApxorPlugin;
import com.apxor.androidsdk.core.utils.Logger;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class WYSIWYGPlugin extends ApxorPlugin {
    private static final String c = "WYSIWYGPlugin";
    private int a = 0;

    /* renamed from: b  reason: collision with root package name */
    private JSONArray f403b = new JSONArray();

    /* loaded from: classes6.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WYSIWYGPlugin.this.b();
            } catch (Error | Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() throws JSONException {
        Context context = SDKController.getInstance().getContext();
        if (context == null) {
            return;
        }
        a();
        for (int i = 0; i < this.f403b.length(); i++) {
            this.a |= this.f403b.getInt(i);
        }
        SDKController sDKController = SDKController.getInstance();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app", sDKController.getAppName());
        contentValues.put("d_id", sDKController.getDeviceID());
        contentValues.put("a_id", sDKController.getApplicationID());
        contentValues.put("p_value", Integer.valueOf(this.a));
        context.getApplicationContext().getContentResolver().insert(Uri.parse("content://" + context.getApplicationContext().getPackageName() + ".apxorsdk/ApxorApps"), contentValues);
    }

    @Override // com.apxor.androidsdk.core.pluginmanager.ApxorPlugin
    public ArrayList<Pair<String, ? extends ApxorBaseSQLiteWrapper>> getPluginDatabasesFrom(Context context, String str) {
        return null;
    }

    @Override // com.apxor.androidsdk.core.pluginmanager.ApxorPlugin
    public boolean initialize(Context context, JSONObject jSONObject) throws JSONException {
        if (Build.VERSION.SDK_INT < 18) {
            Logger.e(c, "Min Sdk version supported is >= 18");
            return false;
        }
        CommandReceiver commandReceiver = new CommandReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.apxor.androidsdk.actions.ENABLE_OVERLAY");
        intentFilter.addAction("com.apxor.androidsdk.actions.DISABLE_OVERLAY");
        context.registerReceiver(commandReceiver, intentFilter);
        e.b().d();
        SDKController.getInstance().dispatchToBackgroundThread(new a(), 5000L);
        Logger.debug(c, "WYSIWYG Plugin version 126 initialized");
        return true;
    }

    @Override // com.apxor.androidsdk.core.pluginmanager.ApxorPlugin
    public boolean start(Context context) {
        return true;
    }

    @Override // com.apxor.androidsdk.core.pluginmanager.ApxorPlugin
    public boolean stop() {
        return true;
    }

    private void a() {
        try {
            String[] strArr = {"ApxorRealtimeUIPlugin", "CrashReporterPlugin", "PushPlugin", "SurveyPlugin", c};
            Set<String> plugins = SDKController.getInstance().getPlugins();
            if (plugins == null) {
                return;
            }
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                char c2 = 65535;
                try {
                    int i2 = 2;
                    int i3 = 4;
                    switch (str.hashCode()) {
                        case -795497715:
                            if (str.equals("PushPlugin")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 854809307:
                            if (str.equals("CrashReporterPlugin")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 866801438:
                            if (str.equals("ApxorRealtimeUIPlugin")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 917695309:
                            if (str.equals("SurveyPlugin")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 1701971840:
                            if (str.equals(c)) {
                                c2 = 4;
                                break;
                            }
                            break;
                    }
                    if (c2 == 0) {
                        this.f403b.put(plugins.contains(str) ? 1 : 0);
                    } else if (c2 == 1) {
                        JSONArray jSONArray = this.f403b;
                        if (!plugins.contains(str)) {
                            i2 = 0;
                        }
                        jSONArray.put(i2);
                    } else if (c2 == 2) {
                        JSONArray jSONArray2 = this.f403b;
                        if (!plugins.contains(str)) {
                            i3 = 0;
                        }
                        jSONArray2.put(i3);
                    } else if (c2 == 3) {
                        this.f403b.put(plugins.contains(str) ? 8 : 0);
                    } else if (c2 == 4) {
                        this.f403b.put(plugins.contains(str) ? 16 : 0);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception | NoSuchMethodError unused2) {
        }
    }
}
