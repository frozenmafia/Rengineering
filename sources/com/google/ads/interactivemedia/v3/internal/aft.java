package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.sendbird.android.constant.StringSet;
/* loaded from: classes4.dex */
public final class aft extends bpk implements bqr {
    private static final aft a;
    private int e;
    private long u;
    private long v;
    private long f = -1;
    private long g = -1;
    private long h = -1;
    private long i = -1;
    private long j = -1;
    private long k = -1;
    private int l = 1000;
    private long m = -1;
    private long n = -1;

    /* renamed from: o */
    private long f534o = -1;
    private int p = 1000;
    private long q = -1;
    private long r = -1;
    private long s = -1;
    private long t = -1;
    private long w = -1;
    private long x = -1;
    private long y = -1;
    private long z = -1;

    static {
        aft aftVar = new aft();
        a = aftVar;
        bpk.aI(aft.class, aftVar);
    }

    private aft() {
    }

    public static /* synthetic */ aft a() {
        return a;
    }

    public static /* synthetic */ void b(aft aftVar, long j) {
        aftVar.e |= 1;
        aftVar.f = j;
    }

    public static /* synthetic */ void c(aft aftVar, long j) {
        aftVar.e |= 2;
        aftVar.g = j;
    }

    public static /* synthetic */ void d(aft aftVar, long j) {
        aftVar.e |= 4;
        aftVar.h = j;
    }

    public static /* synthetic */ void e(aft aftVar, long j) {
        aftVar.e |= 8;
        aftVar.i = j;
    }

    public static /* synthetic */ void f(aft aftVar) {
        aftVar.e &= -9;
        aftVar.i = -1L;
    }

    public static /* synthetic */ void g(aft aftVar, long j) {
        aftVar.e |= 16;
        aftVar.j = j;
    }

    public static /* synthetic */ void h(aft aftVar, long j) {
        aftVar.e |= 32;
        aftVar.k = j;
    }

    public static /* synthetic */ void j(aft aftVar, long j) {
        aftVar.e |= 128;
        aftVar.m = j;
    }

    public static /* synthetic */ void k(aft aftVar, long j) {
        aftVar.e |= 256;
        aftVar.n = j;
    }

    public static /* synthetic */ void l(aft aftVar, long j) {
        aftVar.e |= 512;
        aftVar.f534o = j;
    }

    public static /* synthetic */ void m(aft aftVar, long j) {
        aftVar.e |= 2048;
        aftVar.q = j;
    }

    public static /* synthetic */ void n(aft aftVar, long j) {
        aftVar.e |= 4096;
        aftVar.r = j;
    }

    public static /* synthetic */ void o(aft aftVar, long j) {
        aftVar.e |= 8192;
        aftVar.s = j;
    }

    public static /* synthetic */ void p(aft aftVar, long j) {
        aftVar.e |= 16384;
        aftVar.t = j;
    }

    public static /* synthetic */ void q(aft aftVar, long j) {
        aftVar.e |= 32768;
        aftVar.u = j;
    }

    public static /* synthetic */ void r(aft aftVar, long j) {
        aftVar.e |= 65536;
        aftVar.v = j;
    }

    public static /* synthetic */ void s(aft aftVar, long j) {
        aftVar.e |= 131072;
        aftVar.w = j;
    }

    public static /* synthetic */ void t(aft aftVar, long j) {
        aftVar.e |= 262144;
        aftVar.x = j;
    }

    public static /* synthetic */ void u(aft aftVar, int i) {
        aftVar.l = aga.b(i);
        aftVar.e |= 64;
    }

    public static /* synthetic */ void v(aft aftVar, int i) {
        aftVar.p = aga.b(i);
        aftVar.e |= 1024;
    }

    public static age w() {
        return (age) a.ay();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpk
    protected final Object i(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return a;
                    }
                    return new age((byte[]) null, (byte[]) null, (char[]) null);
                }
                return new aft();
            }
            return aH(a, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"e", "f", "g", "h", "i", "j", "k", "l", aga.a(), "m", "n", "o", TtmlNode.TAG_P, aga.a(), "q", "r", StringSet.s, "t", StringSet.u, "v", "w", "x", "y", "z"});
        }
        return (byte) 1;
    }
}
