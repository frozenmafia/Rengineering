package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bez extends bpk implements bqr {
    private static final bez a;
    private int e;
    private bnz f = bnz.f907b;
    private bfb g;

    static {
        bez bezVar = new bez();
        a = bezVar;
        bpk.aI(bez.class, bezVar);
    }

    private bez() {
    }

    public static /* synthetic */ bez b() {
        return a;
    }

    public static bez c(bnz bnzVar, boy boyVar) throws bpt {
        return (bez) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void f(bez bezVar, bnz bnzVar) {
        bezVar.f = bnzVar;
    }

    public static /* synthetic */ void g(bez bezVar, bfb bfbVar) {
        bfbVar.getClass();
        bezVar.g = bfbVar;
    }

    public static /* synthetic */ void h(bez bezVar) {
        bezVar.e = 0;
    }

    public static bha j() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
    }

    public final bfb d() {
        bfb bfbVar = this.g;
        return bfbVar == null ? bfb.c() : bfbVar;
    }

    public final bnz e() {
        return this.f;
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
                    return new bha(null, null, null, null, null, null, null);
                }
                return new bez();
            }
            return aH(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
