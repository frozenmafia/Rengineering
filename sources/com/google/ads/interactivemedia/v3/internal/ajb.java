package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.CuePoint;
/* loaded from: classes4.dex */
public final class ajb implements CuePoint {
    private final double a;

    /* renamed from: b  reason: collision with root package name */
    private final double f585b;
    private final boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ajb(double d, double d2, boolean z) {
        this.a = d;
        this.f585b = d2;
        this.c = z;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final double getEndTime() {
        return this.f585b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final long getEndTimeMs() {
        return (long) Math.floor(this.f585b * 1000.0d);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final double getStartTime() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final long getStartTimeMs() {
        return (long) Math.floor(this.a * 1000.0d);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final boolean isPlayed() {
        return this.c;
    }
}
