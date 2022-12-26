package o;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes5.dex */
class setItemAnimator$ah$a<T> implements Iterator<T> {
    final Iterator<Map.Entry<T, Void>> valueOf;

    public setItemAnimator$ah$a(Iterator<Map.Entry<T, Void>> it) {
        this.valueOf = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.valueOf.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        return this.valueOf.next().getKey();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.valueOf.remove();
    }
}
