package com.apxor.androidsdk.core.e;

import android.util.Log;
import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.EventListener;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.models.BaseApxorEvent;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class a implements EventListener {
    private LinkedBlockingQueue<C0258a> a = new LinkedBlockingQueue<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f263b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apxor.androidsdk.core.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0258a {
        private String a;

        /* renamed from: b  reason: collision with root package name */
        private String f264b;

        C0258a(String str, String str2) {
            this.a = str;
            this.f264b = str2;
        }

        JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", this.a);
                jSONObject.put("stacktrace", this.f264b);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public void a(JSONObject jSONObject) {
        if (this.c) {
            return;
        }
        boolean optBoolean = jSONObject.optBoolean(Constants.SEND_SDK_LOGS, true);
        this.f263b = optBoolean;
        if (optBoolean) {
            SDKController.getInstance().registerToEvent(Constants.SYSTEM_EVENTS, this);
        }
        this.c = true;
    }

    @Override // com.apxor.androidsdk.core.EventListener
    public void onEvent(BaseApxorEvent baseApxorEvent) {
        if (baseApxorEvent.getEventType().equals(Constants.SYSTEM_EVENTS) && baseApxorEvent.getEventName().equals(Constants.BACKGROUND) && this.f263b) {
            a();
        }
    }

    public void a() {
        if (this.a.isEmpty()) {
            return;
        }
        SDKController sDKController = SDKController.getInstance();
        JSONArray jSONArray = new JSONArray();
        while (true) {
            C0258a poll = this.a.poll();
            if (poll == null) {
                break;
            }
            jSONArray.put(poll.a());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.TICK, (int) sDKController.getCurrentTime());
            jSONObject.put(Constants.SESSION_ID, sDKController.getSessionId());
            jSONObject.put("exceptions", jSONArray);
        } catch (JSONException e) {
            SDKController.getInstance().logException("ael_s_ex", e);
        }
        sDKController.postDataToServer(jSONObject.toString(), sDKController.getServicePathFor(Constants.LOGS_PATH), null);
    }

    public void a(String str, Throwable th) {
        if (this.f263b) {
            this.a.add(new C0258a(str, Log.getStackTraceString(th)));
        }
    }
}
