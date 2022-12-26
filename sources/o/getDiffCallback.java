package o;

import java.util.NoSuchElementException;
import o.ChildHelper;
/* loaded from: classes5.dex */
public abstract class getDiffCallback<E> extends ChildHelper.Bucket<E> {
    private final int toString;
    private int values;

    protected abstract E ah$a(int i);

    public getDiffCallback(int i) {
        this(i, 0);
    }

    public getDiffCallback(int i, int i2) {
        markViewHoldersUpdated.toString(i2, i, "index");
        this.toString = i;
        this.values = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.values < this.toString;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.values;
        this.values = i + 1;
        return ah$a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.values;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.values > 0;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.values - 1;
        this.values = i;
        return ah$a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.values - 1;
    }
}
