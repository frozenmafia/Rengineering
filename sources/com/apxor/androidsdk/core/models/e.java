package com.apxor.androidsdk.core.models;

import com.apxor.androidsdk.core.Constants;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class e {
    private long a;

    public void a(long j) {
        this.a = j;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("config_id", "android");
            jSONObject.put(Constants.SDK_VERSION, 285.0d);
            jSONObject.put(Constants.SDK_START_TIME, this.a);
            jSONObject.put(Constants.TICK_INTERVAL, 0.1d);
            jSONObject.put(Constants.RETRY_WINDOW_TIME, 1800);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
