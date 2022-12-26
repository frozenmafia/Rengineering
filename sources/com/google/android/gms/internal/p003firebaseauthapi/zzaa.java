package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaa  reason: invalid package */
/* loaded from: classes7.dex */
final class zzaa extends zzac {
    final /* synthetic */ zzr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzab zzabVar, zzae zzaeVar, CharSequence charSequence, zzr zzrVar) {
        super(zzaeVar, charSequence);
        this.zza = zzrVar;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzac
    public final int zzc(int i) {
        return ((zzt) this.zza).zza.end();
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzac
    public final int zzd(int i) {
        if (((zzt) this.zza).zza.find(i)) {
            return ((zzt) this.zza).zza.start();
        }
        return -1;
    }
}
