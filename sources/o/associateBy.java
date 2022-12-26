package o;

import com.nimbusds.jose.util.Base64;
import java.io.ByteArrayInputStream;
import java.security.Provider;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
/* loaded from: classes7.dex */
public class associateBy {
    private static Provider ah$a;

    public static X509Certificate valueOf(byte[] bArr) {
        try {
            return values(bArr);
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static X509Certificate values(byte[] bArr) throws CertificateException {
        CertificateFactory certificateFactory;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Provider provider = ah$a;
        if (provider != null) {
            certificateFactory = CertificateFactory.getInstance("X.509", provider);
        } else {
            certificateFactory = CertificateFactory.getInstance("X.509");
        }
        Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
        if (!(generateCertificate instanceof X509Certificate)) {
            throw new CertificateException("Not a X.509 certificate: " + generateCertificate.getType());
        }
        return (X509Certificate) generateCertificate;
    }

    public static X509Certificate ag$a(String str) {
        int indexOf;
        String substring;
        int indexOf2;
        if (str == null || str.isEmpty() || (indexOf = str.indexOf("-----BEGIN CERTIFICATE-----")) < 0 || (indexOf2 = (substring = str.substring(indexOf + 27)).indexOf("-----END CERTIFICATE-----")) < 0) {
            return null;
        }
        return valueOf(new Base64(substring.substring(0, indexOf2).replaceAll("\\s", "")).decode());
    }
}
