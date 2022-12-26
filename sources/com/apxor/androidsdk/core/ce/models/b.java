package com.apxor.androidsdk.core.ce.models;

import androidx.core.app.NotificationCompat;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.ce.Constants;
import com.sendbird.android.constant.StringSet;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class b {
    String a;

    /* renamed from: b  reason: collision with root package name */
    String f237b;
    String c = StringSet.AND;
    String d = "";
    String e = "";
    double f = 0.0d;
    int g = -1;
    private d h = new d();
    private e i = new e();
    private C0254b j = new C0254b();
    private c k = new c();

    /* renamed from: com.apxor.androidsdk.core.ce.models.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0254b {
        private int a;

        /* renamed from: b  reason: collision with root package name */
        private String f238b;

        private C0254b() {
        }

        void a(JSONObject jSONObject) {
            this.a = jSONObject.getInt("count");
            this.f238b = jSONObject.getString("operator");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c {
        double a;

        /* renamed from: b  reason: collision with root package name */
        double f239b;

        c() {
        }

        public void a(JSONObject jSONObject) {
            this.a = jSONObject.getDouble("lower");
            this.f239b = jSONObject.getDouble("upper");
        }
    }

    /* loaded from: classes3.dex */
    class d {
        double a;

        /* renamed from: b  reason: collision with root package name */
        String f240b;
        String c;
        e d = new e();
        c e;

        d() {
            this.e = new c();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public JSONObject a() {
            return this.d.f252b;
        }

        public void a(JSONObject jSONObject) {
            String string = jSONObject.getString(Constants.EVENT_TYPE);
            this.f240b = string;
            if (string.equals("app_event") || this.f240b.equals("client_event")) {
                this.f240b = NotificationCompat.CATEGORY_EVENT;
            }
            this.c = jSONObject.getString(Constants.ACTIVITY);
            this.d.a(jSONObject.getJSONObject("details"));
            this.e.a(jSONObject.getJSONObject(Constants.TIME_BOUNDS));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String b() {
            return this.d.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject a() {
        return this.i.f252b;
    }

    public boolean a(JSONObject jSONObject) {
        try {
            this.h.a(jSONObject.getJSONObject(Constants.TRIGGER));
            this.i.a(jSONObject.getJSONObject("details"));
            this.j.a(jSONObject.getJSONObject(Constants.COUNT_CONFIG));
            this.k.a(jSONObject.getJSONObject(Constants.TIME_BOUNDS));
            String string = jSONObject.getString(Constants.EVENT_TYPE);
            this.a = string;
            if (string.equals("app_event") || this.a.equals("client_event")) {
                this.a = NotificationCompat.CATEGORY_EVENT;
            }
            this.f237b = jSONObject.getString(Constants.ACTIVITY);
            this.c = jSONObject.getString(Constants.COMB_OPERATOR);
            this.d = jSONObject.optString(Constants.PRE_OPERATOR);
            this.e = jSONObject.optString(Constants.POST_OPERATOR);
            if (jSONObject.has(Constants.SEQUENCE_NO)) {
                this.g = jSONObject.getInt(Constants.SEQUENCE_NO);
                return true;
            }
            return true;
        } catch (JSONException e) {
            SDKController.getInstance().logException("cnd_init", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.j.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.j.f238b;
    }

    public String d() {
        return this.i.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c e() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d f() {
        return this.h;
    }
}
