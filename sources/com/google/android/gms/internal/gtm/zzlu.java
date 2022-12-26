package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzlu implements zzgz {
    private DisplayMetrics zzarx = new DisplayMetrics();
    private Context zzrm;

    public zzlu(Context context) {
        this.zzrm = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        ((WindowManager) this.zzrm.getSystemService("window")).getDefaultDisplay().getMetrics(this.zzarx);
        return new zzom(this.zzarx.widthPixels + "x" + this.zzarx.heightPixels);
    }
}
