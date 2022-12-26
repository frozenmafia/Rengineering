package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfz {
    public static final int a = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final int f821b = 4;
    public static final int c = 5;
    public static final int d = 6;
    public static final int e = 7;
    public static final int f = 1;
    private static final /* synthetic */ int[] g = {a, f821b, c, d, e, f};

    public static int a(int i) {
        if (i != f) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return 0;
                        }
                        return e;
                    }
                    return d;
                }
                return c;
            }
            return f821b;
        }
        return a;
    }

    public static int[] values$ar$edu$1f5331ac_0() {
        return new int[]{a, f821b, c, d, e, f};
    }
}
