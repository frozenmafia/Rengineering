package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bft extends bpk implements bqr {
    private static final bft a;
    private bgo e;

    static {
        bft bftVar = new bft();
        a = bftVar;
        bpk.aI(bft.class, bftVar);
    }

    private bft() {
    }

    public static /* synthetic */ bft a() {
        return a;
    }

    public static bft b() {
        return a;
    }

    public static /* synthetic */ void d(bft bftVar, bgo bgoVar) {
        bgoVar.getClass();
        bftVar.e = bgoVar;
    }

    public static bha e() {
        return (bha) a.ay();
    }

    public final bgo c() {
        bgo bgoVar = this.e;
        return bgoVar == null ? bgo.b() : bgoVar;
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
                    return new bha((byte[]) null, (byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
                }
                return new bft();
            }
            return aH(a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"e"});
        }
        return (byte) 1;
    }
}
