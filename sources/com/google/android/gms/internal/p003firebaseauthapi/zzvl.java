package com.google.android.gms.internal.p003firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvl  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzvl extends BroadcastReceiver {
    final /* synthetic */ zzvn zza;
    private final String zzb;

    public zzvl(zzvn zzvnVar, String str) {
        this.zza = zzvnVar;
        this.zzb = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        HashMap hashMap;
        Logger logger;
        Logger logger2;
        if (SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).getStatusCode() == 0) {
                String str = (String) extras.get(SmsRetriever.EXTRA_SMS_MESSAGE);
                hashMap = this.zza.zzd;
                zzvm zzvmVar = (zzvm) hashMap.get(this.zzb);
                if (zzvmVar == null) {
                    logger2 = zzvn.zza;
                    logger2.e("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    zzvmVar.zze = zzvn.zzb(str);
                    if (zzvmVar.zze == null) {
                        logger = zzvn.zza;
                        logger.e("Unable to extract verification code.", new Object[0]);
                    } else if (!zzaf.zzd(zzvmVar.zzd)) {
                        zzvn.zze(this.zza, this.zzb);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
