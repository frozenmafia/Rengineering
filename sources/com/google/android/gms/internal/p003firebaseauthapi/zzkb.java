package com.google.android.gms.internal.p003firebaseauthapi;

import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.isAfterLast;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkb  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzkb implements zzak {
    private static int toString = 0;
    private static int valueOf = 1;
    private static int values;
    private static final Collection<Integer> zza;
    private static final byte[] zzb;
    private final zzlb zzc;
    private final byte[] zzd;

    static {
        values();
        zza = Arrays.asList(64);
        zzb = new byte[16];
        int i = valueOf + 39;
        toString = i % 128;
        int i2 = i % 2;
    }

    static void values() {
        values = 68;
    }

    public zzkb(byte[] bArr) throws GeneralSecurityException {
        Collection<Integer> collection = zza;
        int length = bArr.length;
        if (!collection.contains(Integer.valueOf(length))) {
            StringBuilder sb = new StringBuilder(59);
            sb.append("invalid key size: ");
            sb.append(length);
            sb.append(" bytes; key must have 64 bytes");
            throw new InvalidKeyException(sb.toString());
        }
        int i = length >> 1;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
        this.zzd = Arrays.copyOfRange(bArr, i, length);
        this.zzc = new zzlb(copyOfRange);
        int i2 = valueOf + 103;
        toString = i2 % 128;
        if ((i2 % 2 != 0 ? '%' : (char) 19) != 19) {
            Object obj = null;
            super.hashCode();
        }
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzak
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzd;
        int i = toString + 53;
        valueOf = i % 128;
        int i2 = i % 2;
        int length = bArr.length;
        if (length >= 16) {
            Cipher zza2 = zzkp.zza.zza("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            zza2.init(2, new SecretKeySpec(this.zzd, ah$a(3 - View.resolveSize(0, 0), 140 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), true, Process.getGidForName("") + 4, new char[]{11, 65533, 65529}).intern()), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
            byte[] doFinal = zza2.doFinal(copyOfRange2);
            if ((copyOfRange2.length == 0 ? '\f' : '\n') != '\n' && doFinal == null && zzlh.zzb()) {
                doFinal = new byte[0];
            }
            byte[][] bArr4 = {bArr2, doFinal};
            byte[] zza3 = this.zzc.zza(zzb, 16);
            char c = 0;
            while (true) {
                if ((c <= 0 ? ':' : '3') == '3') {
                    break;
                }
                int i3 = toString + 125;
                valueOf = i3 % 128;
                int i4 = i3 % 2;
                byte[] bArr5 = bArr4[0];
                if (bArr5 == null) {
                    int i5 = valueOf + 71;
                    toString = i5 % 128;
                    bArr5 = i5 % 2 != 0 ? new byte[1] : new byte[0];
                }
                zza3 = zzkd.zzd(zzkc.zzb(zza3), this.zzc.zza(bArr5, 16));
                c = 1;
            }
            byte[] bArr6 = bArr4[1];
            int length2 = bArr6.length;
            if (length2 >= 16) {
                int length3 = zza3.length;
                if (length2 < length3) {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
                zzd = Arrays.copyOf(bArr6, length2);
                for (int i6 = 0; i6 < zza3.length; i6++) {
                    int i7 = (length2 - length3) + i6;
                    zzd[i7] = (byte) (zzd[i7] ^ zza3[i6]);
                }
            } else {
                zzd = zzkd.zzd(zzkc.zza(bArr6), zzkc.zzb(zza3));
            }
            if (zzkd.zzb(copyOfRange, this.zzc.zza(zzd, 16))) {
                int i8 = valueOf + 67;
                toString = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 87 / 0;
                    return doFinal;
                }
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    private static String ah$a(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - values);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
