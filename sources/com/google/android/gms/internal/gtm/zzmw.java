package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes7.dex */
public final class zzmw {
    private zzmk zzasy;

    public final zzmw zza(zzmk zzmkVar) throws IllegalArgumentException {
        Preconditions.checkNotNull(zzmkVar);
        this.zzasy = zzmkVar;
        return this;
    }

    public final zzmk zzlk() {
        return this.zzasy;
    }

    public final String getId() {
        zzmk zzmkVar = this.zzasy;
        return zzmkVar == null ? "" : zzmkVar.getContainerId();
    }
}
