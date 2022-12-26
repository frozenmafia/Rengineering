package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
/* loaded from: classes7.dex */
public final class zzjg extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 3);
        Preconditions.checkArgument(zzoaVarArr[1] instanceof zzoh);
        Preconditions.checkArgument(zzoaVarArr[2] instanceof zzoh);
        zzoa<?> zzoaVar = zzoaVarArr[0];
        List<zzoa<?>> value = ((zzoh) zzoaVarArr[1]).value();
        List<zzoa<?>> value2 = ((zzoh) zzoaVarArr[2]).value();
        Preconditions.checkArgument(value2.size() <= value.size() + 1);
        boolean z = false;
        for (int i = 0; i < value.size(); i++) {
            if (z || zzha.zzd(zzoaVar, zzoo.zza(zzflVar, value.get(i)))) {
                zzoa<?> zza = zzoo.zza(zzflVar, value2.get(i));
                if (!(zza instanceof zzog)) {
                    z = true;
                } else if (zza == zzog.zzauk || ((zzog) zza).zzmh()) {
                    return zza;
                } else {
                    if (zza == zzog.zzauj) {
                        return zzog.zzaum;
                    }
                }
            }
        }
        if (value.size() < value2.size()) {
            zzoa<?> zza2 = zzoo.zza(zzflVar, value2.get(value2.size() - 1));
            if ((zza2 instanceof zzog) && (zza2 == zzog.zzauk || ((zzog) zza2).zzmh())) {
                return zza2;
            }
        }
        return zzog.zzaum;
    }
}
