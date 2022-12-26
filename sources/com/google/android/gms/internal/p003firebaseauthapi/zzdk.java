package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdk  reason: invalid package */
/* loaded from: classes7.dex */
final class zzdk implements zzal {
    private final zzbf<zzal> zza;

    public zzdk(zzbf<zzal> zzbfVar) {
        this.zza = zzbfVar;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzal
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (zzbd<zzal> zzbdVar : this.zza.zzd(copyOfRange)) {
                try {
                    return zzbdVar.zzc().zza(copyOfRange2, null);
                } catch (GeneralSecurityException e) {
                    logger = zzdl.zza;
                    Level level = Level.INFO;
                    String valueOf = String.valueOf(e.toString());
                    logger.logp(level, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", valueOf.length() != 0 ? "ciphertext prefix matches a key, but cannot decrypt: ".concat(valueOf) : new String("ciphertext prefix matches a key, but cannot decrypt: "));
                }
            }
        }
        for (zzbd<zzal> zzbdVar2 : this.zza.zzd(zzaj.zza)) {
            try {
                return zzbdVar2.zzc().zza(bArr, null);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
