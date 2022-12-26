package com.google.android.gms.internal.p003firebaseauthapi;

import com.dreampay.commons.constants.Constants;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvk  reason: invalid package */
/* loaded from: classes7.dex */
final class zzvk extends zztl {
    final /* synthetic */ zzvn zza;
    private final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzvk(zzvn zzvnVar, zztl zztlVar, String str) {
        super(zztlVar);
        this.zza = zzvnVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zztl
    public final void zzb(String str) {
        Logger logger;
        HashMap hashMap;
        logger = zzvn.zza;
        logger.d("onCodeSent", new Object[0]);
        hashMap = this.zza.zzd;
        zzvm zzvmVar = (zzvm) hashMap.get(this.zzb);
        if (zzvmVar == null) {
            return;
        }
        for (zztl zztlVar : zzvmVar.zzb) {
            zztlVar.zzb(str);
        }
        zzvmVar.zzg = true;
        zzvmVar.zzd = str;
        if (zzvmVar.zza <= 0) {
            this.zza.zzh(this.zzb);
        } else if (!zzvmVar.zzc) {
            this.zza.zzn(this.zzb);
        } else if (!zzaf.zzd(zzvmVar.zze)) {
            zzvn.zze(this.zza, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zztl
    public final void zzh(Status status) {
        Logger logger;
        HashMap hashMap;
        logger = zzvn.zza;
        String statusCodeString = CommonStatusCodes.getStatusCodeString(status.getStatusCode());
        String statusMessage = status.getStatusMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(statusCodeString).length() + 39 + String.valueOf(statusMessage).length());
        sb.append("SMS verification code request failed: ");
        sb.append(statusCodeString);
        sb.append(Constants.WHITE_SPACE);
        sb.append(statusMessage);
        logger.e(sb.toString(), new Object[0]);
        hashMap = this.zza.zzd;
        zzvm zzvmVar = (zzvm) hashMap.get(this.zzb);
        if (zzvmVar == null) {
            return;
        }
        for (zztl zztlVar : zzvmVar.zzb) {
            zztlVar.zzh(status);
        }
        this.zza.zzj(this.zzb);
    }
}
