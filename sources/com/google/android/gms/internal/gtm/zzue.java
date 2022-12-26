package com.google.android.gms.internal.gtm;

import androidx.databinding.library.baseAdapters.BR;
import java.nio.ByteBuffer;
/* loaded from: classes7.dex */
final class zzue extends zzub {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b4, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.gtm.zzub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zzb(int r16, byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzue.zzb(int, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzub
    public final String zzh(byte[] bArr, int i, int i2) throws zzrk {
        boolean zzd;
        boolean zzd2;
        boolean zze;
        boolean zzf;
        boolean zzd3;
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte zza = zztx.zza(bArr, i);
                zzd3 = zzua.zzd(zza);
                if (!zzd3) {
                    break;
                }
                i++;
                zzua.zza(zza, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte zza2 = zztx.zza(bArr, i);
                zzd = zzua.zzd(zza2);
                if (zzd) {
                    zzua.zza(zza2, cArr, i5);
                    i = i6;
                    i5++;
                    while (i < i3) {
                        byte zza3 = zztx.zza(bArr, i);
                        zzd2 = zzua.zzd(zza3);
                        if (zzd2) {
                            i++;
                            zzua.zza(zza3, cArr, i5);
                            i5++;
                        }
                    }
                } else {
                    zze = zzua.zze(zza2);
                    if (!zze) {
                        zzf = zzua.zzf(zza2);
                        if (zzf) {
                            if (i6 < i3 - 1) {
                                int i7 = i6 + 1;
                                zzua.zza(zza2, zztx.zza(bArr, i6), zztx.zza(bArr, i7), cArr, i5);
                                i = i7 + 1;
                            } else {
                                throw zzrk.zzpw();
                            }
                        } else if (i6 < i3 - 2) {
                            int i8 = i6 + 1;
                            int i9 = i8 + 1;
                            zzua.zza(zza2, zztx.zza(bArr, i6), zztx.zza(bArr, i8), zztx.zza(bArr, i9), cArr, i5);
                            i = i9 + 1;
                            i5 = i5 + 1 + 1;
                        } else {
                            throw zzrk.zzpw();
                        }
                    } else if (i6 < i3) {
                        zzua.zza(zza2, zztx.zza(bArr, i6), cArr, i5);
                        i = i6 + 1;
                    } else {
                        throw zzrk.zzpw();
                    }
                    i5++;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzub
    public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        char c;
        long j2;
        int i3;
        long j3;
        long j4;
        char charAt;
        long j5 = i;
        long j6 = i2 + j5;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            j = 1;
            c = 128;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            zztx.zza(bArr, j5, (byte) charAt);
            i4++;
            j5++;
        }
        if (i4 == length) {
            return (int) j5;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 < c && j5 < j6) {
                zztx.zza(bArr, j5, (byte) charAt3);
                j2 = j5 + j;
            } else if (charAt3 < 2048 && j5 <= j6 - 2) {
                long j7 = j5 + j;
                zztx.zza(bArr, j5, (byte) ((charAt3 >>> 6) | 960));
                zztx.zza(bArr, j7, (byte) ((charAt3 & '?') | c));
                j3 = 1;
                j4 = j7 + 1;
                i4++;
                c = 128;
                long j8 = j3;
                j5 = j4;
                j = j8;
            } else if ((charAt3 >= 55296 && 57343 >= charAt3) || j5 > j6 - 3) {
                if (j5 <= j6 - 4) {
                    int i5 = i4 + 1;
                    if (i5 != length) {
                        char charAt4 = charSequence.charAt(i5);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            long j9 = j5 + 1;
                            zztx.zza(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                            long j10 = j9 + 1;
                            zztx.zza(bArr, j9, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j11 = j10 + 1;
                            zztx.zza(bArr, j10, (byte) (((codePoint >>> 6) & 63) | 128));
                            j3 = 1;
                            j4 = j11 + 1;
                            zztx.zza(bArr, j11, (byte) ((codePoint & 63) | 128));
                            i4 = i5;
                            i4++;
                            c = 128;
                            long j82 = j3;
                            j5 = j4;
                            j = j82;
                        } else {
                            i4 = i5;
                        }
                    }
                    throw new zzud(i4 - 1, length);
                } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                    throw new zzud(i4, length);
                } else {
                    StringBuilder sb2 = new StringBuilder(46);
                    sb2.append("Failed writing ");
                    sb2.append(charAt3);
                    sb2.append(" at index ");
                    sb2.append(j5);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
            } else {
                long j12 = j5 + 1;
                zztx.zza(bArr, j5, (byte) ((charAt3 >>> '\f') | BR.teamCombination));
                long j13 = j12 + 1;
                zztx.zza(bArr, j12, (byte) (((charAt3 >>> 6) & 63) | 128));
                zztx.zza(bArr, j13, (byte) ((charAt3 & '?') | 128));
                j2 = j13 + 1;
            }
            j4 = j2;
            j3 = 1;
            i4++;
            c = 128;
            long j822 = j3;
            j5 = j4;
            j = j822;
        }
        return (int) j5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzub
    public final void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        char c;
        long j;
        long j2;
        int i;
        char charAt;
        long zzb = zztx.zzb(byteBuffer);
        long position = byteBuffer.position() + zzb;
        long limit = byteBuffer.limit() + zzb;
        int length = charSequence.length();
        if (length > limit - position) {
            char charAt2 = charSequence.charAt(length - 1);
            int limit2 = byteBuffer.limit();
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(limit2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i2 = 0;
        while (true) {
            c = 128;
            if (i2 >= length || (charAt = charSequence.charAt(i2)) >= 128) {
                break;
            }
            zztx.zza(position, (byte) charAt);
            i2++;
            position++;
        }
        if (i2 == length) {
            byteBuffer.position((int) (position - zzb));
            return;
        }
        while (i2 < length) {
            char charAt3 = charSequence.charAt(i2);
            if (charAt3 >= c || position >= limit) {
                if (charAt3 >= 2048 || position > limit - 2) {
                    j = zzb;
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || position > limit - 3) {
                        if (position <= limit - 4) {
                            int i3 = i2 + 1;
                            if (i3 != length) {
                                char charAt4 = charSequence.charAt(i3);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    long j3 = position + 1;
                                    zztx.zza(position, (byte) ((codePoint >>> 18) | 240));
                                    long j4 = j3 + 1;
                                    zztx.zza(j3, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j5 = j4 + 1;
                                    zztx.zza(j4, (byte) (((codePoint >>> 6) & 63) | 128));
                                    zztx.zza(j5, (byte) ((codePoint & 63) | 128));
                                    position = j5 + 1;
                                    i2 = i3;
                                    i2++;
                                    zzb = j;
                                    c = 128;
                                } else {
                                    i2 = i3;
                                }
                            }
                            throw new zzud(i2 - 1, length);
                        } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i = i2 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i)))) {
                            throw new zzud(i2, length);
                        } else {
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Failed writing ");
                            sb2.append(charAt3);
                            sb2.append(" at index ");
                            sb2.append(position);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                    }
                    long j6 = position + 1;
                    zztx.zza(position, (byte) ((charAt3 >>> '\f') | BR.teamCombination));
                    long j7 = j6 + 1;
                    zztx.zza(j6, (byte) (((charAt3 >>> 6) & 63) | 128));
                    zztx.zza(j7, (byte) ((charAt3 & '?') | 128));
                    j2 = j7 + 1;
                } else {
                    j = zzb;
                    long j8 = position + 1;
                    zztx.zza(position, (byte) ((charAt3 >>> 6) | 960));
                    zztx.zza(j8, (byte) ((charAt3 & '?') | 128));
                    j2 = j8 + 1;
                }
                position = j2;
            } else {
                zztx.zza(position, (byte) charAt3);
                position++;
                j = zzb;
            }
            i2++;
            zzb = j;
            c = 128;
        }
        byteBuffer.position((int) (position - zzb));
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        int zzbx;
        int zzr;
        int zzc;
        if (i2 == 0) {
            zzbx = zztz.zzbx(i);
            return zzbx;
        } else if (i2 == 1) {
            zzr = zztz.zzr(i, zztx.zza(bArr, j));
            return zzr;
        } else if (i2 == 2) {
            zzc = zztz.zzc(i, zztx.zza(bArr, j), zztx.zza(bArr, j + 1));
            return zzc;
        } else {
            throw new AssertionError();
        }
    }
}
