package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o.Transition;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class createAnimators<T> implements Iterator<T>, Transition.ArrayListManager {
    private int ah$a;
    private final T[] toString;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public createAnimators(T[] tArr) {
        runAnimators.ag$a(tArr, "array");
        this.toString = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.ah$a < this.toString.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.toString;
            int i = this.ah$a;
            this.ah$a = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.ah$a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
