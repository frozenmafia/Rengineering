package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzei  reason: invalid package */
/* loaded from: classes7.dex */
final class zzei implements zzbb {
    private final zzbf<zzbb> zza;
    private final byte[] zzb = {0};

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzei(zzbf zzbfVar, zzeh zzehVar) {
        this.zza = zzbfVar;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzbb
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (zzbd<zzbb> zzbdVar : this.zza.zzd(copyOf)) {
            try {
                if (zzbdVar.zzb().equals(zzjk.LEGACY)) {
                    zzbdVar.zzc().zza(copyOfRange, zzkd.zzc(bArr2, this.zzb));
                    return;
                } else {
                    zzbdVar.zzc().zza(copyOfRange, bArr2);
                    return;
                }
            } catch (GeneralSecurityException e) {
                logger = zzej.zza;
                Level level = Level.INFO;
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                sb.append("tag prefix matches a key, but cannot verify: ");
                sb.append(valueOf);
                logger.logp(level, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", sb.toString());
            }
        }
        for (zzbd<zzbb> zzbdVar2 : this.zza.zzd(zzaj.zza)) {
            try {
                zzbdVar2.zzc().zza(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
