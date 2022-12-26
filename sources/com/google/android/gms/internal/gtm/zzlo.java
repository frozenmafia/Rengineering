package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzlo implements zzgz {
    private final Context zzrm;

    public zzlo(Context context) {
        this.zzrm = (Context) Preconditions.checkNotNull(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        String string = Settings.Secure.getString(this.zzrm.getContentResolver(), "android_id");
        return string != null ? new zzom(string) : zzog.zzaum;
    }
}
