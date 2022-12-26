package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
/* loaded from: classes7.dex */
public final class zzho extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkNotNull(zzoaVarArr);
        Preconditions.checkArgument(zzoaVarArr.length == 1);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzoh);
        Collections.reverse(((zzoh) zzoaVarArr[0]).value());
        return zzoaVarArr[0];
    }
}
