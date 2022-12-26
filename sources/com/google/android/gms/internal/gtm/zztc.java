package com.google.android.gms.internal.gtm;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class zztc<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzaut;
    private final int zzbdy;
    private List<zztj> zzbdz;
    private Map<K, V> zzbea;
    private volatile zztl zzbeb;
    private Map<K, V> zzbec;
    private volatile zztf zzbed;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends zzqv<FieldDescriptorType>> zztc<FieldDescriptorType, Object> zzbu(int i) {
        return new zztd(i);
    }

    private zztc(int i) {
        this.zzbdy = i;
        this.zzbdz = Collections.emptyList();
        this.zzbea = Collections.emptyMap();
        this.zzbec = Collections.emptyMap();
    }

    public void zzmi() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzaut) {
            return;
        }
        if (this.zzbea.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zzbea);
        }
        this.zzbea = unmodifiableMap;
        if (this.zzbec.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zzbec);
        }
        this.zzbec = unmodifiableMap2;
        this.zzaut = true;
    }

    public final boolean isImmutable() {
        return this.zzaut;
    }

    public final int zzra() {
        return this.zzbdz.size();
    }

    public final Map.Entry<K, V> zzbv(int i) {
        return this.zzbdz.get(i);
    }

    public final Iterable<Map.Entry<K, V>> zzrb() {
        if (this.zzbea.isEmpty()) {
            return zztg.zzrg();
        }
        return this.zzbea.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzbdz.size() + this.zzbea.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zztc<K, V>) comparable) >= 0 || this.zzbea.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zztc<K, V>) comparable);
        if (zza >= 0) {
            return (V) this.zzbdz.get(zza).getValue();
        }
        return this.zzbea.get(comparable);
    }

    public final V zza(K k, V v) {
        zzrd();
        int zza = zza((zztc<K, V>) k);
        if (zza >= 0) {
            return (V) this.zzbdz.get(zza).setValue(v);
        }
        zzrd();
        if (this.zzbdz.isEmpty() && !(this.zzbdz instanceof ArrayList)) {
            this.zzbdz = new ArrayList(this.zzbdy);
        }
        int i = -(zza + 1);
        if (i >= this.zzbdy) {
            return zzre().put(k, v);
        }
        int size = this.zzbdz.size();
        int i2 = this.zzbdy;
        if (size == i2) {
            zztj remove = this.zzbdz.remove(i2 - 1);
            zzre().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.zzbdz.add(i, new zztj(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzrd();
        if (!this.zzbdz.isEmpty()) {
            this.zzbdz.clear();
        }
        if (this.zzbea.isEmpty()) {
            return;
        }
        this.zzbea.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzrd();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zztc<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzbw(zza);
        }
        if (this.zzbea.isEmpty()) {
            return null;
        }
        return this.zzbea.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzbw(int i) {
        zzrd();
        V v = (V) this.zzbdz.remove(i).getValue();
        if (!this.zzbea.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzre().entrySet().iterator();
            this.zzbdz.add(new zztj(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final int zza(K k) {
        int size = this.zzbdz.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzbdz.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzbdz.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzbeb == null) {
            this.zzbeb = new zztl(this, null);
        }
        return this.zzbeb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzrc() {
        if (this.zzbed == null) {
            this.zzbed = new zztf(this, null);
        }
        return this.zzbed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzrd() {
        if (this.zzaut) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzre() {
        zzrd();
        if (this.zzbea.isEmpty() && !(this.zzbea instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzbea = treeMap;
            this.zzbec = treeMap.descendingMap();
        }
        return (SortedMap) this.zzbea;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zztc)) {
            return super.equals(obj);
        }
        zztc zztcVar = (zztc) obj;
        int size = size();
        if (size != zztcVar.size()) {
            return false;
        }
        int zzra = zzra();
        if (zzra != zztcVar.zzra()) {
            return entrySet().equals(zztcVar.entrySet());
        }
        for (int i = 0; i < zzra; i++) {
            if (!zzbv(i).equals(zztcVar.zzbv(i))) {
                return false;
            }
        }
        if (zzra != size) {
            return this.zzbea.equals(zztcVar.zzbea);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int zzra = zzra();
        int i = 0;
        for (int i2 = 0; i2 < zzra; i2++) {
            i += this.zzbdz.get(i2).hashCode();
        }
        return this.zzbea.size() > 0 ? i + this.zzbea.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zztc<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zztc(int i, zztd zztdVar) {
        this(i);
    }
}
