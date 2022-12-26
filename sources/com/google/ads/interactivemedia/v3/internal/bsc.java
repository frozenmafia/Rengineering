package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class bsc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String f(ByteBuffer byteBuffer, int i, int i2) throws bpt {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = byteBuffer.get(i);
                if (!bsk.e(b2)) {
                    break;
                }
                i++;
                bsk.b(b2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b3 = byteBuffer.get(i);
                if (bsk.e(b3)) {
                    int i7 = i5 + 1;
                    bsk.b(b3, cArr, i5);
                    i = i6;
                    while (true) {
                        i5 = i7;
                        if (i < i3) {
                            byte b4 = byteBuffer.get(i);
                            if (!bsk.e(b4)) {
                                break;
                            }
                            i++;
                            i7 = i5 + 1;
                            bsk.b(b4, cArr, i5);
                        }
                    }
                } else {
                    if (bsk.g(b3)) {
                        if (i6 < i3) {
                            bsk.d(b3, byteBuffer.get(i6), cArr, i5);
                            i = i6 + 1;
                        } else {
                            throw bpt.d();
                        }
                    } else if (bsk.f(b3)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            bsk.c(b3, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                            i = i8 + 1;
                        } else {
                            throw bpt.d();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        bsk.a(b3, byteBuffer.get(i6), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                        i5 += 2;
                        i = i10 + 1;
                    } else {
                        throw bpt.d();
                    }
                    i5++;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int b(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String c(byte[] bArr, int i, int i2) throws bpt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String d(ByteBuffer byteBuffer, int i, int i2) throws bpt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(byte[] bArr, int i, int i2) {
        return b(0, bArr, i, i2) == 0;
    }
}
