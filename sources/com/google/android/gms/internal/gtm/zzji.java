package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzji implements zzgz {
    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length > 0);
        for (zzoa<?> zzoaVar : zzoaVarArr) {
            Preconditions.checkNotNull(zzoaVar);
            Preconditions.checkArgument(zzoaVar instanceof zzom);
            zzflVar.zza(((zzom) zzoaVar).value(), zzog.zzaum);
        }
        return zzog.zzaum;
    }
}
