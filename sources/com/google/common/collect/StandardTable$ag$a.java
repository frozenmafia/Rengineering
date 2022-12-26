package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import o.getUnfilteredChildAt;
/* loaded from: classes7.dex */
class StandardTable$ag$a implements Iterator<getUnfilteredChildAt.valueOf<R, C, V>> {
    Map.Entry<R, Map<C, V>> ah$a;
    final Iterator<Map.Entry<R, Map<C, V>>> toString;
    final /* synthetic */ StandardTable valueOf;
    Iterator<Map.Entry<C, V>> values;

    private StandardTable$ag$a(StandardTable standardTable) {
        this.valueOf = standardTable;
        this.toString = standardTable.backingMap.entrySet().iterator();
        this.values = Iterators.valueOf();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.toString.hasNext() || this.values.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: valueOf */
    public getUnfilteredChildAt.valueOf<R, C, V> next() {
        if (!this.values.hasNext()) {
            Map.Entry<R, Map<C, V>> entry = (Map.Entry) this.toString.next();
            this.ah$a = entry;
            this.values = ((Map) entry.getValue()).entrySet().iterator();
        }
        this.ah$a.getClass();
        Map.Entry entry2 = (Map.Entry) this.values.next();
        return Tables.ah$a(this.ah$a.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.values.remove();
        Map.Entry entry = this.ah$a;
        entry.getClass();
        if (((Map) entry.getValue()).isEmpty()) {
            this.toString.remove();
            this.ah$a = null;
        }
    }
}
