package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public abstract class zzmd extends zzhb {
    protected abstract boolean zza(double d, double d2);

    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 2);
        try {
            double zzb = zzha.zzb(zzoaVarArr[0]);
            double zzb2 = zzha.zzb(zzoaVarArr[1]);
            if (Double.isNaN(zzb) || Double.isNaN(zzb2)) {
                return new zzod(false);
            }
            return new zzod(Boolean.valueOf(zza(zzb, zzb2)));
        } catch (IllegalArgumentException unused) {
            return new zzod(false);
        }
    }
}
