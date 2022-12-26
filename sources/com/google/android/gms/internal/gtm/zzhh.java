package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes7.dex */
public final class zzhh extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkNotNull(zzoaVarArr);
        Preconditions.checkArgument(zzoaVarArr.length == 1 || zzoaVarArr.length == 2);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzoh);
        List<zzoa<?>> value = ((zzoh) zzoaVarArr[0]).value();
        zzoa<?> zzoaVar = zzoaVarArr.length < 2 ? zzog.zzaum : zzoaVarArr[1];
        String zzd = zzoaVar == zzog.zzaum ? "," : zzha.zzd(zzoaVar);
        ArrayList arrayList = new ArrayList();
        for (zzoa<?> zzoaVar2 : value) {
            if (zzoaVar2 == zzog.zzaul || zzoaVar2 == zzog.zzaum) {
                arrayList.add("");
            } else {
                arrayList.add(zzha.zzd(zzoaVar2));
            }
        }
        return new zzom(TextUtils.join(zzd, arrayList));
    }
}
