package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzlg extends zzhb {
    private final zzfj zzaru;

    public zzlg(zzfj zzfjVar) {
        this.zzaru = zzfjVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzhb
    protected final zzoa<?> zza(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        return zzoo.zzq(this.zzaru.zzkt().zzkg());
    }
}
