package o;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import o.accept;
/* loaded from: classes5.dex */
public abstract class SplitPairFilter {
    public static final toString values = new toString(null);

    public abstract List<Certificate> valueOf(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException;

    /* loaded from: classes5.dex */
    public static final class toString {
        private toString() {
        }

        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        public final SplitPairFilter toString(X509TrustManager x509TrustManager) {
            runAnimators.ag$a(x509TrustManager, "trustManager");
            return accept.lambda1.invoke.ag$a().values(x509TrustManager);
        }
    }
}
