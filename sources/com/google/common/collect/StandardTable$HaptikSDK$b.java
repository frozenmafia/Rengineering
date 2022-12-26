package com.google.common.collect;

import com.google.common.collect.Sets;
/* loaded from: classes7.dex */
abstract class StandardTable$HaptikSDK$b<T> extends Sets.valueOf<T> {
    final /* synthetic */ StandardTable ah$a;

    private StandardTable$HaptikSDK$b(StandardTable standardTable) {
        this.ah$a = standardTable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.ah$a.backingMap.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.ah$a.backingMap.clear();
    }
}
