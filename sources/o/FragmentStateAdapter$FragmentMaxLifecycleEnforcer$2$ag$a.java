package o;

import java.util.Iterator;
import o.FragmentStateAdapter;
import o.Transition;
/* loaded from: classes5.dex */
public final class FragmentStateAdapter$FragmentMaxLifecycleEnforcer$2$ag$a implements Iterator<FragmentStateAdapter.DataSetChangeObserver>, Transition.ArrayListManager {
    private int toString;
    final /* synthetic */ FragmentStateAdapter.DataSetChangeObserver values;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentStateAdapter$FragmentMaxLifecycleEnforcer$2$ag$a(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver) {
        this.values = dataSetChangeObserver;
        this.toString = dataSetChangeObserver.ag$a();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.toString > 0;
    }

    @Override // java.util.Iterator
    /* renamed from: ag$a */
    public FragmentStateAdapter.DataSetChangeObserver next() {
        FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver = this.values;
        int ag$a = dataSetChangeObserver.ag$a();
        int i = this.toString;
        this.toString = i - 1;
        return dataSetChangeObserver.valueOf(ag$a - i);
    }
}
