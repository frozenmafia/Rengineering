package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.sendbird.android.constant.StringSet;
/* loaded from: classes7.dex */
public final class zzlq implements zzgz {
    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        return new zzom(StringSet.Android);
    }
}
