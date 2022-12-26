package o;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes7.dex */
abstract class setUsingSpansToEstimateScrollbarDimensions<E> extends AbstractList<E> implements checkSelectForSwipe$ah$b<E> {
    private boolean valueOf = true;

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (!get(i).equals(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        ag$a();
        return super.add(e);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        ag$a();
        super.add(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        ag$a();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        ag$a();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ag$a();
        super.clear();
    }

    @Override // o.checkSelectForSwipe$ah$b
    public boolean ah$a() {
        return this.valueOf;
    }

    @Override // o.checkSelectForSwipe$ah$b
    public final void valueOf() {
        this.valueOf = false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        ag$a();
        return (E) super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ag$a();
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        ag$a();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        ag$a();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        ag$a();
        return (E) super.set(i, e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ag$a() {
        if (!this.valueOf) {
            throw new UnsupportedOperationException();
        }
    }
}
