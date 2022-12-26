package com.google.android.gms.internal.p003firebaseauthapi;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvf  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzvf extends PhoneAuthProvider.toString {
    final /* synthetic */ PhoneAuthProvider.toString zza;
    final /* synthetic */ String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvf(PhoneAuthProvider.toString tostring, String str) {
        this.zza = tostring;
        this.zzb = str;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.toString
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzvh.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.toString
    public final void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        this.zza.onCodeSent(str, forceResendingToken);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.toString
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        zzvh.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.toString
    public final void onVerificationFailed(FirebaseException firebaseException) {
        zzvh.zza.remove(this.zzb);
        this.zza.onVerificationFailed(firebaseException);
    }
}
