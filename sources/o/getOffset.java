package o;

import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.util.SortedSet;
/* loaded from: classes7.dex */
public final class getOffset {
    public static boolean ag$a(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        markViewHoldersUpdated.toString(comparator);
        markViewHoldersUpdated.toString(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = ah$a((SortedSet) iterable);
        } else if (!(iterable instanceof hideViewInternal)) {
            return false;
        } else {
            comparator2 = ((hideViewInternal) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static <E> Comparator<? super E> ah$a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? Ordering.natural() : comparator;
    }
}
