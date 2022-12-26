package o;

import java.util.Iterator;
import o.Transition;
/* loaded from: classes5.dex */
public final class disposeIfEmpty$ag$a implements Iterator<T>, Transition.ArrayListManager {
    private final Iterator<T> ah$a;
    private int valueOf;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public disposeIfEmpty$ag$a(disposeIfEmpty<T> disposeifempty) {
        invalidateChildInParent invalidatechildinparent;
        int i;
        invalidatechildinparent = ((disposeIfEmpty) disposeifempty).ag$a;
        this.ah$a = invalidatechildinparent.iterator();
        i = ((disposeIfEmpty) disposeifempty).values;
        this.valueOf = i;
    }

    private final void ah$a() {
        while (this.valueOf > 0 && this.ah$a.hasNext()) {
            this.ah$a.next();
            this.valueOf--;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // java.util.Iterator
    public T next() {
        ah$a();
        return this.ah$a.next();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ah$a();
        return this.ah$a.hasNext();
    }
}
