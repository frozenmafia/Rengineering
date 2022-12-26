package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzjo extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 2);
        return new zzoe(Double.valueOf(zzha.zza(zzoaVarArr[0], new zzoe(Double.valueOf(zzha.zzb(zzoaVarArr[1]) * (-1.0d))))));
    }
}
