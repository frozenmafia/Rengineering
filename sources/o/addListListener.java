package o;

import com.google.common.collect.Multisets;
import com.google.common.collect.Multisets$ah$a;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes7.dex */
public abstract class addListListener<E> extends AbstractCollection<E> implements refreshData<E> {
    private transient Set<E> elementSet;
    private transient Set<refreshData$ag$a<E>> entrySet;

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    protected abstract int distinctElements();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Iterator<E> elementIterator();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Iterator<refreshData$ag$a<E>> entryIterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.refreshData
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.refreshData
    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public int setCount(E e, int i) {
        return Multisets.valueOf(this, e, i);
    }

    public boolean setCount(E e, int i, int i2) {
        return Multisets.ag$a(this, e, i, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.values(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return Multisets.ag$a(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return Multisets.valueOf(this, collection);
    }

    public Set<E> elementSet() {
        Set<E> set = this.elementSet;
        if (set == null) {
            Set<E> createElementSet = createElementSet();
            this.elementSet = createElementSet;
            return createElementSet;
        }
        return set;
    }

    protected Set<E> createElementSet() {
        return new Multisets$ah$a<E>() { // from class: o.addListListener$ah$a
            @Override // com.google.common.collect.Multisets$ah$a
            public refreshData<E> ag$a() {
                return addListListener.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<E> iterator() {
                return addListListener.this.elementIterator();
            }
        };
    }

    public Set<refreshData$ag$a<E>> entrySet() {
        Set<refreshData$ag$a<E>> set = this.entrySet;
        if (set == null) {
            Set<refreshData$ag$a<E>> createEntrySet = createEntrySet();
            this.entrySet = createEntrySet;
            return createEntrySet;
        }
        return set;
    }

    /* loaded from: classes7.dex */
    public class toString extends Multisets.values<E> {
        public toString() {
        }

        @Override // com.google.common.collect.Multisets.values
        public refreshData<E> values() {
            return addListListener.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<refreshData$ag$a<E>> iterator() {
            return addListListener.this.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return addListListener.this.distinctElements();
        }
    }

    protected Set<refreshData$ag$a<E>> createEntrySet() {
        return new toString();
    }

    @Override // java.util.Collection, o.refreshData
    public final boolean equals(Object obj) {
        return Multisets.ah$a(this, obj);
    }

    @Override // java.util.Collection, o.refreshData
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}
