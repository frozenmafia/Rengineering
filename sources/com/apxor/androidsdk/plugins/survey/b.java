package com.apxor.androidsdk.plugins.survey;

import android.content.ContentValues;
import android.content.Context;
import android.os.SystemClock;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.Utilities;
import com.apxor.androidsdk.core.ce.Constants;
import com.apxor.androidsdk.core.utils.Logger;
import com.apxor.androidsdk.core.utils.network.ApxorNetworkCallback;
import com.apxor.androidsdk.core.utils.network.NetworkResponse;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class b {
    private static final String d = "b";
    private static b e;
    private d a = new d();

    /* renamed from: b  reason: collision with root package name */
    private c f375b;
    private int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements ApxorNetworkCallback {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // com.apxor.androidsdk.core.utils.network.ApxorNetworkCallback
        public void onComplete(NetworkResponse networkResponse) {
            if (networkResponse.getCode() != 200) {
                return;
            }
            String str = b.d;
            Logger.d(str, "Sur->Response: " + networkResponse.getCode());
            b.this.f375b.a(this.a);
        }
    }

    private b() {
    }

    private void a(String str, JSONObject jSONObject) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.UUID, str);
        contentValues.put("response", jSONObject.toString());
        this.f375b.a(str, contentValues);
    }

    public static b b() {
        if (e == null) {
            e = new b();
        }
        return e;
    }

    private void b(String str, JSONObject jSONObject) {
        SDKController sDKController = SDKController.getInstance();
        sDKController.postDataToServer(jSONObject.toString(), "https://serverg.apxor.com/v2/api/survey-response?appId=<app-id>".replace("<app-id>", sDKController.getApplicationID()), new a(str));
    }

    private void d() {
        ArrayList<JSONObject> entireDataFromTable = this.f375b.getEntireDataFromTable("responses", null, null);
        int size = entireDataFromTable.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = entireDataFromTable.get(i);
            try {
                b(jSONObject.getString(Constants.UUID), new JSONObject(jSONObject.getString("response")));
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, int i) {
        this.c = i;
        this.f375b = new c(context, "fs_responses.db");
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        this.a.a(jSONObject);
    }

    public void a(JSONObject jSONObject, long j, boolean z) {
        SDKController sDKController = SDKController.getInstance();
        try {
            String string = jSONObject.getString("survey_id");
            jSONObject.put("time_taken", Utilities.getElapsedTime(j, SystemClock.elapsedRealtime()));
            jSONObject.put(com.apxor.androidsdk.core.Constants.SESSION_ID, sDKController.getSessionId());
            jSONObject.put("is_completed", z);
            jSONObject.put(com.apxor.androidsdk.core.Constants.VERSION, sDKController.getAppVersion());
            jSONObject.put("device_uuid", sDKController.getDeviceID());
            jSONObject.put(com.apxor.androidsdk.core.Constants.LAUNCH_TIME, sDKController.getLaunchTime());
            JSONObject userAttributes = sDKController.getUserAttributes();
            JSONObject deviceInfoJson = sDKController.getDeviceInfoJson();
            userAttributes.put(com.apxor.androidsdk.core.Constants.HARDWARE_MODEL, deviceInfoJson.getString(com.apxor.androidsdk.core.Constants.HARDWARE_MODEL));
            userAttributes.put(com.apxor.androidsdk.core.Constants.OS_VERSION, deviceInfoJson.getString(com.apxor.androidsdk.core.Constants.OS_VERSION));
            jSONObject.put(com.apxor.androidsdk.core.Constants.USER_ATTRIBUTES, userAttributes);
            jSONObject.put("session_attributes", sDKController.getSessionAttributes());
            String str = d;
            Logger.e(str, "Response: " + jSONObject.toString());
            a(string, jSONObject);
            b(string, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(JSONObject jSONObject) {
        this.a.b(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.c;
    }
}
