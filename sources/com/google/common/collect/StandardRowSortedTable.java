package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import o.markViewHoldersUpdated;
import o.offsetPositionsForRemovingLaidOutOrNewView;
import o.onDataRefresh;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements onDataRefresh<R, C, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StandardRowSortedTable(SortedMap<R, Map<C, V>> sortedMap, offsetPositionsForRemovingLaidOutOrNewView<? extends Map<C, V>> offsetpositionsforremovinglaidoutornewview) {
        super(sortedMap, offsetpositionsforremovinglaidoutornewview);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SortedMap<R, Map<C, V>> sortedBackingMap() {
        return (SortedMap) this.backingMap;
    }

    @Override // com.google.common.collect.StandardTable, o.AsyncListDiffer.AnonymousClass1, o.getUnfilteredChildAt
    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    @Override // com.google.common.collect.StandardTable, o.getUnfilteredChildAt
    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.StandardTable
    public SortedMap<R, Map<C, V>> createRowMap() {
        return new values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public class values extends StandardTable$ah$b implements SortedMap {
        private values() {
            super(StandardRowSortedTable.this);
        }

        @Override // com.google.common.collect.Maps.HaptikWebView, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* renamed from: invoke */
        public SortedSet<R> keySet() {
            return (SortedSet) super.keySet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.HaptikWebView
        /* renamed from: ah$a */
        public SortedSet<R> valueOf() {
            return new Maps$HaptikSDK$a(this);
        }

        @Override // java.util.SortedMap
        public Comparator<? super R> comparator() {
            return StandardRowSortedTable.this.sortedBackingMap().comparator();
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) StandardRowSortedTable.this.sortedBackingMap().firstKey();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) StandardRowSortedTable.this.sortedBackingMap().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R r) {
            markViewHoldersUpdated.toString(r);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().headMap(r), StandardRowSortedTable.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            markViewHoldersUpdated.toString(r);
            markViewHoldersUpdated.toString(r2);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().subMap(r, r2), StandardRowSortedTable.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R r) {
            markViewHoldersUpdated.toString(r);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().tailMap(r), StandardRowSortedTable.this.factory).rowMap();
        }
    }
}
