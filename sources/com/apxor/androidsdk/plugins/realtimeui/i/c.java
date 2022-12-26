package com.apxor.androidsdk.plugins.realtimeui.i;

import com.apxor.androidsdk.core.ce.Constants;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class c {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private String f354b;
    private JSONArray c;
    private boolean d = false;
    private String e;
    private String f;
    private JSONObject g;
    private boolean h;
    private JSONArray i;

    public String a() {
        return this.a;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.a = jSONObject.getString("action");
            this.f354b = jSONObject.getString(Constants.ACTIVITY);
            if (jSONObject.has("deep_link")) {
                this.h = true;
                JSONObject jSONObject2 = jSONObject.getJSONObject("deep_link");
                this.e = jSONObject2.getString("uri");
                this.f = jSONObject2.getString("intent_action");
                this.g = jSONObject.optJSONObject("mvm");
            }
            if (jSONObject.has("internal_redirection")) {
                this.i = jSONObject.getJSONArray("internal_redirection");
            }
            this.c = jSONObject.optJSONArray(com.apxor.androidsdk.core.Constants.ADDITIONAL_INFO);
            this.d = true;
        }
    }

    public String b() {
        return this.f354b;
    }

    public JSONArray c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public JSONArray f() {
        return this.i;
    }

    public JSONObject g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.d;
    }
}
