package kotlinx.coroutines;

import o.PropertyValuesHolderUtils;
/* loaded from: classes5.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {
    private final PropertyValuesHolderUtils context;

    public DiagnosticCoroutineContextException(PropertyValuesHolderUtils propertyValuesHolderUtils) {
        this.context = propertyValuesHolderUtils;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.context.toString();
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
