package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzlt implements zzgz {
    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        int i = Build.VERSION.SDK_INT;
        StringBuilder sb = new StringBuilder(16);
        sb.append("5.06-");
        sb.append(i);
        return new zzom(sb.toString());
    }
}
