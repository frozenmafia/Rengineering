package com.apxor.androidsdk.core.ce;

import org.json.JSONObject;
/* loaded from: classes6.dex */
public interface ConfigurationListener {
    void applyConfig(JSONObject jSONObject);

    String getActionType();
}
