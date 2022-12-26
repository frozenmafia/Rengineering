package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o.Fade;
import o.createTransitionManagerFromXml;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class SetBuilder<E> extends Fade<E> implements Set<E>, Serializable, createTransitionManagerFromXml {
    private final MapBuilder<E, ?> backing;

    public SetBuilder(MapBuilder<E, ?> mapBuilder) {
        runAnimators.ag$a(mapBuilder, "backing");
        this.backing = mapBuilder;
    }

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(int i) {
        this(new MapBuilder(i));
    }

    public final Set<E> build() {
        this.backing.build();
        return this;
    }

    private final Object writeReplace() {
        if (this.backing.isReadOnly$kotlin_stdlib()) {
            return new SerializedCollection(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // o.Fade
    public int getSize() {
        return this.backing.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.backing.clear();
    }

    @Override // o.Fade, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        return this.backing.addKey$kotlin_stdlib(e) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.backing.removeKey$kotlin_stdlib(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.backing.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        runAnimators.ag$a(collection, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        runAnimators.ag$a(collection, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        runAnimators.ag$a(collection, "elements");
        this.backing.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
