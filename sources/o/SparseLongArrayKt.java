package o;

import java.util.Comparator;
/* loaded from: classes3.dex */
public final /* synthetic */ class SparseLongArrayKt implements Comparator {
    public static final /* synthetic */ SparseLongArrayKt values = new SparseLongArrayKt();

    private /* synthetic */ SparseLongArrayKt() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        compare = Long.compare(((toClosedRange) obj).ag$a, ((toClosedRange) obj2).ag$a);
        return compare;
    }
}
