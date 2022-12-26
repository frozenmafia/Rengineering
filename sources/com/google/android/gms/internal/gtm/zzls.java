package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* loaded from: classes7.dex */
public final class zzls extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        int i = 1;
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length >= 2);
        if (zzoaVarArr[0] == zzog.zzaum || zzoaVarArr[1] == zzog.zzaum) {
            return zzog.zzaum;
        }
        String zzd = zzha.zzd(zzoaVarArr[0]);
        String zzd2 = zzha.zzd(zzoaVarArr[1]);
        int i2 = 64;
        if (zzoaVarArr.length > 2 && zzoaVarArr[2] != zzog.zzaum && zzha.zza(zzoaVarArr[2])) {
            i2 = 66;
        }
        if (zzoaVarArr.length > 3 && zzoaVarArr[3] != zzog.zzaum) {
            if (!(zzoaVarArr[3] instanceof zzoe)) {
                return zzog.zzaum;
            }
            double zzc = zzha.zzc(zzoaVarArr[3]);
            if (Double.isInfinite(zzc) || zzc < 0.0d) {
                return zzog.zzaum;
            }
            i = (int) zzc;
        }
        String str = null;
        try {
            Matcher matcher = Pattern.compile(zzd2, i2).matcher(zzd);
            if (matcher.find() && matcher.groupCount() >= i) {
                str = matcher.group(i);
            }
            return str == null ? zzog.zzaum : new zzom(str);
        } catch (PatternSyntaxException unused) {
            return zzog.zzaum;
        }
    }
}
