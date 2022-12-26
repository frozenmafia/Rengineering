package com.apxor.androidsdk.core.ce.models;

import com.apxor.androidsdk.core.ce.Constants;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class g {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f254b;
    private JSONObject c;
    private boolean d;

    public JSONObject a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        this.a = jSONObject.getString("name");
        this.f254b = jSONObject.getString("type");
        this.c = jSONObject.optJSONObject(Constants.META_ATTRIBUTES);
        this.d = jSONObject.optBoolean(Constants.ONLY_CONTEXT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f254b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.d;
    }
}
