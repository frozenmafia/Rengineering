package o;

import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.internal.http2.ErrorCode;
/* loaded from: classes5.dex */
public final class ExtensionEmbeddingBackend$ag$a extends getPlaceholderIntent {
    final /* synthetic */ ExtensionEmbeddingBackend ah$a;

    public ExtensionEmbeddingBackend$ag$a(ExtensionEmbeddingBackend extensionEmbeddingBackend) {
        this.ah$a = extensionEmbeddingBackend;
    }

    @Override // o.getPlaceholderIntent
    public void valueOf() {
        this.ah$a.ag$a(ErrorCode.CANCEL);
        this.ah$a.ag$a().HaptikSDK$e();
    }

    @Override // o.getPlaceholderIntent
    public IOException toString(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void ag$a() throws IOException {
        if (HaptikSDK$a()) {
            throw toString((IOException) null);
        }
    }
}
