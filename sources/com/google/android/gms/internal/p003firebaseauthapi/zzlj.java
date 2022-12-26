package com.google.android.gms.internal.p003firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlj  reason: invalid package */
/* loaded from: classes7.dex */
final class zzlj extends zzkf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlj(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzkf
    public final int zzb() {
        return 24;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzkf
    final int[] zzc(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        zzkf.zzf(r0, this.zza);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
        zzkf.zzg(iArr3);
        zzkf.zzf(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
