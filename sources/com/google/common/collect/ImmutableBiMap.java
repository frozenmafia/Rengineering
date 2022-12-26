package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import o.getChangePayload;
import o.latchList;
/* loaded from: classes7.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements latchList<K, V> {
    @Override // o.latchList
    public abstract ImmutableBiMap<V, K> inverse();

    public static <K, V> ImmutableBiMap<K, V> of() {
        return RegularImmutableBiMap.EMPTY;
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v) {
        getChangePayload.valueOf(k, v);
        return new RegularImmutableBiMap(new Object[]{k, v}, 1);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2) {
        getChangePayload.valueOf(k, v);
        getChangePayload.valueOf(k2, v2);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2}, 2);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        getChangePayload.valueOf(k, v);
        getChangePayload.valueOf(k2, v2);
        getChangePayload.valueOf(k3, v3);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3}, 3);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        getChangePayload.valueOf(k, v);
        getChangePayload.valueOf(k2, v2);
        getChangePayload.valueOf(k3, v3);
        getChangePayload.valueOf(k4, v4);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4}, 4);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        getChangePayload.valueOf(k, v);
        getChangePayload.valueOf(k2, v2);
        getChangePayload.valueOf(k3, v3);
        getChangePayload.valueOf(k4, v4);
        getChangePayload.valueOf(k5, v5);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5}, 5);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        getChangePayload.valueOf(k, v);
        getChangePayload.valueOf(k2, v2);
        getChangePayload.valueOf(k3, v3);
        getChangePayload.valueOf(k4, v4);
        getChangePayload.valueOf(k5, v5);
        getChangePayload.valueOf(k6, v6);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6}, 6);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        getChangePayload.valueOf(k, v);
        getChangePayload.valueOf(k2, v2);
        getChangePayload.valueOf(k3, v3);
        getChangePayload.valueOf(k4, v4);
        getChangePayload.valueOf(k5, v5);
        getChangePayload.valueOf(k6, v6);
        getChangePayload.valueOf(k7, v7);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7}, 7);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        getChangePayload.valueOf(k, v);
        getChangePayload.valueOf(k2, v2);
        getChangePayload.valueOf(k3, v3);
        getChangePayload.valueOf(k4, v4);
        getChangePayload.valueOf(k5, v5);
        getChangePayload.valueOf(k6, v6);
        getChangePayload.valueOf(k7, v7);
        getChangePayload.valueOf(k8, v8);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8}, 8);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        getChangePayload.valueOf(k, v);
        getChangePayload.valueOf(k2, v2);
        getChangePayload.valueOf(k3, v3);
        getChangePayload.valueOf(k4, v4);
        getChangePayload.valueOf(k5, v5);
        getChangePayload.valueOf(k6, v6);
        getChangePayload.valueOf(k7, v7);
        getChangePayload.valueOf(k8, v8);
        getChangePayload.valueOf(k9, v9);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9}, 9);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        getChangePayload.valueOf(k, v);
        getChangePayload.valueOf(k2, v2);
        getChangePayload.valueOf(k3, v3);
        getChangePayload.valueOf(k4, v4);
        getChangePayload.valueOf(k5, v5);
        getChangePayload.valueOf(k6, v6);
        getChangePayload.valueOf(k7, v7);
        getChangePayload.valueOf(k8, v8);
        getChangePayload.valueOf(k9, v9);
        getChangePayload.valueOf(k10, v10);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10}, 10);
    }

    @SafeVarargs
    public static <K, V> ImmutableBiMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf((Iterable) Arrays.asList(entryArr));
    }

    public static <K, V> ImmutableBiMap$ah$a<K, V> builder() {
        return new ImmutableBiMap$ah$a<>();
    }

    public static <K, V> ImmutableBiMap$ah$a<K, V> builderWithExpectedSize(int i) {
        getChangePayload.values(i, "expectedSize");
        return new ImmutableBiMap$ah$a<>(i);
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new ImmutableBiMap$ah$a(iterable instanceof Collection ? ((Collection) iterable).size() : 4).toString(iterable).ag$a();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, o.latchList
    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<V> createValues() {
        throw new AssertionError("should never be called");
    }

    @Override // o.latchList
    @Deprecated
    public final V forcePut(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* loaded from: classes7.dex */
    static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        SerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public ImmutableBiMap$ah$a<K, V> makeBuilder(int i) {
            return new ImmutableBiMap$ah$a<>(i);
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    Object writeReplace() {
        return new SerializedForm(this);
    }
}
