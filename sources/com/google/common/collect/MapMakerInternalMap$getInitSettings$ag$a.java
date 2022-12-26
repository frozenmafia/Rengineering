package com.google.common.collect;

import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap;
/* loaded from: classes7.dex */
final class MapMakerInternalMap$getInitSettings$ag$a<K> implements MapMakerInternalMap.invoke<K, MapMaker.Dummy, MapMakerInternalMap.getInitSettings<K>, MapMakerInternalMap.StrongKeyDummyValueSegment<K>> {
    private static final MapMakerInternalMap$getInitSettings$ag$a<?> valueOf = new MapMakerInternalMap$getInitSettings$ag$a<>();

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    /* renamed from: toString */
    public void valueOf(MapMakerInternalMap.StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, MapMakerInternalMap.getInitSettings<K> getinitsettings, MapMaker.Dummy dummy) {
    }

    MapMakerInternalMap$getInitSettings$ag$a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K> MapMakerInternalMap$getInitSettings$ag$a<K> values() {
        return (MapMakerInternalMap$getInitSettings$ag$a<K>) valueOf;
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    public MapMakerInternalMap.Strength ag$a() {
        return MapMakerInternalMap.Strength.STRONG;
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    public MapMakerInternalMap.Strength ah$a() {
        return MapMakerInternalMap.Strength.STRONG;
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    /* renamed from: values */
    public MapMakerInternalMap.StrongKeyDummyValueSegment<K> ag$a(MapMakerInternalMap<K, MapMaker.Dummy, MapMakerInternalMap.getInitSettings<K>, MapMakerInternalMap.StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
        return new MapMakerInternalMap.StrongKeyDummyValueSegment<>(mapMakerInternalMap, i, i2);
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    /* renamed from: toString */
    public MapMakerInternalMap.getInitSettings<K> ah$a(MapMakerInternalMap.StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, MapMakerInternalMap.getInitSettings<K> getinitsettings, MapMakerInternalMap.getInitSettings<K> getinitsettings2) {
        return getinitsettings.valueOf(getinitsettings2);
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    /* renamed from: values */
    public MapMakerInternalMap.getInitSettings<K> toString(MapMakerInternalMap.StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, K k, int i, MapMakerInternalMap.getInitSettings<K> getinitsettings) {
        return new MapMakerInternalMap.getInitSettings<>(k, i, getinitsettings);
    }
}
