package com.google.android.gms.internal.p003firebaseauthapi;

import android.view.ViewConfiguration;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.moveToFirst;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcx  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzcx implements zzag {
    private static int HaptikSDK$b = 1;
    private static char ag$a;
    private static int ah$a;
    private static char toString;
    private static char valueOf;
    private static char values;
    private static final ThreadLocal<Cipher> zza;
    private final SecretKey zzb;

    static {
        valueOf();
        zza = new zzcw();
        int i = ah$a + 75;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
    }

    public zzcx(byte[] bArr) throws GeneralSecurityException {
        zzli.zzb(bArr.length);
        this.zzb = new SecretKeySpec(bArr, values(new char[]{63964, 36799, 17876, 18324}, 3 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
    }

    static void valueOf() {
        ag$a = (char) 19889;
        valueOf = (char) 44010;
        toString = (char) 55829;
        values = (char) 373;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzag
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec ivParameterSpec;
        if (bArr.length >= 28) {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                ivParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
                int i = ah$a + 5;
                HaptikSDK$b = i % 128;
                int i2 = i % 2;
            } catch (ClassNotFoundException unused) {
                if (zzlh.zzb()) {
                    ivParameterSpec = new IvParameterSpec(bArr, 0, 12);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal<Cipher> threadLocal = zza;
            threadLocal.get().init(2, this.zzb, ivParameterSpec);
            if (!(bArr2.length == 0)) {
                threadLocal.get().updateAAD(bArr2);
                int i3 = ah$a + 89;
                HaptikSDK$b = i3 % 128;
                int i4 = i3 % 2;
            }
            return threadLocal.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzag
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            int i = HaptikSDK$b + 65;
            try {
                ah$a = i % 128;
                int i2 = i % 2;
                throw null;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String values(char[] cArr, int i) {
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
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + valueOf)) ^ ((cArr3[0] >>> 5) + toString)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + values)) ^ ((cArr3[1] >>> 5) + ag$a)));
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
