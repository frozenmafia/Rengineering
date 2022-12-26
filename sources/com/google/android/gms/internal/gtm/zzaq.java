package com.google.android.gms.internal.gtm;

import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzaq implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ zzap zzwt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(zzap zzapVar) {
        this.zzwt = zzapVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        zzci zzdd = this.zzwt.zzdd();
        if (zzdd != null) {
            zzdd.zze("Job execution failed", th);
        }
    }
}
