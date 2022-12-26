package o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
/* loaded from: classes7.dex */
public final class computeScrollRange implements setDrawable {
    private final String ag$a;
    private final int toString;
    private final java.security.Key valueOf;
    private final ThreadLocal<Mac> values;

    public computeScrollRange(String str, java.security.Key key) throws GeneralSecurityException {
        ThreadLocal<Mac> threadLocal = new ThreadLocal<Mac>() { // from class: o.computeScrollRange.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: ah$a */
            public Mac initialValue() {
                try {
                    Mac ah$a = prepareForDrop.toString.ah$a(computeScrollRange.this.ag$a);
                    ah$a.init(computeScrollRange.this.valueOf);
                    return ah$a;
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            }
        };
        this.values = threadLocal;
        this.ag$a = str;
        this.valueOf = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c = 0;
                    break;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c = 1;
                    break;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c = 2;
                    break;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.toString = 20;
        } else if (c == 1) {
            this.toString = 32;
        } else if (c == 2) {
            this.toString = 48;
        } else if (c == 3) {
            this.toString = 64;
        } else {
            throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        threadLocal.get();
    }

    @Override // o.setDrawable
    public byte[] toString(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > this.toString) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.values.get().update(bArr);
        return Arrays.copyOf(this.values.get().doFinal(), i);
    }
}
