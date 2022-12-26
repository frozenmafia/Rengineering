package com.google.android.gms.internal.p003firebaseauthapi;

import android.widget.ExpandableListView;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import o.moveToFirst;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzka  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzka implements zzag {
    private static int HaptikSDK$a = 1;
    private static char ag$a;
    private static char ah$a;
    private static char toString;
    private static char valueOf;
    private static int values;
    private static final ThreadLocal<Cipher> zza;
    private final SecretKey zzb;

    static {
        try {
            valueOf();
            zza = new zzjz();
            int i = values + 19;
            HaptikSDK$a = i % 128;
            if (!(i % 2 != 0)) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public zzka(byte[] bArr) throws GeneralSecurityException {
        zzli.zzb(bArr.length);
        this.zzb = new SecretKeySpec(bArr, ag$a(new char[]{2774, 55254, 24188, 40874}, ExpandableListView.getPackedPositionGroup(0L) + 3).intern());
    }

    static void valueOf() {
        ag$a = (char) 62974;
        ah$a = (char) 31703;
        toString = (char) 15950;
        valueOf = (char) 30587;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        if ((r0 >= 28 ? '<' : '2') == '<') goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (com.google.android.gms.internal.p003firebaseauthapi.zzlh.zzb() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        r3 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        r3 = '3';
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r3 == '3') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        r3 = com.google.android.gms.internal.p003firebaseauthapi.zzka.HaptikSDK$a + 55;
        com.google.android.gms.internal.p003firebaseauthapi.zzka.values = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        if ((r3 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        if (com.google.android.gms.internal.p003firebaseauthapi.zzlh.zza() > 55) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
        if (com.google.android.gms.internal.p003firebaseauthapi.zzlh.zza() > 19) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        r3 = new javax.crypto.spec.IvParameterSpec(r8, 0, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        r3 = new javax.crypto.spec.GCMParameterSpec(128, r8, 0, 12);
        r2 = com.google.android.gms.internal.p003firebaseauthapi.zzka.values + 41;
        com.google.android.gms.internal.p003firebaseauthapi.zzka.HaptikSDK$a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        r2 = com.google.android.gms.internal.p003firebaseauthapi.zzka.zza;
        r2.get().init(2, r7.zzb, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r9.length == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        r1 = 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
        r1 = '+';
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
        if (r1 == 24) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
        r2.get().updateAAD(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
        return r2.get().doFinal(r8, 12, r0 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
        throw new java.security.GeneralSecurityException("ciphertext too short");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        if ((r0 >= 82) != false) goto L10;
     */
    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] zza(byte[] r8, byte[] r9) throws java.security.GeneralSecurityException {
        /*
            r7 = this;
            int r0 = com.google.android.gms.internal.p003firebaseauthapi.zzka.values
            int r0 = r0 + 71
            int r1 = r0 % 128
            com.google.android.gms.internal.p003firebaseauthapi.zzka.HaptikSDK$a = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            if (r0 != 0) goto L18
            int r0 = r8.length
            r3 = 82
            if (r0 < r3) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            if (r3 == 0) goto L97
            goto L26
        L18:
            int r0 = r8.length
            r3 = 28
            r4 = 60
            if (r0 < r3) goto L22
            r3 = 60
            goto L24
        L22:
            r3 = 50
        L24:
            if (r3 != r4) goto L97
        L26:
            boolean r3 = com.google.android.gms.internal.p003firebaseauthapi.zzlh.zzb()
            r4 = 51
            if (r3 == 0) goto L31
            r3 = 26
            goto L33
        L31:
            r3 = 51
        L33:
            r5 = 12
            if (r3 == r4) goto L58
            int r3 = com.google.android.gms.internal.p003firebaseauthapi.zzka.HaptikSDK$a
            r4 = 55
            int r3 = r3 + r4
            int r6 = r3 % 128
            com.google.android.gms.internal.p003firebaseauthapi.zzka.values = r6
            int r3 = r3 % r1
            if (r3 == 0) goto L4a
            int r3 = com.google.android.gms.internal.p003firebaseauthapi.zzlh.zza()
            if (r3 > r4) goto L58
            goto L52
        L4a:
            int r3 = com.google.android.gms.internal.p003firebaseauthapi.zzlh.zza()
            r4 = 19
            if (r3 > r4) goto L58
        L52:
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec
            r3.<init>(r8, r2, r5)
            goto L68
        L58:
            javax.crypto.spec.GCMParameterSpec r3 = new javax.crypto.spec.GCMParameterSpec
            r4 = 128(0x80, float:1.794E-43)
            r3.<init>(r4, r8, r2, r5)
            int r2 = com.google.android.gms.internal.p003firebaseauthapi.zzka.values
            int r2 = r2 + 41
            int r4 = r2 % 128
            com.google.android.gms.internal.p003firebaseauthapi.zzka.HaptikSDK$a = r4
            int r2 = r2 % r1
        L68:
            java.lang.ThreadLocal<javax.crypto.Cipher> r2 = com.google.android.gms.internal.p003firebaseauthapi.zzka.zza
            java.lang.Object r4 = r2.get()
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            javax.crypto.SecretKey r6 = r7.zzb
            r4.init(r1, r6, r3)
            int r1 = r9.length
            r3 = 24
            if (r1 == 0) goto L7d
            r1 = 24
            goto L7f
        L7d:
            r1 = 43
        L7f:
            if (r1 == r3) goto L82
            goto L8b
        L82:
            java.lang.Object r1 = r2.get()
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            r1.updateAAD(r9)
        L8b:
            java.lang.Object r9 = r2.get()
            javax.crypto.Cipher r9 = (javax.crypto.Cipher) r9
            int r0 = r0 - r5
            byte[] r8 = r9.doFinal(r8, r5, r0)
            return r8
        L97:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "ciphertext too short"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p003firebaseauthapi.zzka.zza(byte[], byte[]):byte[]");
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzag
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            int i = values + 51;
            try {
                HaptikSDK$a = i % 128;
                Object[] objArr = null;
                if (i % 2 == 0) {
                    int length = objArr.length;
                    throw null;
                }
                throw null;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String ag$a(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ah$a)) ^ ((cArr3[0] >>> 5) + toString)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + valueOf)) ^ ((cArr3[1] >>> 5) + ag$a)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
