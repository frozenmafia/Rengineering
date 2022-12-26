package com.apxor.androidsdk.plugins.realtimeui.i;

import com.BV.LinearGradient.LinearGradientManager;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class f {
    private JSONArray a;

    /* renamed from: b  reason: collision with root package name */
    private JSONArray f357b;
    private int c;
    private String d;
    private String e;
    private int f;

    public int a() {
        return this.c;
    }

    public void a(JSONObject jSONObject) {
        this.a = jSONObject.getJSONArray(LinearGradientManager.PROP_COLORS);
        this.f357b = jSONObject.optJSONArray("distributions");
        this.c = jSONObject.optInt(LinearGradientManager.PROP_ANGLE, 180);
        String optString = jSONObject.optString("type", "linear");
        this.d = optString;
        if (optString.equals("linear")) {
            this.e = jSONObject.optString("linear_type", "h");
        } else if (this.d.equals("radial")) {
            this.f = jSONObject.optInt("radial_radius", 100);
        }
    }

    public JSONArray b() {
        return this.a;
    }

    public JSONArray c() {
        return this.f357b;
    }

    public String d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public String f() {
        return this.d;
    }
}
