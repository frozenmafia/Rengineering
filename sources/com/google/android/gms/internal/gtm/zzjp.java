package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzjp extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 1 || zzoaVarArr.length == 2);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzom);
        String value = ((zzom) zzoaVarArr[0]).value();
        int zzc = zzoaVarArr.length == 2 ? (int) zzha.zzc(zzoaVarArr[1]) : 0;
        if (zzc < 0 || zzc >= value.length()) {
            return new zzom("");
        }
        return new zzom(String.valueOf(value.charAt(zzc)));
    }
}
