package o;

import com.nimbusds.jose.util.Base64URL;
import java.nio.charset.StandardCharsets;
/* loaded from: classes7.dex */
public class stopMultiInstanceInvalidation {
    public static byte[] values(Base64URL base64URL) {
        return base64URL.toString().getBytes(StandardCharsets.US_ASCII);
    }
}
