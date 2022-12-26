package o;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public final class ItemTouchUIUtil {
    public static byte[] ah$a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws GeneralSecurityException {
        Mac ah$a = prepareForDrop.toString.ah$a(str);
        if (i > ah$a.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            ah$a.init(new SecretKeySpec(new byte[ah$a.getMacLength()], str));
        } else {
            ah$a.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i];
        ah$a.init(new SecretKeySpec(ah$a.doFinal(bArr), str));
        byte[] bArr5 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            ah$a.update(bArr5);
            ah$a.update(bArr3);
            ah$a.update((byte) i2);
            bArr5 = ah$a.doFinal();
            if (bArr5.length + i3 < i) {
                System.arraycopy(bArr5, 0, bArr4, i3, bArr5.length);
                i3 += bArr5.length;
                i2++;
            } else {
                System.arraycopy(bArr5, 0, bArr4, i3, i - i3);
                return bArr4;
            }
        }
    }
}
