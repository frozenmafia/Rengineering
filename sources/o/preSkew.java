package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.builders.MapBuilder;
/* loaded from: classes5.dex */
public final class preSkew<E> extends Fade<E> implements Set<E> {
    private final MapBuilder<E, ?> values;

    public preSkew(MapBuilder<E, ?> mapBuilder) {
        runAnimators.ag$a(mapBuilder, "backing");
        this.values = mapBuilder;
    }

    @Override // o.Fade
    public int getSize() {
        return this.values.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.values.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.values.clear();
    }

    @Override // o.Fade, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        runAnimators.ag$a(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.values.removeKey$kotlin_stdlib(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.values.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        runAnimators.ag$a(collection, "elements");
        this.values.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        runAnimators.ag$a(collection, "elements");
        this.values.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
