package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
/* loaded from: classes7.dex */
public final class zziu extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < zzoaVarArr.length - 1; i += 2) {
            String zzd = zzha.zzd(zzoaVarArr[i]);
            zzoa<?> zzoaVar = zzoaVarArr[i + 1];
            if ((zzoaVar instanceof zzog) && zzoaVar != zzog.zzaul && zzoaVar != zzog.zzaum) {
                throw new IllegalStateException("Illegal InternalType found in CreateObject.");
            }
            hashMap.put(zzd, zzoaVar);
        }
        return new zzok(hashMap);
    }
}
