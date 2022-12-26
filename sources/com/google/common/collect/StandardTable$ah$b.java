package com.google.common.collect;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.AsyncListDiffer;
import o.hasPendingUpdates;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class StandardTable$ah$b extends Maps.HaptikWebView<R, Map<C, V>> {
    final /* synthetic */ StandardTable ag$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StandardTable$ah$b(StandardTable standardTable) {
        this.ag$a = standardTable;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.ag$a.containsRow(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: ag$a */
    public Map<C, V> get(Object obj) {
        if (this.ag$a.containsRow(obj)) {
            StandardTable standardTable = this.ag$a;
            obj.getClass();
            return standardTable.row(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: toString */
    public Map<C, V> remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Map) this.ag$a.backingMap.remove(obj);
    }

    @Override // com.google.common.collect.Maps.HaptikWebView
    protected Set<Map.Entry<R, Map<C, V>>> ag$a() {
        return new values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class values extends StandardTable$HaptikSDK$b {
        values() {
            super(StandardTable$ah$b.this.ag$a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
            return Maps.ah$a(StandardTable$ah$b.this.ag$a.backingMap.keySet(), new hasPendingUpdates<R, Map<C, V>>() { // from class: com.google.common.collect.StandardTable.ah.b.values.5
                @Override // o.hasPendingUpdates
                /* renamed from: toString */
                public Map<C, V> apply(R r) {
                    return StandardTable$ah$b.this.ag$a.row(r);
                }
            });
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return StandardTable$ah$b.this.ag$a.backingMap.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != null && (entry.getValue() instanceof Map) && AsyncListDiffer.ListListener.values(StandardTable$ah$b.this.ag$a.backingMap.entrySet(), entry)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() != null && (entry.getValue() instanceof Map) && StandardTable$ah$b.this.ag$a.backingMap.entrySet().remove(entry)) {
                    return true;
                }
            }
            return false;
        }
    }
}
