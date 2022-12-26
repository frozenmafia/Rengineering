package com.google.android.gms.internal.p003firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkc  reason: invalid package */
/* loaded from: classes7.dex */
final class zzkc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zza(byte[] bArr) {
        int length = bArr.length;
        if (length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 16);
        copyOf[length] = Byte.MIN_VALUE;
        return copyOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] zzb(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b2 = bArr[i];
            byte b3 = (byte) ((b2 + b2) & 254);
            bArr2[i] = b3;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i + 1] >> 7) & 1) | b3);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
