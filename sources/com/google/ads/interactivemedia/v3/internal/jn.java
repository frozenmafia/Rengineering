package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class jn extends Exception {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1119b;
    public final s c;

    public jn(int i, s sVar, boolean z) {
        super("AudioTrack write failed: " + i);
        this.f1119b = z;
        this.a = i;
        this.c = sVar;
    }
}
