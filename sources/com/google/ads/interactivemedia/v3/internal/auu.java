package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public abstract class auu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public abstract void b(Object obj);
}
