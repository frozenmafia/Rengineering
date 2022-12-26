package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzky implements zzgz {
    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        if (zzflVar.has("gtm.globals.eventName")) {
            return zzflVar.zzca("gtm.globals.eventName");
        }
        return zzog.zzaul;
    }
}
