package com.google.android.gms.internal.measurement;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzhv extends zzib {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhv(zzhy zzhyVar, String str, Boolean bool, boolean z) {
        super(zzhyVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzib
    final /* synthetic */ Object zza(Object obj) {
        if (zzha.zzc.matcher(obj).matches()) {
            return true;
        }
        if (!zzha.zzd.matcher(obj).matches()) {
            String zzc = super.zzc();
            Log.e("PhenotypeFlag", "Invalid boolean value for " + zzc + ": " + ((String) obj));
            return null;
        }
        return false;
    }
}
