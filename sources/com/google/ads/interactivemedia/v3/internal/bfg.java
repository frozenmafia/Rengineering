package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfg extends bpk implements bqr {
    private static final bfg a;
    private int e;

    static {
        bfg bfgVar = new bfg();
        a = bfgVar;
        bpk.aI(bfg.class, bfgVar);
    }

    private bfg() {
    }

    public static /* synthetic */ bfg b() {
        return a;
    }

    public static bfg c() {
        return a;
    }

    public static /* synthetic */ void d(bfg bfgVar) {
        bfgVar.e = 16;
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
                    return new bha((byte[]) null, (int[]) null, (byte[]) null, (byte[]) null);
                }
                return new bfg();
            }
            return aH(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"e"});
        }
        return (byte) 1;
    }
}
