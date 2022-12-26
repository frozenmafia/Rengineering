package com.google.android.gms.internal.p003firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaco  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzaco {
    private static final zzacl zza;

    static {
        if (zzacj.zzx() && zzacj.zzy()) {
            int i = zzyg.zza;
        }
        zza = new zzacm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                byte b3 = bArr[i];
                if (b2 <= -12 && b3 <= -65) {
                    return b2 ^ (b3 << 8);
                }
            } else if (i3 == 2) {
                byte b4 = bArr[i];
                byte b5 = bArr[i + 1];
                if (b2 <= -12 && b4 <= -65 && b5 <= -65) {
                    return ((b4 << 8) ^ b2) ^ (b5 << 16);
                }
            } else {
                throw new AssertionError();
            }
        } else if (b2 <= -12) {
            return b2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ff, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzb(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p003firebaseauthapi.zzaco.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new zzacn(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzd(byte[] bArr, int i, int i2) throws zzaae {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = bArr[i];
                if (!zzack.zzd(b2)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b2;
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b3 = bArr[i];
                if (zzack.zzd(b3)) {
                    int i6 = i4 + 1;
                    cArr[i4] = (char) b3;
                    i = i5;
                    while (true) {
                        i4 = i6;
                        if (i < i3) {
                            byte b4 = bArr[i];
                            if (!zzack.zzd(b4)) {
                                break;
                            }
                            i++;
                            i6 = i4 + 1;
                            cArr[i4] = (char) b4;
                        }
                    }
                } else {
                    if (b3 < -32) {
                        if (i5 < i3) {
                            zzack.zzb(b3, bArr[i5], cArr, i4);
                            i = i5 + 1;
                        } else {
                            throw zzaae.zzd();
                        }
                    } else if (b3 < -16) {
                        if (i5 < i3 - 1) {
                            int i7 = i5 + 1;
                            zzack.zzc(b3, bArr[i5], bArr[i7], cArr, i4);
                            i = i7 + 1;
                        } else {
                            throw zzaae.zzd();
                        }
                    } else if (i5 < i3 - 2) {
                        int i8 = i5 + 1;
                        int i9 = i8 + 1;
                        zzack.zza(b3, bArr[i5], bArr[i8], bArr[i9], cArr, i4);
                        i4 += 2;
                        i = i9 + 1;
                    } else {
                        throw zzaae.zzd();
                    }
                    i4++;
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i, int i2) {
        return zza.zzb(bArr, i, i2);
    }
}
