package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzkv implements zzgz {
    private final Context zzrm;

    public zzkv(Context context) {
        this.zzrm = (Context) Preconditions.checkNotNull(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        try {
            return new zzom(this.zzrm.getPackageManager().getPackageInfo(this.zzrm.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e) {
            String packageName = this.zzrm.getPackageName();
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 25 + String.valueOf(valueOf).length());
            sb.append("Package name ");
            sb.append(packageName);
            sb.append(" not found. ");
            sb.append(valueOf);
            zzev.zzav(sb.toString());
            return zzog.zzaum;
        }
    }
}
