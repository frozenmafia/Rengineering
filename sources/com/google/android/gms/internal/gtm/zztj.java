package com.google.android.gms.internal.gtm;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Incorrect field signature: TK; */
/* loaded from: classes7.dex */
public final class zztj implements Comparable<zztj>, Map.Entry<K, V> {
    private V value;
    private final /* synthetic */ zztc zzbef;
    private final Comparable zzbei;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztj(zztc zztcVar, Map.Entry<K, V> entry) {
        this(zztcVar, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public zztj(zztc zztcVar, K k, V v) {
        this.zzbef = zztcVar;
        this.zzbei = k;
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.zzbef.zzrd();
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return equals(this.zzbei, entry.getKey()) && equals(this.value, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zzbei;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.value;
        return hashCode ^ (v != 0 ? v.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzbei);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzbei;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zztj zztjVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zztjVar.getKey());
    }
}
