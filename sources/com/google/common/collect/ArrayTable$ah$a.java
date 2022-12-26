package com.google.common.collect;

import com.google.common.collect.ArrayTable;
import java.util.Map;
/* loaded from: classes7.dex */
class ArrayTable$ah$a extends ArrayTable.valueOf<C, Map<R, V>> {
    final /* synthetic */ ArrayTable ah$a;

    @Override // com.google.common.collect.ArrayTable.valueOf
    String valueOf() {
        return "Column";
    }

    @Override // com.google.common.collect.ArrayTable.valueOf, java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return toString((ArrayTable$ah$a) obj, (Map) obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ArrayTable$ah$a(ArrayTable arrayTable) {
        super(arrayTable.columnKeyToIndex);
        this.ah$a = arrayTable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ArrayTable.valueOf
    /* renamed from: values */
    public Map<R, V> valueOf(int i) {
        return new ArrayTable.toString(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ArrayTable.valueOf
    /* renamed from: toString */
    public Map<R, V> ah$a(int i, Map<R, V> map) {
        throw new UnsupportedOperationException();
    }

    public Map<R, V> toString(C c, Map<R, V> map) {
        throw new UnsupportedOperationException();
    }
}
