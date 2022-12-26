package com.apxor.androidsdk.plugins.realtimeui.i;

import org.json.JSONObject;
/* loaded from: classes3.dex */
public class a extends e {
    private static final String k = "e";
    private g l = new g();
    private String m;

    @Override // com.apxor.androidsdk.plugins.realtimeui.i.e
    public void a(JSONObject jSONObject) {
        super.a(jSONObject);
        if (jSONObject.has("description_config")) {
            this.l.a(jSONObject.getJSONObject("description_config"));
        }
        this.m = jSONObject.optString("image");
    }

    public g h() {
        return this.l;
    }

    public String i() {
        return this.m;
    }
}
