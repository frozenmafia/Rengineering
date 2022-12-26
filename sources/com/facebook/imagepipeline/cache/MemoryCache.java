package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.MemoryTrimType;
import o.Fragment;
import o.FragmentActivity;
import o.onNewIntent;
import o.requireArguments;
/* loaded from: classes4.dex */
public interface MemoryCache<K, V> extends onNewIntent, requireArguments {

    /* loaded from: classes4.dex */
    public interface CacheTrimStrategy {
        double getTrimRatio(MemoryTrimType memoryTrimType);
    }

    FragmentActivity.AnonymousClass1<V> cache(K k, FragmentActivity.AnonymousClass1<V> anonymousClass1);

    boolean contains(K k);

    boolean contains(Fragment.InstantiationException<K> instantiationException);

    FragmentActivity.AnonymousClass1<V> get(K k);

    int getCount();

    int getSizeInBytes();

    V inspect(K k);

    void probe(K k);

    int removeAll(Fragment.InstantiationException<K> instantiationException);
}
