package o;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
class getRefCountForTest$ah$a implements Iterator<Map.Entry<K, V>> {
    private int ag$a;
    private Iterator<Map.Entry<K, V>> ah$a;
    final /* synthetic */ getRefCountForTest toString;

    private getRefCountForTest$ah$a(getRefCountForTest getrefcountfortest) {
        this.toString = getrefcountfortest;
        this.ag$a = getRefCountForTest.ag$a(getrefcountfortest).size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.ag$a;
        return (i > 0 && i <= getRefCountForTest.ag$a(this.toString).size()) || values().hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: valueOf */
    public Map.Entry<K, V> next() {
        if (values().hasNext()) {
            return (Map.Entry) values().next();
        }
        List ag$a = getRefCountForTest.ag$a(this.toString);
        int i = this.ag$a - 1;
        this.ag$a = i;
        return (Map.Entry) ag$a.get(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    private Iterator<Map.Entry<K, V>> values() {
        if (this.ah$a == null) {
            this.ah$a = getRefCountForTest.values(this.toString).entrySet().iterator();
        }
        return this.ah$a;
    }
}
