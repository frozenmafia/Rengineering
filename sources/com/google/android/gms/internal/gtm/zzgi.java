package com.google.android.gms.internal.gtm;
/* loaded from: classes7.dex */
final class zzgi implements Runnable {
    private final /* synthetic */ zzgh zzaqo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgi(zzgh zzghVar) {
        this.zzaqo = zzghVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgt zzgtVar;
        zzev.zzab("App's UI deactivated. Dispatching hits.");
        zzgtVar = this.zzaqo.zzaqb.zzaps;
        zzgtVar.dispatch();
    }
}
