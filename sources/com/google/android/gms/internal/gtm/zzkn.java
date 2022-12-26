package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzkn extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        char c;
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 2);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzom);
        String zzd = zzha.zzd(zzoaVarArr[1]);
        String value = ((zzom) zzoaVarArr[0]).value();
        value.hashCode();
        int hashCode = value.hashCode();
        if (hashCode == 101) {
            if (value.equals("e")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 105) {
            if (value.equals("i")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 118) {
            if (hashCode == 119 && value.equals("w")) {
                c = 3;
            }
            c = 65535;
        } else {
            if (value.equals("v")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            zzev.zzav(zzd);
        } else if (c == 1) {
            zzev.zzaw(zzd);
        } else if (c == 2) {
            zzev.zzab(zzd);
        } else if (c == 3) {
            zzev.zzac(zzd);
        } else {
            String valueOf = String.valueOf(((zzom) zzoaVarArr[0]).value());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid logging level: ".concat(valueOf) : new String("Invalid logging level: "));
        }
        return zzog.zzaum;
    }
}
