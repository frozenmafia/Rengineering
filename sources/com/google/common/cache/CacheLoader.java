package com.google.common.cache;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o.animateAdd;
import o.animateAddImpl;
import o.animateRemoveImpl;
import o.hasPendingUpdates;
import o.markViewHoldersUpdated;
import o.offsetPositionsForRemovingLaidOutOrNewView;
/* loaded from: classes7.dex */
public abstract class CacheLoader<K, V> {
    public abstract V load(K k) throws Exception;

    public animateAddImpl<V> reload(K k, V v) throws Exception {
        markViewHoldersUpdated.toString(k);
        markViewHoldersUpdated.toString(v);
        return animateRemoveImpl.values(load(k));
    }

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        throw new UnsupportedLoadingOperationException();
    }

    public static <K, V> CacheLoader<K, V> from(hasPendingUpdates<K, V> haspendingupdates) {
        return new FunctionToCacheLoader(haspendingupdates);
    }

    public static <V> CacheLoader<Object, V> from(offsetPositionsForRemovingLaidOutOrNewView<V> offsetpositionsforremovinglaidoutornewview) {
        return new SupplierToCacheLoader(offsetpositionsforremovinglaidoutornewview);
    }

    /* loaded from: classes7.dex */
    static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final hasPendingUpdates<K, V> computingFunction;

        public FunctionToCacheLoader(hasPendingUpdates<K, V> haspendingupdates) {
            this.computingFunction = (hasPendingUpdates) markViewHoldersUpdated.toString(haspendingupdates);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.cache.CacheLoader
        public V load(K k) {
            return (V) this.computingFunction.apply(markViewHoldersUpdated.toString(k));
        }
    }

    public static <K, V> CacheLoader<K, V> asyncReloading(CacheLoader<K, V> cacheLoader, final Executor executor) {
        markViewHoldersUpdated.toString(cacheLoader);
        markViewHoldersUpdated.toString(executor);
        return new CacheLoader<K, V>() { // from class: com.google.common.cache.CacheLoader.2
            @Override // com.google.common.cache.CacheLoader
            public V load(K k) throws Exception {
                return (V) CacheLoader.this.load(k);
            }

            @Override // com.google.common.cache.CacheLoader
            public animateAddImpl<V> reload(final K k, final V v) throws Exception {
                animateAdd ag$a = animateAdd.ag$a(new Callable<V>() { // from class: com.google.common.cache.CacheLoader.2.2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public V call() throws Exception {
                        return CacheLoader.this.reload(k, v).get();
                    }
                });
                executor.execute(ag$a);
                return ag$a;
            }

            @Override // com.google.common.cache.CacheLoader
            public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
                return CacheLoader.this.loadAll(iterable);
            }
        };
    }

    /* loaded from: classes7.dex */
    static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final offsetPositionsForRemovingLaidOutOrNewView<V> computingSupplier;

        public SupplierToCacheLoader(offsetPositionsForRemovingLaidOutOrNewView<V> offsetpositionsforremovinglaidoutornewview) {
            this.computingSupplier = (offsetPositionsForRemovingLaidOutOrNewView) markViewHoldersUpdated.toString(offsetpositionsforremovinglaidoutornewview);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(Object obj) {
            markViewHoldersUpdated.toString(obj);
            return this.computingSupplier.get();
        }
    }

    /* loaded from: classes7.dex */
    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }

    /* loaded from: classes7.dex */
    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }
}
