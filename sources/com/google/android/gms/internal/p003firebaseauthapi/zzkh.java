package com.google.android.gms.internal.p003firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkh  reason: invalid package */
/* loaded from: classes7.dex */
abstract class zzkh implements zzag {
    private final zzkf zza;
    private final zzkf zzb;

    public zzkh(byte[] bArr) throws GeneralSecurityException {
        this.zza = zzc(bArr, 1);
        this.zzb = zzc(bArr, 0);
    }

    private final byte[] zzd(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() < this.zza.zzb() + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr2 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr2);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] bArr3 = new byte[this.zza.zzb()];
        byteBuffer.get(bArr3);
        try {
            byte[] bArr4 = new byte[32];
            this.zzb.zzd(bArr3, 0).get(bArr4);
            int length = bArr.length;
            int i = length & 15;
            int i2 = i == 0 ? length : (length + 16) - i;
            int remaining = byteBuffer.remaining();
            int i3 = remaining % 16;
            int i4 = (i3 == 0 ? remaining : (remaining + 16) - i3) + i2;
            ByteBuffer order = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr);
            order.position(i2);
            order.put(byteBuffer);
            order.position(i4);
            order.putLong(length);
            order.putLong(remaining);
            if (zzkd.zzb(zzla.zza(bArr4, order.array()), bArr2)) {
                byteBuffer.position(position);
                return this.zza.zzh(byteBuffer);
            }
            throw new GeneralSecurityException("invalid MAC");
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzag
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzd(ByteBuffer.wrap(bArr), bArr2);
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzag
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }

    abstract zzkf zzc(byte[] bArr, int i) throws InvalidKeyException;
}
