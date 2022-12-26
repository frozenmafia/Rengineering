package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfa extends bpk implements bqr {
    private static final bfa a;
    private int e;
    private bfb f;

    static {
        bfa bfaVar = new bfa();
        a = bfaVar;
        bpk.aI(bfa.class, bfaVar);
    }

    private bfa() {
    }

    public static /* synthetic */ bfa b() {
        return a;
    }

    public static bfa c(bnz bnzVar, boy boyVar) throws bpt {
        return (bfa) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void e(bfa bfaVar, bfb bfbVar) {
        bfbVar.getClass();
        bfaVar.f = bfbVar;
    }

    public static /* synthetic */ void f(bfa bfaVar) {
        bfaVar.e = 32;
    }

    public static bha g() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
    }

    public final bfb d() {
        bfb bfbVar = this.f;
        return bfbVar == null ? bfb.c() : bfbVar;
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
                    return new bha((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                }
                return new bfa();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
