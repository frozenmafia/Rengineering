package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* loaded from: classes7.dex */
public final class zzhw extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        int min;
        Preconditions.checkNotNull(zzoaVarArr);
        Preconditions.checkArgument(zzoaVarArr.length >= 3);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzoh);
        zzoh zzohVar = (zzoh) zzoaVarArr[0];
        int zzc = (int) zzha.zzc(zzoaVarArr[1]);
        if (zzc < 0) {
            min = Math.max(zzohVar.value().size() + zzc, 0);
        } else {
            min = Math.min(zzc, zzohVar.value().size());
        }
        int min2 = Math.min(Math.max((int) zzha.zzc(zzoaVarArr[2]), 0), zzohVar.value().size() - min) + min;
        ArrayList arrayList = new ArrayList(zzohVar.value().subList(min, min2));
        zzohVar.value().subList(min, min2).clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 3; i < zzoaVarArr.length; i++) {
            arrayList2.add(zzoaVarArr[i]);
        }
        zzohVar.value().addAll(min, arrayList2);
        return new zzoh(arrayList);
    }
}
