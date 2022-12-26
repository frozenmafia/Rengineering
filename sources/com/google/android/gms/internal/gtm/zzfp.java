package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzfp implements zzen {
    private final /* synthetic */ zzfo zzapm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfp(zzfo zzfoVar) {
        this.zzapm = zzfoVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzen
    public final void zze(boolean z) {
        boolean z2;
        zzfo zzfoVar = this.zzapm;
        z2 = zzfoVar.connected;
        zzfoVar.zza(z, z2);
    }
}
