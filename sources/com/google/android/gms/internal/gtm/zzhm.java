package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
/* loaded from: classes7.dex */
public final class zzhm extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        zzoa<?> zzac;
        int i;
        Preconditions.checkNotNull(zzoaVarArr);
        Preconditions.checkArgument(zzoaVarArr.length == 2 || zzoaVarArr.length == 3);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzoh);
        Preconditions.checkArgument(zzoaVarArr[1] instanceof zzof);
        zzoh zzohVar = (zzoh) zzoaVarArr[0];
        zzof zzofVar = (zzof) zzoaVarArr[1];
        List<zzoa<?>> value = zzohVar.value();
        int size = value.size();
        if (zzoaVarArr.length == 3) {
            zzac = zzoaVarArr[2];
            i = 0;
        } else {
            Preconditions.checkState(size > 0);
            zzac = zzohVar.zzac(0);
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i = 1;
                    break;
                } else if (zzohVar.zzad(i2)) {
                    zzac = zzohVar.zzac(i2);
                    i = i2 + 1;
                    break;
                } else {
                    i2++;
                }
            }
            Preconditions.checkState(i2 < size);
        }
        while (i < size && i < zzohVar.value().size()) {
            if (zzohVar.zzad(i)) {
                zzac = zzofVar.value().zzb(zzflVar, zzac, value.get(i), new zzoe(Double.valueOf(i)), zzohVar);
            }
            i++;
        }
        return zzac;
    }
}
