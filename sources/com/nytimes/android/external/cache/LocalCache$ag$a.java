package com.nytimes.android.external.cache;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class LocalCache$ag$a<T> extends AbstractSet<T> {
    final /* synthetic */ LocalCache ag$a;
    final ConcurrentMap<?, ?> valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocalCache$ag$a(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
        this.ag$a = localCache;
        this.valueOf = concurrentMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.valueOf.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.valueOf.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.valueOf.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        ArrayList localCache;
        localCache = LocalCache.toString((Collection) this);
        return localCache.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <E> E[] toArray(E[] eArr) {
        ArrayList localCache;
        localCache = LocalCache.toString((Collection) this);
        return (E[]) localCache.toArray(eArr);
    }
}
