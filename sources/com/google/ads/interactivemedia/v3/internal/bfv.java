package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfv extends bpk implements bqr {
    private static final bfv a;
    private bfy e;
    private bft f;
    private int g;

    static {
        bfv bfvVar = new bfv();
        a = bfvVar;
        bpk.aI(bfv.class, bfvVar);
    }

    private bfv() {
    }

    public static /* synthetic */ bfv b() {
        return a;
    }

    public static bfv c() {
        return a;
    }

    public static /* synthetic */ void e(bfv bfvVar, bfy bfyVar) {
        bfyVar.getClass();
        bfvVar.e = bfyVar;
    }

    public static /* synthetic */ void f(bfv bfvVar, bft bftVar) {
        bftVar.getClass();
        bfvVar.f = bftVar;
    }

    public static /* synthetic */ void h(bfv bfvVar, int i) {
        bfvVar.g = bfs.a(i);
    }

    public static bha j() {
        return (bha) a.ay();
    }

    public final bft a() {
        bft bftVar = this.f;
        return bftVar == null ? bft.b() : bftVar;
    }

    public final bfy d() {
        bfy bfyVar = this.e;
        return bfyVar == null ? bfy.b() : bfyVar;
    }

    public final int g() {
        int b2 = bfs.b(this.g);
        return b2 == 0 ? bfs.e : b2;
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
                    return new bha((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null, (byte[]) null);
                }
                return new bfv();
            }
            return aH(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
