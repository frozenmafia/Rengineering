package com.google.android.gms.internal.gtm;

import android.os.RemoteException;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzfh implements zzkl {
    private final /* synthetic */ zzff zzapd;

    private zzfh(zzff zzffVar) {
        this.zzapd = zzffVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzkl
    public final Object zza(String str, Map<String, Object> map) {
        com.google.android.gms.tagmanager.zzcd zzcdVar;
        try {
            zzcdVar = this.zzapd.zzanh;
            zzcdVar.zzb(str, map);
            return null;
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            zzev.zzav(valueOf.length() != 0 ? "Error calling customEvaluator proxy:".concat(valueOf) : new String("Error calling customEvaluator proxy:"));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfh(zzff zzffVar, zzfg zzfgVar) {
        this(zzffVar);
    }
}
