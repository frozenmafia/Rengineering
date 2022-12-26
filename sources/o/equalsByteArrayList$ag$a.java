package o;

import java.util.Arrays;
import java.util.Random;
/* loaded from: classes3.dex */
public class equalsByteArrayList$ag$a implements equalsByteArrayList {
    private final Random ag$a;
    private final int[] ah$a;
    private final int[] values;

    public equalsByteArrayList$ag$a(int i) {
        this(i, new Random());
    }

    private equalsByteArrayList$ag$a(int i, Random random) {
        this(toString(i, random), random);
    }

    private equalsByteArrayList$ag$a(int[] iArr, Random random) {
        this.values = iArr;
        this.ag$a = random;
        this.ah$a = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.ah$a[iArr[i]] = i;
        }
    }

    @Override // o.equalsByteArrayList
    public int values() {
        return this.values.length;
    }

    @Override // o.equalsByteArrayList
    public int toString(int i) {
        int i2 = this.ah$a[i] + 1;
        int[] iArr = this.values;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    @Override // o.equalsByteArrayList
    public int valueOf(int i) {
        int i2 = this.ah$a[i] - 1;
        if (i2 >= 0) {
            return this.values[i2];
        }
        return -1;
    }

    @Override // o.equalsByteArrayList
    public int ag$a() {
        int[] iArr = this.values;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        return -1;
    }

    @Override // o.equalsByteArrayList
    public int ah$a() {
        int[] iArr = this.values;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    @Override // o.equalsByteArrayList
    public equalsByteArrayList values(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            iArr[i4] = this.ag$a.nextInt(this.values.length + 1);
            int i5 = i4 + 1;
            int nextInt = this.ag$a.nextInt(i5);
            iArr2[i4] = iArr2[nextInt];
            iArr2[nextInt] = i4 + i;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.values.length + i2];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr4 = this.values;
            if (i3 < iArr4.length + i2) {
                if (i6 < i2 && i7 == iArr[i6]) {
                    iArr3[i3] = iArr2[i6];
                    i6++;
                } else {
                    iArr3[i3] = iArr4[i7];
                    if (iArr3[i3] >= i) {
                        iArr3[i3] = iArr3[i3] + i2;
                    }
                    i7++;
                }
                i3++;
            } else {
                return new equalsByteArrayList$ag$a(iArr3, new Random(this.ag$a.nextLong()));
            }
        }
    }

    @Override // o.equalsByteArrayList
    public equalsByteArrayList toString(int i, int i2) {
        int i3 = i2 - i;
        int[] iArr = new int[this.values.length - i3];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = this.values;
            if (i4 < iArr2.length) {
                if (iArr2[i4] < i || iArr2[i4] >= i2) {
                    iArr[i4 - i5] = iArr2[i4] >= i ? iArr2[i4] - i3 : iArr2[i4];
                } else {
                    i5++;
                }
                i4++;
            } else {
                return new equalsByteArrayList$ag$a(iArr, new Random(this.ag$a.nextLong()));
            }
        }
    }

    @Override // o.equalsByteArrayList
    public equalsByteArrayList valueOf() {
        return new equalsByteArrayList$ag$a(0, new Random(this.ag$a.nextLong()));
    }

    private static int[] toString(int i, Random random) {
        int[] iArr = new int[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            int nextInt = random.nextInt(i3);
            iArr[i2] = iArr[nextInt];
            iArr[nextInt] = i2;
            i2 = i3;
        }
        return iArr;
    }
}
