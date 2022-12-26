package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgq extends bpk implements bqr {
    private static final bgq a;
    private bgm e;
    private int f;
    private int g;
    private int h;

    static {
        bgq bgqVar = new bgq();
        a = bgqVar;
        bpk.aI(bgq.class, bgqVar);
    }

    private bgq() {
    }

    public static /* synthetic */ bgq c() {
        return a;
    }

    public final int a() {
        return this.g;
    }

    public final bgm b() {
        bgm bgmVar = this.e;
        return bgmVar == null ? bgm.b() : bgmVar;
    }

    public final boolean d() {
        return this.e != null;
    }

    public final int e() {
        int b2 = bgn.b(this.f);
        return b2 == 0 ? bgn.e : b2;
    }

    public final int f() {
        int b2 = bgy.b(this.h);
        return b2 == 0 ? bgy.f : b2;
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
                    return new bha((byte[]) null, (short[]) null);
                }
                return new bgq();
            }
            return aH(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"e", "f", "g", "h"});
        }
        return (byte) 1;
    }
}
