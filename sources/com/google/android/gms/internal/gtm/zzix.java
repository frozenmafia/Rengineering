package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzix implements zzgz {
    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 1);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzom);
        zzoa<?> zzca = zzflVar.zzca(((zzom) zzoaVarArr[0]).value());
        if (zzca instanceof zzol) {
            throw new IllegalStateException("Illegal Statement type encountered in Get.");
        }
        if (!(zzca instanceof zzog) || zzca == zzog.zzaum || zzca == zzog.zzaul) {
            return zzca;
        }
        throw new IllegalStateException("Illegal InternalType encountered in Get.");
    }
}
