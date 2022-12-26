package o;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import o.accept;
import okhttp3.Protocol;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
/* loaded from: classes5.dex */
public final class MatcherUtils extends accept.lambda1 {
    private static final boolean toString;
    public static final values valueOf;
    private final Provider ah$a;

    private MatcherUtils() {
        this.ah$a = new OpenJSSE();
    }

    public /* synthetic */ MatcherUtils(getTargetTypes gettargettypes) {
        this();
    }

    @Override // o.accept.lambda1
    public SSLContext I_() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.ah$a);
        runAnimators.ah$a(sSLContext, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // o.accept.lambda1
    public X509TrustManager H_() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.ah$a);
        trustManagerFactory.init((KeyStore) null);
        runAnimators.ah$a(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        runAnimators.toString(trustManagers);
        boolean z = true;
        if (!((trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) ? false : false)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected default trust managers: ");
            String arrays = Arrays.toString(trustManagers);
            runAnimators.ah$a(arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            throw new IllegalStateException(sb.toString().toString());
        }
        TrustManager trustManager = trustManagers[0];
        Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        return (X509TrustManager) trustManager;
    }

    @Override // o.accept.lambda1
    public X509TrustManager valueOf(SSLSocketFactory sSLSocketFactory) {
        runAnimators.ag$a(sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
    }

    @Override // o.accept.lambda1
    public void valueOf(SSLSocket sSLSocket, String str, List<Protocol> list) {
        runAnimators.ag$a(sSLSocket, "sslSocket");
        runAnimators.ag$a(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                Object[] array = accept.lambda1.invoke.valueOf(list).toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket2.setSSLParameters(sSLParameters);
                return;
            }
            return;
        }
        super.valueOf(sSLSocket, str, list);
    }

    @Override // o.accept.lambda1
    public String valueOf(SSLSocket sSLSocket) {
        runAnimators.ag$a(sSLSocket, "sslSocket");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
                return null;
            }
            return applicationProtocol;
        }
        return super.valueOf(sSLSocket);
    }

    /* loaded from: classes5.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        public final boolean ah$a() {
            return MatcherUtils.toString;
        }

        public final MatcherUtils ag$a() {
            if (ah$a()) {
                return new MatcherUtils(null);
            }
            return null;
        }
    }

    static {
        values valuesVar = new values(null);
        valueOf = valuesVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, valuesVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        toString = z;
    }
}
