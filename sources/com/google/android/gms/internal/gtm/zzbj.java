package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzbj implements Callable<String> {
    private final /* synthetic */ zzbh zzyi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(zzbh zzbhVar) {
        this.zzyi = zzbhVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        String zzek;
        zzek = this.zzyi.zzek();
        return zzek;
    }
}
