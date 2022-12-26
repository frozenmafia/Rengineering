package o;

import java.util.Map;
/* loaded from: classes7.dex */
public abstract class updateItemCount<K, V> extends removeTile implements Map.Entry<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.removeTile
    /* renamed from: ah$a */
    public abstract Map.Entry<K, V> delegate();

    @Override // java.util.Map.Entry
    public K getKey() {
        return delegate().getKey();
    }

    public V getValue() {
        return delegate().getValue();
    }

    public V setValue(V v) {
        return delegate().setValue(v);
    }

    public boolean equals(Object obj) {
        return delegate().equals(obj);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return delegate().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean valueOf(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (recycleUpdateOp.values(getKey(), entry.getKey()) && recycleUpdateOp.values(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }
}
