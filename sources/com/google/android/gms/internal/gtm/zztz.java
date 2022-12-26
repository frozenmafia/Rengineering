package com.google.android.gms.internal.gtm;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zztz {
    private static final zzub zzbfo;

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzbx(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzc(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean zzi(byte[] bArr) {
        return zzbfo.zzf(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzr(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static boolean zzf(byte[] bArr, int i, int i2) {
        return zzbfo.zzf(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzg(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return zzc(b2, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return zzr(b2, bArr[i]);
        }
        return zzbx(b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(CharSequence charSequence) {
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
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new zzud(i2, length2);
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
    public static int zza(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return zzbfo.zzb(charSequence, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzh(byte[] bArr, int i, int i2) throws zzrk {
        return zzbfo.zzh(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(CharSequence charSequence, ByteBuffer byteBuffer) {
        zzub zzubVar = zzbfo;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(zza(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            zzubVar.zzb(charSequence, byteBuffer);
        } else {
            zzub.zzc(charSequence, byteBuffer);
        }
    }

    static {
        zzub zzucVar;
        if ((zztx.zzrm() && zztx.zzrn()) && !zzpp.zzna()) {
            zzucVar = new zzue();
        } else {
            zzucVar = new zzuc();
        }
        zzbfo = zzucVar;
    }
}
