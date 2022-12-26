package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* loaded from: classes7.dex */
public final class zzhq extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        int min;
        Preconditions.checkNotNull(zzoaVarArr);
        Preconditions.checkArgument(zzoaVarArr.length == 2 || zzoaVarArr.length == 3);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzoh);
        zzoh zzohVar = (zzoh) zzoaVarArr[0];
        int zzc = (int) zzha.zzc(zzoaVarArr[1]);
        if (zzc < 0) {
            min = Math.max(zzohVar.value().size() + zzc, 0);
        } else {
            min = Math.min(zzc, zzohVar.value().size());
        }
        int size = zzohVar.value().size();
        if (zzoaVarArr.length == 3) {
            int zzc2 = (int) zzha.zzc(zzoaVarArr[2]);
            if (zzc2 < 0) {
                size = Math.max(zzc2 + zzohVar.value().size(), 0);
            } else {
                size = Math.min(zzc2, zzohVar.value().size());
            }
        }
        return new zzoh(new ArrayList(zzohVar.value().subList(min, Math.max(min, size))));
    }
}
