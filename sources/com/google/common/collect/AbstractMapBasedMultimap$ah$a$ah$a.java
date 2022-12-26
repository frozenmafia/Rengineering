package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import o.markViewHoldersUpdated;
/* loaded from: classes5.dex */
class AbstractMapBasedMultimap$ah$a$ah$a implements Iterator<Map.Entry<K, Collection<V>>> {
    final Iterator<Map.Entry<K, Collection<V>>> ag$a;
    final /* synthetic */ AbstractMapBasedMultimap$ah$a valueOf;
    Collection<V> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractMapBasedMultimap$ah$a$ah$a(AbstractMapBasedMultimap$ah$a abstractMapBasedMultimap$ah$a) {
        this.valueOf = abstractMapBasedMultimap$ah$a;
        this.ag$a = abstractMapBasedMultimap$ah$a.valueOf.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.ag$a.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: valueOf */
    public Map.Entry<K, Collection<V>> next() {
        Map.Entry entry = (Map.Entry) this.ag$a.next();
        this.values = (Collection) entry.getValue();
        return this.valueOf.toString(entry);
    }

    @Override // java.util.Iterator
    public void remove() {
        markViewHoldersUpdated.ah$a(this.values != null, "no calls to next() since the last call to remove()");
        this.ag$a.remove();
        AbstractMapBasedMultimap.access$220(this.valueOf.ah$a, this.values.size());
        this.values.clear();
        this.values = null;
    }
}
