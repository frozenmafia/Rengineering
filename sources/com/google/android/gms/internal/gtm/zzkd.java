package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;
/* loaded from: classes7.dex */
public final class zzkd extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 1);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzom);
        return new zzom(((zzom) zzoaVarArr[0]).value().toUpperCase(Locale.ENGLISH));
    }
}
