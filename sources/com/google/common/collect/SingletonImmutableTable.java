package com.google.common.collect;

import com.google.common.collect.ImmutableTable;
import java.util.Map;
import o.getUnfilteredChildAt;
import o.markViewHoldersUpdated;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {
    final C singleColumnKey;
    final R singleRowKey;
    final V singleValue;

    @Override // o.getUnfilteredChildAt
    public int size() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableTable, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return column((SingletonImmutableTable<R, C, V>) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingletonImmutableTable(R r, C c, V v) {
        this.singleRowKey = (R) markViewHoldersUpdated.toString(r);
        this.singleColumnKey = (C) markViewHoldersUpdated.toString(c);
        this.singleValue = (V) markViewHoldersUpdated.toString(v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingletonImmutableTable(getUnfilteredChildAt.valueOf<R, C, V> valueof) {
        this(valueof.getRowKey(), valueof.getColumnKey(), valueof.getValue());
    }

    @Override // com.google.common.collect.ImmutableTable, o.getUnfilteredChildAt
    public ImmutableMap<R, V> column(C c) {
        markViewHoldersUpdated.toString(c);
        if (containsColumn(c)) {
            return ImmutableMap.of(this.singleRowKey, (Object) this.singleValue);
        }
        return ImmutableMap.of();
    }

    @Override // com.google.common.collect.ImmutableTable, o.getUnfilteredChildAt
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.of(this.singleColumnKey, ImmutableMap.of(this.singleRowKey, (Object) this.singleValue));
    }

    @Override // com.google.common.collect.ImmutableTable, o.getUnfilteredChildAt
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.of(this.singleRowKey, ImmutableMap.of(this.singleColumnKey, (Object) this.singleValue));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, o.AsyncListDiffer.AnonymousClass1
    public ImmutableSet<getUnfilteredChildAt.valueOf<R, C, V>> createCellSet() {
        return ImmutableSet.of(cellOf(this.singleRowKey, this.singleColumnKey, this.singleValue));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, o.AsyncListDiffer.AnonymousClass1
    public ImmutableCollection<V> createValues() {
        return ImmutableSet.of(this.singleValue);
    }

    @Override // com.google.common.collect.ImmutableTable
    ImmutableTable.SerializedForm createSerializedForm() {
        return ImmutableTable.SerializedForm.create(this, new int[]{0}, new int[]{0});
    }
}
