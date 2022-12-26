package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Comparator;
/* loaded from: classes7.dex */
final class zzhu implements Comparator<zzoa<?>> {
    private final /* synthetic */ zzof zzari;
    private final /* synthetic */ zzfl zzarj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhu(zzhs zzhsVar, zzof zzofVar, zzfl zzflVar) {
        this.zzari = zzofVar;
        this.zzarj = zzflVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzoa<?> zzoaVar, zzoa<?> zzoaVar2) {
        zzoa<?> zzoaVar3 = zzoaVar;
        zzoa<?> zzoaVar4 = zzoaVar2;
        if (zzoaVar3 == null) {
            return zzoaVar4 != null ? 1 : 0;
        } else if (zzoaVar4 == null) {
            return zzoaVar3 != null ? -1 : 0;
        } else {
            zzoa<?> zzb = this.zzari.value().zzb(this.zzarj, zzoaVar3, zzoaVar4);
            Preconditions.checkState(zzb instanceof zzoe);
            return (int) ((zzoe) zzb).value().doubleValue();
        }
    }
}
