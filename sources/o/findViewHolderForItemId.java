package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes5.dex */
public final class findViewHolderForItemId<E> implements List<E>, RandomAccess {
    private final List<E> valueOf;

    public static <E> findViewHolderForItemId<E> valueOf(E... eArr) {
        return new findViewHolderForItemId<>(Arrays.asList(eArr));
    }

    public static <E> findViewHolderForItemId<E> toString(List<E> list) {
        return new findViewHolderForItemId<>(list);
    }

    private findViewHolderForItemId(List<E> list) {
        this.valueOf = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.valueOf.size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.valueOf.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.valueOf.contains(obj);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.valueOf.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.valueOf.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.valueOf.toArray(tArr);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        return this.valueOf.add(e);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.valueOf.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.valueOf.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.valueOf.addAll(collection);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return this.valueOf.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.valueOf.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.valueOf.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.valueOf.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.valueOf.equals(obj);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.valueOf.hashCode();
    }

    @Override // java.util.List
    public E get(int i) {
        return this.valueOf.get(i);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return this.valueOf.set(i, e);
    }

    @Override // java.util.List
    public void add(int i, E e) {
        this.valueOf.add(i, e);
    }

    @Override // java.util.List
    public E remove(int i) {
        return this.valueOf.remove(i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.valueOf.indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.valueOf.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.valueOf.listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return this.valueOf.listIterator(i);
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return this.valueOf.subList(i, i2);
    }
}
