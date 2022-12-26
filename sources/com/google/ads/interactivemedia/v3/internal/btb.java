package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.sendbird.android.constant.StringSet;
/* loaded from: classes7.dex */
public final class btb extends bpk implements bqr {
    private static final btb a;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f978o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;

    static {
        btb btbVar = new btb();
        a = btbVar;
        bpk.aI(btb.class, btbVar);
    }

    private btb() {
    }

    public static btb e() {
        return a;
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
                    return new bsx((byte[]) null, (int[]) null);
                }
                return new btb();
            }
            return aH(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဇ\b\nဇ\t\u000bဇ\u000b\fဇ\r\rဇ\f\u000eဇ\n", new Object[]{"e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "q", StringSet.s, "r", TtmlNode.TAG_P});
        }
        return (byte) 1;
    }
}
