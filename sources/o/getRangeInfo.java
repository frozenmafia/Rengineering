package o;
/* loaded from: classes3.dex */
public final class getRangeInfo {
    public static final boolean values(Iterable<? extends setAction<? extends Object>> iterable) {
        boolean z;
        runAnimators.ag$a(iterable, "<this>");
        while (true) {
            for (setAction<? extends Object> setaction : iterable) {
                z = setaction.ag$a() && z;
            }
            return z;
        }
    }

    public static final boolean valueOf(Iterable<? extends setAction<? extends Object>> iterable) {
        runAnimators.ag$a(iterable, "<this>");
        boolean z = false;
        for (setAction<? extends Object> setaction : iterable) {
            if (setaction.ag$a() || z) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return z;
    }
}
