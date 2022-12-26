package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzjw extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        double min;
        double min2;
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length > 0 && zzoaVarArr.length <= 3);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzom);
        String value = ((zzom) zzoaVarArr[0]).value();
        double zzc = zzoaVarArr.length < 2 ? 0.0d : zzha.zzc(zzoaVarArr[1]);
        double length = value.length();
        if (zzoaVarArr.length == 3 && zzoaVarArr[2] != zzog.zzaum) {
            length = zzha.zzc(zzoaVarArr[2]);
        }
        if (zzc < 0.0d) {
            min = Math.max(value.length() + zzc, 0.0d);
        } else {
            min = Math.min(zzc, value.length());
        }
        int i = (int) min;
        if (length < 0.0d) {
            min2 = Math.max(value.length() + length, 0.0d);
        } else {
            min2 = Math.min(length, value.length());
        }
        return new zzom(value.substring(i, Math.max(0, ((int) min2) - i) + i));
    }
}
