package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzup  reason: invalid package */
/* loaded from: classes5.dex */
final class zzup implements zzuv {
    final /* synthetic */ String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzup(zzuu zzuuVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuv
    public final void zza(PhoneAuthProvider.toString tostring, Object... objArr) {
        tostring.onCodeSent(this.zza, PhoneAuthProvider.ForceResendingToken.valueOf());
    }
}
