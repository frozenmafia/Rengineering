package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzkt implements zzgz {
    private Context zzrm;

    public zzkt(Context context) {
        this.zzrm = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        try {
            PackageManager packageManager = this.zzrm.getPackageManager();
            return new zzom(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.zzrm.getPackageName(), 0)).toString());
        } catch (PackageManager.NameNotFoundException unused) {
            return new zzom("");
        }
    }
}
