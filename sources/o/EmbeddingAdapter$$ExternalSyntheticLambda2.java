package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;
/* loaded from: classes5.dex */
public final class EmbeddingAdapter$$ExternalSyntheticLambda2 {
    private boolean ag$a;
    private int ah$a;
    private boolean toString;
    private final List<ConnectionSpec> values;

    public EmbeddingAdapter$$ExternalSyntheticLambda2(List<ConnectionSpec> list) {
        runAnimators.ag$a(list, "connectionSpecs");
        this.values = list;
    }

    public final ConnectionSpec valueOf(SSLSocket sSLSocket) throws IOException {
        runAnimators.ag$a(sSLSocket, "sslSocket");
        ConnectionSpec connectionSpec = null;
        int i = this.ah$a;
        int size = this.values.size();
        while (true) {
            if (i >= size) {
                break;
            }
            ConnectionSpec connectionSpec2 = this.values.get(i);
            if (connectionSpec2.isCompatible(sSLSocket)) {
                this.ah$a = i + 1;
                connectionSpec = connectionSpec2;
                break;
            }
            i++;
        }
        if (connectionSpec == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find acceptable protocols. isFallback=");
            sb.append(this.ag$a);
            sb.append(',');
            sb.append(" modes=");
            sb.append(this.values);
            sb.append(',');
            sb.append(" supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            runAnimators.toString(enabledProtocols);
            String arrays = Arrays.toString(enabledProtocols);
            runAnimators.ah$a(arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        this.toString = toString(sSLSocket);
        connectionSpec.apply$okhttp(sSLSocket, this.ag$a);
        return connectionSpec;
    }

    public final boolean toString(IOException iOException) {
        runAnimators.ag$a(iOException, "e");
        this.ag$a = true;
        return (!this.toString || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }

    private final boolean toString(SSLSocket sSLSocket) {
        int size = this.values.size();
        for (int i = this.ah$a; i < size; i++) {
            if (this.values.get(i).isCompatible(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
