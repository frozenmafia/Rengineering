package com.google.android.gms.internal.p003firebaseauthapi;

import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdx  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzdx implements zzaz {
    private static final String zza = "zzdx";
    private KeyStore zzb = new zzdw().zza;

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaz
    public final zzag zza(String str) throws GeneralSecurityException {
        zzdv zzdvVar;
        synchronized (this) {
            zzdvVar = new zzdv(zzli.zza("android-keystore://", str), this.zzb);
            byte[] zza2 = zzlg.zza(10);
            byte[] bArr = new byte[0];
            if (!Arrays.equals(zza2, zzdvVar.zza(zzdvVar.zzb(zza2, bArr), bArr))) {
                throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
            }
        }
        return zzdvVar;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzaz
    public final boolean zzb(String str) {
        boolean startsWith;
        synchronized (this) {
            startsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
        }
        return startsWith;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzc(String str) throws GeneralSecurityException {
        String str2;
        boolean containsAlias;
        synchronized (this) {
            try {
                containsAlias = this.zzb.containsAlias(zzli.zza("android-keystore://", str));
            } catch (NullPointerException unused) {
                Log.w(zza, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
                try {
                    Thread.sleep(20L);
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    this.zzb = keyStore;
                    keyStore.load(null);
                } catch (IOException e) {
                    throw new GeneralSecurityException(e);
                } catch (InterruptedException unused2) {
                }
                return this.zzb.containsAlias(str2);
            }
        }
        return containsAlias;
    }
}
