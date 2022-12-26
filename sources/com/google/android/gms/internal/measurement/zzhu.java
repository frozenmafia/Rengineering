package com.google.android.gms.internal.measurement;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzhu extends zzib {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhu(zzhy zzhyVar, String str, Long l, boolean z) {
        super(zzhyVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            Log.e("PhenotypeFlag", "Invalid long value for " + zzc + ": " + ((String) obj));
            return null;
        }
    }
}
