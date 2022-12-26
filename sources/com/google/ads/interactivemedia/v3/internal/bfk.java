package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfk extends bpk implements bqr {
    private static final bfk a;
    private int e;
    private bnz f = bnz.f907b;

    static {
        bfk bfkVar = new bfk();
        a = bfkVar;
        bpk.aI(bfk.class, bfkVar);
    }

    private bfk() {
    }

    public static /* synthetic */ bfk b() {
        return a;
    }

    public static bfk c(bnz bnzVar, boy boyVar) throws bpt {
        return (bfk) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void e(bfk bfkVar, bnz bnzVar) {
        bfkVar.f = bnzVar;
    }

    public static /* synthetic */ void f(bfk bfkVar) {
        bfkVar.e = 0;
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
                    return new bha((byte[]) null, (short[]) null, (char[]) null);
                }
                return new bfk();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
