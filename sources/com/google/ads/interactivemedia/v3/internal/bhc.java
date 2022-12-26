package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bhc extends bpk implements bqr {
    private static final bhc a;
    private int e;

    static {
        bhc bhcVar = new bhc();
        a = bhcVar;
        bpk.aI(bhc.class, bhcVar);
    }

    private bhc() {
    }

    public static /* synthetic */ bhc a() {
        return a;
    }

    public static bhc b() {
        return a;
    }

    public static bhc c(bnz bnzVar, boy boyVar) throws bpt {
        return (bhc) bpk.aB(a, bnzVar, boyVar);
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
                    return new bha((byte[]) null, (byte[][]) null);
                }
                return new bhc();
            }
            return aH(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"e"});
        }
        return (byte) 1;
    }
}
