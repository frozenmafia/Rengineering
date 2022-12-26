package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzlr extends zzhb {
    private static final zzoe zzarv = new zzoe(Double.valueOf(0.0d));
    private static final zzoe zzarw = new zzoe(Double.valueOf(2.147483647E9d));

    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        double d;
        double d2;
        Preconditions.checkArgument(true);
        zzoe zzoeVar = zzoaVarArr.length > 0 ? zzoaVarArr[0] : zzarv;
        zzoe zzoeVar2 = zzoaVarArr.length > 1 ? zzoaVarArr[1] : zzarw;
        if (zzg(zzoeVar) && zzg(zzoeVar2) && zzha.zzb(zzoeVar, zzoeVar2)) {
            d = zzoeVar.value().doubleValue();
            d2 = zzoeVar2.value().doubleValue();
        } else {
            d = 0.0d;
            d2 = 2.147483647E9d;
        }
        return new zzoe(Double.valueOf(Math.round((Math.random() * (d2 - d)) + d)));
    }

    private static boolean zzg(zzoa<?> zzoaVar) {
        return (zzoaVar instanceof zzoe) && !Double.isNaN(((zzoe) zzoaVar).value().doubleValue());
    }
}
