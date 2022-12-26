package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import o.hasUpdates;
import o.markViewHoldersUpdated;
import o.postponeAndUpdateViewHolders;
/* loaded from: classes7.dex */
public final class MapMaker {
    MapMakerInternalMap.Strength ah$b;
    Equivalence<Object> toString;
    MapMakerInternalMap.Strength valueOf;
    boolean values;
    int ah$a = -1;
    int ag$a = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public enum Dummy {
        VALUE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapMaker toString(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.toString;
        markViewHoldersUpdated.ah$a(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.toString = (Equivalence) markViewHoldersUpdated.toString(equivalence);
        this.values = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Equivalence<Object> ag$a() {
        return (Equivalence) hasUpdates.values(this.toString, ah$a().defaultEquivalence());
    }

    public MapMaker valueOf(int i) {
        int i2 = this.ah$a;
        markViewHoldersUpdated.valueOf(i2 == -1, "initial capacity was already set to %s", i2);
        markViewHoldersUpdated.values(i >= 0);
        this.ah$a = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int valueOf() {
        int i = this.ah$a;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    public MapMaker ah$a(int i) {
        int i2 = this.ag$a;
        markViewHoldersUpdated.valueOf(i2 == -1, "concurrency level was already set to %s", i2);
        markViewHoldersUpdated.values(i > 0);
        this.ag$a = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int values() {
        int i = this.ag$a;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    public MapMaker ah$b() {
        return valueOf(MapMakerInternalMap.Strength.WEAK);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapMaker valueOf(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.valueOf;
        markViewHoldersUpdated.ah$a(strength2 == null, "Key strength was already set to %s", strength2);
        this.valueOf = (MapMakerInternalMap.Strength) markViewHoldersUpdated.toString(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.values = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapMakerInternalMap.Strength ah$a() {
        return (MapMakerInternalMap.Strength) hasUpdates.values(this.valueOf, MapMakerInternalMap.Strength.STRONG);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapMaker values(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.ah$b;
        markViewHoldersUpdated.ah$a(strength2 == null, "Value strength was already set to %s", strength2);
        this.ah$b = (MapMakerInternalMap.Strength) markViewHoldersUpdated.toString(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.values = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapMakerInternalMap.Strength invoke() {
        return (MapMakerInternalMap.Strength) hasUpdates.values(this.ah$b, MapMakerInternalMap.Strength.STRONG);
    }

    public <K, V> ConcurrentMap<K, V> HaptikSDK$c() {
        if (!this.values) {
            return new ConcurrentHashMap(valueOf(), 0.75f, values());
        }
        return MapMakerInternalMap.create(this);
    }

    public String toString() {
        hasUpdates.toString valueOf = hasUpdates.valueOf(this);
        int i = this.ah$a;
        if (i != -1) {
            valueOf.ag$a("initialCapacity", i);
        }
        int i2 = this.ag$a;
        if (i2 != -1) {
            valueOf.ag$a("concurrencyLevel", i2);
        }
        MapMakerInternalMap.Strength strength = this.valueOf;
        if (strength != null) {
            valueOf.toString("keyStrength", postponeAndUpdateViewHolders.valueOf(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.ah$b;
        if (strength2 != null) {
            valueOf.toString("valueStrength", postponeAndUpdateViewHolders.valueOf(strength2.toString()));
        }
        if (this.toString != null) {
            valueOf.valueOf("keyEquivalence");
        }
        return valueOf.toString();
    }
}
