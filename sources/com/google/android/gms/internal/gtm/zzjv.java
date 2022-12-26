package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes7.dex */
public final class zzjv extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 1 || zzoaVarArr.length == 2);
        Preconditions.checkArgument(zzoaVarArr[0] instanceof zzom);
        Matcher matcher = Pattern.compile(zzoaVarArr.length < 2 ? "" : zzha.zzd(zzoaVarArr[1])).matcher(((zzom) zzoaVarArr[0]).value());
        if (matcher.find()) {
            return new zzoe(Double.valueOf(matcher.start()));
        }
        return new zzoe(Double.valueOf(-1.0d));
    }
}
