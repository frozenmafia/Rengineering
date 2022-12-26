package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* loaded from: classes7.dex */
public final class zzhx extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkNotNull(zzoaVarArr);
        Preconditions.checkArgument(zzoaVarArr.length > 0);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzoh);
        zzoh zzohVar = (zzoh) zzoaVarArr[0];
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < zzoaVarArr.length; i++) {
            arrayList.add(zzoaVarArr[i]);
        }
        zzohVar.value().addAll(0, arrayList);
        return new zzoe(Double.valueOf(zzohVar.value().size()));
    }
}
