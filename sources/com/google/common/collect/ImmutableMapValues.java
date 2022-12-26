package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;
import o.removeViewIfHidden;
/* loaded from: classes7.dex */
final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {
    private final ImmutableMap<K, V> map;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmutableMapValues(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.map.size();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public removeViewIfHidden<V> iterator() {
        return new removeViewIfHidden<V>() { // from class: com.google.common.collect.ImmutableMapValues.4
            final removeViewIfHidden<Map.Entry<K, V>> ah$a;

            {
                this.ah$a = ImmutableMapValues.this.map.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.ah$a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.ah$a.next().getValue();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return obj != null && Iterators.toString(iterator(), obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<V> asList() {
        final ImmutableList<Map.Entry<K, V>> asList = this.map.entrySet().asList();
        return new ImmutableList<V>(this) { // from class: com.google.common.collect.ImmutableMapValues.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.List
            public V get(int i) {
                return (V) ((Map.Entry) asList.get(i)).getValue();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return asList.size();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new SerializedForm(this.map);
    }

    /* loaded from: classes7.dex */
    static class SerializedForm<V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableMap<?, V> map;

        SerializedForm(ImmutableMap<?, V> immutableMap) {
            this.map = immutableMap;
        }

        Object readResolve() {
            return this.map.values();
        }
    }
}
