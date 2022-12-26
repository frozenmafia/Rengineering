package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzkp implements zzgz {
    private final zzdl zzarm;

    public zzkp(Context context) {
        this(zzdl.zzo(context));
    }

    private zzkp(zzdl zzdlVar) {
        this.zzarm = zzdlVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        String zzgq = this.zzarm.zzgq();
        return zzgq == null ? zzog.zzaum : new zzom(zzgq);
    }
}
