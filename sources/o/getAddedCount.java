package o;

import java.io.BufferedInputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
/* loaded from: classes4.dex */
final class getAddedCount {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SSLContext valueOf() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            keyStore.setCertificateEntry("AmazonRootCA1", (X509Certificate) certificateFactory.generateCertificate(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("com/clevertap/android/sdk/certificates/AmazonRootCA1.cer"))));
            trustManagerFactory.init(keyStore);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
            setBoundsInScreen.ag$a("SSL Context built");
            return sSLContext;
        } catch (Throwable th) {
            setBoundsInScreen.ag$a("Error building SSL Context", th);
            return null;
        }
    }
}
