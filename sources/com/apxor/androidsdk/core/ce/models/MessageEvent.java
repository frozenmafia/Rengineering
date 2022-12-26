package com.apxor.androidsdk.core.ce.models;

import android.content.ContentValues;
import com.apxor.androidsdk.core.ce.Constants;
import com.apxor.androidsdk.core.models.BaseApxorEvent;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class MessageEvent extends BaseApxorEvent {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f235b;
    private String c;

    public MessageEvent(String str, String str2, String str3) {
        this.a = str;
        this.f235b = str2;
        this.c = str3;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public void deserialize(JSONObject jSONObject) {
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public ContentValues getContentValues() {
        return null;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public String getDBName() {
        return "";
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public String getEventName() {
        return null;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public String getEventType() {
        return this.a;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public JSONObject getJSONData() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.UUID, this.f235b);
            jSONObject.put(Constants.MESSAGE_NAME, this.c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public long getTick() {
        return 0L;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public double getTime() {
        return 0.0d;
    }
}
