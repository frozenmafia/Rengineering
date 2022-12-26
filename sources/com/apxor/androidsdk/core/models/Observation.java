package com.apxor.androidsdk.core.models;

import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.SDKController;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class Observation extends BaseApxorEvent {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private double f267b;
    private JSONObject e = null;
    private JSONObject f = null;
    private JSONObject g = null;
    private String d = a();
    private JSONObject c = new JSONObject();

    public Observation(String str, long j, double d) {
        this.a = str;
        this.f267b = d;
    }

    private String a() {
        return String.valueOf(SDKController.getInstance().getIncrementalNumberFor(Constants.INCIDENT_ID)) + SDKController.getInstance().getDeviceID() + System.currentTimeMillis();
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public String getEventType() {
        return Constants.INCIDENTS;
    }

    public String getId() {
        return this.d;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public JSONObject getJSONData() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.INCIDENT_TYPE, this.a);
            jSONObject.put(Constants.INCIDENT_ID, this.d);
            jSONObject.put(Constants.TIME_OF_OCCURRENCE, this.f267b);
            jSONObject.put(Constants.INCIDENT_SPECIFIC_DETAILS, this.c);
            jSONObject.put(Constants.TOP_NAVIGATION_DETAILS, this.f);
            jSONObject.put(Constants.ASSOCIATED_EVENT, this.g);
            jSONObject.put(Constants.HEALTH_SNAPSHOT, this.e);
        } catch (JSONException e) {
            SDKController.getInstance().logException("obs_g_jd", e);
        }
        return jSONObject;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public boolean isStorable() {
        return true;
    }

    public void setAssociatedNavigationEvent(JSONObject jSONObject) {
        this.f = jSONObject;
    }

    public void setAssociatedUserEvent(JSONObject jSONObject) {
        this.g = jSONObject;
    }

    public void setIncidentSpecificDetails(JSONObject jSONObject) {
        this.c = jSONObject;
    }
}
