package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.RemoteException;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzgm implements Runnable {
    private final /* synthetic */ String zzaqk;
    private final /* synthetic */ String zzaql;
    private final /* synthetic */ String zzaqm;
    private final /* synthetic */ zzeo zzaqu;
    private final /* synthetic */ zzgl zzaqv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgm(zzgl zzglVar, String str, String str2, String str3, zzeo zzeoVar) {
        this.zzaqv = zzglVar;
        this.zzaqk = str;
        this.zzaql = str2;
        this.zzaqm = str3;
        this.zzaqu = zzeoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        boolean z;
        Context context2;
        Map map;
        zzdy zzdyVar;
        Map map2;
        try {
            map = this.zzaqv.zzaqs;
            if (!map.containsKey(this.zzaqk)) {
                zzdyVar = this.zzaqv.zzaqt;
                zzdq zzb = zzdyVar.zzb(this.zzaqk, this.zzaql, this.zzaqm);
                map2 = this.zzaqv.zzaqs;
                map2.put(this.zzaqk, zzb);
            }
            z = true;
        } catch (Exception e) {
            context = this.zzaqv.zzrm;
            zzea.zza("Fail to load container: ", e, context);
            z = false;
        }
        try {
            zzeo zzeoVar = this.zzaqu;
            if (zzeoVar != null) {
                zzeoVar.zza(z, this.zzaqk);
            }
        } catch (RemoteException e2) {
            context2 = this.zzaqv.zzrm;
            zzea.zza("Error relaying callback: ", e2, context2);
        }
    }
}
