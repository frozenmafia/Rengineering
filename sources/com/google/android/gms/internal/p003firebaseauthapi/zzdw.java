package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Build;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdw  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzdw {
    KeyStore zza;

    public zzdw() {
        this.zza = null;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.zza = keyStore;
                keyStore.load(null);
                return;
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        throw new IllegalStateException("need Android Keystore on Android M or newer");
    }
}
