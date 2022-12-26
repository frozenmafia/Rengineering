package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class afy extends bpk implements bqr {
    private static final afy a;
    private int e;
    private bnz f = bnz.f907b;
    private bnz g;
    private bnz h;
    private bnz i;

    static {
        afy afyVar = new afy();
        a = afyVar;
        bpk.aI(afy.class, afyVar);
    }

    private afy() {
        bnz bnzVar = bnz.f907b;
        this.g = bnzVar;
        this.h = bnzVar;
        this.i = bnzVar;
    }

    public static /* synthetic */ afy a() {
        return a;
    }

    public static afy b(byte[] bArr, boy boyVar) throws bpt {
        return (afy) bpk.aC(a, bArr, boyVar);
    }

    public static /* synthetic */ void g(afy afyVar, bnz bnzVar) {
        afyVar.e |= 1;
        afyVar.f = bnzVar;
    }

    public static /* synthetic */ void h(afy afyVar, bnz bnzVar) {
        afyVar.e |= 2;
        afyVar.g = bnzVar;
    }

    public static /* synthetic */ void j(afy afyVar, bnz bnzVar) {
        afyVar.e |= 4;
        afyVar.h = bnzVar;
    }

    public static /* synthetic */ void k(afy afyVar, bnz bnzVar) {
        afyVar.e |= 8;
        afyVar.i = bnzVar;
    }

    public static age l() {
        return (age) a.ay();
    }

    public final bnz c() {
        return this.f;
    }

    public final bnz d() {
        return this.g;
    }

    public final bnz e() {
        return this.i;
    }

    public final bnz f() {
        return this.h;
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
                    return new age((byte[]) null, (char[]) null);
                }
                return new afy();
            }
            return aH(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"e", "f", "g", "h", "i"});
        }
        return (byte) 1;
    }
}
