package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfb extends bpk implements bqr {
    private static final bfb a;
    private int e;

    static {
        bfb bfbVar = new bfb();
        a = bfbVar;
        bpk.aI(bfb.class, bfbVar);
    }

    private bfb() {
    }

    public static /* synthetic */ bfb b() {
        return a;
    }

    public static bfb c() {
        return a;
    }

    public static /* synthetic */ void d(bfb bfbVar) {
        bfbVar.e = 16;
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
                    return new bha((byte[]) null, (byte[]) null, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                }
                return new bfb();
            }
            return aH(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"e"});
        }
        return (byte) 1;
    }
}
