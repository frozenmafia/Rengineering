package com.apxor.androidsdk.core.models;

import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.SDKController;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class g extends BaseApxorEvent {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private Double f272b;
    private double c;

    public g(String str, double d) {
        this(str, d, -1.0d);
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public String getEventName() {
        return this.a;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public String getEventType() {
        return Constants.SYSTEM_EVENTS;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public JSONObject getJSONData() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.a);
            jSONObject.put("time", this.f272b);
            if (this.a.equals(Constants.FOREGROUND)) {
                jSONObject.put("background_time", this.c);
            }
        } catch (JSONException e) {
            SDKController.getInstance().logException("se_g_jd", e);
        }
        return jSONObject;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public boolean isStorable() {
        return true;
    }

    public g(String str, double d, double d2) {
        this.a = str;
        this.f272b = Double.valueOf(d);
        this.c = d2;
    }
}
