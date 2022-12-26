package o;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import o.getRefCountForTest;
/* loaded from: classes5.dex */
class getRefCountForTest$HaptikSDK$c extends AbstractSet<Map.Entry<K, V>> {
    final /* synthetic */ getRefCountForTest values;

    private getRefCountForTest$HaptikSDK$c(getRefCountForTest getrefcountfortest) {
        this.values = getrefcountfortest;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new getRefCountForTest.values();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.values.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.values.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: valueOf */
    public boolean add(Map.Entry<K, V> entry) {
        if (contains(entry)) {
            return false;
        }
        this.values.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            this.values.remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.values.clear();
    }
}
