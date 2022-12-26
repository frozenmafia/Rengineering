package com.google.crypto.tink.shaded.protobuf;

import androidx.databinding.library.baseAdapters.BR;
import com.google.crypto.tink.shaded.protobuf.Utf8;
import java.nio.ByteBuffer;
import o.getSwipeVelocityThreshold;
import o.setSpanSizeLookup;
/* loaded from: classes7.dex */
public final class Utf8 {
    private static final valueOf toString;

    public static int ah$a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int toString(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static int toString(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    static {
        valueOf valuesVar;
        if (Utf8$ah$a.valueOf() && !setSpanSizeLookup.valueOf()) {
            valuesVar = new valueOf() { // from class: com.google.crypto.tink.shaded.protobuf.Utf8$ah$a
                /* JADX INFO: Access modifiers changed from: package-private */
                public static boolean valueOf() {
                    boolean z;
                    boolean z2;
                    z = getSwipeVelocityThreshold.HaptikSDK$e;
                    if (z) {
                        z2 = getSwipeVelocityThreshold.HaptikWebView;
                        if (z2) {
                            return true;
                        }
                    }
                    return false;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
                    if (o.getSwipeVelocityThreshold.values(r13, r2) > (-65)) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
                    if (o.getSwipeVelocityThreshold.values(r13, r2) > (-65)) goto L56;
                 */
                @Override // com.google.crypto.tink.shaded.protobuf.Utf8.valueOf
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public int values(int r12, byte[] r13, int r14, int r15) {
                    /*
                        Method dump skipped, instructions count: 201
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8$ah$a.values(int, byte[], int, int):int");
                }

                /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
                    if (o.getSwipeVelocityThreshold.valueOf(r2) > (-65)) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x00a5, code lost:
                    if (o.getSwipeVelocityThreshold.valueOf(r2) > (-65)) goto L56;
                 */
                @Override // com.google.crypto.tink.shaded.protobuf.Utf8.valueOf
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                int ah$a(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
                    /*
                        Method dump skipped, instructions count: 214
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8$ah$a.ah$a(int, java.nio.ByteBuffer, int, int):int");
                }

                @Override // com.google.crypto.tink.shaded.protobuf.Utf8.valueOf
                String valueOf(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
                    boolean utf8$ag$a;
                    boolean utf8$ag$a2;
                    boolean HaptikSDK$b;
                    boolean HaptikSDK$c;
                    boolean utf8$ag$a3;
                    if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                        int i3 = i + i2;
                        char[] cArr = new char[i2];
                        int i4 = 0;
                        while (i < i3) {
                            byte values2 = getSwipeVelocityThreshold.values(bArr, i);
                            utf8$ag$a3 = Utf8$ag$a.toString(values2);
                            if (!utf8$ag$a3) {
                                break;
                            }
                            i++;
                            Utf8$ag$a.toString(values2, cArr, i4);
                            i4++;
                        }
                        int i5 = i4;
                        while (i < i3) {
                            int i6 = i + 1;
                            byte values3 = getSwipeVelocityThreshold.values(bArr, i);
                            utf8$ag$a = Utf8$ag$a.toString(values3);
                            if (utf8$ag$a) {
                                Utf8$ag$a.toString(values3, cArr, i5);
                                i = i6;
                                i5++;
                                while (i < i3) {
                                    byte values4 = getSwipeVelocityThreshold.values(bArr, i);
                                    utf8$ag$a2 = Utf8$ag$a.toString(values4);
                                    if (!utf8$ag$a2) {
                                        break;
                                    }
                                    i++;
                                    Utf8$ag$a.toString(values4, cArr, i5);
                                    i5++;
                                }
                            } else {
                                HaptikSDK$b = Utf8$ag$a.HaptikSDK$b(values3);
                                if (!HaptikSDK$b) {
                                    HaptikSDK$c = Utf8$ag$a.HaptikSDK$c(values3);
                                    if (HaptikSDK$c) {
                                        if (i6 >= i3 - 1) {
                                            throw InvalidProtocolBufferException.invalidUtf8();
                                        }
                                        int i7 = i6 + 1;
                                        Utf8$ag$a.toString(values3, getSwipeVelocityThreshold.values(bArr, i6), getSwipeVelocityThreshold.values(bArr, i7), cArr, i5);
                                        i = i7 + 1;
                                    } else if (i6 >= i3 - 2) {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    } else {
                                        int i8 = i6 + 1;
                                        int i9 = i8 + 1;
                                        Utf8$ag$a.values(values3, getSwipeVelocityThreshold.values(bArr, i6), getSwipeVelocityThreshold.values(bArr, i8), getSwipeVelocityThreshold.values(bArr, i9), cArr, i5);
                                        i = i9 + 1;
                                        i5 = i5 + 1 + 1;
                                    }
                                } else if (i6 >= i3) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                } else {
                                    Utf8$ag$a.ag$a(values3, getSwipeVelocityThreshold.values(bArr, i6), cArr, i5);
                                    i = i6 + 1;
                                }
                                i5++;
                            }
                        }
                        return new String(cArr, 0, i5);
                    }
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }

                @Override // com.google.crypto.tink.shaded.protobuf.Utf8.valueOf
                String toString(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
                    long HaptikSDK$c;
                    boolean utf8$ag$a;
                    boolean utf8$ag$a2;
                    boolean HaptikSDK$b;
                    boolean HaptikSDK$c2;
                    boolean utf8$ag$a3;
                    if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                        HaptikSDK$c = getSwipeVelocityThreshold.ak.HaptikSDK$c(byteBuffer, getSwipeVelocityThreshold.ag$a);
                        long j = HaptikSDK$c + i;
                        long j2 = i2 + j;
                        char[] cArr = new char[i2];
                        int i3 = 0;
                        while (j < j2) {
                            byte valueOf2 = getSwipeVelocityThreshold.valueOf(j);
                            utf8$ag$a3 = Utf8$ag$a.toString(valueOf2);
                            if (!utf8$ag$a3) {
                                break;
                            }
                            j++;
                            Utf8$ag$a.toString(valueOf2, cArr, i3);
                            i3++;
                        }
                        while (j < j2) {
                            long j3 = j + 1;
                            byte valueOf3 = getSwipeVelocityThreshold.valueOf(j);
                            utf8$ag$a = Utf8$ag$a.toString(valueOf3);
                            if (utf8$ag$a) {
                                Utf8$ag$a.toString(valueOf3, cArr, i3);
                                i3++;
                                j = j3;
                                while (j < j2) {
                                    byte valueOf4 = getSwipeVelocityThreshold.valueOf(j);
                                    utf8$ag$a2 = Utf8$ag$a.toString(valueOf4);
                                    if (!utf8$ag$a2) {
                                        break;
                                    }
                                    j++;
                                    Utf8$ag$a.toString(valueOf4, cArr, i3);
                                    i3++;
                                }
                            } else {
                                HaptikSDK$b = Utf8$ag$a.HaptikSDK$b(valueOf3);
                                if (!HaptikSDK$b) {
                                    HaptikSDK$c2 = Utf8$ag$a.HaptikSDK$c(valueOf3);
                                    if (HaptikSDK$c2) {
                                        if (j3 >= j2 - 1) {
                                            throw InvalidProtocolBufferException.invalidUtf8();
                                        }
                                        long j4 = j3 + 1;
                                        Utf8$ag$a.toString(valueOf3, getSwipeVelocityThreshold.valueOf(j3), getSwipeVelocityThreshold.valueOf(j4), cArr, i3);
                                        i3++;
                                        j = j4 + 1;
                                    } else if (j3 >= j2 - 2) {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    } else {
                                        long j5 = j3 + 1;
                                        long j6 = j5 + 1;
                                        Utf8$ag$a.values(valueOf3, getSwipeVelocityThreshold.valueOf(j3), getSwipeVelocityThreshold.valueOf(j5), getSwipeVelocityThreshold.valueOf(j6), cArr, i3);
                                        i3 = i3 + 1 + 1;
                                        j = j6 + 1;
                                    }
                                } else if (j3 >= j2) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                } else {
                                    j = j3 + 1;
                                    Utf8$ag$a.ag$a(valueOf3, getSwipeVelocityThreshold.valueOf(j3), cArr, i3);
                                    i3++;
                                }
                            }
                        }
                        return new String(cArr, 0, i3);
                    }
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
                }

                @Override // com.google.crypto.tink.shaded.protobuf.Utf8.valueOf
                int ag$a(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
                    }
                    int i4 = 0;
                    while (true) {
                        j = 1;
                        c = 128;
                        if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                            break;
                        }
                        getSwipeVelocityThreshold.values(bArr, j5, (byte) charAt);
                        i4++;
                        j5++;
                    }
                    if (i4 == length) {
                        return (int) j5;
                    }
                    while (i4 < length) {
                        char charAt2 = charSequence.charAt(i4);
                        if (charAt2 < c && j5 < j6) {
                            getSwipeVelocityThreshold.values(bArr, j5, (byte) charAt2);
                            j2 = j5 + j;
                        } else if (charAt2 < 2048 && j5 <= j6 - 2) {
                            long j7 = j5 + j;
                            getSwipeVelocityThreshold.values(bArr, j5, (byte) ((charAt2 >>> 6) | 960));
                            getSwipeVelocityThreshold.values(bArr, j7, (byte) ((charAt2 & '?') | c));
                            j3 = 1;
                            j4 = j7 + 1;
                            i4++;
                            c = 128;
                            long j8 = j3;
                            j5 = j4;
                            j = j8;
                        } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j5 > j6 - 3) {
                            if (j5 <= j6 - 4) {
                                int i5 = i4 + 1;
                                if (i5 != length) {
                                    char charAt3 = charSequence.charAt(i5);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        long j9 = j5 + 1;
                                        getSwipeVelocityThreshold.values(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                        long j10 = j9 + 1;
                                        getSwipeVelocityThreshold.values(bArr, j9, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j11 = j10 + 1;
                                        getSwipeVelocityThreshold.values(bArr, j10, (byte) (((codePoint >>> 6) & 63) | 128));
                                        j3 = 1;
                                        j4 = j11 + 1;
                                        getSwipeVelocityThreshold.values(bArr, j11, (byte) ((codePoint & 63) | 128));
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
                                throw new Utf8.UnpairedSurrogateException(i4 - 1, length);
                            } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                                throw new Utf8.UnpairedSurrogateException(i4, length);
                            } else {
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j5);
                            }
                        } else {
                            long j12 = j5 + 1;
                            getSwipeVelocityThreshold.values(bArr, j5, (byte) ((charAt2 >>> '\f') | BR.teamCombination));
                            long j13 = j12 + 1;
                            getSwipeVelocityThreshold.values(bArr, j12, (byte) (((charAt2 >>> 6) & 63) | 128));
                            getSwipeVelocityThreshold.values(bArr, j13, (byte) ((charAt2 & '?') | 128));
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

                private static int valueOf(byte[] bArr, long j, int i) {
                    int i2 = 0;
                    if (i < 16) {
                        return 0;
                    }
                    while (i2 < i) {
                        if (getSwipeVelocityThreshold.values(bArr, j) < 0) {
                            return i2;
                        }
                        i2++;
                        j++;
                    }
                    return i;
                }

                private static int ag$a(long j, int i) {
                    long ag$a;
                    if (i < 16) {
                        return 0;
                    }
                    int i2 = 8 - (((int) j) & 7);
                    int i3 = i2;
                    while (i3 > 0) {
                        if (getSwipeVelocityThreshold.valueOf(j) < 0) {
                            return i2 - i3;
                        }
                        i3--;
                        j++;
                    }
                    int i4 = i - i2;
                    while (i4 >= 8) {
                        ag$a = getSwipeVelocityThreshold.ak.ag$a(j);
                        if ((ag$a & (-9187201950435737472L)) != 0) {
                            break;
                        }
                        j += 8;
                        i4 -= 8;
                    }
                    return i - i4;
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
                    return -1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
                    return -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private static int ag$a(byte[] r8, long r9, int r11) {
                    /*
                        int r0 = valueOf(r8, r9, r11)
                        int r11 = r11 - r0
                        long r0 = (long) r0
                        long r9 = r9 + r0
                    L7:
                        r0 = 0
                        r1 = 0
                    L9:
                        r2 = 1
                        if (r11 <= 0) goto L1a
                        long r4 = r9 + r2
                        byte r1 = o.getSwipeVelocityThreshold.values(r8, r9)
                        if (r1 < 0) goto L19
                        int r11 = r11 + (-1)
                        r9 = r4
                        goto L9
                    L19:
                        r9 = r4
                    L1a:
                        if (r11 != 0) goto L1d
                        return r0
                    L1d:
                        int r11 = r11 + (-1)
                        r0 = -32
                        r4 = -65
                        r5 = -1
                        if (r1 >= r0) goto L3a
                        if (r11 != 0) goto L29
                        return r1
                    L29:
                        int r11 = r11 + (-1)
                        r0 = -62
                        if (r1 < r0) goto L39
                        long r2 = r2 + r9
                        byte r9 = o.getSwipeVelocityThreshold.values(r8, r9)
                        if (r9 <= r4) goto L37
                        goto L39
                    L37:
                        r9 = r2
                        goto L7
                    L39:
                        return r5
                    L3a:
                        r6 = -16
                        if (r1 >= r6) goto L64
                        r6 = 2
                        if (r11 >= r6) goto L46
                        int r8 = ah$a(r8, r1, r9, r11)
                        return r8
                    L46:
                        int r11 = r11 + (-2)
                        long r6 = r9 + r2
                        byte r9 = o.getSwipeVelocityThreshold.values(r8, r9)
                        if (r9 > r4) goto L63
                        r10 = -96
                        if (r1 != r0) goto L56
                        if (r9 < r10) goto L63
                    L56:
                        r0 = -19
                        if (r1 != r0) goto L5c
                        if (r9 >= r10) goto L63
                    L5c:
                        long r2 = r2 + r6
                        byte r9 = o.getSwipeVelocityThreshold.values(r8, r6)
                        if (r9 <= r4) goto L37
                    L63:
                        return r5
                    L64:
                        r0 = 3
                        if (r11 >= r0) goto L6c
                        int r8 = ah$a(r8, r1, r9, r11)
                        return r8
                    L6c:
                        int r11 = r11 + (-3)
                        long r6 = r9 + r2
                        byte r9 = o.getSwipeVelocityThreshold.values(r8, r9)
                        if (r9 > r4) goto L8e
                        int r10 = r1 << 28
                        int r9 = r9 + 112
                        int r10 = r10 + r9
                        int r9 = r10 >> 30
                        if (r9 != 0) goto L8e
                        long r9 = r6 + r2
                        byte r0 = o.getSwipeVelocityThreshold.values(r8, r6)
                        if (r0 > r4) goto L8e
                        long r2 = r2 + r9
                        byte r9 = o.getSwipeVelocityThreshold.values(r8, r9)
                        if (r9 <= r4) goto L37
                    L8e:
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8$ah$a.ag$a(byte[], long, int):int");
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
                    return -1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
                    return -1;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private static int toString(long r8, int r10) {
                    /*
                        int r0 = ag$a(r8, r10)
                        long r1 = (long) r0
                        long r8 = r8 + r1
                        int r10 = r10 - r0
                    L7:
                        r0 = 0
                        r1 = 0
                    L9:
                        r2 = 1
                        if (r10 <= 0) goto L1a
                        long r4 = r8 + r2
                        byte r1 = o.getSwipeVelocityThreshold.valueOf(r8)
                        if (r1 < 0) goto L19
                        int r10 = r10 + (-1)
                        r8 = r4
                        goto L9
                    L19:
                        r8 = r4
                    L1a:
                        if (r10 != 0) goto L1d
                        return r0
                    L1d:
                        int r10 = r10 + (-1)
                        r0 = -32
                        r4 = -65
                        r5 = -1
                        if (r1 >= r0) goto L3a
                        if (r10 != 0) goto L29
                        return r1
                    L29:
                        int r10 = r10 + (-1)
                        r0 = -62
                        if (r1 < r0) goto L39
                        long r2 = r2 + r8
                        byte r8 = o.getSwipeVelocityThreshold.valueOf(r8)
                        if (r8 <= r4) goto L37
                        goto L39
                    L37:
                        r8 = r2
                        goto L7
                    L39:
                        return r5
                    L3a:
                        r6 = -16
                        if (r1 >= r6) goto L64
                        r6 = 2
                        if (r10 >= r6) goto L46
                        int r8 = values(r8, r1, r10)
                        return r8
                    L46:
                        int r10 = r10 + (-2)
                        long r6 = r8 + r2
                        byte r8 = o.getSwipeVelocityThreshold.valueOf(r8)
                        if (r8 > r4) goto L63
                        r9 = -96
                        if (r1 != r0) goto L56
                        if (r8 < r9) goto L63
                    L56:
                        r0 = -19
                        if (r1 != r0) goto L5c
                        if (r8 >= r9) goto L63
                    L5c:
                        long r2 = r2 + r6
                        byte r8 = o.getSwipeVelocityThreshold.valueOf(r6)
                        if (r8 <= r4) goto L37
                    L63:
                        return r5
                    L64:
                        r0 = 3
                        if (r10 >= r0) goto L6c
                        int r8 = values(r8, r1, r10)
                        return r8
                    L6c:
                        int r10 = r10 + (-3)
                        long r6 = r8 + r2
                        byte r8 = o.getSwipeVelocityThreshold.valueOf(r8)
                        if (r8 > r4) goto L8e
                        int r9 = r1 << 28
                        int r8 = r8 + 112
                        int r9 = r9 + r8
                        int r8 = r9 >> 30
                        if (r8 != 0) goto L8e
                        long r8 = r6 + r2
                        byte r0 = o.getSwipeVelocityThreshold.valueOf(r6)
                        if (r0 > r4) goto L8e
                        long r2 = r2 + r8
                        byte r8 = o.getSwipeVelocityThreshold.valueOf(r8)
                        if (r8 <= r4) goto L37
                    L8e:
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8$ah$a.toString(long, int):int");
                }

                private static int ah$a(byte[] bArr, int i, long j, int i2) {
                    int utf8;
                    if (i2 == 0) {
                        utf8 = Utf8.toString(i);
                        return utf8;
                    } else if (i2 != 1) {
                        if (i2 == 2) {
                            return Utf8.ah$a(i, getSwipeVelocityThreshold.values(bArr, j), getSwipeVelocityThreshold.values(bArr, j + 1));
                        }
                        throw new AssertionError();
                    } else {
                        return Utf8.toString(i, getSwipeVelocityThreshold.values(bArr, j));
                    }
                }

                private static int values(long j, int i, int i2) {
                    int utf8;
                    if (i2 == 0) {
                        utf8 = Utf8.toString(i);
                        return utf8;
                    } else if (i2 != 1) {
                        if (i2 == 2) {
                            return Utf8.ah$a(i, getSwipeVelocityThreshold.valueOf(j), getSwipeVelocityThreshold.valueOf(j + 1));
                        }
                        throw new AssertionError();
                    } else {
                        return Utf8.toString(i, getSwipeVelocityThreshold.valueOf(j));
                    }
                }
            };
        } else {
            valuesVar = new values();
        }
        toString = valuesVar;
    }

    public static boolean valueOf(byte[] bArr, int i, int i2) {
        return toString.ah$a(bArr, i, i2);
    }

    public static int ag$a(int i, byte[] bArr, int i2, int i3) {
        return toString.values(i, bArr, i2, i3);
    }

    public static int ah$a(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return ah$a(b2, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return toString(b2, bArr[i]);
        }
        return toString(b2);
    }

    public static int toString(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return ah$a(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
                }
                throw new AssertionError();
            }
            return toString(i, byteBuffer.get(i2));
        }
        return toString(i);
    }

    /* loaded from: classes7.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    public static int valueOf(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += valueOf(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + 4294967296L));
    }

    private static int valueOf(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    public static int valueOf(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return toString.ag$a(charSequence, bArr, i, i2);
    }

    public static String values(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        return toString.valueOf(byteBuffer, i, i2);
    }

    public static String toString(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return toString.valueOf(bArr, i, i2);
    }

    public static int ag$a(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i;
        while (i3 < i2 - 7 && (byteBuffer.getLong(i3) & (-9187201950435737472L)) == 0) {
            i3 += 8;
        }
        return i3 - i;
    }

    /* loaded from: classes7.dex */
    public static abstract class valueOf {
        abstract int ag$a(CharSequence charSequence, byte[] bArr, int i, int i2);

        abstract int ah$a(int i, ByteBuffer byteBuffer, int i2, int i3);

        abstract String toString(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;

        abstract String valueOf(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        public abstract int values(int i, byte[] bArr, int i2, int i3);

        public final boolean ah$a(byte[] bArr, int i, int i2) {
            return values(0, bArr, i, i2) == 0;
        }

        public final boolean ag$a(ByteBuffer byteBuffer, int i, int i2) {
            return values(0, byteBuffer, i, i2) == 0;
        }

        public final int values(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return values(i, byteBuffer.array(), i2 + arrayOffset, arrayOffset + i3);
            } else if (byteBuffer.isDirect()) {
                return ah$a(i, byteBuffer, i2, i3);
            } else {
                return valueOf(i, byteBuffer, i2, i3);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:108:0x008b, code lost:
            if (r8.get(r9) > (-65)) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0017, code lost:
            if (r8.get(r9) > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x004c, code lost:
            if (r8.get(r9) > (-65)) goto L31;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final int valueOf(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L8e
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L8e
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.valueOf(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L65
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L63
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.valueOf(r0, r1)
                return r7
            L63:
                r9 = r7
                goto L68
            L65:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L68:
                if (r4 != 0) goto L78
                int r7 = r9 + 1
                byte r4 = r8.get(r9)
                if (r7 < r10) goto L77
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.values(r0, r1, r4)
                return r7
            L77:
                r9 = r7
            L78:
                if (r1 > r3) goto L8d
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L8d
                if (r4 > r3) goto L8d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L8d:
                return r2
            L8e:
                int r7 = values(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.valueOf.valueOf(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int values(ByteBuffer byteBuffer, int i, int i2) {
            int ag$a = i + Utf8.ag$a(byteBuffer, i, i2);
            while (ag$a < i2) {
                int i3 = ag$a + 1;
                byte b2 = byteBuffer.get(ag$a);
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i3 >= i2) {
                            return b2;
                        }
                        if (b2 < -62 || byteBuffer.get(i3) > -65) {
                            return -1;
                        }
                        i3++;
                    } else if (b2 >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.toString(byteBuffer, b2, i3, i2 - i3);
                        }
                        int i4 = i3 + 1;
                        byte b3 = byteBuffer.get(i3);
                        if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                            int i5 = i4 + 1;
                            if (byteBuffer.get(i4) <= -65) {
                                i3 = i5 + 1;
                                if (byteBuffer.get(i5) > -65) {
                                }
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 1) {
                        return Utf8.toString(byteBuffer, b2, i3, i2 - i3);
                    } else {
                        int i6 = i3 + 1;
                        byte b4 = byteBuffer.get(i3);
                        if (b4 > -65 || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || byteBuffer.get(i6) > -65))) {
                            return -1;
                        }
                        ag$a = i6 + 1;
                    }
                }
                ag$a = i3;
            }
            return 0;
        }

        final String valueOf(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return valueOf(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            } else if (byteBuffer.isDirect()) {
                return toString(byteBuffer, i, i2);
            } else {
                return ah$a(byteBuffer, i, i2);
            }
        }

        final String ah$a(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            boolean utf8$ag$a;
            boolean utf8$ag$a2;
            boolean HaptikSDK$b;
            boolean HaptikSDK$c;
            boolean utf8$ag$a3;
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b2 = byteBuffer.get(i);
                    utf8$ag$a3 = Utf8$ag$a.toString(b2);
                    if (!utf8$ag$a3) {
                        break;
                    }
                    i++;
                    Utf8$ag$a.toString(b2, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b3 = byteBuffer.get(i);
                    utf8$ag$a = Utf8$ag$a.toString(b3);
                    if (utf8$ag$a) {
                        Utf8$ag$a.toString(b3, cArr, i5);
                        i = i6;
                        i5++;
                        while (i < i3) {
                            byte b4 = byteBuffer.get(i);
                            utf8$ag$a2 = Utf8$ag$a.toString(b4);
                            if (!utf8$ag$a2) {
                                break;
                            }
                            i++;
                            Utf8$ag$a.toString(b4, cArr, i5);
                            i5++;
                        }
                    } else {
                        HaptikSDK$b = Utf8$ag$a.HaptikSDK$b(b3);
                        if (!HaptikSDK$b) {
                            HaptikSDK$c = Utf8$ag$a.HaptikSDK$c(b3);
                            if (HaptikSDK$c) {
                                if (i6 >= i3 - 1) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                int i7 = i6 + 1;
                                Utf8$ag$a.toString(b3, byteBuffer.get(i6), byteBuffer.get(i7), cArr, i5);
                                i = i7 + 1;
                            } else if (i6 >= i3 - 2) {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            } else {
                                int i8 = i6 + 1;
                                int i9 = i8 + 1;
                                Utf8$ag$a.values(b3, byteBuffer.get(i6), byteBuffer.get(i8), byteBuffer.get(i9), cArr, i5);
                                i = i9 + 1;
                                i5 = i5 + 1 + 1;
                            }
                        } else if (i6 >= i3) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        } else {
                            Utf8$ag$a.ag$a(b3, byteBuffer.get(i6), cArr, i5);
                            i = i6 + 1;
                        }
                        i5++;
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* loaded from: classes7.dex */
    static final class values extends valueOf {
        values() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x007f, code lost:
            if (r8[r9] > (-65)) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0015, code lost:
            if (r8[r9] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0046, code lost:
            if (r8[r9] > (-65)) goto L31;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.valueOf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int values(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L82
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L82
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.valueOf(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L5d
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5b
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.valueOf(r0, r1)
                return r7
            L5b:
                r9 = r7
                goto L60
            L5d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L60:
                if (r4 != 0) goto L6e
                int r7 = r9 + 1
                r4 = r8[r9]
                if (r7 < r10) goto L6d
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.values(r0, r1, r4)
                return r7
            L6d:
                r9 = r7
            L6e:
                if (r1 > r3) goto L81
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L81
                if (r4 > r3) goto L81
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L81:
                return r2
            L82:
                int r7 = values(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.values.values(int, byte[], int, int):int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.valueOf
        int ah$a(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return valueOf(i, byteBuffer, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.valueOf
        String valueOf(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            boolean utf8$ag$a;
            boolean utf8$ag$a2;
            boolean HaptikSDK$b;
            boolean HaptikSDK$c;
            boolean utf8$ag$a3;
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b2 = bArr[i];
                    utf8$ag$a3 = Utf8$ag$a.toString(b2);
                    if (!utf8$ag$a3) {
                        break;
                    }
                    i++;
                    Utf8$ag$a.toString(b2, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b3 = bArr[i];
                    utf8$ag$a = Utf8$ag$a.toString(b3);
                    if (utf8$ag$a) {
                        Utf8$ag$a.toString(b3, cArr, i5);
                        i = i6;
                        i5++;
                        while (i < i3) {
                            byte b4 = bArr[i];
                            utf8$ag$a2 = Utf8$ag$a.toString(b4);
                            if (!utf8$ag$a2) {
                                break;
                            }
                            i++;
                            Utf8$ag$a.toString(b4, cArr, i5);
                            i5++;
                        }
                    } else {
                        HaptikSDK$b = Utf8$ag$a.HaptikSDK$b(b3);
                        if (!HaptikSDK$b) {
                            HaptikSDK$c = Utf8$ag$a.HaptikSDK$c(b3);
                            if (HaptikSDK$c) {
                                if (i6 >= i3 - 1) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                int i7 = i6 + 1;
                                Utf8$ag$a.toString(b3, bArr[i6], bArr[i7], cArr, i5);
                                i = i7 + 1;
                            } else if (i6 >= i3 - 2) {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            } else {
                                int i8 = i6 + 1;
                                int i9 = i8 + 1;
                                Utf8$ag$a.values(b3, bArr[i6], bArr[i8], bArr[i9], cArr, i5);
                                i = i9 + 1;
                                i5 = i5 + 1 + 1;
                            }
                        } else if (i6 >= i3) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        } else {
                            Utf8$ag$a.ag$a(b3, bArr[i6], cArr, i5);
                            i = i6 + 1;
                        }
                        i5++;
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.valueOf
        String toString(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            return ah$a(byteBuffer, i, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:75:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.valueOf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int ag$a(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.values.ag$a(java.lang.CharSequence, byte[], int, int):int");
        }

        private static int values(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return toString(bArr, i, i2);
        }

        private static int toString(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i3 >= i2) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b2 >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.ah$a(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                            int i5 = i4 + 1;
                            if (bArr[i4] <= -65) {
                                i3 = i5 + 1;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 1) {
                        return Utf8.ah$a(bArr, i3, i2);
                    } else {
                        int i6 = i3 + 1;
                        byte b4 = bArr[i3];
                        if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                            i = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }
    }
}
