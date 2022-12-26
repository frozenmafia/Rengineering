package com.apxor.androidsdk.plugins.realtimeui;

import android.text.TextUtils;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.ce.Constants;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public abstract class b {
    boolean a;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    protected String k;
    private String l;
    private String m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f306o;
    private boolean q;
    private String r;
    private com.apxor.androidsdk.plugins.realtimeui.i.f s;

    /* renamed from: b  reason: collision with root package name */
    String f305b = "inline";
    private long c = 400;
    private long d = -1;
    private long e = -1;
    private String p = "";

    public String a() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.g += "-" + i;
    }

    public void a(String str) {
        this.p = str;
    }

    public boolean a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f = str;
            this.g = str2;
            this.f305b = jSONObject.getString("display_type");
            this.h = jSONObject.getString(Constants.ACTIVITY);
            if (jSONObject.has("dynamic_viewId_app_event")) {
                this.m = jSONObject.getString("dynamic_viewId_app_event");
                this.r = jSONObject.optString("dyn_event_attr");
                this.n = true;
                this.i = "";
            } else {
                this.i = jSONObject.optString("view_id");
            }
            this.j = jSONObject.optString("search_type", "");
            this.k = jSONObject.optString("position");
            String optString = jSONObject.optString("bg_color", "#FFFFFF");
            this.l = optString;
            if (!TextUtils.isEmpty(optString) && this.l.length() >= 7) {
                JSONObject optJSONObject = jSONObject.optJSONObject("gradient_config");
                if (optJSONObject != null) {
                    com.apxor.androidsdk.plugins.realtimeui.i.f fVar = new com.apxor.androidsdk.plugins.realtimeui.i.f();
                    this.s = fVar;
                    fVar.a(optJSONObject);
                }
                this.a = jSONObject.optBoolean("has_ripple", false);
                this.c = jSONObject.optLong("delay", this.c);
                this.d = jSONObject.optLong("timeout", this.d);
                this.e = jSONObject.optLong("find_interval", this.e);
                return true;
            }
            return false;
        } catch (JSONException e) {
            SDKController.getInstance().logException("uic_init", e);
            return false;
        }
    }

    public String b() {
        return this.l;
    }

    public String c() {
        return this.g;
    }

    public long d() {
        return this.c;
    }

    public String e() {
        return this.f305b;
    }

    public String f() {
        return this.m;
    }

    public String g() {
        return this.r;
    }

    public boolean h() {
        return this.n;
    }

    public long i() {
        return this.e;
    }

    public com.apxor.androidsdk.plugins.realtimeui.i.f j() {
        return this.s;
    }

    public boolean k() {
        return this.a;
    }

    public String l() {
        return this.k;
    }

    public String m() {
        return this.j;
    }

    public long n() {
        return this.d;
    }

    public String o() {
        return this.f;
    }

    public String p() {
        return this.p;
    }

    public String q() {
        return this.i;
    }

    public boolean r() {
        return this.q;
    }

    public boolean s() {
        return this.f306o;
    }

    public void t() {
        this.q = true;
    }

    public void u() {
        this.f306o = true;
    }
}
