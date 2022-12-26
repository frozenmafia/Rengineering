package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
/* loaded from: classes7.dex */
public final class zzhg extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkNotNull(zzoaVarArr);
        int i = 0;
        Preconditions.checkArgument(zzoaVarArr.length > 0 && zzoaVarArr.length <= 3);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzoh);
        zzoh zzohVar = (zzoh) zzoaVarArr[0];
        zzoa<?> zzoaVar = zzoaVarArr.length < 2 ? zzog.zzaum : zzoaVarArr[1];
        zzoa<?> zzoaVar2 = zzoaVarArr.length < 3 ? zzog.zzaum : zzoaVarArr[2];
        List<zzoa<?>> value = zzohVar.value();
        int size = value.size();
        if (zzoaVar2 != zzog.zzaum) {
            int zzc = (int) zzha.zzc(zzoaVar2);
            i = zzc < 0 ? Math.max(size - Math.abs(zzc), 0) : zzc;
        }
        int i2 = -1;
        while (true) {
            if (i < size) {
                if (zzohVar.zzad(i) && zzha.zzd(zzoaVar, value.get(i))) {
                    i2 = i;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return new zzoe(Double.valueOf(i2));
    }
}
