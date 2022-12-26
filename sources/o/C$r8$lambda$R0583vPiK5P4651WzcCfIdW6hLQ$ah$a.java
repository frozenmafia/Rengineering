package o;

import android.net.http.X509TrustManagerExtensions;
import javax.net.ssl.X509TrustManager;
/* renamed from: o.$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ$ah$a  reason: invalid class name */
/* loaded from: classes5.dex */
public final class C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ$ah$a {
    private C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ$ah$a() {
    }

    public /* synthetic */ C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    public final C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ ag$a(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        runAnimators.ag$a(x509TrustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            return new C$r8$lambda$R0583vPiK5P4651WzcCfIdW6hLQ(x509TrustManager, x509TrustManagerExtensions);
        }
        return null;
    }
}
