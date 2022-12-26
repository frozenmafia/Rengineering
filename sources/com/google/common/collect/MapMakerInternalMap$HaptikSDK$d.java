package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;
/* loaded from: classes7.dex */
public final class MapMakerInternalMap$HaptikSDK$d<K, V> extends MapMakerInternalMap.toString<K, V, MapMakerInternalMap$HaptikSDK$d<K, V>> implements MapMakerInternalMap$aj$a<K, V, MapMakerInternalMap$HaptikSDK$d<K, V>> {
    private volatile MapMakerInternalMap.extraCallback<K, V, MapMakerInternalMap$HaptikSDK$d<K, V>> valueOf;

    public static /* synthetic */ MapMakerInternalMap.extraCallback ag$a(MapMakerInternalMap$HaptikSDK$d mapMakerInternalMap$HaptikSDK$d) {
        return mapMakerInternalMap$HaptikSDK$d.valueOf;
    }

    public static /* synthetic */ MapMakerInternalMap.extraCallback values(MapMakerInternalMap$HaptikSDK$d mapMakerInternalMap$HaptikSDK$d, MapMakerInternalMap.extraCallback extracallback) {
        mapMakerInternalMap$HaptikSDK$d.valueOf = extracallback;
        return extracallback;
    }

    MapMakerInternalMap$HaptikSDK$d(K k, int i, MapMakerInternalMap$HaptikSDK$d<K, V> mapMakerInternalMap$HaptikSDK$d) {
        super(k, i, mapMakerInternalMap$HaptikSDK$d);
        this.valueOf = MapMakerInternalMap.unsetWeakValueReference();
    }

    @Override // com.google.common.collect.MapMakerInternalMap$HaptikSDK$c
    public V ah$b() {
        return this.valueOf.get();
    }

    void ag$a(V v, ReferenceQueue<V> referenceQueue) {
        MapMakerInternalMap.extraCallback<K, V, MapMakerInternalMap$HaptikSDK$d<K, V>> extracallback = this.valueOf;
        this.valueOf = new MapMakerInternalMap.ak.a(referenceQueue, v, this);
        extracallback.clear();
    }

    MapMakerInternalMap$HaptikSDK$d<K, V> ah$a(ReferenceQueue<V> referenceQueue, MapMakerInternalMap$HaptikSDK$d<K, V> mapMakerInternalMap$HaptikSDK$d) {
        MapMakerInternalMap$HaptikSDK$d<K, V> mapMakerInternalMap$HaptikSDK$d2 = new MapMakerInternalMap$HaptikSDK$d<>(this.ag$a, this.toString, mapMakerInternalMap$HaptikSDK$d);
        mapMakerInternalMap$HaptikSDK$d2.valueOf = this.valueOf.toString(referenceQueue, mapMakerInternalMap$HaptikSDK$d2);
        return mapMakerInternalMap$HaptikSDK$d2;
    }

    @Override // com.google.common.collect.MapMakerInternalMap$aj$a
    public MapMakerInternalMap.extraCallback<K, V, MapMakerInternalMap$HaptikSDK$d<K, V>> values() {
        return this.valueOf;
    }

    /* loaded from: classes7.dex */
    public static final class toString<K, V> implements MapMakerInternalMap.invoke<K, V, MapMakerInternalMap$HaptikSDK$d<K, V>, MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> {
        private static final toString<?, ?> values = new toString<>();

        toString() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.MapMakerInternalMap.invoke
        public /* bridge */ /* synthetic */ void valueOf(MapMakerInternalMap.Segment segment, MapMakerInternalMap$HaptikSDK$c mapMakerInternalMap$HaptikSDK$c, Object obj) {
            valueOf((MapMakerInternalMap.StrongKeyWeakValueSegment<K, MapMakerInternalMap$HaptikSDK$d<K, V>>) segment, (MapMakerInternalMap$HaptikSDK$d<K, MapMakerInternalMap$HaptikSDK$d<K, V>>) mapMakerInternalMap$HaptikSDK$c, (MapMakerInternalMap$HaptikSDK$d<K, V>) obj);
        }

        public static <K, V> toString<K, V> valueOf() {
            return (toString<K, V>) values;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.invoke
        public MapMakerInternalMap.Strength ag$a() {
            return MapMakerInternalMap.Strength.STRONG;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.invoke
        public MapMakerInternalMap.Strength ah$a() {
            return MapMakerInternalMap.Strength.WEAK;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.invoke
        /* renamed from: values */
        public MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> ag$a(MapMakerInternalMap<K, V, MapMakerInternalMap$HaptikSDK$d<K, V>, MapMakerInternalMap.StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            return new MapMakerInternalMap.StrongKeyWeakValueSegment<>(mapMakerInternalMap, i, i2);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.invoke
        /* renamed from: toString */
        public MapMakerInternalMap$HaptikSDK$d<K, V> ah$a(MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, MapMakerInternalMap$HaptikSDK$d<K, V> mapMakerInternalMap$HaptikSDK$d, MapMakerInternalMap$HaptikSDK$d<K, V> mapMakerInternalMap$HaptikSDK$d2) {
            ReferenceQueue<V> referenceQueue;
            if (MapMakerInternalMap.Segment.isCollected(mapMakerInternalMap$HaptikSDK$d)) {
                return null;
            }
            referenceQueue = ((MapMakerInternalMap.StrongKeyWeakValueSegment) strongKeyWeakValueSegment).queueForValues;
            return mapMakerInternalMap$HaptikSDK$d.ah$a(referenceQueue, mapMakerInternalMap$HaptikSDK$d2);
        }

        public void valueOf(MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, MapMakerInternalMap$HaptikSDK$d<K, V> mapMakerInternalMap$HaptikSDK$d, V v) {
            ReferenceQueue<V> referenceQueue;
            referenceQueue = ((MapMakerInternalMap.StrongKeyWeakValueSegment) strongKeyWeakValueSegment).queueForValues;
            mapMakerInternalMap$HaptikSDK$d.ag$a(v, referenceQueue);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.invoke
        /* renamed from: ag$a */
        public MapMakerInternalMap$HaptikSDK$d<K, V> toString(MapMakerInternalMap.StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k, int i, MapMakerInternalMap$HaptikSDK$d<K, V> mapMakerInternalMap$HaptikSDK$d) {
            return new MapMakerInternalMap$HaptikSDK$d<>(k, i, mapMakerInternalMap$HaptikSDK$d);
        }
    }
}
