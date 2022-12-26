package o;

import java.util.NoSuchElementException;
/* loaded from: classes7.dex */
public abstract class onCurrentListChanged<T> extends removeViewIfHidden<T> {
    private T toString;

    protected abstract T ah$a(T t);

    public onCurrentListChanged(T t) {
        this.toString = t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.toString != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.toString;
        if (t == null) {
            throw new NoSuchElementException();
        }
        this.toString = ah$a(t);
        return t;
    }
}
