package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzhl extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkNotNull(zzoaVarArr);
        Preconditions.checkArgument(zzoaVarArr.length > 0);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzoh);
        zzoh zzohVar = (zzoh) zzoaVarArr[0];
        int size = zzohVar.value().size();
        zzohVar.setSize((zzoaVarArr.length + size) - 1);
        for (int i = 1; i < zzoaVarArr.length; i++) {
            zzohVar.zza(size, zzoaVarArr[i]);
            size++;
        }
        return new zzoe(Double.valueOf(size));
    }
}
