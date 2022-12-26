package com.google.android.gms.internal.p003firebaseauthapi;

import android.view.KeyEvent;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.getWantsAllOnMoveCalls;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjy  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzjy implements zzag {
    private static int ah$a = 0;
    private static int toString = 1;
    private static long valueOf;
    private static final ThreadLocal<Cipher> zza;
    private static final ThreadLocal<Cipher> zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final SecretKeySpec zze;
    private final int zzf;

    static {
        values();
        zza = new zzjw();
        zzb = new zzjx();
        int i = toString + 65;
        ah$a = i % 128;
        int i2 = i % 2;
    }

    static void values() {
        valueOf = -857925206582864470L;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzag
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = (length - this.zzf) - 16;
        if (i < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i2 = ah$a + 123;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Cipher cipher = zza.get();
        cipher.init(1, this.zze);
        byte[] zzd = zzd(cipher, 0, bArr, 0, this.zzf);
        byte[] zzd2 = zzd(cipher, 1, bArr2, 0, bArr2.length);
        byte[] zzd3 = zzd(cipher, 2, bArr, this.zzf, i);
        int i4 = 0;
        byte b2 = 0;
        while (true) {
            if (!(i4 < 16)) {
                break;
            }
            int i5 = ah$a + 21;
            toString = i5 % 128;
            if (!(i5 % 2 == 0)) {
                b2 = (byte) (b2 | (((bArr[(length - 16) + i4] ^ zzd2[i4]) ^ zzd[i4]) ^ zzd3[i4]));
                i4++;
            } else {
                b2 = (byte) (b2 & (((bArr[(length % 16) % i4] ^ zzd2[i4]) & zzd[i4]) ^ zzd3[i4]));
                i4 += 15;
            }
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = zzb.get();
        cipher2.init(1, this.zze, new IvParameterSpec(zzd));
        byte[] doFinal = cipher2.doFinal(bArr, this.zzf, i);
        int i6 = ah$a + 109;
        toString = i6 % 128;
        if (i6 % 2 == 0) {
            Object[] objArr = null;
            int length2 = objArr.length;
            return doFinal;
        }
        return doFinal;
    }

    @Override // com.google.android.gms.internal.p003firebaseauthapi.zzag
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            int i = ah$a + 13;
            try {
                toString = i % 128;
                Object obj = null;
                if (!(i % 2 != 0)) {
                    super.hashCode();
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

    private static byte[] zzc(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = toString + 63;
        ah$a = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        while (true) {
            if (!(i3 < 15)) {
                break;
            }
            byte b2 = bArr[i3];
            int i4 = i3 + 1;
            bArr2[i3] = (byte) (((b2 + b2) ^ ((bArr[i4] & 255) >>> 7)) & 255);
            i3 = i4;
        }
        byte b3 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b3 + b3));
        int i5 = toString + 71;
        ah$a = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            return bArr2;
        }
        return bArr2;
    }

    private static byte[] zze(byte[] bArr, byte[] bArr2) {
        int i = toString + 29;
        ah$a = i % 128;
        int i2 = i % 2;
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        int i3 = 0;
        int i4 = toString + 81;
        while (true) {
            ah$a = i4 % 128;
            int i5 = i4 % 2;
            if (i3 >= length) {
                return bArr3;
            }
            try {
                int i6 = ah$a + 79;
                toString = i6 % 128;
                if ((i6 % 2 == 0 ? 'U' : 'C') != 'C') {
                    bArr3[i3] = (byte) (bArr[i3] | bArr2[i3]);
                    i3 += 63;
                } else {
                    bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
                    i3++;
                }
                i4 = toString + 53;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    public zzjy(byte[] bArr, int i) throws GeneralSecurityException {
        if (i != 12) {
            if (i != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            int i2 = toString + 69;
            ah$a = i2 % 128;
            int i3 = i2 % 2;
        }
        this.zzf = i;
        zzli.zzb(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, values(new char[]{5902, 5967, 2764, 24355, 13228, 39083, 6021}, KeyEvent.getMaxKeyCode() >> 16).intern());
        this.zze = secretKeySpec;
        Cipher cipher = zza.get();
        cipher.init(1, secretKeySpec);
        byte[] zzc = zzc(cipher.doFinal(new byte[16]));
        this.zzc = zzc;
        this.zzd = zzc(zzc);
        int i4 = ah$a + 23;
        toString = i4 % 128;
        if ((i4 % 2 == 0 ? '9' : (char) 30) != '9') {
            return;
        }
        int i5 = 53 / 0;
    }

    private final byte[] zzd(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        int i4 = 0;
        if (i3 == 0) {
            int i5 = toString + 113;
            ah$a = i5 % 128;
            if (i5 % 2 == 0) {
                return cipher.doFinal(zze(bArr3, this.zzc));
            }
            int i6 = 8 / 0;
            return cipher.doFinal(zze(bArr3, this.zzc));
        }
        try {
            byte[] doFinal = cipher.doFinal(bArr3);
            int i7 = 0;
            while (i3 - i7 > 16) {
                int i8 = 0;
                while (true) {
                    if ((i8 < 16 ? '9' : '\n') != '\n') {
                        int i9 = toString + 13;
                        ah$a = i9 % 128;
                        if ((i9 % 2 != 0 ? '>' : (char) 28) != '>') {
                            doFinal[i8] = (byte) (doFinal[i8] ^ bArr[(i2 + i7) + i8]);
                            i8++;
                        } else {
                            doFinal[i8] = (byte) (doFinal[i8] | bArr[(i2 >>> i7) >>> i8]);
                            i8 += 79;
                        }
                    }
                }
                doFinal = cipher.doFinal(doFinal);
                i7 += 16;
            }
            try {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i7 + i2, i2 + i3);
                if (copyOfRange.length == 16) {
                    bArr2 = zze(copyOfRange, this.zzc);
                    int i10 = ah$a + 13;
                    toString = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    byte[] copyOf = Arrays.copyOf(this.zzd, 16);
                    while (true) {
                        length = copyOfRange.length;
                        if ((i4 < length ? '^' : '4') == '4') {
                            break;
                        }
                        int i12 = ah$a + 63;
                        toString = i12 % 128;
                        if (i12 % 2 == 0) {
                            copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                            i4 += 78;
                        } else {
                            copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                            i4++;
                        }
                    }
                    copyOf[length] = (byte) (copyOf[length] ^ 128);
                    bArr2 = copyOf;
                }
                return cipher.doFinal(zze(doFinal, bArr2));
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String values(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(valueOf, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * valueOf));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
