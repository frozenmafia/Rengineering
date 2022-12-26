package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
/* loaded from: classes4.dex */
public final class bgr extends bpk implements bqr {
    private static final bgr a;
    private int e;
    private bpq f = aE();

    static {
        bgr bgrVar = new bgr();
        a = bgrVar;
        bpk.aI(bgr.class, bgrVar);
    }

    private bgr() {
    }

    public static /* synthetic */ bgr c() {
        return a;
    }

    public static bgr d(byte[] bArr, boy boyVar) throws bpt {
        return (bgr) bpk.aC(a, bArr, boyVar);
    }

    public final int a() {
        return this.f.size();
    }

    public final int b() {
        return this.e;
    }

    public final List e() {
        return this.f;
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
                    return new bha((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
                }
                return new bgr();
            }
            return aH(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"e", "f", bgq.class});
        }
        return (byte) 1;
    }
}
