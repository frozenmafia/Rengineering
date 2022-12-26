package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzjl extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 2);
        double zzb = zzha.zzb(zzoaVarArr[0]);
        double zzb2 = zzha.zzb(zzoaVarArr[1]);
        if (Double.isNaN(zzb) || Double.isNaN(zzb2)) {
            return new zzoe(Double.valueOf(Double.NaN));
        }
        if (Double.isInfinite(zzb) && Double.isInfinite(zzb2)) {
            return new zzoe(Double.valueOf(Double.NaN));
        }
        boolean z = (((double) Double.compare(zzb2, 0.0d)) < 0.0d) ^ (((double) Double.compare(zzb, 0.0d)) < 0.0d);
        if (Double.isInfinite(zzb) && !Double.isInfinite(zzb2)) {
            return new zzoe(Double.valueOf(z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY));
        } else if (Double.isInfinite(zzb) || !Double.isInfinite(zzb2)) {
            int i = (zzb > 0.0d ? 1 : (zzb == 0.0d ? 0 : -1));
            if (i == 0) {
                if (zzb2 == 0.0d) {
                    return new zzoe(Double.valueOf(Double.NaN));
                }
                return new zzoe(Double.valueOf(0.0d));
            } else if (!Double.isInfinite(zzb) && i != 0 && zzb2 == 0.0d) {
                return new zzoe(Double.valueOf(z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY));
            } else {
                return new zzoe(Double.valueOf(zzb / zzb2));
            }
        } else {
            return new zzoe(Double.valueOf(0.0d));
        }
    }
}
