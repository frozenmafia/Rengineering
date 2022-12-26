package o;

import java.util.Comparator;
/* loaded from: classes3.dex */
public final /* synthetic */ class nextBoolean implements Comparator {
    public static final /* synthetic */ nextBoolean toString = new nextBoolean();

    private /* synthetic */ nextBoolean() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        compare = Integer.compare(((SparseIntArrayKt$ag$a) obj).ah$a.valueOf, ((SparseIntArrayKt$ag$a) obj2).ah$a.valueOf);
        return compare;
    }
}
