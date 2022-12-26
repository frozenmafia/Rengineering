package com.apxor.androidsdk.core.models;

import android.os.SystemClock;
import com.apxor.androidsdk.core.Attributes;
import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.Utilities;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class a extends BaseApxorEvent {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f268b;
    private double c;
    private JSONObject d;
    private String e = "app_events";

    @Deprecated
    public a(String str, String str2, HashMap<String, String> hashMap) {
        SDKController sDKController = SDKController.getInstance();
        double lastEventTime = sDKController.getLastEventTime();
        this.a = str;
        this.f268b = str2;
        double elapsedTime = Utilities.getElapsedTime(sDKController.getSdkUpTimeMillis(), SystemClock.elapsedRealtime());
        this.c = elapsedTime;
        if (elapsedTime < lastEventTime) {
            this.c = lastEventTime;
        }
        if (hashMap == null || hashMap.size() <= 0) {
            return;
        }
        this.d = new JSONObject();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && !key.isEmpty() && value != null && !value.isEmpty()) {
                try {
                    this.d.put(key, value);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public void a(String str) {
        this.e = str;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public String getEventName() {
        return this.f268b;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public String getEventType() {
        return this.e;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public JSONObject getJSONData() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f268b);
            jSONObject.put("time", this.c);
            String str = this.a;
            if (str != null) {
                jSONObject.put(Constants.CATEGORY, str);
            }
            JSONObject jSONObject2 = this.d;
            if (jSONObject2 != null) {
                jSONObject.put(Constants.ADDITIONAL_INFO, jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public boolean isStorable() {
        return true;
    }

    public void a(int i, String str) {
        if (this.d == null) {
            this.d = new JSONObject();
        }
        try {
            this.d.put("apx_lt_count", i);
            this.d.put("apx_lt_count_slot", str);
        } catch (JSONException unused) {
        }
    }

    public a(String str, String str2, Attributes attributes) {
        SDKController sDKController = SDKController.getInstance();
        double lastEventTime = sDKController.getLastEventTime();
        this.a = str;
        this.f268b = str2;
        double elapsedTime = Utilities.getElapsedTime(sDKController.getSdkUpTimeMillis(), SystemClock.elapsedRealtime());
        this.c = elapsedTime;
        if (elapsedTime < lastEventTime) {
            this.c = lastEventTime;
        }
        if (attributes != null) {
            try {
                this.d = new JSONObject(attributes.getAttributes().toString());
            } catch (JSONException unused) {
            }
        }
    }
}
