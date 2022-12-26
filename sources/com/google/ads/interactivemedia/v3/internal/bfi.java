package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfi extends bpk implements bqr {
    private static final bfi a;
    private bfj e;
    private int f;

    static {
        bfi bfiVar = new bfi();
        a = bfiVar;
        bpk.aI(bfi.class, bfiVar);
    }

    private bfi() {
    }

    public static /* synthetic */ bfi b() {
        return a;
    }

    public static bfi c(bnz bnzVar, boy boyVar) throws bpt {
        return (bfi) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void e(bfi bfiVar, bfj bfjVar) {
        bfjVar.getClass();
        bfiVar.e = bfjVar;
    }

    public static /* synthetic */ void f(bfi bfiVar, int i) {
        bfiVar.f = i;
    }

    public static bha g() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.f;
    }

    public final bfj d() {
        bfj bfjVar = this.e;
        return bfjVar == null ? bfj.c() : bfjVar;
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
                    return new bha((byte[]) null, (char[]) null, (byte[]) null, (char[]) null, (byte[]) null);
                }
                return new bfi();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
