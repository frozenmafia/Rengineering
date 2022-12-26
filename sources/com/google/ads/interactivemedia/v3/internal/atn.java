package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class atn extends atq implements NavigableMap {
    final /* synthetic */ atw c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atn(atw atwVar, NavigableMap navigableMap) {
        super(atwVar, navigableMap);
        this.c = atwVar;
    }

    final Map.Entry c(Iterator it) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Collection a = this.c.a();
            a.addAll((Collection) entry.getValue());
            it.remove();
            return axb.r(entry.getKey(), this.c.b(a));
        }
        return null;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = h().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return h().ceilingKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.atq
    /* renamed from: d */
    public final NavigableMap h() {
        return (NavigableMap) super.h();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return ((atn) descendingMap()).keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new atn(this.c, h().descendingMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.atq
    /* renamed from: e */
    public final NavigableSet i() {
        return new ato(this.c, h());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atq, com.google.ads.interactivemedia.v3.internal.atj, com.google.ads.interactivemedia.v3.internal.awc, java.util.AbstractMap, java.util.Map
    /* renamed from: f */
    public final NavigableSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = h().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = h().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return h().floorKey(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atq, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = h().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return h().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = h().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = h().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return h().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return c(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return c(descendingMap().entrySet().iterator());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atq, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atq, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new atn(this.c, h().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new atn(this.c, h().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new atn(this.c, h().tailMap(obj, z));
    }
}
