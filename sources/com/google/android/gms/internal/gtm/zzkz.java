package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
/* loaded from: classes7.dex */
public final class zzkz implements zzgz {
    private Clock zzsd = DefaultClock.getInstance();

    @Override // com.google.android.gms.internal.gtm.zzgz
    public final zzoa<?> zzb(zzfl zzflVar, zzoa<?>... zzoaVarArr) {
        Preconditions.checkArgument(zzoaVarArr != null);
        Preconditions.checkArgument(zzoaVarArr.length == 0);
        return new zzoe(Double.valueOf(this.zzsd.currentTimeMillis()));
    }

    public final void zza(Clock clock) {
        this.zzsd = (Clock) Preconditions.checkNotNull(clock);
    }
}
