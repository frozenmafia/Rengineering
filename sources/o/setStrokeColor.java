package o;

import java.util.concurrent.CancellationException;
/* loaded from: classes7.dex */
public final class setStrokeColor {
    public static final CancellationException toString(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
