package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import o.getTileStart;
import o.getUnfilteredChildAt;
import o.hasPendingUpdates;
import o.markViewHoldersUpdated;
import o.onDataRefresh;
/* loaded from: classes7.dex */
public final class Tables {
    private static final hasPendingUpdates<? extends Map<?, ?>, ? extends Map<?, ?>> ag$a = new hasPendingUpdates<Map<Object, Object>, Map<Object, Object>>() { // from class: com.google.common.collect.Tables.2
        @Override // o.hasPendingUpdates
        /* renamed from: ag$a */
        public Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    };

    public static <R, C, V> getUnfilteredChildAt.valueOf<R, C, V> ah$a(R r, C c, V v) {
        return new ImmutableCell(r, c, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class ImmutableCell<R, C, V> extends Tables$ah$a<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final C columnKey;
        private final R rowKey;
        private final V value;

        ImmutableCell(R r, C c, V v) {
            this.rowKey = r;
            this.columnKey = c;
            this.value = v;
        }

        @Override // o.getUnfilteredChildAt.valueOf
        public R getRowKey() {
            return this.rowKey;
        }

        @Override // o.getUnfilteredChildAt.valueOf
        public C getColumnKey() {
            return this.columnKey;
        }

        @Override // o.getUnfilteredChildAt.valueOf
        public V getValue() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class UnmodifiableTable<R, C, V> extends getTileStart<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final getUnfilteredChildAt<? extends R, ? extends C, ? extends V> delegate;

        UnmodifiableTable(getUnfilteredChildAt<? extends R, ? extends C, ? extends V> getunfilteredchildat) {
            this.delegate = (getUnfilteredChildAt) markViewHoldersUpdated.toString(getunfilteredchildat);
        }

        @Override // o.getTileStart, o.removeTile
        public getUnfilteredChildAt<R, C, V> delegate() {
            return (getUnfilteredChildAt<? extends R, ? extends C, ? extends V>) this.delegate;
        }

        @Override // o.getTileStart, o.getUnfilteredChildAt
        public Set<getUnfilteredChildAt.valueOf<R, C, V>> cellSet() {
            return Collections.unmodifiableSet(super.cellSet());
        }

        @Override // o.getTileStart, o.getUnfilteredChildAt
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // o.getTileStart, o.getUnfilteredChildAt
        public Map<R, V> column(C c) {
            return Collections.unmodifiableMap(super.column(c));
        }

        @Override // o.getTileStart, o.getUnfilteredChildAt
        public Set<C> columnKeySet() {
            return Collections.unmodifiableSet(super.columnKeySet());
        }

        @Override // o.getTileStart, o.getUnfilteredChildAt
        public Map<C, Map<R, V>> columnMap() {
            return Collections.unmodifiableMap(Maps.values(super.columnMap(), Tables.values()));
        }

        @Override // o.getTileStart, o.getUnfilteredChildAt
        public V put(R r, C c, V v) {
            throw new UnsupportedOperationException();
        }

        @Override // o.getTileStart, o.getUnfilteredChildAt
        public void putAll(getUnfilteredChildAt<? extends R, ? extends C, ? extends V> getunfilteredchildat) {
            throw new UnsupportedOperationException();
        }

        @Override // o.getTileStart, o.getUnfilteredChildAt
        public V remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // o.getTileStart, o.getUnfilteredChildAt
        public Map<C, V> row(R r) {
            return Collections.unmodifiableMap(super.row(r));
        }

        @Override // o.getTileStart, o.getUnfilteredChildAt
        public Set<R> rowKeySet() {
            return Collections.unmodifiableSet(super.rowKeySet());
        }

        @Override // o.getTileStart, o.getUnfilteredChildAt
        public Map<R, Map<C, V>> rowMap() {
            return Collections.unmodifiableMap(Maps.values(super.rowMap(), Tables.values()));
        }

        @Override // o.getTileStart, o.getUnfilteredChildAt
        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }
    }

    /* loaded from: classes7.dex */
    static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements onDataRefresh<R, C, V> {
        private static final long serialVersionUID = 0;

        public UnmodifiableRowSortedMap(onDataRefresh<R, ? extends C, ? extends V> ondatarefresh) {
            super(ondatarefresh);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.Tables.UnmodifiableTable, o.getTileStart, o.removeTile
        public onDataRefresh<R, C, V> delegate() {
            return (onDataRefresh) super.delegate();
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, o.getTileStart, o.getUnfilteredChildAt
        public SortedMap<R, Map<C, V>> rowMap() {
            SortedMap ag$a;
            ag$a = Maps.ag$a((SortedMap) delegate().rowMap(), Maps.values(Tables.values()));
            return Collections.unmodifiableSortedMap(ag$a);
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, o.getTileStart, o.getUnfilteredChildAt
        public SortedSet<R> rowKeySet() {
            return Collections.unmodifiableSortedSet(delegate().rowKeySet());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> hasPendingUpdates<Map<K, V>, Map<K, V>> values() {
        return (hasPendingUpdates<Map<K, V>, Map<K, V>>) ag$a;
    }

    public static boolean values(getUnfilteredChildAt<?, ?, ?> getunfilteredchildat, Object obj) {
        if (obj == getunfilteredchildat) {
            return true;
        }
        if (obj instanceof getUnfilteredChildAt) {
            return getunfilteredchildat.cellSet().equals(((getUnfilteredChildAt) obj).cellSet());
        }
        return false;
    }
}
