package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class aoz extends bpk implements bqr {
    private static final aoz a;
    private int e;
    private apb f;
    private bnz g = bnz.f907b;
    private bnz h = bnz.f907b;

    static {
        aoz aozVar = new aoz();
        a = aozVar;
        bpk.aI(aoz.class, aozVar);
    }

    private aoz() {
    }

    public static aoz b(bnz bnzVar, boy boyVar) throws bpt {
        return (aoz) bpk.aB(a, bnzVar, boyVar);
    }

    public final apb c() {
        apb apbVar = this.f;
        return apbVar == null ? apb.f() : apbVar;
    }

    public final bnz d() {
        return this.h;
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
                    return new apa(null, null);
                }
                return new aoz();
            }
            return aH(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"e", "f", "g", "h"});
        }
        return (byte) 1;
    }
}
