package o;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
/* loaded from: classes7.dex */
public class onSyncCompleted {
    public static byte[] values(SecretKey secretKey, SecretKey secretKey2, Provider provider) throws JOSEException {
        Cipher cipher;
        try {
            if (provider != null) {
                cipher = Cipher.getInstance("AESWrap", provider);
            } else {
                cipher = Cipher.getInstance("AESWrap");
            }
            cipher.init(3, secretKey2);
            return cipher.wrap(secretKey);
        } catch (InvalidKeyException | NoSuchAlgorithmException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new JOSEException("Couldn't wrap AES key: " + e.getMessage(), e);
        }
    }
}
