package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o.getChangePayload;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Incorrect field signature: TE; */
/* loaded from: classes7.dex */
public abstract class MapMakerInternalMap$ah$b<T> implements Iterator<T> {
    int HaptikSDK$a = -1;
    final /* synthetic */ MapMakerInternalMap HaptikSDK$b;
    MapMakerInternalMap$HaptikSDK$c ag$a;
    MapMakerInternalMap<K, V, E, S>.extraCallbackWithResult ah$a;
    int invoke;
    MapMakerInternalMap<K, V, E, S>.extraCallbackWithResult toString;
    MapMakerInternalMap.Segment<K, V, E, S> valueOf;
    AtomicReferenceArray<E> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapMakerInternalMap$ah$b(MapMakerInternalMap mapMakerInternalMap) {
        this.HaptikSDK$b = mapMakerInternalMap;
        this.invoke = mapMakerInternalMap.segments.length - 1;
        valueOf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void valueOf() {
        this.ah$a = null;
        if (ah$a() || HaptikSDK$b()) {
            return;
        }
        while (this.invoke >= 0) {
            MapMakerInternalMap.Segment<K, V, E, S>[] segmentArr = this.HaptikSDK$b.segments;
            int i = this.invoke;
            this.invoke = i - 1;
            MapMakerInternalMap.WeakKeyWeakValueSegment weakKeyWeakValueSegment = segmentArr[i];
            this.valueOf = weakKeyWeakValueSegment;
            if (weakKeyWeakValueSegment.count != 0) {
                AtomicReferenceArray<E> atomicReferenceArray = this.valueOf.table;
                this.values = atomicReferenceArray;
                this.HaptikSDK$a = atomicReferenceArray.length() - 1;
                if (HaptikSDK$b()) {
                    return;
                }
            }
        }
    }

    boolean ah$a() {
        MapMakerInternalMap$HaptikSDK$c mapMakerInternalMap$HaptikSDK$c = this.ag$a;
        if (mapMakerInternalMap$HaptikSDK$c == null) {
            return false;
        }
        while (true) {
            MapMakerInternalMap$HaptikSDK$c ah$a = mapMakerInternalMap$HaptikSDK$c.ah$a();
            this.ag$a = ah$a;
            if (ah$a == null) {
                return false;
            }
            if (ag$a(ah$a)) {
                return true;
            }
            mapMakerInternalMap$HaptikSDK$c = this.ag$a;
        }
    }

    boolean HaptikSDK$b() {
        while (true) {
            int i = this.HaptikSDK$a;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray<E> atomicReferenceArray = this.values;
            this.HaptikSDK$a = i - 1;
            MapMakerInternalMap$HaptikSDK$c mapMakerInternalMap$HaptikSDK$c = (MapMakerInternalMap$HaptikSDK$c) atomicReferenceArray.get(i);
            this.ag$a = mapMakerInternalMap$HaptikSDK$c;
            if (mapMakerInternalMap$HaptikSDK$c != null && (ag$a(mapMakerInternalMap$HaptikSDK$c) || ah$a())) {
                return true;
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TE;)Z */
    boolean ag$a(MapMakerInternalMap$HaptikSDK$c mapMakerInternalMap$HaptikSDK$c) {
        boolean z;
        try {
            Object valueOf = mapMakerInternalMap$HaptikSDK$c.valueOf();
            Object liveValue = this.HaptikSDK$b.getLiveValue(mapMakerInternalMap$HaptikSDK$c);
            if (liveValue != null) {
                this.ah$a = new MapMakerInternalMap.extraCallbackWithResult(valueOf, liveValue);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.valueOf.postReadCleanup();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.ah$a != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapMakerInternalMap<K, V, E, S>.extraCallbackWithResult values() {
        MapMakerInternalMap<K, V, E, S>.extraCallbackWithResult extracallbackwithresult = this.ah$a;
        if (extracallbackwithresult == null) {
            throw new NoSuchElementException();
        }
        this.toString = extracallbackwithresult;
        valueOf();
        return this.toString;
    }

    @Override // java.util.Iterator
    public void remove() {
        getChangePayload.toString(this.toString != null);
        this.HaptikSDK$b.remove(this.toString.getKey());
        this.toString = null;
    }
}
