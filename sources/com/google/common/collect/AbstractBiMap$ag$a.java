package com.google.common.collect;

import java.util.Iterator;
import java.util.Set;
import o.isTileLoaded;
/* loaded from: classes7.dex */
class AbstractBiMap$ag$a extends isTileLoaded<V> {
    final Set<V> ag$a;
    final /* synthetic */ AbstractBiMap toString;

    private AbstractBiMap$ag$a(AbstractBiMap abstractBiMap) {
        this.toString = abstractBiMap;
        this.ag$a = abstractBiMap.inverse.keySet();
    }

    @Override // o.isTileLoaded, o.updateRange, o.removeTile
    public Set<V> delegate() {
        return this.ag$a;
    }

    @Override // o.updateRange, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<V> iterator() {
        return Maps.valueOf(this.toString.entrySet().iterator());
    }

    @Override // o.updateRange, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return standardToArray();
    }

    @Override // o.updateRange, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) standardToArray(tArr);
    }

    @Override // o.removeTile
    public String toString() {
        return standardToString();
    }
}
