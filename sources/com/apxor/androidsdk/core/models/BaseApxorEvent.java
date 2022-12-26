package com.apxor.androidsdk.core.models;

import android.content.ContentValues;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public abstract class BaseApxorEvent {
    @Deprecated
    public void deserialize(JSONObject jSONObject) throws JSONException {
    }

    @Deprecated
    public ContentValues getContentValues() {
        return null;
    }

    @Deprecated
    public String getDBName() {
        return "";
    }

    public String getEventName() {
        return "";
    }

    public abstract String getEventType();

    public abstract JSONObject getJSONData();

    @Deprecated
    public long getTick() {
        return 0L;
    }

    @Deprecated
    public double getTime() {
        return 0.0d;
    }

    public boolean isStorable() {
        return false;
    }
}
