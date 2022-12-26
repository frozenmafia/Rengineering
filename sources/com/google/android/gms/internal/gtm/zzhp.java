package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
/* loaded from: classes7.dex */
public final class zzhp extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkNotNull(zzoaVarArr);
        Preconditions.checkArgument(zzoaVarArr.length == 1);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzoh);
        zzog zzogVar = zzog.zzaum;
        List<zzoa<?>> value = ((zzoh) zzoaVarArr[0]).value();
        return !value.isEmpty() ? value.remove(0) : zzogVar;
    }
}
