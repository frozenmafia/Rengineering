package o;

import java.util.Iterator;
import o.FragmentStateAdapter;
import o.Transition;
/* loaded from: classes8.dex */
public final class FragmentStateAdapter$FragmentMaxLifecycleEnforcer$2$ah$a implements Iterable<String>, Transition.ArrayListManager {
    final /* synthetic */ FragmentStateAdapter.DataSetChangeObserver toString;

    public FragmentStateAdapter$FragmentMaxLifecycleEnforcer$2$ah$a(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver) {
        this.toString = dataSetChangeObserver;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return new FragmentStateAdapter.FragmentMaxLifecycleEnforcer.AnonymousClass2.toString(this.toString);
    }
}
