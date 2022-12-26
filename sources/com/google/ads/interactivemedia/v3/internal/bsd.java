package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
/* loaded from: classes4.dex */
final class bsd extends bsc {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.bsc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bsd.a(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.bsc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bsd.b(int, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.bsc
    public final String c(byte[] bArr, int i, int i2) throws bpt {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = bArr[i];
                if (!bsk.e(b2)) {
                    break;
                }
                i++;
                bsk.b(b2, cArr, i4);
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b3 = bArr[i];
                if (bsk.e(b3)) {
                    int i6 = i4 + 1;
                    bsk.b(b3, cArr, i4);
                    i = i5;
                    while (true) {
                        i4 = i6;
                        if (i < i3) {
                            byte b4 = bArr[i];
                            if (!bsk.e(b4)) {
                                break;
                            }
                            i++;
                            i6 = i4 + 1;
                            bsk.b(b4, cArr, i4);
                        }
                    }
                } else {
                    if (bsk.g(b3)) {
                        if (i5 < i3) {
                            bsk.d(b3, bArr[i5], cArr, i4);
                            i = i5 + 1;
                        } else {
                            throw bpt.d();
                        }
                    } else if (bsk.f(b3)) {
                        if (i5 < i3 - 1) {
                            int i7 = i5 + 1;
                            bsk.c(b3, bArr[i5], bArr[i7], cArr, i4);
                            i = i7 + 1;
                        } else {
                            throw bpt.d();
                        }
                    } else if (i5 < i3 - 2) {
                        int i8 = i5 + 1;
                        int i9 = i8 + 1;
                        bsk.a(b3, bArr[i5], bArr[i8], bArr[i9], cArr, i4);
                        i4 += 2;
                        i = i9 + 1;
                    } else {
                        throw bpt.d();
                    }
                    i4++;
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.bsc
    public final String d(ByteBuffer byteBuffer, int i, int i2) throws bpt {
        return f(byteBuffer, i, i2);
    }
}
