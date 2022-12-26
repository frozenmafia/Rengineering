package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgd extends bpk implements bqr {
    private static final bgd a;
    private int e;
    private int f;

    static {
        bgd bgdVar = new bgd();
        a = bgdVar;
        bpk.aI(bgd.class, bgdVar);
    }

    private bgd() {
    }

    public static /* synthetic */ bgd b() {
        return a;
    }

    public static bgd c() {
        return a;
    }

    public static /* synthetic */ void d(bgd bgdVar, int i) {
        bgdVar.f = i;
    }

    public static /* synthetic */ void f(bgd bgdVar, int i) {
        bgdVar.e = bga.a(i);
    }

    public static bha g() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.f;
    }

    public final int e() {
        int b2 = bga.b(this.e);
        return b2 == 0 ? bga.g : b2;
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
                    return new bha((byte[]) null, (byte[]) null, (char[]) null, (byte[]) null);
                }
                return new bgd();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
