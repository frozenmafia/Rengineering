package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* loaded from: classes7.dex */
public final class zzme extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 2 || zzoaVarArr.length == 3);
        try {
            return new zzod(Boolean.valueOf(Pattern.compile(zzha.zzd(zzoaVarArr[1]), zzoaVarArr.length < 3 ? false : "true".equalsIgnoreCase(zzha.zzd(zzoaVarArr[2])) ? 66 : 64).matcher(zzha.zzd(zzoaVarArr[0])).find()));
        } catch (PatternSyntaxException unused) {
            return new zzod(false);
        }
    }
}
