package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import o.getPixelSize;
/* loaded from: classes7.dex */
public final class ChildCancelledException extends CancellationException {
    public ChildCancelledException() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        boolean z;
        z = getPixelSize.ag$a;
        if (z) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
