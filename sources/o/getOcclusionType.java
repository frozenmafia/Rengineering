package o;
/* loaded from: classes5.dex */
final class getOcclusionType {
    private static int ah$a(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        while ((i & i3) != 0) {
            i3 >>= 1;
        }
        return (i & (i3 - 1)) + i3;
    }

    getOcclusionType() {
    }

    private static void valueOf(int[] iArr, int i, int i2, int i3, int i4) {
        do {
            i3 -= i2;
            iArr[i + i3] = i4;
        } while (i3 > 0);
    }

    private static int valueOf(int[] iArr, int i, int i2) {
        int i3;
        int i4 = 1 << (i - i2);
        while (i < 15 && (i3 = i4 - iArr[i]) > 0) {
            i++;
            i4 = i3 << 1;
        }
        return i - i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void ag$a(int[] iArr, int i, int i2, int[] iArr2, int i3) {
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = iArr2[i5];
            iArr4[i6] = iArr4[i6] + 1;
        }
        iArr5[1] = 0;
        int i7 = 1;
        while (i7 < 15) {
            int i8 = i7 + 1;
            iArr5[i8] = iArr5[i7] + iArr4[i7];
            i7 = i8;
        }
        for (int i9 = 0; i9 < i3; i9++) {
            if (iArr2[i9] != 0) {
                int i10 = iArr2[i9];
                int i11 = iArr5[i10];
                iArr5[i10] = i11 + 1;
                iArr3[i11] = i9;
            }
        }
        int i12 = 1 << i2;
        if (iArr5[15] == 1) {
            for (int i13 = 0; i13 < i12; i13++) {
                iArr[i + i13] = iArr3[0];
            }
            return;
        }
        int i14 = 2;
        int i15 = 0;
        int i16 = 1;
        int i17 = 2;
        while (i16 <= i2) {
            while (iArr4[i16] > 0) {
                valueOf(iArr, i + i15, i17, i12, iArr3[i4] | (i16 << 16));
                i15 = ah$a(i15, i16);
                iArr4[i16] = iArr4[i16] - 1;
                i4++;
            }
            i16++;
            i17 <<= 1;
        }
        int i18 = -1;
        int i19 = i2 + 1;
        int i20 = i;
        int i21 = i12;
        while (i19 <= 15) {
            while (iArr4[i19] > 0) {
                int i22 = (i12 - 1) & i15;
                if (i22 != i18) {
                    i20 += i21;
                    int valueOf = valueOf(iArr4, i19, i2);
                    iArr[i + i22] = ((valueOf + i2) << 16) | ((i20 - i) - i22);
                    i21 = 1 << valueOf;
                    i18 = i22;
                }
                valueOf(iArr, (i15 >> i2) + i20, i14, i21, ((i19 - i2) << 16) | iArr3[i4]);
                i15 = ah$a(i15, i19);
                iArr4[i19] = iArr4[i19] - 1;
                i4++;
            }
            i19++;
            i14 <<= 1;
        }
    }
}
