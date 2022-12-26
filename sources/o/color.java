package o;
/* loaded from: classes3.dex */
final class color {

    /* loaded from: classes3.dex */
    public static final class toString {
        public final int[] ag$a;
        public final int[] ah$a;
        public final long[] ah$b;
        public final int toString;
        public final long[] valueOf;
        public final long values;

        private toString(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.valueOf = jArr;
            this.ag$a = iArr;
            this.toString = i;
            this.ah$b = jArr2;
            this.ah$a = iArr2;
            this.values = j;
        }
    }

    public static toString ag$a(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += getElevationDegrees.valueOf(i4, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr2 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr3 = new int[i3];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            long j2 = jArr[i8];
            while (i9 > 0) {
                int min = Math.min(i2, i9);
                jArr2[i6] = j2;
                iArr2[i6] = i * min;
                i7 = Math.max(i7, iArr2[i6]);
                jArr3[i6] = i5 * j;
                iArr3[i6] = 1;
                j2 += iArr2[i6];
                i5 += min;
                i9 -= min;
                i6++;
            }
        }
        return new toString(jArr2, iArr2, i7, jArr3, iArr3, j * i5);
    }
}
