package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class aln {
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private Object f627b;

    public aln(Context context, AdsRenderingSettings adsRenderingSettings) {
        this.a = context;
        this.f627b = adsRenderingSettings;
    }

    public aln(ahq ahqVar) {
        this.a = ahqVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.ads.interactivemedia.v3.api.AdsRenderingSettings, java.lang.Object] */
    public final void a(String str) {
        if (!this.f627b.getEnableCustomTabs() || Build.VERSION.SDK_INT < 18) {
            Object obj = this.a;
            if (str == null || str.length() <= 0) {
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            if (!(obj instanceof Activity)) {
                intent.setFlags(268435456);
            }
            ((Context) obj).startActivity(intent);
            return;
        }
        new CustomTabsIntent.Builder().build().launchUrl((Context) this.a, Uri.parse(str));
    }

    public final void b(AdsRenderingSettings adsRenderingSettings) {
        this.f627b = adsRenderingSettings;
    }

    public final JSONObject c() {
        return (JSONObject) this.f627b;
    }

    public final void d() {
        ((ahq) this.a).a(new ahr(this, null));
    }

    public final void e(JSONObject jSONObject, HashSet hashSet, long j) {
        ((ahq) this.a).a(new ahs(this, hashSet, jSONObject, j, null));
    }

    public final void f(JSONObject jSONObject, HashSet hashSet, long j) {
        ((ahq) this.a).a(new aht(this, hashSet, jSONObject, j, null));
    }

    public final void g(JSONObject jSONObject) {
        this.f627b = jSONObject;
    }
}
