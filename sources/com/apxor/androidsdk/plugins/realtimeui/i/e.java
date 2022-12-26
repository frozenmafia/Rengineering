package com.apxor.androidsdk.plugins.realtimeui.i;

import android.graphics.Color;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.utils.Logger;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class e {
    private static final String a = "e";
    private d h;
    private f i;

    /* renamed from: b  reason: collision with root package name */
    private int f356b = 0;
    private int c = 8;
    private c d = new c();
    private g e = new g();
    private com.apxor.androidsdk.plugins.realtimeui.f f = new com.apxor.androidsdk.plugins.realtimeui.f();
    private com.apxor.androidsdk.plugins.realtimeui.f g = new com.apxor.androidsdk.plugins.realtimeui.f();
    private boolean j = false;

    public c a() {
        return this.d;
    }

    public void a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("color");
            if (!string.isEmpty() && !string.equals("#")) {
                this.f356b = Color.parseColor(string);
            }
        } catch (Exception e) {
            SDKController.getInstance().logException("CLR_PRS_EXC_BTN_CNF", e);
            Logger.d(a, e.getLocalizedMessage());
        }
        this.c = jSONObject.getInt("visibility");
        this.e.a(jSONObject.getJSONObject("text_config"));
        this.d.a(jSONObject.getJSONObject("action_config"));
        this.f.a(jSONObject.optJSONObject("margin_config"));
        this.g.a(jSONObject.optJSONObject("padding_config"));
        JSONObject optJSONObject = jSONObject.optJSONObject("borders");
        if (optJSONObject != null) {
            d dVar = new d();
            this.h = dVar;
            dVar.a(optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("gradient_config");
        if (optJSONObject2 != null) {
            f fVar = new f();
            this.i = fVar;
            fVar.a(optJSONObject2);
        }
        this.j = true;
    }

    public d b() {
        return this.h;
    }

    public int c() {
        return this.f356b;
    }

    public f d() {
        return this.i;
    }

    public g e() {
        return this.e;
    }

    public int f() {
        return this.c;
    }

    public boolean g() {
        return this.j;
    }
}
