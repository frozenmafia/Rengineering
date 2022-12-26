package com.nytimes.android.external.cache;

import com.nytimes.android.external.cache.LocalCache;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o.assertNotMainThread;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class LocalCache$HaptikSDK$c<T> implements Iterator<T> {
    int HaptikSDK$a;
    int HaptikSDK$b = -1;
    AtomicReferenceArray<LocalCache$ah$b<K, V>> ag$a;
    LocalCache.Segment<K, V> ah$a;
    final /* synthetic */ LocalCache ah$b;
    LocalCache<K, V>.onMessageChannelReady invoke;
    LocalCache<K, V>.onMessageChannelReady valueOf;
    LocalCache$ah$b<K, V> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocalCache$HaptikSDK$c(LocalCache localCache) {
        this.ah$b = localCache;
        this.HaptikSDK$a = localCache.aj$a.length - 1;
        values();
    }

    final void values() {
        this.invoke = null;
        if (ag$a() || HaptikSDK$a()) {
            return;
        }
        while (this.HaptikSDK$a >= 0) {
            LocalCache.Segment<K, V>[] segmentArr = this.ah$b.aj$a;
            int i = this.HaptikSDK$a;
            this.HaptikSDK$a = i - 1;
            LocalCache.Segment<K, V> segment = segmentArr[i];
            this.ah$a = segment;
            if (segment.count != 0) {
                AtomicReferenceArray<LocalCache$ah$b<K, V>> atomicReferenceArray = this.ah$a.table;
                this.ag$a = atomicReferenceArray;
                this.HaptikSDK$b = atomicReferenceArray.length() - 1;
                if (HaptikSDK$a()) {
                    return;
                }
            }
        }
    }

    boolean ag$a() {
        LocalCache$ah$b localCache$ah$b = this.values;
        if (localCache$ah$b == null) {
            return false;
        }
        while (true) {
            LocalCache$ah$b<K, V> next = localCache$ah$b.getNext();
            this.values = next;
            if (next == 0) {
                return false;
            }
            if (ag$a(next)) {
                return true;
            }
            localCache$ah$b = this.values;
        }
    }

    boolean HaptikSDK$a() {
        while (true) {
            int i = this.HaptikSDK$b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray<LocalCache$ah$b<K, V>> atomicReferenceArray = this.ag$a;
            this.HaptikSDK$b = i - 1;
            LocalCache$ah$b<K, V> localCache$ah$b = (LocalCache$ah$b) atomicReferenceArray.get(i);
            this.values = localCache$ah$b;
            if (localCache$ah$b != 0 && (ag$a(localCache$ah$b) || ag$a())) {
                return true;
            }
        }
    }

    boolean ag$a(LocalCache$ah$b<K, V> localCache$ah$b) {
        boolean z;
        try {
            long ag$a = this.ah$b.ak.ag$a();
            Object key = localCache$ah$b.getKey();
            Object localCache = this.ah$b.toString(localCache$ah$b, ag$a);
            if (localCache != null) {
                this.invoke = new LocalCache.onMessageChannelReady(key, localCache);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.ah$a.postReadCleanup();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.invoke != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocalCache<K, V>.onMessageChannelReady valueOf() {
        LocalCache<K, V>.onMessageChannelReady onmessagechannelready = this.invoke;
        if (onmessagechannelready == null) {
            throw new NoSuchElementException();
        }
        this.valueOf = onmessagechannelready;
        values();
        return this.valueOf;
    }

    @Override // java.util.Iterator
    public void remove() {
        assertNotMainThread.values(this.valueOf != null);
        this.ah$b.remove(this.valueOf.getKey());
        this.valueOf = null;
    }
}
