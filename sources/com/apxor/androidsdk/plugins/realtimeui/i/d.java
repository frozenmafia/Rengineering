package com.apxor.androidsdk.plugins.realtimeui.i;

import android.graphics.Color;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class d {
    private float a;

    /* renamed from: b  reason: collision with root package name */
    private int f355b;
    private String c;

    public float a() {
        return this.a;
    }

    public void a(JSONObject jSONObject) {
        this.a = (float) jSONObject.optDouble("radius", 0.0d);
        this.c = jSONObject.optString("stroke_color", "#ffffff");
        this.f355b = jSONObject.optInt("stroke_width", 0);
    }

    public int b() {
        try {
            if (this.c.isEmpty() || this.c.equals("#")) {
                return 0;
            }
            return Color.parseColor(this.c);
        } catch (IllegalArgumentException unused) {
            return Color.parseColor("#ffffff");
        }
    }

    public int c() {
        return this.f355b;
    }
}
