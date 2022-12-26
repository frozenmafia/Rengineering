package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzij implements zzgz {
    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 2);
        zzoa<?> zza = zzoo.zza(zzflVar, zzoaVarArr[0]);
        return zzha.zza(zza) ? zza : zzoo.zza(zzflVar, zzoaVarArr[1]);
    }
}
