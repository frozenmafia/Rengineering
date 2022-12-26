package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgs extends bpk implements bqr {
    private static final bgs a;
    private String e = "";
    private int f;
    private int g;
    private int h;

    static {
        bgs bgsVar = new bgs();
        a = bgsVar;
        bpk.aI(bgs.class, bgsVar);
    }

    private bgs() {
    }

    public static /* synthetic */ bgs a() {
        return a;
    }

    public static /* synthetic */ void b(bgs bgsVar, String str) {
        str.getClass();
        bgsVar.e = str;
    }

    public static /* synthetic */ void c(bgs bgsVar, int i) {
        bgsVar.g = i;
    }

    public static /* synthetic */ void d(bgs bgsVar, int i) {
        bgsVar.h = bgy.a(i);
    }

    public static /* synthetic */ void e(bgs bgsVar, int i) {
        bgsVar.f = bgn.a(i);
    }

    public static bha f() {
        return (bha) a.ay();
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
                    return new bha((byte[]) null, (char[]) null);
                }
                return new bgs();
            }
            return aH(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"e", "f", "g", "h"});
        }
        return (byte) 1;
    }
}
