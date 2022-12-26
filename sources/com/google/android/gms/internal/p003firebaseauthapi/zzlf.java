package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.SecureRandom;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlf  reason: invalid package */
/* loaded from: classes7.dex */
final class zzlf extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SecureRandom initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
