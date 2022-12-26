package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* loaded from: classes7.dex */
public final class zzjx extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        int i = 1;
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 1 || zzoaVarArr.length == 2);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzom);
        ArrayList arrayList = new ArrayList();
        if (zzoaVarArr.length == 1) {
            arrayList.add(zzoaVarArr[0]);
        } else {
            String value = ((zzom) zzoaVarArr[0]).value();
            String zzd = zzha.zzd(zzoaVarArr[1]);
            boolean equals = zzd.equals("");
            String[] split = value.split(zzd, equals ? 0 : -1);
            for (i = (equals && split.length > 0 && split[0].equals("")) ? 0 : 0; i < split.length; i++) {
                arrayList.add(new zzom(split[i]));
            }
        }
        return new zzoh(arrayList);
    }
}
