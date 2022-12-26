package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bff extends bpk implements bqr {
    private static final bff a;
    private bfg e;
    private int f;

    static {
        bff bffVar = new bff();
        a = bffVar;
        bpk.aI(bff.class, bffVar);
    }

    private bff() {
    }

    public static /* synthetic */ bff b() {
        return a;
    }

    public static bff c() {
        return a;
    }

    public static bff d(bnz bnzVar, boy boyVar) throws bpt {
        return (bff) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void f(bff bffVar, bfg bfgVar) {
        bfgVar.getClass();
        bffVar.e = bfgVar;
    }

    public static /* synthetic */ void g(bff bffVar, int i) {
        bffVar.f = i;
    }

    public static bha h() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.f;
    }

    public final bfg e() {
        bfg bfgVar = this.e;
        return bfgVar == null ? bfg.c() : bfgVar;
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
                    return new bha((byte[]) null, (byte[]) null, (short[]) null, (byte[]) null, (byte[]) null);
                }
                return new bff();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
