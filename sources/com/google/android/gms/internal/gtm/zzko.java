package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzko extends zzhb {
    private final zzfj zzapc;

    public zzko(Context context, zzfj zzfjVar) {
        this.zzapc = zzfjVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        this.zzapc.zzkt().zzg(false);
        return zzog.zzaum;
    }
}
