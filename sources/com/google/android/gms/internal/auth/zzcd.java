package com.google.android.gms.internal.auth;

import android.content.Context;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzcd extends zzda {
    private final Context zza;
    private final zzdj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcd(Context context, zzdj zzdjVar) {
        Objects.requireNonNull(context, "Null context");
        this.zza = context;
        this.zzb = zzdjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzdaVar = (zzda) obj;
            if (this.zza.equals(zzdaVar.zza())) {
                zzdj zzdjVar = this.zzb;
                if (zzdjVar == null) {
                    if (zzdaVar.zzb() != null) {
                        return false;
                    }
                } else if (!zzdjVar.equals(zzdaVar.zzb())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        zzdj zzdjVar = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (zzdjVar == null ? 0 : zzdjVar.hashCode());
    }

    public final String toString() {
        String obj = this.zza.toString();
        String valueOf = String.valueOf(this.zzb);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.zzda
    public final Context zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.zzda
    public final zzdj zzb() {
        return this.zzb;
    }
}
