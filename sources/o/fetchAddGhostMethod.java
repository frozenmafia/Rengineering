package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import o.Transition;
/* loaded from: classes5.dex */
public final class fetchAddGhostMethod implements ListIterator, Transition.ArrayListManager {
    public static final fetchAddGhostMethod values = new fetchAddGhostMethod();

    @Override // java.util.ListIterator
    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private fetchAddGhostMethod() {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: values */
    public Void next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    /* renamed from: ag$a */
    public Void previous() {
        throw new NoSuchElementException();
    }
}
