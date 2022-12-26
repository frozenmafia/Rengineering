package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import o.updateRange;
/* loaded from: classes7.dex */
class Maps$HaptikSDK$c<K, V> extends updateRange<Map.Entry<K, V>> {
    private final Collection<Map.Entry<K, V>> toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Maps$HaptikSDK$c(Collection<Map.Entry<K, V>> collection) {
        this.toString = collection;
    }

    @Override // o.updateRange, o.removeTile
    public Collection<Map.Entry<K, V>> delegate() {
        return this.toString;
    }

    @Override // o.updateRange, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return Maps.toString(this.toString.iterator());
    }

    @Override // o.updateRange, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return standardToArray();
    }

    @Override // o.updateRange, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) standardToArray(tArr);
    }
}
