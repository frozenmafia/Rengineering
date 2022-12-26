package okhttp3.internal.connection;

import java.io.IOException;
import o.ChangeScroll;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        runAnimators.ag$a(iOException, "firstConnectException");
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }

    public final void addConnectException(IOException iOException) {
        runAnimators.ag$a(iOException, "e");
        ChangeScroll.toString(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }
}
