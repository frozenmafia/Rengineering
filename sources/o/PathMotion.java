package o;

import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class PathMotion implements Comparator<Comparable<? super Object>> {
    public static final PathMotion values = new PathMotion();

    private PathMotion() {
    }

    @Override // java.util.Comparator
    /* renamed from: ag$a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        runAnimators.ag$a(comparable, "a");
        runAnimators.ag$a(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return ObjectAnimatorUtils.values;
    }
}
