package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzla implements zzgz {
    private final String zzarp = Build.BRAND;

    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        return new zzom(this.zzarp);
    }
}
