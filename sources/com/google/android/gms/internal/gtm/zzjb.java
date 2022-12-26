package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes7.dex */
public final class zzjb extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 2 || zzoaVarArr.length == 3);
        Preconditions.checkArgument(zzoaVarArr[1] instanceof zzoh);
        if (zzoaVarArr.length == 3) {
            Preconditions.checkArgument(zzoaVarArr[2] instanceof zzoh);
        }
        List<zzoa<?>> arrayList = new ArrayList<>();
        if (zzha.zza(zzoaVarArr[0])) {
            arrayList = ((zzoh) zzoaVarArr[1]).value();
        } else if (zzoaVarArr.length > 2) {
            arrayList = ((zzoh) zzoaVarArr[2]).value();
        }
        zzog zza = zzoo.zza(zzflVar, arrayList);
        return ((zza instanceof zzog) && zzoo.zzm(zza)) ? zza : zzog.zzaum;
    }
}
