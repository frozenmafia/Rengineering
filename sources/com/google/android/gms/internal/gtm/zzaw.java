package com.google.android.gms.internal.gtm;
/* loaded from: classes7.dex */
final class zzaw implements Runnable {
    private final /* synthetic */ zzce zzxh;
    private final /* synthetic */ zzav zzxi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaw(zzav zzavVar, zzce zzceVar) {
        this.zzxi = zzavVar;
        this.zzxh = zzceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzxi.zzxe.isConnected()) {
            return;
        }
        this.zzxi.zzxe.zzr("Connected to service after a timeout");
        this.zzxi.zzxe.zza(this.zzxh);
    }
}
