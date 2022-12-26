package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzjs extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 2 || zzoaVarArr.length == 3);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzom);
        String value = ((zzom) zzoaVarArr[0]).value();
        String zzd = zzha.zzd(zzoaVarArr[1]);
        double d = Double.POSITIVE_INFINITY;
        if (zzoaVarArr.length == 3 && !Double.isNaN(zzha.zzb(zzoaVarArr[2]))) {
            d = zzha.zzc(zzoaVarArr[2]);
        }
        return new zzoe(Double.valueOf(value.lastIndexOf(zzd, (int) Math.min(Math.max(d, 0.0d), value.length()))));
    }
}
