package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.webkit.WebView;
import com.google.android.exoplayer2.ExoPlayer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class ahf extends ahc {
    private WebView a;

    /* renamed from: b  reason: collision with root package name */
    private Long f557b = null;
    private final Map c;

    public ahf(Map map) {
        this.c = map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahc
    public final void c() {
        super.c();
        new Handler().postDelayed(new ahe(this), Math.max(4000 - (this.f557b == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f557b.longValue(), TimeUnit.NANOSECONDS)), (long) ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS));
        this.a = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahc
    public final void f(agm agmVar, agk agkVar) {
        JSONObject jSONObject = new JSONObject();
        Map f = agkVar.f();
        for (String str : f.keySet()) {
            ahh.g(jSONObject, str, (aez) f.get(str));
        }
        g(agmVar, agkVar, jSONObject);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahc
    public final void j() {
        WebView webView = new WebView(agv.b().a());
        this.a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        i(this.a);
        agx.a().h(this.a, null);
        Iterator it = this.c.keySet().iterator();
        if (!it.hasNext()) {
            this.f557b = Long.valueOf(System.nanoTime());
            return;
        }
        aez aezVar = (aez) this.c.get((String) it.next());
        throw null;
    }
}
