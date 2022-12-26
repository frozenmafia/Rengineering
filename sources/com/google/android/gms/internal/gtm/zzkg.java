package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
/* loaded from: classes7.dex */
public final class zzkg extends zzhb {
    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        try {
            return new zzom(zzkf.decode(zzha.zzd(zzoaVarArr.length > 0 ? (zzoa) Preconditions.checkNotNull(zzoaVarArr[0]) : zzog.zzaum), ""));
        } catch (UnsupportedEncodingException unused) {
            return zzog.zzaum;
        }
    }
}
