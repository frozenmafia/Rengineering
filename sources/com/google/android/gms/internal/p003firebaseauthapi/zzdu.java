package com.google.android.gms.internal.p003firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdu  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzdu {
    public static final /* synthetic */ int zza = 0;
    private static final String zzb = "zzdu";
    private final zzay zzc;
    private final zzag zzd;
    private final zzax zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdu(zzdt zzdtVar, zzds zzdsVar) throws GeneralSecurityException, IOException {
        this.zzc = zzdt.zzc(zzdtVar);
        this.zzd = zzdt.zza(zzdtVar);
        this.zze = zzdt.zzb(zzdtVar);
    }

    public final zzaw zza() throws GeneralSecurityException {
        zzaw zzb2;
        synchronized (this) {
            zzb2 = this.zze.zzb();
        }
        return zzb2;
    }
}
