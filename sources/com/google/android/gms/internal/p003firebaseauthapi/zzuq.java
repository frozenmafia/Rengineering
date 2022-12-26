package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuq  reason: invalid package */
/* loaded from: classes5.dex */
final class zzuq implements zzuv {
    final /* synthetic */ PhoneAuthCredential zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzuq(zzuu zzuuVar, PhoneAuthCredential phoneAuthCredential) {
        this.zza = phoneAuthCredential;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuv
    public final void zza(PhoneAuthProvider.toString tostring, Object... objArr) {
        tostring.onVerificationCompleted(this.zza);
    }
}
