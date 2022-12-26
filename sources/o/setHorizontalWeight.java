package o;

import java.util.Comparator;
/* loaded from: classes3.dex */
public final /* synthetic */ class setHorizontalWeight implements Comparator {
    public static final /* synthetic */ setHorizontalWeight ag$a = new setHorizontalWeight();

    private /* synthetic */ setHorizontalWeight() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int ah$b;
        ah$b = setHorizontalDimensionBehaviour.ah$b((setMinWidth) obj, (setMinWidth) obj2);
        return ah$b;
    }
}
