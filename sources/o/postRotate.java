package o;

import java.util.LinkedHashSet;
import java.util.Set;
/* loaded from: classes5.dex */
public class postRotate extends preConcat {
    public static final <T> Set<T> valueOf(Set<? extends T> set, Iterable<? extends T> iterable) {
        int size;
        runAnimators.ag$a(set, "<this>");
        runAnimators.ag$a(iterable, "elements");
        Integer valueOf = reserveEndViewTransition.valueOf(iterable);
        if (valueOf != null) {
            size = set.size() + valueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(fetchDrawMatrixField.toString(size));
        linkedHashSet.addAll(set);
        reserveEndViewTransition.toString(linkedHashSet, iterable);
        return linkedHashSet;
    }
}
