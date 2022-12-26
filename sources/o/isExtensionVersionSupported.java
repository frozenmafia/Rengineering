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
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
/* loaded from: classes5.dex */
public final class isExtensionVersionSupported extends accept.lambda1 {
    public static final isExtensionVersionSupported$ag$a valueOf;
    private static final boolean values;
    private final Provider ag$a;

    private isExtensionVersionSupported() {
        this.ag$a = new BouncyCastleJsseProvider();
    }

    public /* synthetic */ isExtensionVersionSupported(getTargetTypes gettargettypes) {
        this();
    }

    @Override // o.accept.lambda1
    public SSLContext I_() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.ag$a);
        runAnimators.ah$a(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // o.accept.lambda1
    public X509TrustManager H_() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with BouncyCastle");
    }

    @Override // o.accept.lambda1
    public void valueOf(SSLSocket sSLSocket, String str, List<Protocol> list) {
        runAnimators.ag$a(sSLSocket, "sslSocket");
        runAnimators.ag$a(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            List<String> valueOf2 = accept.lambda1.invoke.valueOf(list);
            runAnimators.ah$a(parameters, "sslParameters");
            Object[] array = valueOf2.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
            return;
        }
        super.valueOf(sSLSocket, str, list);
    }

    @Override // o.accept.lambda1
    public String valueOf(SSLSocket sSLSocket) {
        runAnimators.ag$a(sSLSocket, "sslSocket");
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
                return null;
            }
            return applicationProtocol;
        }
        return super.valueOf(sSLSocket);
    }

    static {
        isExtensionVersionSupported$ag$a isextensionversionsupported_ag_a = new isExtensionVersionSupported$ag$a(null);
        valueOf = isextensionversionsupported_ag_a;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, isextensionversionsupported_ag_a.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        values = z;
    }
}
