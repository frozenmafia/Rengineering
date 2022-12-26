package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfu extends bpk implements bqr {
    private static final bfu a;
    private bfv e;

    static {
        bfu bfuVar = new bfu();
        a = bfuVar;
        bpk.aI(bfu.class, bfuVar);
    }

    private bfu() {
    }

    public static /* synthetic */ bfu a() {
        return a;
    }

    public static bfu b(bnz bnzVar, boy boyVar) throws bpt {
        return (bfu) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void d(bfu bfuVar, bfv bfvVar) {
        bfvVar.getClass();
        bfuVar.e = bfvVar;
    }

    public static bha e() {
        return (bha) a.ay();
    }

    public final bfv c() {
        bfv bfvVar = this.e;
        return bfvVar == null ? bfv.c() : bfvVar;
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
                    return new bha((byte[]) null, (short[]) null, (byte[]) null, (byte[]) null);
                }
                return new bfu();
            }
            return aH(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"e"});
        }
        return (byte) 1;
    }
}
