package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaat  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzaat<K, V> extends LinkedHashMap<K, V> {
    private static final zzaat zza;
    private boolean zzb;

    static {
        zzaat zzaatVar = new zzaat();
        zza = zzaatVar;
        zzaatVar.zzb = false;
    }

    private zzaat() {
        this.zzb = true;
    }

    public static <K, V> zzaat<K, V> zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            return zzaac.zzb((byte[]) obj);
        }
        if (obj instanceof zzzy) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            for (Map.Entry<K, V> entry : entrySet()) {
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                V value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                    equals = value.equals(obj2);
                    continue;
                } else {
                    equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zzg();
        zzaac.zze(k);
        zzaac.zze(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zzg();
        for (K k : map.keySet()) {
            zzaac.zze(k);
            zzaac.zze(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zzg();
        return (V) super.remove(obj);
    }

    public final zzaat<K, V> zzb() {
        return isEmpty() ? new zzaat<>() : new zzaat<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzaat<K, V> zzaatVar) {
        zzg();
        if (zzaatVar.isEmpty()) {
            return;
        }
        putAll(zzaatVar);
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzaat(Map<K, V> map) {
        super(map);
        this.zzb = true;
    }
}
