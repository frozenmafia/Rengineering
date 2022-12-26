package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzga extends com.google.android.gms.tagmanager.zzck {
    final /* synthetic */ zzfy zzaqb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzga(zzfy zzfyVar) {
        this.zzaqb = zzfyVar;
    }

    @Override // com.google.android.gms.tagmanager.zzcj
    public final void interceptEvent(String str, String str2, Bundle bundle, long j) throws RemoteException {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append(str);
        sb.append("+gtm");
        this.zzaqb.zzamv.execute(new zzgb(this, str2, bundle, sb.toString(), j, str));
    }
}
