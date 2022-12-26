package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzik implements zzii {
    volatile zzii zza;
    volatile boolean zzb;
    Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzik(zzii zziiVar) {
        zziiVar.getClass();
        this.zza = zziiVar;
    }

    public final String toString() {
        Object obj = this.zza;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.zzc + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    zzii zziiVar = this.zza;
                    zziiVar.getClass();
                    Object zza = zziiVar.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    this.zza = null;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
