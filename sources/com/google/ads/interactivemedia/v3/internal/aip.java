package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class aip implements AdsRequest {
    private String a;

    /* renamed from: b  reason: collision with root package name */
    private Map f578b;
    private String c;
    private ContentProgressProvider d;
    private aim e = aim.UNKNOWN;
    private aio f = aio.UNKNOWN;
    private ain g = ain.UNKNOWN;
    private Float h;
    private List i;
    private String j;
    private String k;
    private Float l;
    private Float m;
    private transient Object n;

    public final aim a() {
        return this.e;
    }

    public final ain b() {
        return this.g;
    }

    public final aio c() {
        return this.f;
    }

    public final Float d() {
        return this.h;
    }

    public final Float e() {
        return this.m;
    }

    public final Float f() {
        return this.l;
    }

    public final String g() {
        return this.j;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getAdTagUrl() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getAdsResponse() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final ContentProgressProvider getContentProgressProvider() {
        return this.d;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getExtraParameter(String str) {
        Map map = this.f578b;
        if (map == null) {
            return null;
        }
        return (String) map.get(str);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final Map<String, String> getExtraParameters() {
        return this.f578b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final Object getUserRequestContext() {
        return this.n;
    }

    public final String h() {
        return this.k;
    }

    public final List i() {
        return this.i;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdTagUrl(String str) {
        this.a = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdWillAutoPlay(boolean z) {
        this.e = z ? aim.AUTO : aim.CLICK;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdWillPlayMuted(boolean z) {
        this.f = z ? aio.MUTED : aio.UNMUTED;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdsResponse(String str) {
        this.c = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentDuration(float f) {
        this.h = Float.valueOf(f);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentKeywords(List<String> list) {
        this.i = list;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentProgressProvider(ContentProgressProvider contentProgressProvider) {
        this.d = contentProgressProvider;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentTitle(String str) {
        this.j = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentUrl(String str) {
        this.k = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContinuousPlayback(boolean z) {
        this.g = z ? ain.ON : ain.OFF;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setExtraParameter(String str, String str2) {
        if (this.f578b == null) {
            this.f578b = new HashMap();
        }
        this.f578b.put(str, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setLiveStreamPrefetchSeconds(float f) {
        this.m = Float.valueOf(f);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setUserRequestContext(Object obj) {
        this.n = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setVastLoadTimeout(float f) {
        this.l = Float.valueOf(f);
    }
}
