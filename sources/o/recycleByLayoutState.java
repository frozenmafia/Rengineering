package o;

import java.security.InvalidKeyException;
import java.util.Arrays;
/* loaded from: classes7.dex */
class recycleByLayoutState extends onDown {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onDown
    public int ag$a() {
        return 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public recycleByLayoutState(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // o.onDown
    int[] values(int[] iArr, int i) {
        if (iArr.length != ag$a() / 4) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        onDown.ag$a(iArr2, toString(this.toString, iArr));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    static int[] toString(int[] iArr, int[] iArr2) {
        onDown.ag$a(r0, iArr);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr2[0], iArr2[1], iArr2[2], iArr2[3]};
        onDown.valueOf(iArr3);
        return Arrays.copyOf(iArr3, 8);
    }
}
