package com.google.android.gms.internal.p003firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvd  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzvd {
    public static zzxy zza(PhoneAuthCredential phoneAuthCredential) {
        if (!TextUtils.isEmpty(phoneAuthCredential.HaptikSDK$a())) {
            return zzxy.zzc(phoneAuthCredential.HaptikSDK$c(), phoneAuthCredential.HaptikSDK$a(), phoneAuthCredential.HaptikSDK$b());
        }
        return zzxy.zzb(phoneAuthCredential.invoke(), phoneAuthCredential.values(), phoneAuthCredential.HaptikSDK$b());
    }
}
