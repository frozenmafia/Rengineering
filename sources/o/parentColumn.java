package o;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* loaded from: classes7.dex */
public class parentColumn {
    public static Cipher ah$a(String str, Provider provider) throws NoSuchAlgorithmException, NoSuchPaddingException {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
