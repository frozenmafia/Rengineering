package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class cd {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f995b = new long[32];

    public final int a() {
        return this.a;
    }

    public final long b(int i) {
        if (i < 0 || i >= this.a) {
            int i2 = this.a;
            throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
        }
        return this.f995b[i];
    }

    public final void c(long j) {
        int i = this.a;
        long[] jArr = this.f995b;
        if (i == jArr.length) {
            this.f995b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f995b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }
}
