package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthProvider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzus  reason: invalid package */
/* loaded from: classes5.dex */
final class zzus implements zzuv {
    final /* synthetic */ Status zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzus(zzuu zzuuVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuv
    public final void zza(PhoneAuthProvider.toString tostring, Object... objArr) {
        tostring.onVerificationFailed(zzto.zza(this.zza));
    }
}
