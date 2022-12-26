package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzez implements zzfw {
    private final /* synthetic */ zzey zzaom;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzez(zzey zzeyVar) {
        this.zzaom = zzeyVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzfw
    public final void zza(zzeh zzehVar) {
        this.zzaom.zze(zzehVar.zzih());
    }

    @Override // com.google.android.gms.internal.gtm.zzfw
    public final void zzb(zzeh zzehVar) {
        this.zzaom.zze(zzehVar.zzih());
        long zzih = zzehVar.zzih();
        StringBuilder sb = new StringBuilder(57);
        sb.append("Permanent failure dispatching hitId: ");
        sb.append(zzih);
        zzev.zzab(sb.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzfw
    public final void zzc(zzeh zzehVar) {
        Clock clock;
        Clock clock2;
        long zzii = zzehVar.zzii();
        if (zzii == 0) {
            zzey zzeyVar = this.zzaom;
            long zzih = zzehVar.zzih();
            clock2 = this.zzaom.zzsd;
            zzeyVar.zzb(zzih, clock2.currentTimeMillis());
            return;
        }
        clock = this.zzaom.zzsd;
        if (zzii + 14400000 < clock.currentTimeMillis()) {
            this.zzaom.zze(zzehVar.zzih());
            long zzih2 = zzehVar.zzih();
            StringBuilder sb = new StringBuilder(47);
            sb.append("Giving up on failed hitId: ");
            sb.append(zzih2);
            zzev.zzab(sb.toString());
        }
    }
}
