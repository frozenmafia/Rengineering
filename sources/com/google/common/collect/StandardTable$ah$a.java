package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import o.removeViewIfHidden;
/* loaded from: classes7.dex */
class StandardTable$ah$a extends AbstractIterator<C> {
    final /* synthetic */ StandardTable ah$a;
    final Iterator<Map<C, V>> toString;
    Iterator<Map.Entry<C, V>> valueOf;
    final Map<C, V> values;

    private StandardTable$ah$a(StandardTable standardTable) {
        removeViewIfHidden ah$a;
        this.ah$a = standardTable;
        this.values = (Map) standardTable.factory.get();
        this.toString = standardTable.backingMap.values().iterator();
        ah$a = Iterators.ah$a();
        this.valueOf = ah$a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [C, java.lang.Object] */
    @Override // com.google.common.collect.AbstractIterator
    protected C ah$a() {
        while (true) {
            if (this.valueOf.hasNext()) {
                Map.Entry entry = (Map.Entry) this.valueOf.next();
                if (!this.values.containsKey(entry.getKey())) {
                    this.values.put(entry.getKey(), entry.getValue());
                    return entry.getKey();
                }
            } else if (this.toString.hasNext()) {
                this.valueOf = ((Map) this.toString.next()).entrySet().iterator();
            } else {
                return valueOf();
            }
        }
    }
}
