package o;

import java.lang.Comparable;
import java.util.Comparator;
/* loaded from: classes5.dex */
public class setOnScrollListener<A extends Comparable<A>> implements Comparator<A> {
    private static setOnScrollListener ah$a = new setOnScrollListener();

    private setOnScrollListener() {
    }

    @Override // java.util.Comparator
    /* renamed from: ah$a */
    public int compare(A a, A a2) {
        return a.compareTo(a2);
    }
}
