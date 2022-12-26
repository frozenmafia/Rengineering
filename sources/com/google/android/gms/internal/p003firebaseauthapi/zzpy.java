package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.p003firebaseauthapi.zzpv;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Future;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpy  reason: invalid package */
/* loaded from: classes5.dex */
public abstract class zzpy<T extends zzpv> {
    private zzpu<T> zza;

    public final <ResultT, A extends Api.AnyClient> Task<ResultT> zza(zzpx<A, ResultT> zzpxVar) {
        return (Task<ResultT>) zzc().zza.doRead(zzpxVar.zza());
    }

    public final <ResultT, A extends Api.AnyClient> Task<ResultT> zzb(zzpx<A, ResultT> zzpxVar) {
        return (Task<ResultT>) zzc().zza.doWrite(zzpxVar.zza());
    }

    public final zzpu<T> zzc() {
        zzpu<T> zzpuVar;
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzd().get();
                } catch (Exception e) {
                    String valueOf = String.valueOf(e.getMessage());
                    throw new RuntimeException(valueOf.length() != 0 ? "There was an error while initializing the connection to the GoogleApi: ".concat(valueOf) : new String("There was an error while initializing the connection to the GoogleApi: "));
                }
            }
            zzpuVar = this.zza;
        }
        return zzpuVar;
    }

    abstract Future<zzpu<T>> zzd();
}
