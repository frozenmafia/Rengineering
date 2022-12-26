package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzln extends zzhb {
    private final zzfj zzarn;
    private final Context zzrm;

    public zzln(Context context, zzfj zzfjVar) {
        this.zzrm = context;
        this.zzarn = zzfjVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length > 0);
        Object obj = this.zzarn.zzkt().zzib().get(zzha.zzd(zzoaVarArr[0]));
        zzoa<?> zzoaVar = obj;
        if (obj == null) {
            zzoaVar = obj;
            if (zzoaVarArr.length > 1) {
                zzoaVar = zzoaVarArr[1];
            }
        }
        return zzoo.zzq(zzoaVar);
    }
}
