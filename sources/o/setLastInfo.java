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
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
/* loaded from: classes5.dex */
public final class setLastInfo extends accept.lambda1 {
    public static final setLastInfo$ah$a ah$a;
    private static final boolean valueOf;
    private final Provider ag$a;

    @Override // o.accept.lambda1
    public X509TrustManager valueOf(SSLSocketFactory sSLSocketFactory) {
        runAnimators.ag$a(sSLSocketFactory, "sslSocketFactory");
        return null;
    }

    private setLastInfo() {
        Provider newProvider = Conscrypt.newProvider();
        runAnimators.ah$a(newProvider, "Conscrypt.newProvider()");
        this.ag$a = newProvider;
    }

    public /* synthetic */ setLastInfo(getTargetTypes gettargettypes) {
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
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        runAnimators.ah$a(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
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
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, valueOf.ag$a);
        return x509TrustManager;
    }

    /* loaded from: classes5.dex */
    public static final class valueOf implements ConscryptHostnameVerifier {
        public static final valueOf ag$a = new valueOf();

        private valueOf() {
        }
    }

    @Override // o.accept.lambda1
    public void valueOf(SSLSocket sSLSocket, String str, List<Protocol> list) {
        runAnimators.ag$a(sSLSocket, "sslSocket");
        runAnimators.ag$a(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = accept.lambda1.invoke.valueOf(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
            return;
        }
        super.valueOf(sSLSocket, str, list);
    }

    @Override // o.accept.lambda1
    public String valueOf(SSLSocket sSLSocket) {
        runAnimators.ag$a(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.valueOf(sSLSocket);
    }

    @Override // o.accept.lambda1
    public SSLSocketFactory toString(X509TrustManager x509TrustManager) {
        runAnimators.ag$a(x509TrustManager, "trustManager");
        SSLContext I_ = I_();
        I_.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = I_.getSocketFactory();
        runAnimators.ah$a(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
        if (r0.ah$a(2, 1, 0) != false) goto L7;
     */
    static {
        /*
            o.setLastInfo$ah$a r0 = new o.setLastInfo$ah$a
            r1 = 0
            r0.<init>(r1)
            o.setLastInfo.ah$a = r0
            r1 = 1
            r2 = 0
            java.lang.String r3 = "org.conscrypt.Conscrypt$Version"
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.Throwable -> L25
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L25
            java.lang.Class.forName(r3, r2, r4)     // Catch: java.lang.Throwable -> L25
            boolean r3 = org.conscrypt.Conscrypt.isAvailable()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L25
            r3 = 2
            boolean r0 = r0.ah$a(r3, r1, r2)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            o.setLastInfo.valueOf = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setLastInfo.<clinit>():void");
    }
}
