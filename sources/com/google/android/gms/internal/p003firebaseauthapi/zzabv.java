package com.google.android.gms.internal.p003firebaseauthapi;

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
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabv  reason: invalid package */
/* loaded from: classes7.dex */
public class zzabv<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zza;
    private boolean zzd;
    private volatile zzabu zze;
    private List<zzabs> zzb = Collections.emptyList();
    private Map<K, V> zzc = Collections.emptyMap();
    private Map<K, V> zzf = Collections.emptyMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzabv(int i, zzabo zzaboVar) {
        this.zza = i;
    }

    private final int zzk(K k) {
        int size = this.zzb.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.zzb.get(size).zza());
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
            int compareTo2 = k.compareTo(this.zzb.get(i2).zza());
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

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzl(int i) {
        zzn();
        V v = (V) this.zzb.remove(i).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzm().entrySet().iterator();
            List<zzabs> list = this.zzb;
            Map.Entry<K, V> next = it.next();
            list.add(new zzabs(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    private final SortedMap<K, V> zzm() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzk(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzabu(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzabv)) {
            return super.equals(obj);
        }
        zzabv zzabvVar = (zzabv) obj;
        int size = size();
        if (size != zzabvVar.size()) {
            return false;
        }
        int zzb = zzb();
        if (zzb == zzabvVar.zzb()) {
            for (int i = 0; i < zzb; i++) {
                if (!zzg(i).equals(zzabvVar.zzg(i))) {
                    return false;
                }
            }
            if (zzb != size) {
                return this.zzc.equals(zzabvVar.zzc);
            }
            return true;
        }
        return entrySet().equals(zzabvVar.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return (V) this.zzb.get(zzk).getValue();
        }
        return this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int zzb = zzb();
        int i = 0;
        for (int i2 = 0; i2 < zzb; i2++) {
            i += this.zzb.get(i2).hashCode();
        }
        return this.zzc.size() > 0 ? i + this.zzc.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zzn();
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return (V) zzl(zzk);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb.size() + this.zzc.size();
    }

    public void zza() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzd) {
            return;
        }
        if (this.zzc.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.zzc);
        }
        this.zzc = unmodifiableMap;
        if (this.zzf.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.zzf);
        }
        this.zzf = unmodifiableMap2;
        this.zzd = true;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final Iterable<Map.Entry<K, V>> zzc() {
        return this.zzc.isEmpty() ? zzabr.zza() : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze */
    public final V put(K k, V v) {
        zzn();
        int zzk = zzk(k);
        if (zzk >= 0) {
            return (V) this.zzb.get(zzk).setValue(v);
        }
        zzn();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i = -(zzk + 1);
        if (i >= this.zza) {
            return zzm().put(k, v);
        }
        int size = this.zzb.size();
        int i2 = this.zza;
        if (size == i2) {
            zzabs remove = this.zzb.remove(i2 - 1);
            zzm().put((K) remove.zza(), (V) remove.getValue());
        }
        this.zzb.add(i, new zzabs(this, k, v));
        return null;
    }

    public final Map.Entry<K, V> zzg(int i) {
        return this.zzb.get(i);
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
