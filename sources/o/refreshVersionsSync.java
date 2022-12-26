package o;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.util.Base64URL;
/* loaded from: classes7.dex */
public interface refreshVersionsSync extends setAutoCloser {
    boolean ah$a(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL) throws JOSEException;
}
