package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgh extends bpk implements bqr {
    private static final bgh a;
    private bgi e;

    static {
        bgh bghVar = new bgh();
        a = bghVar;
        bpk.aI(bgh.class, bghVar);
    }

    private bgh() {
    }

    public static /* synthetic */ bgh a() {
        return a;
    }

    public static bgh b(bnz bnzVar, boy boyVar) throws bpt {
        return (bgh) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void d(bgh bghVar, bgi bgiVar) {
        bgiVar.getClass();
        bghVar.e = bgiVar;
    }

    public static bha e() {
        return (bha) a.ay();
    }

    public final bgi c() {
        bgi bgiVar = this.e;
        return bgiVar == null ? bgi.b() : bgiVar;
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
                    return new bha((byte[]) null, (short[]) null, (byte[]) null);
                }
                return new bgh();
            }
            return aH(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"e"});
        }
        return (byte) 1;
    }
}
