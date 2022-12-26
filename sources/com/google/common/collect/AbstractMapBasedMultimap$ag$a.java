package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import o.markViewHoldersUpdated;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class AbstractMapBasedMultimap$ag$a extends Maps.values<K, Collection<V>> {
    final /* synthetic */ AbstractMapBasedMultimap ag$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMapBasedMultimap$ag$a(AbstractMapBasedMultimap abstractMapBasedMultimap, Map<K, Collection<V>> map) {
        super(map);
        this.ag$a = abstractMapBasedMultimap;
    }

    @Override // com.google.common.collect.Maps.values, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        final Iterator it = values().entrySet().iterator();
        return new Iterator<K>() { // from class: com.google.common.collect.AbstractMapBasedMultimap$ag$a.4
            Map.Entry<K, Collection<V>> toString;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, K] */
            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) it.next();
                this.toString = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                markViewHoldersUpdated.ah$a(this.toString != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.toString.getValue();
                it.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap$ag$a.this.ag$a, collection.size());
                collection.clear();
                this.toString = null;
            }
        };
    }

    @Override // com.google.common.collect.Maps.values, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) values().remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            AbstractMapBasedMultimap.access$220(this.ag$a, i);
        } else {
            i = 0;
        }
        return i > 0;
    }

    @Override // com.google.common.collect.Maps.values, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        Iterators.values(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return values().keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return this == obj || values().keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return values().keySet().hashCode();
    }
}
