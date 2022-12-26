package o;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes5.dex */
class addToAppearedInPreLayoutHolders$ah$a<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> ah$a;

    public addToAppearedInPreLayoutHolders$ah$a(Iterator<Map.Entry<K, Object>> it) {
        this.ah$a = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.ah$a.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: valueOf */
    public Map.Entry<K, Object> next() {
        Map.Entry<K, Object> next = this.ah$a.next();
        return next.getValue() instanceof addToAppearedInPreLayoutHolders ? new addToAppearedInPreLayoutHolders$ag$a(next) : next;
    }

    @Override // java.util.Iterator
    public void remove() {
        this.ah$a.remove();
    }
}
