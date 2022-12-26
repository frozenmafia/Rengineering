package com.google.common.collect;

import com.google.common.collect.StandardTable;
import java.util.Iterator;
import java.util.Map;
import o.AsyncListUtil;
import o.getBackgroundThreadExecutor;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
class StandardTable$values$ag$a extends AbstractIterator<Map.Entry<R, V>> {
    final Iterator<Map.Entry<R, Map<C, V>>> valueOf;
    final /* synthetic */ StandardTable.values values;

    private StandardTable$values$ag$a(StandardTable.values valuesVar) {
        this.values = valuesVar;
        this.valueOf = valuesVar.valueOf.backingMap.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.AbstractIterator
    /* renamed from: ag$a */
    public Map.Entry<R, V> ah$a() {
        while (this.valueOf.hasNext()) {
            Map.Entry entry = (Map.Entry) this.valueOf.next();
            if (((Map) entry.getValue()).containsKey(this.values.toString)) {
                return new values(entry);
            }
        }
        return (Map.Entry) valueOf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class values extends getBackgroundThreadExecutor<R, V> {
        final /* synthetic */ Map.Entry toString;

        values(Map.Entry entry) {
            this.toString = entry;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [R, java.lang.Object] */
        @Override // o.getBackgroundThreadExecutor, java.util.Map.Entry
        public R getKey() {
            return this.toString.getKey();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [V, java.lang.Object] */
        @Override // o.getBackgroundThreadExecutor, java.util.Map.Entry
        public V getValue() {
            return ((Map) this.toString.getValue()).get(StandardTable$values$ag$a.this.values.toString);
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [V, java.lang.Object] */
        @Override // o.getBackgroundThreadExecutor, java.util.Map.Entry
        public V setValue(V v) {
            return AsyncListUtil.ViewCallback.ag$a(((Map) this.toString.getValue()).put(StandardTable$values$ag$a.this.values.toString, markViewHoldersUpdated.toString(v)));
        }
    }
}
