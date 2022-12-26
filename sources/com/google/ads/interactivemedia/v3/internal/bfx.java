package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfx extends bpk implements bqr {
    private static final bfx a;
    private int e;
    private bfv f;
    private bnz g = bnz.f907b;
    private bnz h = bnz.f907b;

    static {
        bfx bfxVar = new bfx();
        a = bfxVar;
        bpk.aI(bfx.class, bfxVar);
    }

    private bfx() {
    }

    public static /* synthetic */ bfx c() {
        return a;
    }

    public static bfx d() {
        return a;
    }

    public static bfx e(bnz bnzVar, boy boyVar) throws bpt {
        return (bfx) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void h(bfx bfxVar, bfv bfvVar) {
        bfvVar.getClass();
        bfxVar.f = bfvVar;
    }

    public static /* synthetic */ void j(bfx bfxVar, bnz bnzVar) {
        bfxVar.g = bnzVar;
    }

    public static /* synthetic */ void k(bfx bfxVar, bnz bnzVar) {
        bfxVar.h = bnzVar;
    }

    public static /* synthetic */ void l(bfx bfxVar) {
        bfxVar.e = 0;
    }

    public static bha m() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
    }

    public final bfv b() {
        bfv bfvVar = this.f;
        return bfvVar == null ? bfv.c() : bfvVar;
    }

    public final bnz f() {
        return this.g;
    }

    public final bnz g() {
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
                    return new bha((byte[]) null, (byte[]) null, (short[]) null, (byte[]) null);
                }
                return new bfx();
            }
            return aH(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"e", "f", "g", "h"});
        }
        return (byte) 1;
    }
}
