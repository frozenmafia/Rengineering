package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Random;
/* loaded from: classes4.dex */
public final class ue {
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f1295b;
    private final Object c;

    public ue(ja... jaVarArr) {
        kl klVar = new kl();
        kn knVar = new kn();
        ja[] jaVarArr2 = new ja[2];
        this.f1295b = jaVarArr2;
        System.arraycopy(jaVarArr, 0, jaVarArr2, 0, 0);
        this.a = klVar;
        this.c = knVar;
        ja[] jaVarArr3 = jaVarArr2;
        jaVarArr3[0] = klVar;
        jaVarArr3[1] = knVar;
    }

    public final int a() {
        int[] iArr = (int[]) this.f1295b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final int b() {
        int[] iArr = (int[]) this.f1295b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int c() {
        return ((int[]) this.f1295b).length;
    }

    public final int d(int i) {
        int i2 = ((int[]) this.c)[i] + 1;
        int[] iArr = (int[]) this.f1295b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int e(int i) {
        int i2 = ((int[]) this.c)[i] - 1;
        if (i2 >= 0) {
            return ((int[]) this.f1295b)[i2];
        }
        return -1;
    }

    public final ue f() {
        return new ue(new Random(((Random) this.a).nextLong()));
    }

    public final ue g(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            iArr[i4] = ((Random) this.a).nextInt(((int[]) this.f1295b).length + 1);
            int i5 = i4 + 1;
            int nextInt = ((Random) this.a).nextInt(i5);
            iArr2[i4] = iArr2[nextInt];
            iArr2[nextInt] = i4 + i;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[((int[]) this.f1295b).length + i2];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr4 = (int[]) this.f1295b;
            if (i3 < iArr4.length + i2) {
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i8 = iArr4[i7];
                    iArr3[i3] = i8;
                    if (i8 >= i) {
                        iArr3[i3] = i8 + i2;
                    }
                    i7++;
                } else {
                    iArr3[i3] = iArr2[i6];
                    i6++;
                }
                i3++;
            } else {
                return new ue(iArr3, new Random(((Random) this.a).nextLong()));
            }
        }
    }

    public final ue h(int i, int i2) {
        int i3 = i2 - i;
        int[] iArr = new int[((int[]) this.f1295b).length - i3];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = (int[]) this.f1295b;
            if (i4 < iArr2.length) {
                int i6 = iArr2[i4];
                if (i6 < i || i6 >= i2) {
                    if (i6 >= i) {
                        i6 -= i3;
                    }
                    iArr[i4 - i5] = i6;
                } else {
                    i5++;
                }
                i4++;
            } else {
                return new ue(iArr, new Random(((Random) this.a).nextLong()));
            }
        }
    }

    public final long i(long j) {
        return ((kn) this.c).i(j);
    }

    public final long j() {
        return ((kl) this.a).o();
    }

    public final ja[] k() {
        return (ja[]) this.f1295b;
    }

    public final void l(au auVar) {
        ((kn) this.c).k(auVar.f720b);
        ((kn) this.c).j(auVar.c);
    }

    public final void m(boolean z) {
        ((kl) this.a).p(z);
    }

    public ue() {
        this(new Random());
    }

    private ue(Random random) {
        this(new int[0], random);
    }

    private ue(int[] iArr, Random random) {
        this.f1295b = iArr;
        this.a = random;
        this.c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            ((int[]) this.c)[iArr[i]] = i;
        }
    }
}
