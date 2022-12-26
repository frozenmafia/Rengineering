package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes7.dex */
public final class zziw extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    public final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkNotNull(zzoaVarArr);
        Preconditions.checkArgument(zzoaVarArr.length == 3);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzom);
        String value = ((zzom) zzoaVarArr[0]).value();
        Preconditions.checkArgument(zzflVar.has(value));
        zzoa<?> zzoaVar = zzoaVarArr[1];
        Preconditions.checkNotNull(zzoaVar);
        zzoa<?> zzoaVar2 = zzoaVarArr[2];
        Preconditions.checkArgument(zzoaVar2 instanceof zzoh);
        List<zzoa<?>> value2 = ((zzoh) zzoaVar2).value();
        Iterator<zzoa<?>> zzmf = zzoaVar.zzmf();
        while (zzmf.hasNext()) {
            zzflVar.zzb(value, zzmf.next());
            zzog zza = zzoo.zza(zzflVar, value2);
            if (zza == zzog.zzauj) {
                return zzog.zzaum;
            }
            if (zza.zzmh()) {
                return zza;
            }
        }
        return zzog.zzaum;
    }
}
