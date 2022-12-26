package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class afu extends bpk implements bqr {
    private static final afu a;
    private int e;
    private long f = -1;
    private long g = -1;
    private long h = -1;
    private long i = -1;
    private long j = -1;
    private long k = -1;
    private long l = -1;
    private long m = -1;

    static {
        afu afuVar = new afu();
        a = afuVar;
        bpk.aI(afu.class, afuVar);
    }

    private afu() {
    }

    public static /* synthetic */ afu a() {
        return a;
    }

    public static /* synthetic */ void b(afu afuVar, long j) {
        afuVar.e |= 1;
        afuVar.f = j;
    }

    public static /* synthetic */ void c(afu afuVar, long j) {
        afuVar.e |= 4;
        afuVar.h = j;
    }

    public static /* synthetic */ void d(afu afuVar, long j) {
        afuVar.e |= 8;
        afuVar.i = j;
    }

    public static /* synthetic */ void e(afu afuVar, long j) {
        afuVar.e |= 16;
        afuVar.j = j;
    }

    public static /* synthetic */ void f(afu afuVar, long j) {
        afuVar.e |= 32;
        afuVar.k = j;
    }

    public static age g() {
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
                    return new age((byte[]) null, (short[]) null);
                }
                return new afu();
            }
            return aH(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        return (byte) 1;
    }
}
