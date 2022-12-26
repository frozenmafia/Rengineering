package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzks implements zzgz {
    private final Context zzrm;

    public zzks(Context context) {
        this.zzrm = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        return new zzom(this.zzrm.getPackageName());
    }
}
