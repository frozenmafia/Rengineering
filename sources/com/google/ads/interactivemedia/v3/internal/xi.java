package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
final class xi {
    private long a;

    /* renamed from: b  reason: collision with root package name */
    private long f1342b;
    private long c;
    private long d;
    private long e;
    private long f;
    private final boolean[] g = new boolean[15];
    private int h;

    private static int g(long j) {
        return (int) (j % 15);
    }

    public final long a() {
        long j = this.e;
        if (j == 0) {
            return 0L;
        }
        return this.f / j;
    }

    public final long b() {
        return this.f;
    }

    public final void c(long j) {
        long j2 = this.d;
        if (j2 == 0) {
            this.a = j;
        } else if (j2 == 1) {
            long j3 = j - this.a;
            this.f1342b = j3;
            this.f = j3;
            this.e = 1L;
        } else {
            long j4 = j - this.c;
            int g = g(j2);
            if (Math.abs(j4 - this.f1342b) <= 1000000) {
                this.e++;
                this.f += j4;
                boolean[] zArr = this.g;
                if (zArr[g]) {
                    zArr[g] = false;
                    this.h--;
                }
            } else {
                boolean[] zArr2 = this.g;
                if (!zArr2[g]) {
                    zArr2[g] = true;
                    this.h++;
                }
            }
        }
        this.d++;
        this.c = j;
    }

    public final void d() {
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.h = 0;
        Arrays.fill(this.g, false);
    }

    public final boolean e() {
        long j = this.d;
        if (j == 0) {
            return false;
        }
        return this.g[g(j - 1)];
    }

    public final boolean f() {
        return this.d > 15 && this.h == 0;
    }
}
