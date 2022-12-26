package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.getChangePayload;
import o.getUnfilteredChildAt;
import o.offsetPositionsForRemovingLaidOutOrNewView;
/* loaded from: classes7.dex */
public class HashBasedTable<R, C, V> extends StandardTable<R, C, V> {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.StandardTable, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ boolean contains(Object obj, Object obj2) {
        return super.contains(obj, obj2);
    }

    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    @Override // o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ void putAll(getUnfilteredChildAt getunfilteredchildat) {
        super.putAll(getunfilteredchildat);
    }

    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ Object remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ Map row(Object obj) {
        return super.row(obj);
    }

    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ Set rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.StandardTable, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ Map rowMap() {
        return super.rowMap();
    }

    @Override // com.google.common.collect.StandardTable, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // o.AsyncListDiffer.AnonymousClass1
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class Factory<C, V> implements offsetPositionsForRemovingLaidOutOrNewView<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        final int expectedSize;

        Factory(int i) {
            this.expectedSize = i;
        }

        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        public Map<C, V> get() {
            return Maps.toString(this.expectedSize);
        }
    }

    public static <R, C, V> HashBasedTable<R, C, V> create() {
        return new HashBasedTable<>(new LinkedHashMap(), new Factory(0));
    }

    public static <R, C, V> HashBasedTable<R, C, V> create(int i, int i2) {
        getChangePayload.values(i2, "expectedCellsPerRow");
        return new HashBasedTable<>(Maps.toString(i), new Factory(i2));
    }

    public static <R, C, V> HashBasedTable<R, C, V> create(getUnfilteredChildAt<? extends R, ? extends C, ? extends V> getunfilteredchildat) {
        HashBasedTable<R, C, V> create = create();
        create.putAll(getunfilteredchildat);
        return create;
    }

    HashBasedTable(Map<R, Map<C, V>> map, Factory<C, V> factory) {
        super(map, factory);
    }
}
