package o;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes7.dex */
public final class setDefaultDragDirs extends setDefaultSwipeDirs {
    @Override // o.setDefaultSwipeDirs, o.endAnimation
    public /* bridge */ /* synthetic */ byte[] ah$a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.ah$a(bArr, bArr2);
    }

    @Override // o.setDefaultSwipeDirs, o.endAnimation
    public /* bridge */ /* synthetic */ byte[] values(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.values(bArr, bArr2);
    }

    public setDefaultDragDirs(byte[] bArr) throws InvalidKeyException {
        super(bArr);
    }

    @Override // o.setDefaultSwipeDirs
    onDown toString(byte[] bArr, int i) throws InvalidKeyException {
        return new onDown(bArr, i) { // from class: o.ItemTouchHelper.RecoverAnimation.1
            @Override // o.onDown
            int ag$a() {
                return 12;
            }

            @Override // o.onDown
            int[] values(int[] iArr, int i2) {
                if (iArr.length == ag$a() / 4) {
                    int[] iArr2 = new int[16];
                    onDown.ag$a(iArr2, this.toString);
                    iArr2[12] = i2;
                    System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                    return iArr2;
                }
                throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
            }
        };
    }
}
