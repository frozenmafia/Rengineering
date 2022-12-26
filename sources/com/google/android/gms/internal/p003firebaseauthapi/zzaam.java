package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaam  reason: invalid package */
/* loaded from: classes7.dex */
final class zzaam extends zzaan {
    private zzaam() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaam(zzaak zzaakVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaan
    public final <L> List<L> zza(Object obj, long j) {
        zzaab zzaabVar = (zzaab) zzacj.zzf(obj, j);
        if (zzaabVar.zzc()) {
            return zzaabVar;
        }
        int size = zzaabVar.size();
        zzaab zzd = zzaabVar.zzd(size == 0 ? 10 : size + size);
        zzacj.zzs(obj, j, zzd);
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaan
    public final void zzb(Object obj, long j) {
        ((zzaab) zzacj.zzf(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.firebase-auth-api.zzaab] */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaan
    public final <E> void zzc(Object obj, Object obj2, long j) {
        zzaab<E> zzaabVar = (zzaab) zzacj.zzf(obj, j);
        zzaab<E> zzaabVar2 = (zzaab) zzacj.zzf(obj2, j);
        int size = zzaabVar.size();
        int size2 = zzaabVar2.size();
        zzaab<E> zzaabVar3 = zzaabVar;
        zzaabVar3 = zzaabVar;
        if (size > 0 && size2 > 0) {
            boolean zzc = zzaabVar.zzc();
            zzaab<E> zzaabVar4 = zzaabVar;
            if (!zzc) {
                zzaabVar4 = zzaabVar.zzd(size2 + size);
            }
            zzaabVar4.addAll(zzaabVar2);
            zzaabVar3 = zzaabVar4;
        }
        if (size > 0) {
            zzaabVar2 = zzaabVar3;
        }
        zzacj.zzs(obj, j, zzaabVar2);
    }
}
