package com.google.android.gms.internal.measurement;
/* loaded from: classes7.dex */
final class zznb extends zzna {
    @Override // com.google.android.gms.internal.measurement.zzna
    final int zza(int i, byte[] bArr, int i2, int i3) {
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
                    if (i4 < i3) {
                        if (b2 >= -62) {
                            i2 = i4 + 1;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    }
                    return b2;
                }
                if (b2 < -16) {
                    if (i4 < i3 - 1) {
                        int i5 = i4 + 1;
                        byte b3 = bArr[i4];
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            i2 = i5 + 1;
                            if (bArr[i5] > -65) {
                            }
                        }
                    } else {
                        return zznd.zza(bArr, i4, i3);
                    }
                } else if (i4 < i3 - 2) {
                    int i6 = i4 + 1;
                    byte b4 = bArr[i4];
                    if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0) {
                        int i7 = i6 + 1;
                        if (bArr[i6] <= -65) {
                            i4 = i7 + 1;
                            if (bArr[i7] > -65) {
                            }
                        }
                    }
                } else {
                    return zznd.zza(bArr, i4, i3);
                }
                return -1;
            }
            i2 = i4;
        }
        return 0;
    }
}
