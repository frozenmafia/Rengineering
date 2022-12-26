package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class GhostViewPlatform extends addGhost {
    public static final <T extends Comparable<? super T>> void ag$a(List<T> list) {
        runAnimators.ag$a(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void ah$a(List<T> list, Comparator<? super T> comparator) {
        runAnimators.ag$a(list, "<this>");
        runAnimators.ag$a(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
