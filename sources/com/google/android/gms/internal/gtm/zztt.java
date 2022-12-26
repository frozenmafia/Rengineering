package com.google.android.gms.internal.gtm;

import java.io.IOException;
/* loaded from: classes7.dex */
final class zztt extends zztr<zzts, zzts> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final boolean zza(zzsy zzsyVar) {
        return false;
    }

    private static void zza(Object obj, zzts zztsVar) {
        ((zzrc) obj).zzbak = zztsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final void zzt(Object obj) {
        ((zzrc) obj).zzbak.zzmi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final /* synthetic */ int zzad(zzts zztsVar) {
        return zztsVar.zzpe();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final /* synthetic */ int zzai(zzts zztsVar) {
        return zztsVar.zzrl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final /* synthetic */ zzts zzh(zzts zztsVar, zzts zztsVar2) {
        zzts zztsVar3 = zztsVar;
        zzts zztsVar4 = zztsVar2;
        return zztsVar4.equals(zzts.zzrj()) ? zztsVar3 : zzts.zza(zztsVar3, zztsVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final /* synthetic */ void zzc(zzts zztsVar, zzum zzumVar) throws IOException {
        zztsVar.zza(zzumVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final /* synthetic */ void zza(zzts zztsVar, zzum zzumVar) throws IOException {
        zztsVar.zzb(zzumVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final /* synthetic */ void zzg(Object obj, zzts zztsVar) {
        zza(obj, zztsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final /* synthetic */ zzts zzah(Object obj) {
        zzts zztsVar = ((zzrc) obj).zzbak;
        if (zztsVar == zzts.zzrj()) {
            zzts zzrk = zzts.zzrk();
            zza(obj, zzrk);
            return zzrk;
        }
        return zztsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final /* synthetic */ zzts zzag(Object obj) {
        return ((zzrc) obj).zzbak;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final /* synthetic */ void zzf(Object obj, zzts zztsVar) {
        zza(obj, zztsVar);
    }

    @Override // com.google.android.gms.internal.gtm.zztr
    final /* synthetic */ zzts zzaa(zzts zztsVar) {
        zzts zztsVar2 = zztsVar;
        zztsVar2.zzmi();
        return zztsVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final /* synthetic */ zzts zzri() {
        return zzts.zzrk();
    }

    @Override // com.google.android.gms.internal.gtm.zztr
    final /* synthetic */ void zza(zzts zztsVar, int i, zzts zztsVar2) {
        zztsVar.zzb((i << 3) | 3, zztsVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final /* synthetic */ void zza(zzts zztsVar, int i, zzps zzpsVar) {
        zztsVar.zzb((i << 3) | 2, zzpsVar);
    }

    @Override // com.google.android.gms.internal.gtm.zztr
    final /* synthetic */ void zzb(zzts zztsVar, int i, long j) {
        zztsVar.zzb((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.gtm.zztr
    final /* synthetic */ void zzc(zzts zztsVar, int i, int i2) {
        zztsVar.zzb((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zztr
    public final /* synthetic */ void zza(zzts zztsVar, int i, long j) {
        zztsVar.zzb(i << 3, Long.valueOf(j));
    }
}
