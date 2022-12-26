package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public abstract class zzhb implements zzgz {
    protected abstract zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr);

    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzflVar != null);
        Preconditions.checkArgument(zzoaVarArr != null);
        zzoa<?>[] zzoaVarArr2 = new zzoa[zzoaVarArr.length];
        for (int i = 0; i < zzoaVarArr.length; i++) {
            Preconditions.checkArgument(zzoaVarArr[i] != null);
            Preconditions.checkArgument(zzoaVarArr[i] != zzog.zzauj);
            Preconditions.checkArgument(zzoaVarArr[i] != zzog.zzauk);
            zzoaVarArr2[i] = zzoo.zza(zzflVar, zzoaVarArr[i]);
            Preconditions.checkArgument(zzoaVarArr2[i] != null);
            Preconditions.checkArgument(zzoaVarArr2[i] != zzog.zzauj);
            Preconditions.checkArgument(zzoaVarArr2[i] != zzog.zzauk);
        }
        zzoa<?> zza = zza(zzflVar, zzoaVarArr2);
        Preconditions.checkState(zza != null);
        return zza;
    }
}
