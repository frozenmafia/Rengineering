package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o.SplitController;
import okhttp3.Protocol;
/* loaded from: classes5.dex */
public final class clearRegisteredRules implements SplitController.Companion {
    private SplitController.Companion ah$a;
    private final toString values;

    /* loaded from: classes5.dex */
    public interface toString {
        boolean ag$a(SSLSocket sSLSocket);

        SplitController.Companion valueOf(SSLSocket sSLSocket);
    }

    @Override // o.SplitController.Companion
    public boolean values() {
        return true;
    }

    public clearRegisteredRules(toString tostring) {
        runAnimators.ag$a(tostring, "socketAdapterFactory");
        this.values = tostring;
    }

    @Override // o.SplitController.Companion
    public X509TrustManager ag$a(SSLSocketFactory sSLSocketFactory) {
        runAnimators.ag$a(sSLSocketFactory, "sslSocketFactory");
        return SplitController$Companion$ag$a.values(this, sSLSocketFactory);
    }

    @Override // o.SplitController.Companion
    public boolean toString(SSLSocketFactory sSLSocketFactory) {
        runAnimators.ag$a(sSLSocketFactory, "sslSocketFactory");
        return runAnimators.ag$a(sSLSocketFactory, "sslSocketFactory");
    }

    @Override // o.SplitController.Companion
    public boolean valueOf(SSLSocket sSLSocket) {
        runAnimators.ag$a(sSLSocket, "sslSocket");
        return this.values.ag$a(sSLSocket);
    }

    @Override // o.SplitController.Companion
    public void ag$a(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        runAnimators.ag$a(sSLSocket, "sslSocket");
        runAnimators.ag$a(list, "protocols");
        SplitController.Companion values = values(sSLSocket);
        if (values != null) {
            values.ag$a(sSLSocket, str, list);
        }
    }

    @Override // o.SplitController.Companion
    public String toString(SSLSocket sSLSocket) {
        runAnimators.ag$a(sSLSocket, "sslSocket");
        SplitController.Companion values = values(sSLSocket);
        if (values != null) {
            return values.toString(sSLSocket);
        }
        return null;
    }

    private final SplitController.Companion values(SSLSocket sSLSocket) {
        SplitController.Companion companion;
        synchronized (this) {
            if (this.ah$a == null && this.values.ag$a(sSLSocket)) {
                this.ah$a = this.values.valueOf(sSLSocket);
            }
            companion = this.ah$a;
        }
        return companion;
    }
}
