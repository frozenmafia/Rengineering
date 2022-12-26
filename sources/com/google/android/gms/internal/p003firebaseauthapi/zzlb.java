package com.google.android.gms.internal.p003firebaseauthapi;

import android.telephony.cdma.CdmaCellLocation;
import android.view.View;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import o.isFirst;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlb  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzlb implements zzek {
    private static int ag$a = 0;
    private static char ah$a = 2;
    private static int toString = 1;
    private static char[] values = {1, 13787, 13769, 13791};
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzlb(byte[] bArr) throws GeneralSecurityException {
        zzli.zzb(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, toString((byte) (View.MeasureSpec.getSize(0) + 11), new char[]{3, 1, 13780}, 3 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))).intern());
        this.zza = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zzb2 = zzkc.zzb(zzb.doFinal(new byte[16]));
        this.zzb = zzb2;
        this.zzc = zzkc.zzb(zzb2);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        int i = ag$a + 111;
        toString = i % 128;
        int i2 = i % 2;
        try {
            Cipher zza = zzkp.zza.zza("AES/ECB/NoPadding");
            int i3 = toString + 27;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return zza;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
        if ((r12 > 127) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
        r0 = zzb();
        r0.init(1, r10.zza);
        r4 = r11.length;
        r5 = java.lang.Math.max(1, (int) java.lang.Math.ceil(r4 / 16.0d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        if ((r5 * 16) != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        r4 = com.google.android.gms.internal.p003firebaseauthapi.zzkd.zze(r11, (r5 - 1) * 16, r10.zzb, 0, 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        r4 = com.google.android.gms.internal.p003firebaseauthapi.zzkd.zzd(com.google.android.gms.internal.p003firebaseauthapi.zzkc.zza(java.util.Arrays.copyOfRange(r11, (r5 - 1) * 16, r4)), r10.zzc);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        r6 = new byte[16];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r7 >= (r5 - 1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        r8 = com.google.android.gms.internal.p003firebaseauthapi.zzlb.toString + 33;
        com.google.android.gms.internal.p003firebaseauthapi.zzlb.ag$a = r8 % 128;
        r8 = r8 % 2;
        r6 = r0.doFinal(com.google.android.gms.internal.p003firebaseauthapi.zzkd.zze(r6, 0, r11, r7 * 16, 16));
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
        return java.util.Arrays.copyOf(r0.doFinal(com.google.android.gms.internal.p003firebaseauthapi.zzkd.zzd(r4, r6)), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        throw new java.security.InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r12 <= 16) goto L10;
     */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzek
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] zza(byte[] r11, int r12) throws java.security.GeneralSecurityException {
        /*
            r10 = this;
            int r0 = com.google.android.gms.internal.p003firebaseauthapi.zzlb.ag$a
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.google.android.gms.internal.p003firebaseauthapi.zzlb.toString = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            r3 = 16
            if (r0 == r2) goto L18
            if (r12 > r3) goto L84
            goto L21
        L18:
            r0 = 127(0x7f, float:1.78E-43)
            if (r12 > r0) goto L1e
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            if (r0 != 0) goto L84
        L21:
            javax.crypto.Cipher r0 = zzb()
            javax.crypto.SecretKey r4 = r10.zza
            r0.init(r2, r4)
            int r4 = r11.length
            double r5 = (double) r4
            r7 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r5 = r5 / r7
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            int r5 = java.lang.Math.max(r2, r5)
            int r6 = r5 * 16
            if (r6 != r4) goto L47
            byte[] r4 = r10.zzb
            int r6 = r5 + (-1)
            int r6 = r6 * 16
            byte[] r4 = com.google.android.gms.internal.p003firebaseauthapi.zzkd.zze(r11, r6, r4, r1, r3)
            goto L59
        L47:
            int r6 = r5 + (-1)
            int r6 = r6 * 16
            byte[] r4 = java.util.Arrays.copyOfRange(r11, r6, r4)
            byte[] r4 = com.google.android.gms.internal.p003firebaseauthapi.zzkc.zza(r4)
            byte[] r6 = r10.zzc
            byte[] r4 = com.google.android.gms.internal.p003firebaseauthapi.zzkd.zzd(r4, r6)
        L59:
            byte[] r6 = new byte[r3]
            r7 = 0
        L5c:
            int r8 = r5 + (-1)
            if (r7 >= r8) goto L77
            int r8 = com.google.android.gms.internal.p003firebaseauthapi.zzlb.toString
            int r8 = r8 + 33
            int r9 = r8 % 128
            com.google.android.gms.internal.p003firebaseauthapi.zzlb.ag$a = r9
            int r8 = r8 % 2
            int r8 = r7 * 16
            byte[] r6 = com.google.android.gms.internal.p003firebaseauthapi.zzkd.zze(r6, r1, r11, r8, r3)
            byte[] r6 = r0.doFinal(r6)
            int r7 = r7 + 1
            goto L5c
        L77:
            byte[] r11 = com.google.android.gms.internal.p003firebaseauthapi.zzkd.zzd(r4, r6)
            byte[] r11 = r0.doFinal(r11)
            byte[] r11 = java.util.Arrays.copyOf(r11, r12)
            return r11
        L84:
            java.security.InvalidAlgorithmParameterException r11 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r12 = "outputLength too large, max is 16 bytes"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p003firebaseauthapi.zzlb.zza(byte[], int):byte[]");
    }

    private static String toString(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = values;
            char c = ah$a;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}
