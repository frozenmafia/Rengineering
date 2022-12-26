package o;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
/* loaded from: classes5.dex */
public final class setConcat<V> extends onAppear<V> implements Collection<V> {
    private final MapBuilder<?, V> valueOf;

    public setConcat(MapBuilder<?, V> mapBuilder) {
        runAnimators.ag$a(mapBuilder, "backing");
        this.valueOf = mapBuilder;
    }

    @Override // o.onAppear
    public int ag$a() {
        return this.valueOf.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.valueOf.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.valueOf.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        runAnimators.ag$a(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.valueOf.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.valueOf.valuesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.valueOf.removeValue$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        runAnimators.ag$a(collection, "elements");
        this.valueOf.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        runAnimators.ag$a(collection, "elements");
        this.valueOf.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
