package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgk extends bpk implements bqr {
    private static final bgk a;
    private int e;
    private bgi f;
    private bnz g = bnz.f907b;

    static {
        bgk bgkVar = new bgk();
        a = bgkVar;
        bpk.aI(bgk.class, bgkVar);
    }

    private bgk() {
    }

    public static bgk d() {
        return a;
    }

    public static bgk e(bnz bnzVar, boy boyVar) throws bpt {
        return (bgk) bpk.aB(a, bnzVar, boyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void g(bgk bgkVar, bgi bgiVar) {
        bgiVar.getClass();
        bgkVar.f = bgiVar;
    }

    public static bha l() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
    }

    public final bgi b() {
        bgi bgiVar = this.f;
        return bgiVar == null ? bgi.b() : bgiVar;
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
                    return new bha((byte[]) null, (byte[]) null, (short[]) null);
                }
                return new bgk();
            }
            return aH(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }

    public final boolean j() {
        return this.f != null;
    }
}
