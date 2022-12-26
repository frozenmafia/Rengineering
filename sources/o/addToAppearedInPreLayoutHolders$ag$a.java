package o;

import java.util.Map;
import o.ViewInfoStore;
/* loaded from: classes5.dex */
class addToAppearedInPreLayoutHolders$ag$a<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, addToAppearedInPreLayoutHolders> ah$a;

    private addToAppearedInPreLayoutHolders$ag$a(Map.Entry<K, addToAppearedInPreLayoutHolders> entry) {
        this.ah$a = entry;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.ah$a.getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        addToAppearedInPreLayoutHolders value = this.ah$a.getValue();
        if (value == null) {
            return null;
        }
        return value.valueOf();
    }

    public addToAppearedInPreLayoutHolders valueOf() {
        return this.ah$a.getValue();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (!(obj instanceof ViewInfoStore.InfoRecord)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return this.ah$a.getValue().ag$a((ViewInfoStore.InfoRecord) obj);
    }
}
