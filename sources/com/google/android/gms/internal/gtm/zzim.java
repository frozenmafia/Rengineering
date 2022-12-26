package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzim implements zzgz {
    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        zzoa<?> zza;
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 3);
        if (zzha.zza(zzoo.zza(zzflVar, zzoaVarArr[0]))) {
            zza = zzoo.zza(zzflVar, zzoaVarArr[1]);
        } else {
            zza = zzoo.zza(zzflVar, zzoaVarArr[2]);
        }
        if (!(zza instanceof zzog) || zza == zzog.zzaum || zza == zzog.zzaul) {
            return zza;
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Ternary.");
    }
}
