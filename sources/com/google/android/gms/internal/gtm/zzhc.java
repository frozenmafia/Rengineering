package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* loaded from: classes7.dex */
public final class zzhc extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkNotNull(zzoaVarArr);
        Preconditions.checkArgument(zzoaVarArr.length > 0);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzoh);
        ArrayList arrayList = new ArrayList();
        for (zzoa<?> zzoaVar : ((zzoh) zzoaVarArr[0]).value()) {
            arrayList.add(zzoaVar);
        }
        for (int i = 1; i < zzoaVarArr.length; i++) {
            if (zzoaVarArr[i] instanceof zzoh) {
                for (zzoa<?> zzoaVar2 : ((zzoh) zzoaVarArr[i]).value()) {
                    arrayList.add(zzoaVar2);
                }
            } else {
                arrayList.add(zzoaVarArr[i]);
            }
        }
        return new zzoh(arrayList);
    }
}
