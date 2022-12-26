package com.nytimes.android.external.cache;

import java.io.Serializable;
import java.util.Map;
import o.RoomDatabase;
import o.assertNotMainThread;
import o.getOpenHelper;
import o.internalEndTransaction;
import o.unwrapOpenHelper;
/* loaded from: classes5.dex */
public abstract class CacheLoader<K, V> {
    public abstract V load(K k) throws Exception;

    public RoomDatabase<V> reload(K k, V v) throws Exception {
        assertNotMainThread.valueOf(k);
        assertNotMainThread.valueOf(v);
        return internalEndTransaction.toString(load(k));
    }

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        throw new UnsupportedLoadingOperationException();
    }

    public static <K, V> CacheLoader<K, V> from(unwrapOpenHelper<K, V> unwrapopenhelper) {
        return new FunctionToCacheLoader(unwrapopenhelper);
    }

    /* loaded from: classes7.dex */
    static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final unwrapOpenHelper<K, V> computingFunction;

        public FunctionToCacheLoader(unwrapOpenHelper<K, V> unwrapopenhelper) {
            this.computingFunction = (unwrapOpenHelper) assertNotMainThread.valueOf(unwrapopenhelper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.nytimes.android.external.cache.CacheLoader
        public V load(K k) {
            return (V) this.computingFunction.apply(assertNotMainThread.valueOf(k));
        }
    }

    public static <V> CacheLoader<Object, V> from(getOpenHelper<V> getopenhelper) {
        return new SupplierToCacheLoader(getopenhelper);
    }

    /* loaded from: classes7.dex */
    static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final getOpenHelper<V> computingSupplier;

        public SupplierToCacheLoader(getOpenHelper<V> getopenhelper) {
            this.computingSupplier = (getOpenHelper) assertNotMainThread.valueOf(getopenhelper);
        }

        @Override // com.nytimes.android.external.cache.CacheLoader
        public V load(Object obj) {
            assertNotMainThread.valueOf(obj);
            return this.computingSupplier.valueOf();
        }
    }

    /* loaded from: classes7.dex */
    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }

    /* loaded from: classes5.dex */
    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }
}
