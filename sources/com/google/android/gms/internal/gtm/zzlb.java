package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzlb implements zzgz {
    private final Context zzrm;

    public zzlb(Context context) {
        this.zzrm = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        String string = Settings.Secure.getString(this.zzrm.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        return new zzom(string);
    }
}
