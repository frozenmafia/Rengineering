package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzg  reason: invalid package */
/* loaded from: classes5.dex */
final class zzg implements zze {
    private zzg() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzg(zzf zzfVar) {
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zze
    public final ExecutorService zza(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
