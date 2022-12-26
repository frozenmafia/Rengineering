package com.google.android.gms.internal.gtm;
/* loaded from: classes7.dex */
public final class zzba extends zzan {
    private final zzq zzsu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzba(zzap zzapVar) {
        super(zzapVar);
        this.zzsu = new zzq();
    }

    @Override // com.google.android.gms.internal.gtm.zzan
    protected final void zzaw() {
        zzcq().zzat().zzb(this.zzsu);
        zzda zzcu = zzcu();
        String zzaz = zzcu.zzaz();
        if (zzaz != null) {
            this.zzsu.setAppName(zzaz);
        }
        String zzba = zzcu.zzba();
        if (zzba != null) {
            this.zzsu.setAppVersion(zzba);
        }
    }

    public final zzq zzdv() {
        zzdb();
        return this.zzsu;
    }
}
