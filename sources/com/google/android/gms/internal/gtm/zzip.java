package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzip extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 2);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzom);
        String value = ((zzom) zzoaVarArr[0]).value();
        if (zzflVar.has(value)) {
            zzflVar.zzb(value, zzoaVarArr[1]);
            return zzoaVarArr[1];
        }
        String valueOf = String.valueOf(value);
        throw new IllegalStateException(valueOf.length() != 0 ? "Attempting to assign to undefined variable ".concat(valueOf) : new String("Attempting to assign to undefined variable "));
    }
}
