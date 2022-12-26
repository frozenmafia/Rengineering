package o;

import java.util.Comparator;
/* loaded from: classes3.dex */
public final /* synthetic */ class setInVirtualLayout implements Comparator {
    public static final /* synthetic */ setInVirtualLayout values = new setInVirtualLayout();

    private /* synthetic */ setInVirtualLayout() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int invoke;
        invoke = setHorizontalDimensionBehaviour.invoke((setMinWidth) obj, (setMinWidth) obj2);
        return invoke;
    }
}
