package o;

import o.FragmentStateAdapter;
import o.ScrollEventAdapter;
/* loaded from: classes8.dex */
public final class updateCurrentItem<K, V> extends ScrollEventAdapter.ScrollEventValues<K, V, kotlin.Pair<? extends K, ? extends V>> {
    private final FragmentStateAdapter.DataSetChangeObserver ah$a;

    @Override // o.containsItem, o.scheduleGracePeriodEnd
    public FragmentStateAdapter.DataSetChangeObserver values() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.ScrollEventAdapter.ScrollEventValues
    /* renamed from: toString */
    public kotlin.Pair<K, V> ah$a(K k, V v) {
        return getReparent.toString(k, v);
    }
}
