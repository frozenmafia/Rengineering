package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzur  reason: invalid package */
/* loaded from: classes5.dex */
final class zzur implements zzuv {
    final /* synthetic */ String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzur(zzuu zzuuVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzuv
    public final void zza(PhoneAuthProvider.toString tostring, Object... objArr) {
        tostring.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
