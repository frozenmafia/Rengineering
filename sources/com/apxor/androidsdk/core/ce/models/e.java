package com.apxor.androidsdk.core.ce.models;

import com.apxor.androidsdk.core.Constants;
import org.json.JSONObject;
/* loaded from: classes3.dex */
class e {
    String a;

    /* renamed from: b  reason: collision with root package name */
    JSONObject f252b;

    public void a(JSONObject jSONObject) {
        this.a = jSONObject.getString("name");
        this.f252b = jSONObject.getJSONObject(Constants.ADDITIONAL_INFO);
    }
}
