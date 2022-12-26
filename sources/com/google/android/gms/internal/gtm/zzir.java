package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzir extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 1);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzoh);
        for (zzoa<?> zzoaVar : ((zzoh) zzoaVarArr[0]).value()) {
            zzoa<?> zza = zzoo.zza(zzflVar, zzoaVar);
            if ((zza instanceof zzog) && (zza == zzog.zzauj || zza == zzog.zzauk || ((zzog) zza).zzmh())) {
                return zza;
            }
        }
        return zzog.zzaum;
    }
}
