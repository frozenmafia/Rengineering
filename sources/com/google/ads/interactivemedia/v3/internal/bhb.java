package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bhb extends bpk implements bqr {
    private static final bhb a;
    private int e;
    private bnz f = bnz.f907b;

    static {
        bhb bhbVar = new bhb();
        a = bhbVar;
        bpk.aI(bhb.class, bhbVar);
    }

    private bhb() {
    }

    public static bha b() {
        return (bha) a.ay();
    }

    public static /* synthetic */ bhb c() {
        return a;
    }

    public static bhb d(bnz bnzVar, boy boyVar) throws bpt {
        return (bhb) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void f(bhb bhbVar, bnz bnzVar) {
        bhbVar.f = bnzVar;
    }

    public static /* synthetic */ void g(bhb bhbVar) {
        bhbVar.e = 0;
    }

    public final int a() {
        return this.e;
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
                    return new bha(null);
                }
                return new bhb();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
