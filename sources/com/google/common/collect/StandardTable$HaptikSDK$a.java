package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import o.markViewHoldersUpdated;
import o.updateItemCount;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class StandardTable$HaptikSDK$a extends Maps.valueOf<C, V> {
    Map<C, V> ag$a;
    final /* synthetic */ StandardTable toString;
    final R values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
    public StandardTable$HaptikSDK$a(StandardTable standardTable, R r) {
        this.toString = standardTable;
        this.values = markViewHoldersUpdated.toString(r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void HaptikSDK$b() {
        Map<C, V> map = this.ag$a;
        if (map == 0 || (map.isEmpty() && this.toString.backingMap.containsKey(this.values))) {
            this.ag$a = valueOf();
        }
    }

    Map<C, V> valueOf() {
        return (Map) this.toString.backingMap.get(this.values);
    }

    void ah$a() {
        HaptikSDK$b();
        Map<C, V> map = this.ag$a;
        if (map == 0 || !map.isEmpty()) {
            return;
        }
        this.toString.backingMap.remove(this.values);
        this.ag$a = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<C, V> map;
        HaptikSDK$b();
        return (obj == null || (map = this.ag$a) == 0 || !Maps.ag$a((Map<?, ?>) map, obj)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [V, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<C, V> map;
        HaptikSDK$b();
        if (obj == null || (map = this.ag$a) == 0) {
            return null;
        }
        return Maps.valueOf((Map<?, ??>) map, obj);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [V, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [V, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public V put(C c, V v) {
        markViewHoldersUpdated.toString(c);
        markViewHoldersUpdated.toString(v);
        Map<C, V> map = this.ag$a;
        if (map != 0 && !map.isEmpty()) {
            return this.ag$a.put(c, v);
        }
        return this.toString.put(this.values, c, v);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [V, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        HaptikSDK$b();
        Map<C, V> map = this.ag$a;
        if (map == 0) {
            return null;
        }
        ?? HaptikSDK$b = Maps.HaptikSDK$b(map, obj);
        ah$a();
        return HaptikSDK$b;
    }

    @Override // com.google.common.collect.Maps.valueOf, java.util.AbstractMap, java.util.Map
    public void clear() {
        HaptikSDK$b();
        Map<C, V> map = this.ag$a;
        if (map != 0) {
            map.clear();
        }
        ah$a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        HaptikSDK$b();
        Map<C, V> map = this.ag$a;
        if (map == 0) {
            return 0;
        }
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Maps.valueOf
    public Iterator<Map.Entry<C, V>> ag$a() {
        HaptikSDK$b();
        Map<C, V> map = this.ag$a;
        if (map == 0) {
            return Iterators.valueOf();
        }
        final Iterator it = map.entrySet().iterator();
        return new Iterator<Map.Entry<C, V>>() { // from class: com.google.common.collect.StandardTable$HaptikSDK$a.3
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            /* renamed from: ag$a */
            public Map.Entry<C, V> next() {
                return StandardTable$HaptikSDK$a.this.toString((Map.Entry) it.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                it.remove();
                StandardTable$HaptikSDK$a.this.ah$a();
            }
        };
    }

    Map.Entry<C, V> toString(final Map.Entry<C, V> entry) {
        return new updateItemCount<C, V>(this) { // from class: com.google.common.collect.StandardTable$HaptikSDK$a.4
            @Override // o.updateItemCount, o.removeTile
            /* renamed from: ah$a */
            public Map.Entry<C, V> delegate() {
                return entry;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [V, java.lang.Object] */
            @Override // o.updateItemCount, java.util.Map.Entry
            public V setValue(V v) {
                return super.setValue(markViewHoldersUpdated.toString(v));
            }

            @Override // o.updateItemCount, java.util.Map.Entry
            public boolean equals(Object obj) {
                return valueOf(obj);
            }
        };
    }
}
