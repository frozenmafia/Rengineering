package o;
/* loaded from: classes5.dex */
public class offsetPositionRecordsForMove {
    public final String ag$a;
    public final String ah$a;
    public final offsetPositionRecordsForMove toString;
    public final StackTraceElement[] values;

    public offsetPositionRecordsForMove(Throwable th, offsetChildrenHorizontal offsetchildrenhorizontal) {
        this.ag$a = th.getLocalizedMessage();
        this.ah$a = th.getClass().getName();
        this.values = offsetchildrenhorizontal.ag$a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.toString = cause != null ? new offsetPositionRecordsForMove(cause, offsetchildrenhorizontal) : null;
    }
}
