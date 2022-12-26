package o;

import java.util.Arrays;
/* loaded from: classes7.dex */
class getDragDirs {
    getDragDirs() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] values(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr2[i] = (byte) ((bArr[i] << 1) & 254);
            if (i < 15) {
                bArr2[i] = (byte) (bArr2[i] | ((byte) ((bArr[i + 1] >> 7) & 1)));
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] ag$a(byte[] bArr) {
        if (bArr.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 16);
        copyOf[bArr.length] = Byte.MIN_VALUE;
        return copyOf;
    }
}
