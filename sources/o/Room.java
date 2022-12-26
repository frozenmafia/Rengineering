package o;

import java.util.NoSuchElementException;
/* loaded from: classes5.dex */
public abstract class Room<T> extends getTypeConverter<T> {
    private T values;

    protected abstract T values(T t);

    public Room(T t) {
        this.values = t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.values != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            T t = this.values;
            this.values = values(t);
            return t;
        } catch (Throwable th) {
            this.values = values(this.values);
            throw th;
        }
    }
}
