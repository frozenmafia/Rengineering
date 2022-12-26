package o;

import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
/* loaded from: classes5.dex */
public final class SplitController extends Handler {
    public static final SplitController values = new SplitController();

    /* loaded from: classes5.dex */
    public interface Companion {
        X509TrustManager ag$a(SSLSocketFactory sSLSocketFactory);

        void ag$a(SSLSocket sSLSocket, String str, List<? extends Protocol> list);

        String toString(SSLSocket sSLSocket);

        boolean toString(SSLSocketFactory sSLSocketFactory);

        boolean valueOf(SSLSocket sSLSocket);

        boolean values();
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    private SplitController() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        int ag$a;
        runAnimators.ag$a(logRecord, "record");
        ExtensionEmbeddingBackend$SplitListenerWrapper$$ExternalSyntheticLambda0 extensionEmbeddingBackend$SplitListenerWrapper$$ExternalSyntheticLambda0 = ExtensionEmbeddingBackend$SplitListenerWrapper$$ExternalSyntheticLambda0.valueOf;
        String loggerName = logRecord.getLoggerName();
        runAnimators.ah$a(loggerName, "record.loggerName");
        ag$a = wildcardMatch.ag$a(logRecord);
        String message = logRecord.getMessage();
        runAnimators.ah$a(message, "record.message");
        extensionEmbeddingBackend$SplitListenerWrapper$$ExternalSyntheticLambda0.values(loggerName, ag$a, message, logRecord.getThrown());
    }
}
