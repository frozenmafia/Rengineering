package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.hasPendingUpdates;
import o.markViewHoldersUpdated;
import o.requestTiles;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class Multimaps$ah$a<K, V> extends Maps.HaptikWebView<K, Collection<V>> {
    private final requestTiles<K, V> toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Multimaps$ah$a(requestTiles<K, V> requesttiles) {
        this.toString = (requestTiles) markViewHoldersUpdated.toString(requesttiles);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.toString.keySet().size();
    }

    @Override // com.google.common.collect.Maps.HaptikWebView
    protected Set<Map.Entry<K, Collection<V>>> ag$a() {
        return new values();
    }

    void ah$a(Object obj) {
        this.toString.keySet().remove(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class values extends Maps.toString<K, Collection<V>> {
        values() {
        }

        @Override // com.google.common.collect.Maps.toString
        Map<K, Collection<V>> ah$a() {
            return Multimaps$ah$a.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return Maps.ah$a(Multimaps$ah$a.this.toString.keySet(), new hasPendingUpdates<K, Collection<V>>() { // from class: com.google.common.collect.Multimaps.ah.a.values.3
                @Override // o.hasPendingUpdates
                /* renamed from: toString */
                public Collection<V> apply(K k) {
                    return Multimaps$ah$a.this.toString.get(k);
                }
            });
        }

        @Override // com.google.common.collect.Maps.toString, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Multimaps$ah$a.this.ah$a(entry.getKey());
                return true;
            }
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: ag$a */
    public Collection<V> get(Object obj) {
        if (containsKey(obj)) {
            return this.toString.get(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: values */
    public Collection<V> remove(Object obj) {
        if (containsKey(obj)) {
            return this.toString.removeAll(obj);
        }
        return null;
    }

    @Override // com.google.common.collect.Maps.HaptikWebView, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return this.toString.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.toString.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.toString.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.toString.clear();
    }
}
