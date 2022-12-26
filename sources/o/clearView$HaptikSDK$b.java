package o;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import o.clearView;
/* loaded from: classes7.dex */
class clearView$HaptikSDK$b extends AbstractSet<Map.Entry<K, V>> {
    final /* synthetic */ clearView ag$a;

    private clearView$HaptikSDK$b(clearView clearview) {
        this.ag$a = clearview;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new clearView.values();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.ag$a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.ag$a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: ag$a */
    public boolean add(Map.Entry<K, V> entry) {
        if (contains(entry)) {
            return false;
        }
        this.ag$a.valueOf((clearView) ((Comparable) entry.getKey()), (Comparable) entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            this.ag$a.remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.ag$a.clear();
    }
}
