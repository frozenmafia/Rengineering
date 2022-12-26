package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes7.dex */
public final class zzse<K, V> extends LinkedHashMap<K, V> {
    private static final zzse zzbct;
    private boolean zzavs;

    private zzse() {
        this.zzavs = true;
    }

    private zzse(Map<K, V> map) {
        super(map);
        this.zzavs = true;
    }

    public static <K, V> zzse<K, V> zzqf() {
        return zzbct;
    }

    public final void zza(zzse<K, V> zzseVar) {
        zzqh();
        if (zzseVar.isEmpty()) {
            return;
        }
        putAll(zzseVar);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzqh();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zzqh();
        zzre.checkNotNull(k);
        zzre.checkNotNull(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zzqh();
        for (K k : map.keySet()) {
            zzre.checkNotNull(k);
            zzre.checkNotNull(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zzqh();
        return (V) super.remove(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L59
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L15
            goto L57
        L15:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L34
            goto L57
        L34:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L51
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L51
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L55
        L51:
            boolean r3 = r4.equals(r3)
        L55:
            if (r3 != 0) goto L1d
        L57:
            r7 = 0
            goto L5a
        L59:
            r7 = 1
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzse.equals(java.lang.Object):boolean");
    }

    private static int zzw(Object obj) {
        if (obj instanceof byte[]) {
            return zzre.hashCode((byte[]) obj);
        }
        if (obj instanceof zzrf) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += zzw(entry.getValue()) ^ zzw(entry.getKey());
        }
        return i;
    }

    public final zzse<K, V> zzqg() {
        return isEmpty() ? new zzse<>() : new zzse<>(this);
    }

    public final void zzmi() {
        this.zzavs = false;
    }

    public final boolean isMutable() {
        return this.zzavs;
    }

    private final void zzqh() {
        if (!this.zzavs) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        zzse zzseVar = new zzse();
        zzbct = zzseVar;
        zzseVar.zzavs = false;
    }
}
