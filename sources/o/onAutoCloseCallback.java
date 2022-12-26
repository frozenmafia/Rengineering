package o;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.util.Base64URL;
/* loaded from: classes7.dex */
public interface onAutoCloseCallback extends setAutoCloser {
    Base64URL ah$a(JWSHeader jWSHeader, byte[] bArr) throws JOSEException;
}
