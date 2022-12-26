package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzhc extends zzhz {
    private final Context zza;
    private final zzii zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhc(Context context, zzii zziiVar) {
        Objects.requireNonNull(context, "Null context");
        this.zza = context;
        this.zzb = zziiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhz) {
            zzhz zzhzVar = (zzhz) obj;
            if (this.zza.equals(zzhzVar.zza())) {
                zzii zziiVar = this.zzb;
                if (zziiVar == null) {
                    if (zzhzVar.zzb() != null) {
                        return false;
                    }
                } else if (!zziiVar.equals(zzhzVar.zzb())) {
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
        zzii zziiVar = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (zziiVar == null ? 0 : zziiVar.hashCode());
    }

    public final String toString() {
        String obj = this.zza.toString();
        String valueOf = String.valueOf(this.zzb);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhz
    public final Context zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzhz
    public final zzii zzb() {
        return this.zzb;
    }
}
