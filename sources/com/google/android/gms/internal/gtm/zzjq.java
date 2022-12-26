package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzjq extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length > 0);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzom);
        StringBuilder sb = new StringBuilder(((zzom) zzoaVarArr[0]).value());
        for (int i = 1; i < zzoaVarArr.length; i++) {
            sb.append(zzha.zzd(zzoaVarArr[i]));
        }
        return new zzom(sb.toString());
    }
}
