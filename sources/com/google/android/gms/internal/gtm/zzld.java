package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.dreampay.commons.constants.Constants;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzld implements zzgz {
    private final String zzarr = Build.MANUFACTURER;
    private final String zzars = Build.MODEL;

    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        String str = this.zzarr;
        String str2 = this.zzars;
        if (!str2.startsWith(str) && !str.equals("unknown")) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            sb.append(str);
            sb.append(Constants.WHITE_SPACE);
            sb.append(str2);
            str2 = sb.toString();
        }
        return new zzom(str2);
    }
}
