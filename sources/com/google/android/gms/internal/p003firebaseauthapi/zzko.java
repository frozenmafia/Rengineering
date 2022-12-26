package com.google.android.gms.internal.p003firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzko  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzko implements zzag {
    private final zzkz zza;
    private final zzbb zzb;
    private final int zzc;

    public zzko(zzkz zzkzVar, zzbb zzbbVar, int i) {
        this.zza = zzkzVar;
        this.zzb = zzbbVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzag
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzc;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
        this.zzb.zza(Arrays.copyOfRange(bArr, length - this.zzc, length), zzkd.zzc(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.zza.zza(copyOfRange);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzag
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
