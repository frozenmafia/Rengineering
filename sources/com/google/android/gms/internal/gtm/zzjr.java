package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzjr extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 2 || zzoaVarArr.length == 3);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzom);
        String value = ((zzom) zzoaVarArr[0]).value();
        return new zzoe(Double.valueOf(value.indexOf(zzha.zzd(zzoaVarArr[1]), (int) Math.min(Math.max(zzoaVarArr.length < 3 ? 0.0d : zzha.zzc(zzoaVarArr[2]), 0.0d), value.length()))));
    }
}
