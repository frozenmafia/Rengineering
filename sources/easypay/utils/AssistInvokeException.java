package easypay.utils;
/* loaded from: classes5.dex */
public class AssistInvokeException extends Exception {
    public AssistInvokeException() {
    }

    public AssistInvokeException(String str) {
        super(str);
    }

    protected AssistInvokeException(String str, Throwable th, boolean z, boolean z2) {
        super(str, th, z, z2);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        Throwable cause;
        synchronized (this) {
            cause = super.getCause();
        }
        return cause;
    }
}
