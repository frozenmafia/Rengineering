package com.google.android.gms.internal.measurement;
/* loaded from: classes7.dex */
final class zzjq {
    private final Object zza;
    private final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjq(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjq) {
            zzjq zzjqVar = (zzjq) obj;
            return this.zza == zzjqVar.zza && this.zzb == zzjqVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
