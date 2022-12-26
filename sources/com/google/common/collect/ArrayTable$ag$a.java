package com.google.common.collect;

import com.google.common.collect.ArrayTable;
import java.util.Map;
/* loaded from: classes7.dex */
class ArrayTable$ag$a extends ArrayTable.valueOf<R, Map<C, V>> {
    final /* synthetic */ ArrayTable ah$a;

    @Override // com.google.common.collect.ArrayTable.valueOf
    String valueOf() {
        return "Row";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ArrayTable$ag$a(ArrayTable arrayTable) {
        super(ArrayTable.access$300(arrayTable));
        this.ah$a = arrayTable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ArrayTable.valueOf
    /* renamed from: ah$a */
    public Map<C, V> valueOf(int i) {
        return new ArrayTable.values(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ArrayTable.valueOf
    public Map<C, V> ah$a(int i, Map<C, V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ArrayTable.valueOf, java.util.AbstractMap, java.util.Map
    /* renamed from: toString */
    public Map<C, V> put(R r, Map<C, V> map) {
        throw new UnsupportedOperationException();
    }
}
