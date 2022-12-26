package o;

import com.google.common.collect.Iterators;
import java.util.Collection;
import java.util.Iterator;
import o.AsyncListDiffer;
/* loaded from: classes7.dex */
public abstract class updateRange<E> extends removeTile implements Collection<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.removeTile
    public abstract Collection<E> delegate();

    public Iterator<E> iterator() {
        return delegate().iterator();
    }

    @Override // java.util.Collection
    public int size() {
        return delegate().size();
    }

    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    public boolean add(E e) {
        return delegate().add(e);
    }

    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return delegate().addAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    public void clear() {
        delegate().clear();
    }

    public Object[] toArray() {
        return delegate().toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return (T[]) delegate().toArray(tArr);
    }

    protected boolean standardContains(Object obj) {
        return Iterators.toString((Iterator<?>) iterator(), obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean standardContainsAll(Collection<?> collection) {
        return AsyncListDiffer.ListListener.toString(this, collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean standardAddAll(Collection<? extends E> collection) {
        return Iterators.ah$a(this, collection.iterator());
    }

    protected boolean standardRemove(Object obj) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (recycleUpdateOp.values(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    protected boolean standardRemoveAll(Collection<?> collection) {
        return Iterators.values((Iterator<?>) iterator(), collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean standardRetainAll(Collection<?> collection) {
        return Iterators.toString((Iterator<?>) iterator(), collection);
    }

    protected void standardClear() {
        Iterators.values(iterator());
    }

    protected boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String standardToString() {
        return AsyncListDiffer.ListListener.ag$a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T> T[] standardToArray(T[] tArr) {
        return (T[]) recycleData.valueOf(this, tArr);
    }
}
