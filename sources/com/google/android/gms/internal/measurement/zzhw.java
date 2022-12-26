package com.google.android.gms.internal.measurement;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzhw extends zzib {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhw(zzhy zzhyVar, String str, Double d, boolean z) {
        super(zzhyVar, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            Log.e("PhenotypeFlag", "Invalid double value for " + zzc + ": " + ((String) obj));
            return null;
        }
    }
}
