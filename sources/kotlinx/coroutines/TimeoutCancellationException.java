package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import o.ArgbEvaluator;
import o.getPathName;
/* loaded from: classes5.dex */
public final class TimeoutCancellationException extends CancellationException implements ArgbEvaluator<TimeoutCancellationException> {
    public final transient getPathName coroutine;

    public TimeoutCancellationException(String str, getPathName getpathname) {
        super(str);
        this.coroutine = getpathname;
    }

    public TimeoutCancellationException(String str) {
        this(str, null);
    }

    @Override // o.ArgbEvaluator
    public TimeoutCancellationException createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.coroutine);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
