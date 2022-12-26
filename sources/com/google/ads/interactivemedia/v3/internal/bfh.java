package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfh extends bpk implements bqr {
    private static final bfh a;
    private int e;
    private bfj f;
    private bnz g = bnz.f907b;

    static {
        bfh bfhVar = new bfh();
        a = bfhVar;
        bpk.aI(bfh.class, bfhVar);
    }

    private bfh() {
    }

    public static /* synthetic */ bfh b() {
        return a;
    }

    public static bfh c(bnz bnzVar, boy boyVar) throws bpt {
        return (bfh) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void f(bfh bfhVar, bfj bfjVar) {
        bfjVar.getClass();
        bfhVar.f = bfjVar;
    }

    public static /* synthetic */ void g(bfh bfhVar, bnz bnzVar) {
        bfhVar.g = bnzVar;
    }

    public static /* synthetic */ void h(bfh bfhVar) {
        bfhVar.e = 0;
    }

    public static bha j() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
    }

    public final bfj d() {
        bfj bfjVar = this.f;
        return bfjVar == null ? bfj.c() : bfjVar;
    }

    public final bnz e() {
        return this.g;
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
                    return new bha((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
                }
                return new bfh();
            }
            return aH(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
