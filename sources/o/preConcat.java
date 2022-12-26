package o;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
/* loaded from: classes5.dex */
public class preConcat extends hiddenAnimateTransform {
    public static final <T> Set<T> valueOf() {
        return EmptySet.INSTANCE;
    }

    public static final <T> Set<T> values(T... tArr) {
        runAnimators.ag$a(tArr, "elements");
        return tArr.length > 0 ? getStartAlpha.HaptikWebView(tArr) : oops.valueOf();
    }

    public static final <T> Set<T> valueOf(T... tArr) {
        runAnimators.ag$a(tArr, "elements");
        return (Set) getStartAlpha.toString((Object[]) tArr, new LinkedHashSet(fetchDrawMatrixField.toString(tArr.length)));
    }

    public static final <T> HashSet<T> ah$a(T... tArr) {
        runAnimators.ag$a(tArr, "elements");
        return (HashSet) getStartAlpha.toString((Object[]) tArr, new HashSet(fetchDrawMatrixField.toString(tArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> toString(Set<? extends T> set) {
        runAnimators.ag$a(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : oops.ag$a(set.iterator().next());
        }
        return oops.valueOf();
    }
}
