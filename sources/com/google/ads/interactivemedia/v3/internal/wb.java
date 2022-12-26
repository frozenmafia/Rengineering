package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
/* loaded from: classes4.dex */
public final class wb {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f1324b;
    private final ui[] c;
    private final int[] d;
    private final int[][][] e;
    private final ui f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wb(int[] iArr, ui[] uiVarArr, int[] iArr2, int[][][] iArr3, ui uiVar) {
        this.f1324b = iArr;
        this.c = uiVarArr;
        this.e = iArr3;
        this.d = iArr2;
        this.f = uiVar;
        this.a = iArr.length;
    }

    public final int a() {
        return this.a;
    }

    public final int b(int i) {
        return this.f1324b[i];
    }

    public final int c(int i, int i2, int i3) {
        return fy.f(this.e[i][i2][i3]);
    }

    public final ui d(int i) {
        return this.c[i];
    }

    public final ui e() {
        return this.f;
    }

    public final int f(int i, int i2) {
        int i3 = this.c[i].b(i2).a;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (c(i, i2, i6) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        int i7 = 16;
        String str = null;
        boolean z = false;
        int i8 = 0;
        while (i4 < copyOf.length) {
            String str2 = this.c[i].b(i2).b(copyOf[i4]).l;
            if (i8 != 0) {
                z |= !cp.V(str, str2);
            } else {
                str = str2;
            }
            i7 = Math.min(i7, this.e[i][i2][i4] & 24);
            i4++;
            i8++;
        }
        return z ? Math.min(i7, this.d[i]) : i7;
    }
}
