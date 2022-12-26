package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfj extends bpk implements bqr {
    private static final bfj a;
    private int e;

    static {
        bfj bfjVar = new bfj();
        a = bfjVar;
        bpk.aI(bfj.class, bfjVar);
    }

    private bfj() {
    }

    public static /* synthetic */ bfj b() {
        return a;
    }

    public static bfj c() {
        return a;
    }

    public static /* synthetic */ void d(bfj bfjVar) {
        bfjVar.e = 16;
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
                    return new bha((byte[]) null, (byte[]) null, (char[]) null, (char[]) null);
                }
                return new bfj();
            }
            return aH(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"e"});
        }
        return (byte) 1;
    }
}
