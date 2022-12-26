package com.apxor.androidsdk.plugins.realtimeui;

import com.facebook.react.uimanager.ViewProps;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class f {
    private double a;

    /* renamed from: b  reason: collision with root package name */
    private double f313b;
    private double c;
    private double d;
    private boolean e = false;

    public double a() {
        return this.c;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.a = jSONObject.getDouble(ViewProps.TOP);
            this.f313b = jSONObject.getDouble("left");
            this.c = jSONObject.getDouble(ViewProps.BOTTOM);
            this.d = jSONObject.getDouble("right");
            this.e = true;
        }
    }

    public double b() {
        return this.f313b;
    }

    public double c() {
        return this.d;
    }

    public double d() {
        return this.a;
    }

    public boolean e() {
        return this.e;
    }
}
