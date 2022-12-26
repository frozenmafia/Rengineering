package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class bfs {
    public static final int a = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final int f820b = 3;
    public static final int c = 4;
    public static final int d = 5;
    public static final int e = 1;
    private static final /* synthetic */ int[] f = {a, f820b, c, d, e};

    public static int a(int i) {
        if (i != e) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 0;
                    }
                    return d;
                }
                return c;
            }
            return f820b;
        }
        return a;
    }

    public static int[] values$ar$edu$34ac0a47_0() {
        return new int[]{a, f820b, c, d, e};
    }
}
