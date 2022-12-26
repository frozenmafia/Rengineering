package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.AsyncListDiffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class AbstractMapBasedMultimap$ah$a extends Maps.HaptikWebView<K, Collection<V>> {
    final /* synthetic */ AbstractMapBasedMultimap ah$a;
    final transient Map<K, Collection<V>> valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractMapBasedMultimap$ah$a(AbstractMapBasedMultimap abstractMapBasedMultimap, Map<K, Collection<V>> map) {
        this.ah$a = abstractMapBasedMultimap;
        this.valueOf = map;
    }

    @Override // com.google.common.collect.Maps.HaptikWebView
    protected Set<Map.Entry<K, Collection<V>>> ag$a() {
        return new valueOf();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return Maps.ag$a((Map<?, ?>) this.valueOf, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: toString */
    public Collection<V> get(Object obj) {
        Collection collection = (Collection) Maps.valueOf((Map<?, Object>) this.valueOf, obj);
        if (collection == null) {
            return null;
        }
        return this.ah$a.wrapCollection(obj, collection);
    }

    @Override // com.google.common.collect.Maps.HaptikWebView, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return this.ah$a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.valueOf.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: ah$a */
    public Collection<V> remove(Object obj) {
        Collection collection = (Collection) this.valueOf.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection<V> createCollection = this.ah$a.createCollection();
        createCollection.addAll(collection);
        AbstractMapBasedMultimap.access$220(this.ah$a, collection.size());
        collection.clear();
        return createCollection;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return this == obj || this.valueOf.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return this.valueOf.hashCode();
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return this.valueOf.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (this.valueOf == this.ah$a.map) {
            this.ah$a.clear();
        } else {
            Iterators.values(new AbstractMapBasedMultimap$ah$a$ah$a(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map.Entry<K, Collection<V>> toString(Map.Entry<K, Collection<V>> entry) {
        Object key = entry.getKey();
        return Maps.valueOf(key, this.ah$a.wrapCollection(key, (Collection) entry.getValue()));
    }

    /* loaded from: classes5.dex */
    class valueOf extends Maps.toString<K, Collection<V>> {
        valueOf() {
        }

        @Override // com.google.common.collect.Maps.toString
        Map<K, Collection<V>> ah$a() {
            return AbstractMapBasedMultimap$ah$a.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new AbstractMapBasedMultimap$ah$a$ah$a(AbstractMapBasedMultimap$ah$a.this);
        }

        @Override // com.google.common.collect.Maps.toString, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return AsyncListDiffer.ListListener.values(AbstractMapBasedMultimap$ah$a.this.valueOf.entrySet(), obj);
        }

        @Override // com.google.common.collect.Maps.toString, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                AbstractMapBasedMultimap$ah$a.this.ah$a.removeValuesForKey(entry.getKey());
                return true;
            }
            return false;
        }
    }
}
