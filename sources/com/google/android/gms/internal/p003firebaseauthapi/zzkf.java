package com.google.android.gms.internal.p003firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkf  reason: invalid package */
/* loaded from: classes7.dex */
abstract class zzkf implements zzkz {
    private static final int[] zzb = zzi(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    int[] zza;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkf(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzi(bArr);
        this.zzc = i;
    }

    static void zze(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 << 16) | (i6 >>> (-16));
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 << 12) | (i9 >>> (-12));
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 << 8) | (i12 >>> (-8));
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 << 7) | (i15 >>> (-7));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzf(int[] iArr, int[] iArr2) {
        int[] iArr3 = zzb;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzg(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            zze(iArr, 0, 4, 8, 12);
            zze(iArr, 1, 5, 9, 13);
            zze(iArr, 2, 6, 10, 14);
            zze(iArr, 3, 7, 11, 15);
            zze(iArr, 0, 5, 10, 15);
            zze(iArr, 1, 6, 11, 12);
            zze(iArr, 2, 7, 8, 13);
            zze(iArr, 3, 4, 9, 14);
        }
    }

    static int[] zzi(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzkz
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        return zzh(ByteBuffer.wrap(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb();

    abstract int[] zzc(int[] iArr, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer zzd(byte[] bArr, int i) {
        int[] zzc = zzc(zzi(bArr), i);
        int[] iArr = (int[]) zzc.clone();
        zzg(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            zzc[i2] = zzc[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzc, 0, 16);
        return order;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] zzh(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= zzb()) {
            byte[] bArr = new byte[zzb()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            int remaining = byteBuffer.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer zzd = zzd(bArr, this.zzc + i2);
                if (i2 == i - 1) {
                    zzkd.zza(allocate, byteBuffer, zzd, remaining % 64);
                } else {
                    zzkd.zza(allocate, byteBuffer, zzd, 64);
                }
            }
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
