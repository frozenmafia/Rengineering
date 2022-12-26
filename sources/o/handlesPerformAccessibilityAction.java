package o;

import java.util.Arrays;
import java.util.Iterator;
import o.FragmentStateAdapter;
/* loaded from: classes5.dex */
public final class handlesPerformAccessibilityAction {
    public static final int ah$a(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, FragmentStateAdapter.DataSetChangeObserver[] dataSetChangeObserverArr) {
        runAnimators.ag$a(dataSetChangeObserver, "<this>");
        runAnimators.ag$a(dataSetChangeObserverArr, "typeParams");
        int hashCode = dataSetChangeObserver.ah$a().hashCode();
        int hashCode2 = Arrays.hashCode(dataSetChangeObserverArr);
        Iterable<FragmentStateAdapter.DataSetChangeObserver> ag$a = runAnimators.ag$a(dataSetChangeObserver, "<this>");
        Iterator<FragmentStateAdapter.DataSetChangeObserver> it = ag$a.iterator();
        int i = 1;
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            String ah$a = it.next().ah$a();
            if (ah$a != null) {
                i3 = ah$a.hashCode();
            }
            i2 = (i2 * 31) + i3;
        }
        for (FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver2 : ag$a) {
            FragmentViewHolder values = dataSetChangeObserver2.values();
            i = (i * 31) + (values != null ? values.hashCode() : 0);
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + i;
    }
}
