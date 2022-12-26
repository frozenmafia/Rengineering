package o;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes5.dex */
abstract class calculateCachedEnd<E> extends AbstractList<E> implements ViewInfoStore$HaptikSDK$b<E> {
    private boolean toString = true;

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
        values();
        return super.add(e);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        values();
        super.add(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        values();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        values();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        values();
        super.clear();
    }

    @Override // o.ViewInfoStore$HaptikSDK$b
    public boolean ag$a() {
        return this.toString;
    }

    @Override // o.ViewInfoStore$HaptikSDK$b
    public final void valueOf() {
        this.toString = false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        values();
        return (E) super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        values();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        values();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        values();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        values();
        return (E) super.set(i, e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void values() {
        if (!this.toString) {
            throw new UnsupportedOperationException();
        }
    }
}
