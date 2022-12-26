package o;
/* loaded from: classes5.dex */
public final class resetTouch {
    public static final void valueOf(int i) {
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }
}
