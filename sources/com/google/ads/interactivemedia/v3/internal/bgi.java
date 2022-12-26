package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bgi extends bpk implements bqr {
    private static final bgi a;
    private int e;
    private int f;
    private int g;

    static {
        bgi bgiVar = new bgi();
        a = bgiVar;
        bpk.aI(bgi.class, bgiVar);
    }

    private bgi() {
    }

    public static /* synthetic */ bgi a() {
        return a;
    }

    public static bgi b() {
        return a;
    }

    public static /* synthetic */ void f(bgi bgiVar, int i) {
        bgiVar.e = bgg.b(i);
    }

    public static /* synthetic */ void g(bgi bgiVar, int i) {
        bgiVar.f = bgf.b(i);
    }

    public static /* synthetic */ void h(bgi bgiVar, int i) {
        bgiVar.g = bge.b(i);
    }

    public static bha j() {
        return (bha) a.ay();
    }

    public final int c() {
        int c = bge.c(this.g);
        return c == 0 ? bge.e : c;
    }

    public final int d() {
        int c = bgf.c(this.f);
        return c == 0 ? bgf.e : c;
    }

    public final int e() {
        int c = bgg.c(this.e);
        return c == 0 ? bgg.f : c;
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
                    return new bha((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
                }
                return new bgi();
            }
            return aH(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"e", "f", "g"});
        }
        return (byte) 1;
    }
}
