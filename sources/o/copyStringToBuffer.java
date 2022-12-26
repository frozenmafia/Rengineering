package o;
/* loaded from: classes5.dex */
public class copyStringToBuffer {
    static final byte[] ag$a = new byte[256];
    static final byte[] toString = new byte[256];
    static final int[] ah$a = new int[256];
    static final int[] values = new int[256];
    static final int[] valueOf = new int[256];
    static final int[] HaptikSDK$b = new int[256];
    static final int[] invoke = new int[10];

    private static int ag$a(byte b2, int i) {
        int i2 = b2 & 255;
        return (i2 >> (8 - i)) | (i2 << i);
    }

    static {
        valueOf();
        for (int i = 0; i < 256; i++) {
            int i2 = ag$a[i] & 255;
            toString[i2] = (byte) i;
            int i3 = i << 1;
            if (i3 >= 256) {
                i3 ^= 283;
            }
            int i4 = i3 << 1;
            if (i4 >= 256) {
                i4 ^= 283;
            }
            int i5 = i4 << 1;
            if (i5 >= 256) {
                i5 ^= 283;
            }
            int i6 = i5 ^ i;
            int i7 = ((i3 ^ (i4 ^ i5)) << 24) | (i6 << 16) | ((i6 ^ i4) << 8) | (i6 ^ i3);
            ah$a[i2] = i7;
            values[i2] = (i7 >>> 8) | (i7 << 24);
            valueOf[i2] = (i7 >>> 16) | (i7 << 16);
            HaptikSDK$b[i2] = (i7 << 8) | (i7 >>> 24);
        }
        ag$a(283);
    }

    static int[] values(byte[] bArr, int i) throws IllegalArgumentException {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i2 = (i + 1) * 4;
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < 4) {
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = (bArr[i5] << 24) | ((bArr[i6] & 255) << 16);
            int i9 = i7 + 1;
            iArr[i4] = i8 | ((bArr[i7] & 255) << 8) | (bArr[i9] & 255);
            i4++;
            i5 = i9 + 1;
        }
        int i10 = 0;
        int i11 = 4;
        while (i11 < i2) {
            int i12 = iArr[i11 - 1];
            if (i3 == 0) {
                byte[] bArr2 = ag$a;
                i12 = ((bArr2[i12 >>> 24] & 255) | (((bArr2[(i12 >>> 16) & 255] << 24) | ((bArr2[(i12 >>> 8) & 255] & 255) << 16)) | ((bArr2[i12 & 255] & 255) << 8))) ^ invoke[i10];
                i10++;
                i3 = 4;
            }
            iArr[i11] = i12 ^ iArr[i11 - 4];
            i11++;
            i3--;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] toString(byte[] bArr, int i) throws IllegalArgumentException {
        return values(bArr, values(bArr, i), i);
    }

    private static int[] values(byte[] bArr, int[] iArr, int i) throws IllegalArgumentException {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i2 = 4;
        int[] iArr2 = new int[(i + 1) * 4];
        int i3 = i * 4;
        int i4 = i3 + 1;
        iArr2[0] = iArr[i3];
        int i5 = i4 + 1;
        int i6 = iArr[i4];
        int i7 = 1;
        iArr2[1] = i6;
        int i8 = i5 + 1;
        iArr2[2] = iArr[i5];
        iArr2[3] = iArr[i8];
        int i9 = i8 - 7;
        while (i7 < i) {
            int i10 = i9 + 1;
            int i11 = iArr[i9];
            int i12 = i2 + 1;
            int[] iArr3 = ah$a;
            byte[] bArr2 = ag$a;
            int i13 = iArr3[bArr2[i11 >>> 24] & 255];
            int[] iArr4 = values;
            int i14 = i13 ^ iArr4[bArr2[(i11 >>> 16) & 255] & 255];
            int[] iArr5 = valueOf;
            int i15 = i14 ^ iArr5[bArr2[(i11 >>> 8) & 255] & 255];
            int[] iArr6 = HaptikSDK$b;
            iArr2[i2] = iArr6[bArr2[i11 & 255] & 255] ^ i15;
            int i16 = i10 + 1;
            int i17 = iArr[i10];
            int i18 = i12 + 1;
            iArr2[i12] = iArr6[bArr2[i17 & 255] & 255] ^ ((iArr3[bArr2[i17 >>> 24] & 255] ^ iArr4[bArr2[(i17 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i17 >>> 8) & 255] & 255]);
            int i19 = i16 + 1;
            int i20 = iArr[i16];
            int i21 = i18 + 1;
            iArr2[i18] = iArr6[bArr2[i20 & 255] & 255] ^ ((iArr3[bArr2[i20 >>> 24] & 255] ^ iArr4[bArr2[(i20 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i20 >>> 8) & 255] & 255]);
            int i22 = iArr[i19];
            int i23 = i21 + 1;
            iArr2[i21] = iArr6[bArr2[i22 & 255] & 255] ^ ((iArr3[bArr2[i22 >>> 24] & 255] ^ iArr4[bArr2[(i22 >>> 16) & 255] & 255]) ^ iArr5[bArr2[(i22 >>> 8) & 255] & 255]);
            i9 = i19 - 7;
            i7++;
            i2 = i23;
        }
        int i24 = i2 + 1;
        int i25 = i9 + 1;
        iArr2[i2] = iArr[i9];
        int i26 = i24 + 1;
        int i27 = i25 + 1;
        iArr2[i24] = iArr[i25];
        iArr2[i26] = iArr[i27];
        iArr2[i26 + 1] = iArr[i27 + 1];
        return iArr2;
    }

    public static byte[][] toString(int i) {
        byte[][] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            byte[] bArr2 = new byte[4];
            bArr2[0] = (byte) (i3 & 3);
            bArr2[1] = (byte) ((i3 >> 2) & 3);
            bArr2[2] = (byte) ((i3 >> 4) & 3);
            bArr2[3] = (byte) ((i3 >> 6) & 3);
            bArr[i2] = bArr2;
        }
        return bArr;
    }

    private static void valueOf() {
        int i;
        byte b2 = 1;
        byte b3 = 1;
        do {
            b2 = (byte) (((b2 & 128) != 0 ? 27 : 0) ^ ((b2 << 1) ^ b2));
            byte b4 = (byte) (b3 ^ (b3 << 1));
            byte b5 = (byte) (b4 ^ (b4 << 2));
            byte b6 = (byte) (b5 ^ (b5 << 4));
            b3 = (byte) (b6 ^ ((b6 & 128) != 0 ? (byte) 9 : (byte) 0));
            i = b2 & 255;
            ag$a[i] = (byte) (((((b3 ^ 99) ^ ag$a(b3, 1)) ^ ag$a(b3, 2)) ^ ag$a(b3, 3)) ^ ag$a(b3, 4));
        } while (i != 1);
        ag$a[0] = 99;
    }

    private static void ag$a(int i) {
        invoke[0] = 16777216;
        int i2 = 1;
        for (int i3 = 1; i3 < 10; i3++) {
            i2 <<= 1;
            if (i2 >= 256) {
                i2 ^= i;
            }
            invoke[i3] = i2 << 24;
        }
    }
}
