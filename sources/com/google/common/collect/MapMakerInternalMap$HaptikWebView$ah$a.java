package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class MapMakerInternalMap$HaptikWebView$ah$a<K, V> implements MapMakerInternalMap.invoke<K, V, MapMakerInternalMap.HaptikWebView<K, V>, MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> {
    private static final MapMakerInternalMap$HaptikWebView$ah$a<?, ?> toString = new MapMakerInternalMap$HaptikWebView$ah$a<>();

    MapMakerInternalMap$HaptikWebView$ah$a() {
    }

    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    public /* synthetic */ MapMakerInternalMap$HaptikSDK$c ah$a(MapMakerInternalMap.Segment segment, MapMakerInternalMap$HaptikSDK$c mapMakerInternalMap$HaptikSDK$c, MapMakerInternalMap$HaptikSDK$c mapMakerInternalMap$HaptikSDK$c2) {
        return toString((MapMakerInternalMap.StrongKeyStrongValueSegment) ((MapMakerInternalMap.StrongKeyStrongValueSegment) segment), (MapMakerInternalMap.HaptikWebView) ((MapMakerInternalMap.HaptikWebView) mapMakerInternalMap$HaptikSDK$c), (MapMakerInternalMap.HaptikWebView) ((MapMakerInternalMap.HaptikWebView) mapMakerInternalMap$HaptikSDK$c2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    public /* bridge */ /* synthetic */ MapMakerInternalMap$HaptikSDK$c toString(MapMakerInternalMap.Segment segment, Object obj, int i, MapMakerInternalMap$HaptikSDK$c mapMakerInternalMap$HaptikSDK$c) {
        return toString((MapMakerInternalMap.StrongKeyStrongValueSegment<MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>, V>) segment, (MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>) obj, i, (MapMakerInternalMap.HaptikWebView<MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>, V>) mapMakerInternalMap$HaptikSDK$c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.MapMakerInternalMap.invoke
    public /* synthetic */ void valueOf(MapMakerInternalMap.Segment segment, MapMakerInternalMap$HaptikSDK$c mapMakerInternalMap$HaptikSDK$c, Object obj) {
        toString((MapMakerInternalMap.StrongKeyStrongValueSegment<K, MapMakerInternalMap.HaptikWebView<K, V>>) segment, (MapMakerInternalMap.HaptikWebView<K, MapMakerInternalMap.HaptikWebView<K, V>>) mapMakerInternalMap$HaptikSDK$c, (MapMakerInternalMap.HaptikWebView<K, V>) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> MapMakerInternalMap$HaptikWebView$ah$a<K, V> values() {
        return (MapMakerInternalMap$HaptikWebView$ah$a<K, V>) toString;
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
    /* renamed from: toString */
    public MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> ag$a(MapMakerInternalMap<K, V, MapMakerInternalMap.HaptikWebView<K, V>, MapMakerInternalMap.StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
        return new MapMakerInternalMap.StrongKeyStrongValueSegment<>(mapMakerInternalMap, i, i2);
    }

    public MapMakerInternalMap.HaptikWebView<K, V> toString(MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, MapMakerInternalMap.HaptikWebView<K, V> haptikWebView, MapMakerInternalMap.HaptikWebView<K, V> haptikWebView2) {
        return haptikWebView.valueOf((MapMakerInternalMap.HaptikWebView) haptikWebView2);
    }

    public void toString(MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, MapMakerInternalMap.HaptikWebView<K, V> haptikWebView, V v) {
        haptikWebView.valueOf((MapMakerInternalMap.HaptikWebView<K, V>) v);
    }

    public MapMakerInternalMap.HaptikWebView<K, V> toString(MapMakerInternalMap.StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k, int i, MapMakerInternalMap.HaptikWebView<K, V> haptikWebView) {
        return new MapMakerInternalMap.HaptikWebView<>(k, i, haptikWebView);
    }
}
