package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdProgressInfo;
/* loaded from: classes4.dex */
public final class aic implements AdProgressInfo {
    private final double a;

    /* renamed from: b  reason: collision with root package name */
    private final double f569b;
    private final int c;
    private final int d;
    private final double e;
    private final double f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aic(double d, double d2, int i, int i2, double d3, double d4) {
        this.a = d;
        this.f569b = d2;
        this.c = i;
        this.d = i2;
        this.e = d3;
        this.f = d4;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getAdBreakDuration() {
        return this.e;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getAdPeriodDuration() {
        return this.f;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final int getAdPosition() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getCurrentTime() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getDuration() {
        return this.f569b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final int getTotalAds() {
        return this.d;
    }
}
