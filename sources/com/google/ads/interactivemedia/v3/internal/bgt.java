package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgt extends bpk implements bqr {
    private static final bgt a;
    private int e;
    private bpq f = aE();

    static {
        bgt bgtVar = new bgt();
        a = bgtVar;
        bpk.aI(bgt.class, bgtVar);
    }

    private bgt() {
    }

    public static /* synthetic */ bgt a() {
        return a;
    }

    public static /* synthetic */ void b(bgt bgtVar, int i) {
        bgtVar.e = i;
    }

    public static /* synthetic */ void c(bgt bgtVar, bgs bgsVar) {
        bgsVar.getClass();
        bgtVar.e();
        bgtVar.f.add(bgsVar);
    }

    public static bha d() {
        return (bha) a.ay();
    }

    private final void e() {
        bpq bpqVar = this.f;
        if (bpqVar.c()) {
            return;
        }
        this.f = bpk.aF(bpqVar);
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
                    return new bha((byte[]) null, (byte[]) null, (char[]) null);
                }
                return new bgt();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"e", "f", bgs.class});
        }
        return (byte) 1;
    }
}
