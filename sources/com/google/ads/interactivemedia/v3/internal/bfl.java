package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfl extends bpk implements bqr {
    private static final bfl a;
    private int e;
    private int f;

    static {
        bfl bflVar = new bfl();
        a = bflVar;
        bpk.aI(bfl.class, bflVar);
    }

    private bfl() {
    }

    public static /* synthetic */ bfl b() {
        return a;
    }

    public static bfl c(bnz bnzVar, boy boyVar) throws bpt {
        return (bfl) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void d(bfl bflVar, int i) {
        bflVar.e = i;
    }

    public static bha e() {
        return (bha) a.ay();
    }

    public final int a() {
        return this.e;
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
                    return new bha((byte[]) null, (byte[]) null, (byte[]) null, (short[]) null);
                }
                return new bfl();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"e", "f"});
        }
        return (byte) 1;
    }
}
