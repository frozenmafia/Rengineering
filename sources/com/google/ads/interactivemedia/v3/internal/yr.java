package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
public final class yr {
    public static final yr a = new yr(-3, C.TIME_UNSET, -1);

    /* renamed from: b  reason: collision with root package name */
    private final int f1367b;
    private final long c;
    private final long d;

    private yr(int i, long j, long j2) {
        this.f1367b = i;
        this.c = j;
        this.d = j2;
    }

    public static yr d(long j, long j2) {
        return new yr(-1, j, j2);
    }

    public static yr e(long j) {
        return new yr(0, C.TIME_UNSET, j);
    }

    public static yr f(long j, long j2) {
        return new yr(-2, j, j2);
    }
}
