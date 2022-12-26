package com.google.android.gms.internal.gtm;

import java.nio.ByteBuffer;
/* loaded from: classes7.dex */
final class zzuc extends zzub {
    @Override // com.google.android.gms.internal.gtm.zzub
    final int zzb(int i, byte[] bArr, int i2, int i3) {
        int zzg;
        int zzg2;
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i4 >= i3) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i2 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (b2 >= -16) {
                    if (i4 < i3 - 2) {
                        int i5 = i4 + 1;
                        byte b3 = bArr[i4];
                        if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (bArr[i5] <= -65) {
                                i4 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    zzg2 = zztz.zzg(bArr, i4, i3);
                    return zzg2;
                } else if (i4 < i3 - 1) {
                    int i7 = i4 + 1;
                    byte b4 = bArr[i4];
                    if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                        i2 = i7 + 1;
                        if (bArr[i7] > -65) {
                        }
                    }
                    return -1;
                } else {
                    zzg = zztz.zzg(bArr, i4, i3);
                    return zzg;
                }
            }
            i2 = i4;
        }
        return 0;
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
                byte b2 = bArr[i];
                zzd3 = zzua.zzd(b2);
                if (!zzd3) {
                    break;
                }
                i++;
                zzua.zza(b2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = bArr[i];
                zzd = zzua.zzd(b3);
                if (zzd) {
                    zzua.zza(b3, cArr, i5);
                    i = i6;
                    i5++;
                    while (i < i3) {
                        byte b4 = bArr[i];
                        zzd2 = zzua.zzd(b4);
                        if (zzd2) {
                            i++;
                            zzua.zza(b4, cArr, i5);
                            i5++;
                        }
                    }
                } else {
                    zze = zzua.zze(b3);
                    if (!zze) {
                        zzf = zzua.zzf(b3);
                        if (zzf) {
                            if (i6 < i3 - 1) {
                                int i7 = i6 + 1;
                                zzua.zza(b3, bArr[i6], bArr[i7], cArr, i5);
                                i = i7 + 1;
                            } else {
                                throw zzrk.zzpw();
                            }
                        } else if (i6 < i3 - 2) {
                            int i8 = i6 + 1;
                            int i9 = i8 + 1;
                            zzua.zza(b3, bArr[i6], bArr[i8], bArr[i9], cArr, i5);
                            i = i9 + 1;
                            i5 = i5 + 1 + 1;
                        } else {
                            throw zzrk.zzpw();
                        }
                    } else if (i6 < i3) {
                        zzua.zza(b3, bArr[i6], cArr, i5);
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
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.gtm.zzub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzuc.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzub
    public final void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        zzc(charSequence, byteBuffer);
    }
}
