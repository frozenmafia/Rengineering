package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;
/* loaded from: classes7.dex */
public final class zzll implements zzgz {
    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return new zzom("");
        }
        String language = locale.getLanguage();
        if (language == null) {
            return new zzom("");
        }
        return new zzom(language.toLowerCase());
    }
}
