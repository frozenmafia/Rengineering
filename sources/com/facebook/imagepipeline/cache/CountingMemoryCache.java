package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import java.util.Map;
import o.FragmentActivity;
import o.onNewIntent;
/* loaded from: classes4.dex */
public interface CountingMemoryCache<K, V> extends MemoryCache<K, V>, onNewIntent {

    /* loaded from: classes4.dex */
    public interface EntryStateObserver<K> {
        void onExclusivityChanged(K k, boolean z);
    }

    FragmentActivity.AnonymousClass1<V> cache(K k, FragmentActivity.AnonymousClass1<V> anonymousClass1, EntryStateObserver<K> entryStateObserver);

    void clear();

    CountingLruMap<K, Entry<K, V>> getCachedEntries();

    int getEvictionQueueCount();

    int getEvictionQueueSizeInBytes();

    int getInUseSizeInBytes();

    MemoryCacheParams getMemoryCacheParams();

    Map<Bitmap, Object> getOtherEntries();

    void maybeEvictEntries();

    FragmentActivity.AnonymousClass1<V> reuse(K k);

    /* loaded from: classes4.dex */
    public static class Entry<K, V> {
        public final K key;
        public final EntryStateObserver<K> observer;
        public int size;
        public final FragmentActivity.AnonymousClass1<V> valueRef;
        public int clientCount = 0;
        public boolean isOrphan = false;
        public int accessCount = 0;

        private Entry(K k, FragmentActivity.AnonymousClass1<V> anonymousClass1, EntryStateObserver<K> entryStateObserver, int i) {
            this.key = (K) k.getClass();
            this.valueRef = (FragmentActivity.AnonymousClass1) FragmentActivity.AnonymousClass1.toString(anonymousClass1).getClass();
            this.observer = entryStateObserver;
            this.size = i;
        }

        public static <K, V> Entry<K, V> of(K k, FragmentActivity.AnonymousClass1<V> anonymousClass1, EntryStateObserver<K> entryStateObserver) {
            return of(k, anonymousClass1, -1, entryStateObserver);
        }

        public static <K, V> Entry<K, V> of(K k, FragmentActivity.AnonymousClass1<V> anonymousClass1, int i, EntryStateObserver<K> entryStateObserver) {
            return new Entry<>(k, anonymousClass1, entryStateObserver, i);
        }
    }
}
