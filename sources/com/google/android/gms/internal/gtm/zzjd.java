package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* loaded from: classes7.dex */
public final class zzjd implements zzgz {
    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        ArrayList arrayList = new ArrayList(zzoaVarArr.length);
        for (zzoa<?> zzoaVar : zzoaVarArr) {
            arrayList.add(zzoaVar);
        }
        return new zzoh(arrayList);
    }
}
