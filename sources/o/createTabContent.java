package o;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
/* loaded from: classes6.dex */
public class createTabContent {
    private byte[] ah$a = null;
    private final CharsetDecoder values;

    public createTabContent(Charset charset) {
        this.values = charset.newDecoder();
    }

    public String values(byte[] bArr, int i) {
        byte[] bArr2 = this.ah$a;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[bArr2.length + i];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.ah$a.length, i);
            i += this.ah$a.length;
            bArr = bArr3;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        boolean z = true;
        CharBuffer charBuffer = null;
        boolean z2 = false;
        int i2 = 0;
        while (!z2 && i2 < 4) {
            try {
                charBuffer = this.values.decode(wrap);
                z2 = true;
            } catch (CharacterCodingException unused) {
                i2++;
                wrap = ByteBuffer.wrap(bArr, 0, i - i2);
            }
        }
        if ((!z2 || i2 <= 0) ? false : false) {
            byte[] bArr4 = new byte[i2];
            this.ah$a = bArr4;
            System.arraycopy(bArr, i - i2, bArr4, 0, i2);
        } else {
            this.ah$a = null;
        }
        if (!z2) {
            FragmentActivity.ah$a("ReactNative", "failed to decode string from byte array");
            return "";
        }
        return new String(charBuffer.array(), 0, charBuffer.length());
    }
}
