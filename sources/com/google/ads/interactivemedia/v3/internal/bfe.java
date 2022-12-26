package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfe extends bpk implements bqr {
    private static final bfe a;
    private int e;
    private bfg f;
    private bnz g = bnz.f907b;

    static {
        bfe bfeVar = new bfe();
        a = bfeVar;
        bpk.aI(bfe.class, bfeVar);
    }

    private bfe() {
    }

    public static /* synthetic */ bfe b() {
        return a;
    }

    public static bfe c() {
        return a;
    }

    public static bfe d(bnz bnzVar, boy boyVar) throws bpt {
        return (bfe) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void g(bfe bfeVar, bfg bfgVar) {
        bfgVar.getClass();
        bfeVar.f = bfgVar;
    }

    public static /* synthetic */ void h(bfe bfeVar, bnz bnzVar) {
        bfeVar.g = bnzVar;
    }

    public static /* synthetic */ void j(bfe bfeVar) {
        bfeVar.e = 0;
    }

    public static bha k() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
    }

    public final bfg e() {
        bfg bfgVar = this.f;
        return bfgVar == null ? bfg.c() : bfgVar;
    }

    public final bnz f() {
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
                    return new bha((byte[]) null, (char[]) null, (char[]) null, (byte[]) null, (byte[]) null);
                }
                return new bfe();
            }
            return aH(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
