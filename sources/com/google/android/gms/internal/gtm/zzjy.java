package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzjy extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length > 0 && zzoaVarArr.length <= 3);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzom);
        String value = ((zzom) zzoaVarArr[0]).value();
        int zzc = (int) zzha.zzc(zzoaVarArr.length < 2 ? zzog.zzaum : zzoaVarArr[1]);
        int length = value.length();
        if (zzoaVarArr.length == 3 && zzoaVarArr[2] != zzog.zzaum) {
            length = (int) zzha.zzc(zzoo.zza(zzflVar, zzoaVarArr[2]));
        }
        int min = Math.min(Math.max(zzc, 0), value.length());
        int min2 = Math.min(Math.max(length, 0), value.length());
        return new zzom(value.substring(Math.min(min, min2), Math.max(min, min2)));
    }
}
