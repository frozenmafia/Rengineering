package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setOrdering {
    public static final void toString(boolean z, Number number) {
        runAnimators.ag$a(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }
}
