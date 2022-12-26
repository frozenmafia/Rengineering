package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bga {
    public static final int a = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final int f822b = 3;
    public static final int c = 4;
    public static final int d = 5;
    public static final int e = 6;
    public static final int f = 7;
    public static final int g = 1;
    private static final /* synthetic */ int[] h = {a, f822b, c, d, e, f, g};

    public static int a(int i) {
        if (i != g) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return 0;
                            }
                            return f;
                        }
                        return e;
                    }
                    return d;
                }
                return c;
            }
            return f822b;
        }
        return a;
    }

    public static int[] values$ar$edu$309cd8f0_0() {
        return new int[]{a, f822b, c, d, e, f, g};
    }
}
