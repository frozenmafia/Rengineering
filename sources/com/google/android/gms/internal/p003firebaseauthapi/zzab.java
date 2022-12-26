package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzab  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzab implements zzad {
    final /* synthetic */ zzs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzad
    public final /* synthetic */ Iterator zza(zzae zzaeVar, CharSequence charSequence) {
        return new zzaa(this, zzaeVar, charSequence, this.zza.zza(charSequence));
    }
}
