package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import o.markViewHoldersUpdated;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class AbstractMapBasedMultimap$HaptikSDK$a extends AbstractCollection<V> {
    final Collection<V> ag$a;
    final K ah$a;
    /* JADX WARN: Incorrect inner types in field signature: Lcom/google/common/collect/AbstractMapBasedMultimap<TK;TV;>.a; */
    final AbstractMapBasedMultimap$HaptikSDK$a toString;
    Collection<V> valueOf;
    final /* synthetic */ AbstractMapBasedMultimap values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/Collection<TV;>;Lcom/google/common/collect/AbstractMapBasedMultimap<TK;TV;>.a;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractMapBasedMultimap$HaptikSDK$a(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, Collection collection, AbstractMapBasedMultimap$HaptikSDK$a abstractMapBasedMultimap$HaptikSDK$a) {
        this.values = abstractMapBasedMultimap;
        this.ah$a = obj;
        this.valueOf = collection;
        this.toString = abstractMapBasedMultimap$HaptikSDK$a;
        this.ag$a = abstractMapBasedMultimap$HaptikSDK$a == null ? null : abstractMapBasedMultimap$HaptikSDK$a.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$b() {
        Collection<V> collection;
        AbstractMapBasedMultimap$HaptikSDK$a abstractMapBasedMultimap$HaptikSDK$a = this.toString;
        if (abstractMapBasedMultimap$HaptikSDK$a != null) {
            abstractMapBasedMultimap$HaptikSDK$a.ah$b();
            if (this.toString.values() != this.ag$a) {
                throw new ConcurrentModificationException();
            }
        } else if (!this.valueOf.isEmpty() || (collection = (Collection) this.values.map.get(this.ah$a)) == 0) {
        } else {
            this.valueOf = collection;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void HaptikSDK$c() {
        AbstractMapBasedMultimap$HaptikSDK$a abstractMapBasedMultimap$HaptikSDK$a = this.toString;
        if (abstractMapBasedMultimap$HaptikSDK$a != null) {
            abstractMapBasedMultimap$HaptikSDK$a.HaptikSDK$c();
        } else if (this.valueOf.isEmpty()) {
            this.values.map.remove(this.ah$a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public K ag$a() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a() {
        AbstractMapBasedMultimap$HaptikSDK$a abstractMapBasedMultimap$HaptikSDK$a = this.toString;
        if (abstractMapBasedMultimap$HaptikSDK$a == null) {
            this.values.map.put(this.ah$a, this.valueOf);
        } else {
            abstractMapBasedMultimap$HaptikSDK$a.ah$a();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        ah$b();
        return this.valueOf.size();
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        ah$b();
        return this.valueOf.equals(obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        ah$b();
        return this.valueOf.hashCode();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        ah$b();
        return this.valueOf.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<V> values() {
        return this.valueOf;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        ah$b();
        return new valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class valueOf implements Iterator<V> {
        final Collection<V> ag$a;
        final Iterator<V> values;

        /* JADX INFO: Access modifiers changed from: package-private */
        public valueOf() {
            Iterator<V> iteratorOrListIterator;
            this.ag$a = AbstractMapBasedMultimap$HaptikSDK$a.this.valueOf;
            iteratorOrListIterator = AbstractMapBasedMultimap.iteratorOrListIterator(AbstractMapBasedMultimap$HaptikSDK$a.this.valueOf);
            this.values = iteratorOrListIterator;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public valueOf(Iterator<V> it) {
            this.ag$a = AbstractMapBasedMultimap$HaptikSDK$a.this.valueOf;
            this.values = it;
        }

        void ag$a() {
            AbstractMapBasedMultimap$HaptikSDK$a.this.ah$b();
            if (AbstractMapBasedMultimap$HaptikSDK$a.this.valueOf != this.ag$a) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            ag$a();
            return this.values.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [V, java.lang.Object] */
        @Override // java.util.Iterator
        public V next() {
            ag$a();
            return this.values.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.values.remove();
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap$HaptikSDK$a.this.values);
            AbstractMapBasedMultimap$HaptikSDK$a.this.HaptikSDK$c();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Iterator<V> valueOf() {
            ag$a();
            return this.values;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        ah$b();
        boolean isEmpty = this.valueOf.isEmpty();
        boolean add = this.valueOf.add(v);
        if (add) {
            AbstractMapBasedMultimap.access$208(this.values);
            if (isEmpty) {
                ah$a();
            }
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Incorrect inner types in method signature: ()Lcom/google/common/collect/AbstractMapBasedMultimap<TK;TV;>.a; */
    public AbstractMapBasedMultimap$HaptikSDK$a valueOf() {
        return this.toString;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.valueOf.addAll(collection);
        if (addAll) {
            AbstractMapBasedMultimap.access$212(this.values, this.valueOf.size() - size);
            if (size == 0) {
                ah$a();
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        ah$b();
        return this.valueOf.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        ah$b();
        return this.valueOf.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.valueOf.clear();
        AbstractMapBasedMultimap.access$220(this.values, size);
        HaptikSDK$c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        ah$b();
        boolean remove = this.valueOf.remove(obj);
        if (remove) {
            AbstractMapBasedMultimap.access$210(this.values);
            HaptikSDK$c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.valueOf.removeAll(collection);
        if (removeAll) {
            AbstractMapBasedMultimap.access$212(this.values, this.valueOf.size() - size);
            HaptikSDK$c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        markViewHoldersUpdated.toString(collection);
        int size = size();
        boolean retainAll = this.valueOf.retainAll(collection);
        if (retainAll) {
            AbstractMapBasedMultimap.access$212(this.values, this.valueOf.size() - size);
            HaptikSDK$c();
        }
        return retainAll;
    }
}
