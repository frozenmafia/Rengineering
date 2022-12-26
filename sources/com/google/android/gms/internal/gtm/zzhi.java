package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
/* loaded from: classes7.dex */
public final class zzhi extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkNotNull(zzoaVarArr);
        Preconditions.checkArgument(zzoaVarArr.length > 0 && zzoaVarArr.length <= 3);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzoh);
        zzoh zzohVar = (zzoh) zzoaVarArr[0];
        zzoa<?> zzoaVar = zzoaVarArr.length < 2 ? zzog.zzaum : zzoaVarArr[1];
        List<zzoa<?>> value = zzohVar.value();
        int size = value.size();
        int i = size - 1;
        if (zzoaVarArr.length == 3) {
            int zzc = (int) zzha.zzc(zzoaVarArr[2]);
            if (zzc < 0) {
                i = size - Math.abs(zzc);
            } else {
                i = Math.min(zzc, i);
            }
        }
        while (true) {
            if (i < 0) {
                i = -1;
                break;
            } else if (zzohVar.zzad(i) && zzha.zzd(zzoaVar, value.get(i))) {
                break;
            } else {
                i--;
            }
        }
        return new zzoe(Double.valueOf(i));
    }
}
