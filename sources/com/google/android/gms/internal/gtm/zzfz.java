package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzfy;
import com.google.android.gms.internal.gtm.zzgp;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes7.dex */
final class zzfz implements zzfy.zzc {
    @Override // com.google.android.gms.internal.gtm.zzfy.zzc
    public final zzfy zzb(Context context, com.google.android.gms.tagmanager.zzcm zzcmVar, com.google.android.gms.tagmanager.zzcd zzcdVar) {
        ScheduledExecutorService scheduledExecutorService;
        zzgt zzgtVar = new zzgt(context);
        ExecutorService zzr = zzgp.zza.zzr(context);
        scheduledExecutorService = zzgr.zzaqy;
        return new zzfy(context, zzcmVar, zzcdVar, zzgtVar, zzr, scheduledExecutorService, zzfd.zzkr(), new zzfy.zza(context));
    }
}
