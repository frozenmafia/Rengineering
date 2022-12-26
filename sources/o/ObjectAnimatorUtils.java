package o;

import java.util.Comparator;
/* loaded from: classes5.dex */
final class ObjectAnimatorUtils implements Comparator<Comparable<? super Object>> {
    public static final ObjectAnimatorUtils values = new ObjectAnimatorUtils();

    private ObjectAnimatorUtils() {
    }

    @Override // java.util.Comparator
    /* renamed from: ag$a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        runAnimators.ag$a(comparable, "a");
        runAnimators.ag$a(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return PathMotion.values;
    }
}
