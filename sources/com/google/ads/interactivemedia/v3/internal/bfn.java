package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfn extends bpk implements bqr {
    private static final bfn a;
    private int e;
    private int f;

    static {
        bfn bfnVar = new bfn();
        a = bfnVar;
        bpk.aI(bfn.class, bfnVar);
    }

    private bfn() {
    }

    public static /* synthetic */ bfn b() {
        return a;
    }

    public static bfn c(bnz bnzVar, boy boyVar) throws bpt {
        return (bfn) bpk.aB(a, bnzVar, boyVar);
    }

    public static /* synthetic */ void d(bfn bfnVar, int i) {
        bfnVar.e = i;
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
                    return new bha((byte[]) null, (byte[]) null, (int[]) null);
                }
                return new bfn();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"f", "e"});
        }
        return (byte) 1;
    }
}
