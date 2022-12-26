package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* loaded from: classes7.dex */
public final class zzit extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        ArrayList arrayList = new ArrayList();
        int length = zzoaVarArr.length;
        for (int i = 0; i < length; i++) {
            zzoa<?> zzoaVar = zzoaVarArr[i];
            Preconditions.checkArgument(!(zzoaVar instanceof zzog) || zzoaVar == zzog.zzaum || zzoaVar == zzog.zzaul);
            arrayList.add(zzoaVar);
        }
        return new zzoh(arrayList);
    }
}
