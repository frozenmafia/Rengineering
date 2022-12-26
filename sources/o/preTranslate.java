package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
/* loaded from: classes5.dex */
public final class preTranslate<K, V> extends postTranslate<Map.Entry<K, V>, K, V> {
    private final MapBuilder<K, V> valueOf;

    public preTranslate(MapBuilder<K, V> mapBuilder) {
        runAnimators.ag$a(mapBuilder, "backing");
        this.valueOf = mapBuilder;
    }

    @Override // o.Fade
    public int getSize() {
        return this.valueOf.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.valueOf.isEmpty();
    }

    @Override // o.postTranslate
    public boolean values(Map.Entry<? extends K, ? extends V> entry) {
        runAnimators.ag$a(entry, "element");
        return this.valueOf.containsEntry$kotlin_stdlib(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.valueOf.clear();
    }

    @Override // o.Fade, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: ag$a */
    public boolean add(Map.Entry<K, V> entry) {
        runAnimators.ag$a(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        runAnimators.ag$a(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // o.postTranslate
    public boolean valueOf(Map.Entry entry) {
        runAnimators.ag$a(entry, "element");
        return this.valueOf.removeEntry$kotlin_stdlib(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.valueOf.entriesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        runAnimators.ag$a(collection, "elements");
        return this.valueOf.containsAllEntries$kotlin_stdlib(collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        runAnimators.ag$a(collection, "elements");
        this.valueOf.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        runAnimators.ag$a(collection, "elements");
        this.valueOf.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
