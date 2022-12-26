package com.apxor.androidsdk.core.models;

import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.SDKController;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class NavigationEvent extends BaseApxorEvent {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private double f266b;
    private double c;
    private String d;

    public NavigationEvent() {
        this.a = null;
        this.f266b = 0.0d;
        this.c = -1.0d;
        this.d = null;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public String getEventName() {
        String str = this.a;
        return str == null ? "" : str;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public String getEventType() {
        return Constants.NAVIGATION_EVENTS;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public JSONObject getJSONData() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.a;
            if (str == null) {
                str = "unknown";
            }
            this.a = str;
            jSONObject.put(Constants.NAVIGATION_ID, str);
            String str2 = this.d;
            if (str2 == null) {
                str2 = this.a;
            }
            this.d = str2;
            jSONObject.put("name", str2);
            jSONObject.put(Constants.TRANSITION_TIME, this.f266b);
            jSONObject.put("duration", this.c);
        } catch (JSONException e) {
            SDKController.getInstance().logException("ne_g_jd", e);
        }
        return jSONObject;
    }

    public String getScreenName() {
        return this.d;
    }

    public double getTransitionTime() {
        return this.f266b;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public boolean isStorable() {
        return true;
    }

    public void setDuration(Double d) {
        this.c = d.doubleValue();
    }

    public void setScreenName(String str) {
        this.d = str;
    }

    public void setTransitionTime(Double d) {
        this.f266b = d.doubleValue();
    }

    public NavigationEvent(String str, Double d) {
        this.a = null;
        this.f266b = 0.0d;
        this.c = -1.0d;
        this.d = null;
        this.a = str;
        this.f266b = d.doubleValue();
    }
}
