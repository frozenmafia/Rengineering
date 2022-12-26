package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfo extends bpk implements bqr {
    private static final bfo a;
    private int e;
    private bnz f = bnz.f907b;

    static {
        bfo bfoVar = new bfo();
        a = bfoVar;
        bpk.aI(bfo.class, bfoVar);
    }

    private bfo() {
    }

    public static /* synthetic */ bfo b() {
        return a;
    }

    public static bfo c(bnz bnzVar, boy boyVar) throws bpt {
        return (bfo) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void e(bfo bfoVar, bnz bnzVar) {
        bfoVar.f = bnzVar;
    }

    public static /* synthetic */ void f(bfo bfoVar) {
        bfoVar.e = 0;
    }

    public static bha g() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
    }

    public final bnz d() {
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
                    return new bha((byte[]) null, (boolean[]) null, (byte[]) null);
                }
                return new bfo();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
