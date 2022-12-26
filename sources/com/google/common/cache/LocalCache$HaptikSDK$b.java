package com.google.common.cache;

import com.google.common.cache.LocalCache;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o.markViewHoldersUpdated;
import o.setBackgroundThreadExecutor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class LocalCache$HaptikSDK$b<T> implements Iterator<T> {
    final /* synthetic */ LocalCache HaptikSDK$b;
    int HaptikSDK$c;
    AtomicReferenceArray<setBackgroundThreadExecutor<K, V>> ag$a;
    LocalCache<K, V>.onRelationshipValidationResult ah$a;
    int invoke = -1;
    LocalCache.Segment<K, V> toString;
    LocalCache<K, V>.onRelationshipValidationResult valueOf;
    setBackgroundThreadExecutor<K, V> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocalCache$HaptikSDK$b(LocalCache localCache) {
        this.HaptikSDK$b = localCache;
        this.HaptikSDK$c = localCache.onXdkEvent.length - 1;
        ag$a();
    }

    final void ag$a() {
        this.valueOf = null;
        if (ah$a() || HaptikSDK$b()) {
            return;
        }
        while (this.HaptikSDK$c >= 0) {
            LocalCache.Segment<K, V>[] segmentArr = this.HaptikSDK$b.onXdkEvent;
            int i = this.HaptikSDK$c;
            this.HaptikSDK$c = i - 1;
            LocalCache.Segment<K, V> segment = segmentArr[i];
            this.toString = segment;
            if (segment.count != 0) {
                AtomicReferenceArray<setBackgroundThreadExecutor<K, V>> atomicReferenceArray = this.toString.table;
                this.ag$a = atomicReferenceArray;
                this.invoke = atomicReferenceArray.length() - 1;
                if (HaptikSDK$b()) {
                    return;
                }
            }
        }
    }

    boolean ah$a() {
        setBackgroundThreadExecutor setbackgroundthreadexecutor = this.values;
        if (setbackgroundthreadexecutor == null) {
            return false;
        }
        while (true) {
            setBackgroundThreadExecutor<K, V> next = setbackgroundthreadexecutor.getNext();
            this.values = next;
            if (next == 0) {
                return false;
            }
            if (values(next)) {
                return true;
            }
            setbackgroundthreadexecutor = this.values;
        }
    }

    boolean HaptikSDK$b() {
        while (true) {
            int i = this.invoke;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray<setBackgroundThreadExecutor<K, V>> atomicReferenceArray = this.ag$a;
            this.invoke = i - 1;
            setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor = (setBackgroundThreadExecutor) atomicReferenceArray.get(i);
            this.values = setbackgroundthreadexecutor;
            if (setbackgroundthreadexecutor != 0 && (values(setbackgroundthreadexecutor) || ah$a())) {
                return true;
            }
        }
    }

    boolean values(setBackgroundThreadExecutor<K, V> setbackgroundthreadexecutor) {
        boolean z;
        try {
            long values = this.HaptikSDK$b.extraCallback.values();
            Object key = setbackgroundthreadexecutor.getKey();
            Object localCache = this.HaptikSDK$b.toString(setbackgroundthreadexecutor, values);
            if (localCache != null) {
                this.valueOf = new LocalCache.onRelationshipValidationResult(key, localCache);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.toString.postReadCleanup();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.valueOf != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocalCache<K, V>.onRelationshipValidationResult values() {
        LocalCache<K, V>.onRelationshipValidationResult onrelationshipvalidationresult = this.valueOf;
        if (onrelationshipvalidationresult == null) {
            throw new NoSuchElementException();
        }
        this.ah$a = onrelationshipvalidationresult;
        ag$a();
        return this.ah$a;
    }

    @Override // java.util.Iterator
    public void remove() {
        markViewHoldersUpdated.ag$a(this.ah$a != null);
        this.HaptikSDK$b.remove(this.ah$a.getKey());
        this.ah$a = null;
    }
}
