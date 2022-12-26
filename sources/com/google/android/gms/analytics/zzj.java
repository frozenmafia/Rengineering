package com.google.android.gms.analytics;

import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes7.dex */
public class zzj<T extends zzj> {
    private final zzk zzsn;
    protected final zzg zzso;
    private final List<zzh> zzsp;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzj(zzk zzkVar, Clock clock) {
        Preconditions.checkNotNull(zzkVar);
        this.zzsn = zzkVar;
        this.zzsp = new ArrayList();
        zzg zzgVar = new zzg(this, clock);
        zzgVar.zzar();
        this.zzso = zzgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zza(zzg zzgVar) {
    }

    public zzg zzac() {
        zzg zzai = this.zzso.zzai();
        zzd(zzai);
        return zzai;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzd(zzg zzgVar) {
        for (zzh zzhVar : this.zzsp) {
            zzhVar.zza(this, zzgVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzk zzas() {
        return this.zzsn;
    }
}
