package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzhl implements zzla {
    final /* synthetic */ zzhx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhl(zzhx zzhxVar) {
        this.zza = zzhxVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzla
    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzF("auto", "_err", bundle, str);
        } else {
            this.zza.zzD("auto", "_err", bundle);
        }
    }
}
