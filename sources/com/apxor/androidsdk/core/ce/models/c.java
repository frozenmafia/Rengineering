package com.apxor.androidsdk.core.ce.models;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.ce.ContextEvaluator;
import com.apxor.androidsdk.core.ce.models.b;
import com.apxor.androidsdk.core.utils.Logger;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class c implements com.apxor.androidsdk.core.ce.e {
    private static final String a = "c";

    /* renamed from: b  reason: collision with root package name */
    private static final Handler f241b;
    private int h;
    private com.apxor.androidsdk.core.ce.models.b c = new com.apxor.androidsdk.core.ce.models.b();
    private int d = 0;
    private boolean e = false;
    private String f = "";
    private boolean g = false;
    private int i = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ SDKController a;

        a(SDKController sDKController) {
            this.a = sDKController;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.a.getCurrentTime(), "app_time", "", (JSONObject) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apxor.androidsdk.core.ce.models.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0255c implements com.apxor.androidsdk.core.ce.e {
        final /* synthetic */ ContextEvaluator a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f243b;

        C0255c(ContextEvaluator contextEvaluator, Runnable runnable) {
            this.a = contextEvaluator;
            this.f243b = runnable;
        }

        @Override // com.apxor.androidsdk.core.ce.e
        public void a(double d, String str, String str2, JSONObject jSONObject) {
            if (str.equals(Constants.APX_APP_OPEN)) {
                return;
            }
            this.a.deregisterFromEventFilter("app_event", this);
            c.f241b.removeCallbacks(this.f243b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements com.apxor.androidsdk.core.ce.e {
        final /* synthetic */ ContextEvaluator a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f244b;

        d(ContextEvaluator contextEvaluator, Runnable runnable) {
            this.a = contextEvaluator;
            this.f244b = runnable;
        }

        @Override // com.apxor.androidsdk.core.ce.e
        public void a(double d, String str, String str2, JSONObject jSONObject) {
            this.a.deregisterFromEventFilter("user_event", this);
            c.f241b.removeCallbacks(this.f244b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        final /* synthetic */ SDKController a;

        e(SDKController sDKController) {
            this.a = sDKController;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.a.getCurrentTime(), "", "", c.this.c.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements com.apxor.androidsdk.core.ce.e {
        final /* synthetic */ Runnable a;

        f(Runnable runnable) {
            this.a = runnable;
        }

        @Override // com.apxor.androidsdk.core.ce.e
        public void a(double d, String str, String str2, JSONObject jSONObject) {
            c cVar = c.this;
            cVar.a(str, cVar.c.f().d.a, "screen_event", this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements com.apxor.androidsdk.core.ce.e {
        final /* synthetic */ Runnable a;

        g(Runnable runnable) {
            this.a = runnable;
        }

        @Override // com.apxor.androidsdk.core.ce.e
        public void a(double d, String str, String str2, JSONObject jSONObject) {
            c.this.a(str, Constants.FOREGROUND, "sys_event", this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements com.apxor.androidsdk.core.ce.e {
        final /* synthetic */ Runnable a;

        h(Runnable runnable) {
            this.a = runnable;
        }

        @Override // com.apxor.androidsdk.core.ce.e
        public void a(double d, String str, String str2, JSONObject jSONObject) {
            c.this.a(str, str2, "activity_event", this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i implements com.apxor.androidsdk.core.ce.e {
        final /* synthetic */ ContextEvaluator a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f249b;
        final /* synthetic */ Runnable c;

        i(ContextEvaluator contextEvaluator, String str, Runnable runnable) {
            this.a = contextEvaluator;
            this.f249b = str;
            this.c = runnable;
        }

        @Override // com.apxor.androidsdk.core.ce.e
        public void a(double d, String str, String str2, JSONObject jSONObject) {
            this.a.deregisterFromEventFilter(this.f249b, this);
            c.f241b.removeCallbacks(this.c);
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("CETime");
        handlerThread.start();
        f241b = new Handler(handlerThread.getLooper());
    }

    private void a(Runnable runnable) {
        a(this.c.d(), runnable);
    }

    private void a(String str, Runnable runnable) {
        ContextEvaluator contextEvaluator = ContextEvaluator.getInstance();
        contextEvaluator.registerToEventFilter("sys_event", new g(runnable));
        contextEvaluator.registerToEventFilter("activity_event", new h(runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, Runnable runnable) {
        if (str.equals(str2)) {
            return;
        }
        ContextEvaluator.getInstance().deregisterFromEventFilter(str3, this);
        f241b.removeCallbacks(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r2 == 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        r10 = "client_event";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(org.json.JSONArray r8, java.lang.Runnable r9, java.lang.String r10) {
        /*
            r7 = this;
            com.apxor.androidsdk.core.ce.ContextEvaluator r0 = com.apxor.androidsdk.core.ce.ContextEvaluator.getInstance()     // Catch: org.json.JSONException -> L62
            if (r8 == 0) goto L62
            int r1 = r8.length()     // Catch: org.json.JSONException -> L62
            if (r1 <= 0) goto L62
            int r1 = r8.length()     // Catch: org.json.JSONException -> L62
            r2 = -1
            int r3 = r10.hashCode()     // Catch: org.json.JSONException -> L62
            r4 = 3108(0xc24, float:4.355E-42)
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L2a
            r4 = 3170(0xc62, float:4.442E-42)
            if (r3 == r4) goto L20
            goto L33
        L20:
            java.lang.String r3 = "ce"
            boolean r10 = r10.equals(r3)     // Catch: org.json.JSONException -> L62
            if (r10 == 0) goto L33
            r2 = 1
            goto L33
        L2a:
            java.lang.String r3 = "ae"
            boolean r10 = r10.equals(r3)     // Catch: org.json.JSONException -> L62
            if (r10 == 0) goto L33
            r2 = 0
        L33:
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L38
            goto L3b
        L38:
            java.lang.String r10 = "client_event"
            goto L3d
        L3b:
            java.lang.String r10 = "app_event"
        L3d:
            if (r5 >= r1) goto L62
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L62
            r2.<init>()     // Catch: org.json.JSONException -> L62
            r2.append(r10)     // Catch: org.json.JSONException -> L62
            java.lang.String r3 = "___"
            r2.append(r3)     // Catch: org.json.JSONException -> L62
            java.lang.String r3 = r8.getString(r5)     // Catch: org.json.JSONException -> L62
            r2.append(r3)     // Catch: org.json.JSONException -> L62
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L62
            com.apxor.androidsdk.core.ce.models.c$i r3 = new com.apxor.androidsdk.core.ce.models.c$i     // Catch: org.json.JSONException -> L62
            r3.<init>(r0, r2, r9)     // Catch: org.json.JSONException -> L62
            r0.registerToEventFilter(r2, r3)     // Catch: org.json.JSONException -> L62
            int r5 = r5 + 1
            goto L3d
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.ce.models.c.a(org.json.JSONArray, java.lang.Runnable, java.lang.String):void");
    }

    private boolean a(double d2, b.c cVar) {
        double d3 = (long) (d2 * 1000.0d);
        return d3 >= cVar.a && d3 <= cVar.f239b;
    }

    private boolean a(int i2, int i3, String str) {
        return ContextEvaluator.getInstance().compareDoubleValues(i3, i2, str);
    }

    private boolean a(b.d dVar, double d2, String str, String str2, JSONObject jSONObject) {
        return str.equals(dVar.b()) && a(dVar.f240b, dVar.c, str2) && a(d2, this.c.f().e) && a(jSONObject, dVar.a());
    }

    private boolean a(String str, String str2, String str3) {
        return (str.equals("activity_event") && str.equals("app_time") && (str3 == null || !str3.equals(str2)) && (str3 == null || !str3.endsWith(str2))) ? false : true;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArray;
        boolean z = true;
        if (jSONObject == null) {
            return jSONObject2 == null || jSONObject2.length() <= 0;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (jSONObject.opt(next) == null) {
                return false;
            }
            try {
                Object obj = jSONObject.get(next);
                Object obj2 = jSONObject2.get(next);
                if (obj2 instanceof JSONObject) {
                    JSONObject jSONObject3 = (JSONObject) obj2;
                    if (obj instanceof JSONArray) {
                        jSONArray = (JSONArray) obj;
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(obj);
                        jSONArray = jSONArray2;
                    }
                    int length = jSONArray.length();
                    z = ContextEvaluator.getInstance().compareValues(jSONObject3, jSONArray, jSONObject3.getString("t"), jSONObject3.getString("op"), "val", length);
                    continue;
                } else {
                    z = obj.equals(obj2);
                    continue;
                }
            } catch (Exception unused) {
                z = false;
                continue;
            }
            if (!z) {
                return z;
            }
        }
        return z;
    }

    private void b(double d2, String str, String str2, JSONObject jSONObject) {
        SDKController sDKController = SDKController.getInstance();
        ContextEvaluator contextEvaluator = ContextEvaluator.getInstance();
        b.d f2 = this.c.f();
        this.g = a(f2, d2, str, str2, jSONObject);
        String str3 = a;
        Logger.debug(str3, "Triggered: " + this.c.f().f240b + ", Registering: " + this.c.a + ", Status: " + this.g);
        if (this.g) {
            f2.a = d2;
            contextEvaluator.deregisterFromEventFilter(f2.f240b.concat("___").concat(f2.d.a), this);
            b bVar = new b();
            String str4 = this.c.a;
            str4.hashCode();
            str4.hashCode();
            char c = 65535;
            int hashCode = str4.hashCode();
            if (hashCode != -1036146179) {
                if (hashCode != -416705334) {
                    if (hashCode == 1727172696 && str4.equals("idle_time")) {
                        c = 2;
                    }
                } else if (str4.equals("scr_time")) {
                    c = 1;
                }
            } else if (str4.equals("activity_time")) {
                c = 0;
            }
            if (c == 0) {
                long f3 = f();
                if (f3 > 0) {
                    JSONArray optJSONArray = this.c.a().optJSONArray("nkpi");
                    f241b.postDelayed(bVar, f3);
                    a(bVar);
                    a(optJSONArray, bVar, this.c.a().optString("et", "ae"));
                }
            } else if (c != 1) {
                if (c != 2) {
                    contextEvaluator.registerToEventFilter(this.c.a.concat("___").concat(this.c.d()), this);
                    return;
                }
                long f4 = f();
                if (f4 > 0) {
                    f241b.postDelayed(bVar, f4);
                    a(bVar);
                    contextEvaluator.registerToEventFilter("app_event", new C0255c(contextEvaluator, bVar));
                    contextEvaluator.registerToEventFilter("user_event", new d(contextEvaluator, bVar));
                }
            } else {
                Activity currentActivity = contextEvaluator.getCurrentActivity();
                if (currentActivity == null) {
                    return;
                }
                String name = currentActivity.getClass().getName();
                long f5 = f();
                if (f5 > 0) {
                    JSONArray optJSONArray2 = this.c.a().optJSONArray("nkpi");
                    e eVar = new e(sDKController);
                    f241b.postDelayed(eVar, f5);
                    a(name, eVar);
                    contextEvaluator.registerToEventFilter("screen_event", new f(eVar));
                    a(optJSONArray2, eVar, this.c.a().optString("et", "ae"));
                }
            }
        }
    }

    private long f() {
        try {
            return this.c.a().getLong("time");
        } catch (JSONException unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Activity currentActivity = ContextEvaluator.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        String b2 = this.c.f().b();
        String name = currentActivity.getClass().getName();
        if (name.equals(b2) || name.endsWith(b2)) {
            a(SDKController.getInstance().getCurrentTime(), "", "", this.c.a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // com.apxor.androidsdk.core.ce.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(double r3, java.lang.String r5, java.lang.String r6, org.json.JSONObject r7) {
        /*
            r2 = this;
            boolean r0 = r2.g
            if (r0 != 0) goto L8
            r2.b(r3, r5, r6, r7)
            return
        L8:
            com.apxor.androidsdk.core.ce.models.b r0 = r2.c
            java.lang.String r0 = r0.d()
            boolean r5 = r5.equals(r0)
            r0 = 1
            if (r5 == 0) goto L45
            com.apxor.androidsdk.core.ce.models.b r5 = r2.c
            java.lang.String r1 = r5.a
            java.lang.String r5 = r5.f237b
            boolean r5 = r2.a(r1, r5, r6)
            if (r5 == 0) goto L45
            com.apxor.androidsdk.core.ce.models.b r5 = r2.c
            com.apxor.androidsdk.core.ce.models.b$d r5 = r5.f()
            double r5 = r5.a
            double r5 = r3 - r5
            com.apxor.androidsdk.core.ce.models.b r1 = r2.c
            com.apxor.androidsdk.core.ce.models.b$c r1 = r1.e()
            boolean r5 = r2.a(r5, r1)
            if (r5 == 0) goto L45
            com.apxor.androidsdk.core.ce.models.b r5 = r2.c
            org.json.JSONObject r5 = r5.a()
            boolean r5 = r2.a(r7, r5)
            if (r5 == 0) goto L45
            r5 = 1
            goto L46
        L45:
            r5 = 0
        L46:
            if (r5 == 0) goto L76
            int r5 = r2.d
            int r5 = r5 + r0
            r2.d = r5
            boolean r6 = r2.e
            if (r6 != 0) goto L55
            com.apxor.androidsdk.core.ce.models.b r6 = r2.c
            r6.f = r3
        L55:
            com.apxor.androidsdk.core.ce.models.b r3 = r2.c
            int r3 = r3.b()
            com.apxor.androidsdk.core.ce.models.b r4 = r2.c
            java.lang.String r4 = r4.c()
            boolean r3 = r2.a(r5, r3, r4)
            r2.e = r3
            if (r3 == 0) goto L76
            com.apxor.androidsdk.core.ce.ContextEvaluator r3 = com.apxor.androidsdk.core.ce.ContextEvaluator.getInstance()
            java.lang.String r4 = r2.f
            int r5 = r2.h
            int r6 = r2.i
            r3.validate(r4, r5, r6)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.ce.models.c.a(double, java.lang.String, java.lang.String, org.json.JSONObject):void");
    }

    public void a(int i2) {
        this.i = i2;
    }

    public boolean a(JSONObject jSONObject, String str, boolean z, int i2) {
        com.apxor.androidsdk.core.ce.models.b bVar = new com.apxor.androidsdk.core.ce.models.b();
        if (bVar.a(jSONObject)) {
            this.c = bVar;
            this.f = str;
            this.h = i2;
            if ((bVar.b() <= 1 && bVar.c().equals(com.apxor.androidsdk.core.ce.Constants.LT)) || (bVar.b() <= 0 && bVar.c().equals(com.apxor.androidsdk.core.ce.Constants.LTE))) {
                this.e = true;
            }
            if (!z || i2 == 0) {
                h();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        ContextEvaluator contextEvaluator = ContextEvaluator.getInstance();
        b.d f2 = this.c.f();
        contextEvaluator.deregisterFromEventFilter(f2.f240b.concat("___").concat(f2.d.a), this);
        contextEvaluator.deregisterFromEventFilter(this.c.a.concat("___").concat(this.c.d()), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.c.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.c.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.c.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        b.d f2 = this.c.f();
        if (!f2.f240b.equals("app_start")) {
            ContextEvaluator.getInstance().registerToEventFilter(f2.f240b.concat("___").concat(f2.d.a), this);
            return;
        }
        this.g = true;
        f2.a = 0.0d;
        if (!this.c.a.equals("app_time")) {
            ContextEvaluator.getInstance().registerToEventFilter(this.c.a.concat("___").concat(this.c.d()), this);
            return;
        }
        long f3 = f();
        if (f3 > 0) {
            SDKController sDKController = SDKController.getInstance();
            HandlerThread handlerThread = new HandlerThread("AppTime");
            handlerThread.start();
            new Handler(handlerThread.getLooper()).postDelayed(new a(sDKController), f3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        com.apxor.androidsdk.core.ce.models.b bVar = this.c;
        bVar.f = bVar.f().e.a;
        if (this.g) {
            this.c.f().a = this.c.f().e.a;
        }
    }
}
