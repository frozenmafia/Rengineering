package o;

import java.util.Collection;
/* loaded from: classes.dex */
public class getInsertIndex extends GhostViewHolder {
    public static final <T> Integer valueOf(Iterable<? extends T> iterable) {
        runAnimators.ag$a(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static final <T> int ag$a(Iterable<? extends T> iterable, int i) {
        runAnimators.ag$a(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
