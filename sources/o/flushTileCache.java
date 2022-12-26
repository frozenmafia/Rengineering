package o;

import java.util.NoSuchElementException;
import java.util.Queue;
/* loaded from: classes7.dex */
public abstract class flushTileCache<E> extends updateRange<E> implements Queue<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.updateRange, o.removeTile
    public abstract Queue<E> delegate();

    public boolean offer(E e) {
        return delegate().offer(e);
    }

    @Override // java.util.Queue
    public E poll() {
        return delegate().poll();
    }

    @Override // java.util.Queue
    public E remove() {
        return delegate().remove();
    }

    @Override // java.util.Queue
    public E peek() {
        return delegate().peek();
    }

    @Override // java.util.Queue
    public E element() {
        return delegate().element();
    }

    protected boolean standardOffer(E e) {
        try {
            return add(e);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    protected E standardPeek() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    protected E standardPoll() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }
}
