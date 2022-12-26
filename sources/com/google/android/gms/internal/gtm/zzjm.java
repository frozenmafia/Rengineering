package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzjm extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        int i;
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 2);
        double zzb = zzha.zzb(zzoaVarArr[0]);
        double zzb2 = zzha.zzb(zzoaVarArr[1]);
        if (Double.isNaN(zzb) || Double.isNaN(zzb2)) {
            return new zzoe(Double.valueOf(Double.NaN));
        }
        if (Double.isInfinite(zzb) || zzb2 == 0.0d) {
            return new zzoe(Double.valueOf(Double.NaN));
        }
        if (!Double.isInfinite(zzb) && Double.isInfinite(zzb2)) {
            return new zzoe(Double.valueOf(zzb));
        }
        if (zzb == 0.0d && i != 0 && !Double.isInfinite(zzb2)) {
            return new zzoe(Double.valueOf(zzb));
        }
        return new zzoe(Double.valueOf(zzb % zzb2));
    }
}
