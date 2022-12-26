package com.google.android.gms.internal.gtm;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzgh implements ComponentCallbacks2 {
    final /* synthetic */ zzfy zzaqb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgh(zzfy zzfyVar) {
        this.zzaqb = zzfyVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20) {
            this.zzaqb.zzamv.execute(new zzgi(this));
        }
    }
}
