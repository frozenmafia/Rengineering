package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public abstract class apw {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final String f669b;
    private final Object c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ apw(int i, String str, Object obj) {
        this.a = i;
        this.f669b = str;
        this.c = obj;
        apq.c().f(this);
    }

    public static apw e(int i, String str, Boolean bool) {
        return new apr(i, str, bool);
    }

    public static void i(String str, float f) {
        new apu(str, Float.valueOf(f));
    }

    public static void j(String str, int i) {
        new aps(str, Integer.valueOf(i));
    }

    public static apw k(String str, long j) {
        return new apt(str, Long.valueOf(j));
    }

    public static apw l(String str, String str2) {
        return new apv(str, str2);
    }

    public static void m() {
        apq.c().e(l("gads:sdk_core_constants:experiment_id", null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object c(SharedPreferences sharedPreferences);

    public final int d() {
        return this.a;
    }

    public final Object f() {
        return apq.a().b(this);
    }

    public final Object g() {
        return this.c;
    }

    public final String h() {
        return this.f669b;
    }
}
