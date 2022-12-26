package com.google.common.collect;

import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;
/* loaded from: classes7.dex */
final class MapMakerInternalMap$a$ag$a<K> implements MapMakerInternalMap.invoke<K, MapMaker.Dummy, MapMakerInternalMap.a<K>, MapMakerInternalMap.WeakKeyDummyValueSegment<K>> {
    private static final MapMakerInternalMap$a$ag$a<?> values = new MapMakerInternalMap$a$ag$a<>();

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    /* renamed from: ag$a */
    public void valueOf(MapMakerInternalMap.WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, MapMakerInternalMap.a<K> aVar, MapMaker.Dummy dummy) {
    }

    MapMakerInternalMap$a$ag$a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K> MapMakerInternalMap$a$ag$a<K> valueOf() {
        return (MapMakerInternalMap$a$ag$a<K>) values;
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
    /* renamed from: ah$a */
    public MapMakerInternalMap.WeakKeyDummyValueSegment<K> ag$a(MapMakerInternalMap<K, MapMaker.Dummy, MapMakerInternalMap.a<K>, MapMakerInternalMap.WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
        return new MapMakerInternalMap.WeakKeyDummyValueSegment<>(mapMakerInternalMap, i, i2);
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    /* renamed from: toString */
    public MapMakerInternalMap.a<K> ah$a(MapMakerInternalMap.WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, MapMakerInternalMap.a<K> aVar, MapMakerInternalMap.a<K> aVar2) {
        ReferenceQueue<K> referenceQueue;
        if (aVar.valueOf() == null) {
            return null;
        }
        referenceQueue = ((MapMakerInternalMap.WeakKeyDummyValueSegment) weakKeyDummyValueSegment).queueForKeys;
        return aVar.valueOf(referenceQueue, aVar2);
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    /* renamed from: ag$a */
    public MapMakerInternalMap.a<K> toString(MapMakerInternalMap.WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, K k, int i, MapMakerInternalMap.a<K> aVar) {
        ReferenceQueue referenceQueue;
        referenceQueue = ((MapMakerInternalMap.WeakKeyDummyValueSegment) weakKeyDummyValueSegment).queueForKeys;
        return new MapMakerInternalMap.a<>(referenceQueue, k, i, aVar);
    }
}
