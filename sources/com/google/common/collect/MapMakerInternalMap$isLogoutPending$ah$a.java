package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class MapMakerInternalMap$isLogoutPending$ah$a<K, V> implements MapMakerInternalMap.invoke<K, V, MapMakerInternalMap.isLogoutPending<K, V>, MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> {
    private static final MapMakerInternalMap$isLogoutPending$ah$a<?, ?> ah$a = new MapMakerInternalMap$isLogoutPending$ah$a<>();

    MapMakerInternalMap$isLogoutPending$ah$a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> MapMakerInternalMap$isLogoutPending$ah$a<K, V> values() {
        return (MapMakerInternalMap$isLogoutPending$ah$a<K, V>) ah$a;
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    public MapMakerInternalMap.Strength ag$a() {
        return MapMakerInternalMap.Strength.WEAK;
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    public MapMakerInternalMap.Strength ah$a() {
        return MapMakerInternalMap.Strength.STRONG;
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    /* renamed from: values */
    public MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> ag$a(MapMakerInternalMap<K, V, MapMakerInternalMap.isLogoutPending<K, V>, MapMakerInternalMap.WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
        return new MapMakerInternalMap.WeakKeyStrongValueSegment<>(mapMakerInternalMap, i, i2);
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    /* renamed from: values */
    public MapMakerInternalMap.isLogoutPending<K, V> ah$a(MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, MapMakerInternalMap.isLogoutPending<K, V> islogoutpending, MapMakerInternalMap.isLogoutPending<K, V> islogoutpending2) {
        ReferenceQueue<K> referenceQueue;
        if (islogoutpending.valueOf() == null) {
            return null;
        }
        referenceQueue = ((MapMakerInternalMap.WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys;
        return islogoutpending.values(referenceQueue, islogoutpending2);
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    /* renamed from: toString */
    public void valueOf(MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, MapMakerInternalMap.isLogoutPending<K, V> islogoutpending, V v) {
        islogoutpending.ah$a(v);
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    /* renamed from: values */
    public MapMakerInternalMap.isLogoutPending<K, V> toString(MapMakerInternalMap.WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k, int i, MapMakerInternalMap.isLogoutPending<K, V> islogoutpending) {
        ReferenceQueue referenceQueue;
        referenceQueue = ((MapMakerInternalMap.WeakKeyStrongValueSegment) weakKeyStrongValueSegment).queueForKeys;
        return new MapMakerInternalMap.isLogoutPending<>(referenceQueue, k, i, islogoutpending);
    }
}
