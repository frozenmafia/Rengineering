package com.google.android.gms.internal.gtm;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzgc extends com.google.android.gms.tagmanager.zzch {
    final /* synthetic */ zzfy zzaqb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgc(zzfy zzfyVar) {
        this.zzaqb = zzfyVar;
    }

    @Override // com.google.android.gms.tagmanager.zzcg
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (str.endsWith("+gtm")) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append(str);
        sb.append("+gtm");
        this.zzaqb.zzamv.execute(new zzgd(this, str2, bundle, sb.toString(), j, str));
    }
}
