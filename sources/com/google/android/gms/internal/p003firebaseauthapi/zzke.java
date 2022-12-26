package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.InvalidKeyException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzke  reason: invalid package */
/* loaded from: classes7.dex */
final class zzke extends zzkf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzke(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzkf
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzkf
    final int[] zzc(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            zzkf.zzf(iArr2, this.zza);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
