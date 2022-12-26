package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.LinearLayoutManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqj  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzqj extends zzux<Void, LinearLayoutManager.AnchorInfo> {
    public zzqj() {
        super(5);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzpx
    public final TaskApiCall<zztm, Void> zza() {
        return TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqi
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzqj zzqjVar = zzqj.this;
                zzqjVar.zzv = new zzuw(zzqjVar, (TaskCompletionSource) obj2);
                ((zztm) obj).zzq().zzh(new zzly(zzqjVar.zze.invoke()), zzqjVar.zzc);
            }
        }).build();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzpx
    public final String zzb() {
        return "delete";
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzux
    public final void zzc() {
        ((LinearLayoutManager.AnchorInfo) this.zzf).valueOf();
        zzm(null);
    }
}
