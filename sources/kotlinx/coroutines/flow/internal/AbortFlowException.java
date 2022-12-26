package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import o.getPixelSize;
import o.writeCharArray;
/* loaded from: classes7.dex */
public final class AbortFlowException extends CancellationException {
    public final transient writeCharArray<?> owner;

    public AbortFlowException(writeCharArray<?> writechararray) {
        super("Flow was aborted, no more elements needed");
        this.owner = writechararray;
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
