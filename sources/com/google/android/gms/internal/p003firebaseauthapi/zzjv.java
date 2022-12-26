package com.google.android.gms.internal.p003firebaseauthapi;

import android.text.TextUtils;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import o.getDouble;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjv  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzjv implements zzkz {
    private static int ag$a = 0;
    private static int toString = 1;
    private static int[] values;
    private static final ThreadLocal<Cipher> zza;
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    static {
        try {
            valueOf();
            zza = new zzju();
            int i = toString + 63;
            ag$a = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    static void valueOf() {
        values = new int[]{41940429, -984625339, -4674482, -711503197, 251226895, 252524784, 285868657, -1893557641, -839577378, 376397295, 429767311, -23204500, -2003724077, -1318319666, -1401366548, -13793345, -692055781, -458994541};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r0 >= r5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
        if (r0 >= r5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
        r6 = new byte[r5];
        java.lang.System.arraycopy(r14, 0, r6, 0, r5);
        r9 = r13.zzc;
        r0 = r0 - r9;
        r5 = new byte[r0];
        r7 = com.google.android.gms.internal.p003firebaseauthapi.zzjv.zza.get();
        r8 = new byte[r13.zzd];
        java.lang.System.arraycopy(r6, 0, r8, 0, r13.zzc);
        r7.init(2, r13.zzb, new javax.crypto.spec.IvParameterSpec(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r7.doFinal(r14, r9, r0, r5, 0) != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r3 == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        r14 = com.google.android.gms.internal.p003firebaseauthapi.zzjv.toString + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
        com.google.android.gms.internal.p003firebaseauthapi.zzjv.ag$a = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if ((r14 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        r14 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
        throw new java.security.GeneralSecurityException("stored output's length does not match input's length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
        throw new java.security.GeneralSecurityException("ciphertext too short");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
        throw r14;
     */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzkz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] zza(byte[] r14) throws java.security.GeneralSecurityException {
        /*
            r13 = this;
            int r0 = com.google.android.gms.internal.p003firebaseauthapi.zzjv.ag$a
            int r0 = r0 + 21
            int r1 = r0 % 128
            com.google.android.gms.internal.p003firebaseauthapi.zzjv.toString = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            r4 = 0
            if (r0 == 0) goto L1f
            int r0 = r14.length
            int r5 = r13.zzc
            super.hashCode()     // Catch: java.lang.Throwable -> L1d
            if (r0 < r5) goto L6f
            goto L24
        L1d:
            r14 = move-exception
            throw r14
        L1f:
            int r0 = r14.length
            int r5 = r13.zzc
            if (r0 < r5) goto L6f
        L24:
            byte[] r6 = new byte[r5]
            java.lang.System.arraycopy(r14, r3, r6, r3, r5)
            int r9 = r13.zzc
            int r0 = r0 - r9
            byte[] r5 = new byte[r0]
            java.lang.ThreadLocal<javax.crypto.Cipher> r7 = com.google.android.gms.internal.p003firebaseauthapi.zzjv.zza
            java.lang.Object r7 = r7.get()
            javax.crypto.Cipher r7 = (javax.crypto.Cipher) r7
            int r8 = r13.zzd
            byte[] r8 = new byte[r8]
            int r10 = r13.zzc
            java.lang.System.arraycopy(r6, r3, r8, r3, r10)
            javax.crypto.spec.IvParameterSpec r6 = new javax.crypto.spec.IvParameterSpec
            r6.<init>(r8)
            javax.crypto.spec.SecretKeySpec r8 = r13.zzb
            r7.init(r1, r8, r6)
            r12 = 0
            r8 = r14
            r10 = r0
            r11 = r5
            int r14 = r7.doFinal(r8, r9, r10, r11, r12)
            if (r14 != r0) goto L54
            goto L55
        L54:
            r3 = 1
        L55:
            if (r3 == r2) goto L67
            int r14 = com.google.android.gms.internal.p003firebaseauthapi.zzjv.toString     // Catch: java.lang.Exception -> L77
            int r14 = r14 + 65
            int r0 = r14 % 128
            com.google.android.gms.internal.p003firebaseauthapi.zzjv.ag$a = r0     // Catch: java.lang.Exception -> L77
            int r14 = r14 % r1
            if (r14 == 0) goto L66
            int r14 = r4.length     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r14 = move-exception
            throw r14
        L66:
            return r5
        L67:
            java.security.GeneralSecurityException r14 = new java.security.GeneralSecurityException
            java.lang.String r0 = "stored output's length does not match input's length"
            r14.<init>(r0)
            throw r14
        L6f:
            java.security.GeneralSecurityException r14 = new java.security.GeneralSecurityException
            java.lang.String r0 = "ciphertext too short"
            r14.<init>(r0)
            throw r14
        L77:
            r14 = move-exception
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p003firebaseauthapi.zzjv.zza(byte[]):byte[]");
    }

    public zzjv(byte[] bArr, int i) throws GeneralSecurityException {
        zzli.zzb(bArr.length);
        this.zzb = new SecretKeySpec(bArr, values(new int[]{823817052, 651574735}, 2 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
        int blockSize = zza.get().getBlockSize();
        this.zzd = blockSize;
        if (i >= 12) {
            if ((i <= blockSize ? '3' : 'I') != 'I') {
                int i2 = toString + 87;
                ag$a = i2 % 128;
                if ((i2 % 2 != 0 ? 'R' : '\'') != 'R') {
                    this.zzc = i;
                    return;
                }
                this.zzc = i;
                int i3 = 78 / 0;
                return;
            }
        }
        throw new GeneralSecurityException("invalid IV size");
    }

    private static String values(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) values.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
