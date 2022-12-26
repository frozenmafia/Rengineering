package o;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.pdf417.encoder.Compaction;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/* loaded from: classes5.dex */
final class bindBlob {
    private static final byte[] ah$a;
    private static final byte[] values = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    private static final byte[] valueOf = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    private static final byte[] toString = new byte[128];
    private static final Charset ag$a = StandardCharsets.ISO_8859_1;

    private static boolean ah$a(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    private static boolean invoke(char c) {
        if (c == '\t' || c == '\n' || c == '\r') {
            return true;
        }
        return c >= ' ' && c <= '~';
    }

    private static boolean toString(char c) {
        return c >= '0' && c <= '9';
    }

    private static boolean valueOf(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    static {
        byte[] bArr = new byte[128];
        ah$a = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = values;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b2 = bArr2[i2];
            if (b2 > 0) {
                ah$a[b2] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(toString, (byte) -1);
        while (true) {
            byte[] bArr3 = valueOf;
            if (i >= bArr3.length) {
                return;
            }
            byte b3 = bArr3[i];
            if (b3 > 0) {
                toString[b3] = (byte) i;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String values(String str, Compaction compaction, Charset charset) throws WriterException {
        CharacterSetECI characterSetECIByName;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = ag$a;
        } else if (!ag$a.equals(charset) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(charset.name())) != null) {
            valueOf(characterSetECIByName.getValue(), sb);
        }
        int length = str.length();
        int i = AnonymousClass1.ag$a[compaction.ordinal()];
        if (i == 1) {
            ag$a(str, 0, length, sb, 0);
        } else if (i == 2) {
            byte[] bytes = str.getBytes(charset);
            toString(bytes, 0, bytes.length, 1, sb);
        } else if (i != 3) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int bindblob = toString(str, i2);
                if (bindblob >= 13) {
                    sb.append((char) 902);
                    values(str, i2, bindblob, sb);
                    i2 += bindblob;
                    i3 = 0;
                    i4 = 2;
                } else {
                    int ag$a2 = ag$a(str, i2);
                    if (ag$a2 >= 5 || bindblob == length) {
                        if (i4 != 0) {
                            sb.append((char) 900);
                            i3 = 0;
                            i4 = 0;
                        }
                        i3 = ag$a(str, i2, ag$a2, sb, i3);
                        i2 += ag$a2;
                    } else {
                        int ah$a2 = ah$a(str, i2, charset);
                        if (ah$a2 == 0) {
                            ah$a2 = 1;
                        }
                        int i5 = ah$a2 + i2;
                        byte[] bytes2 = str.substring(i2, i5).getBytes(charset);
                        if (bytes2.length == 1 && i4 == 0) {
                            toString(bytes2, 0, 1, 0, sb);
                        } else {
                            toString(bytes2, 0, bytes2.length, i4, sb);
                            i3 = 0;
                            i4 = 1;
                        }
                        i2 = i5;
                    }
                }
            }
        } else {
            sb.append((char) 902);
            values(str, 0, length, sb);
        }
        return sb.toString();
    }

    /* renamed from: o.bindBlob$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[Compaction.values().length];
            ag$a = iArr;
            try {
                iArr[Compaction.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ag$a[Compaction.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ag$a[Compaction.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6 A[EDGE_INSN: B:76:0x00f6->B:55:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int ag$a(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindBlob.ag$a(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    private static void toString(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append((char) 913);
        } else if (i2 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + (bArr[i4 + i5] & 255);
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j % 900);
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    private static void values(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf2 = BigInteger.valueOf(900L);
        BigInteger valueOf3 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf2).intValue());
                bigInteger = bigInteger.divide(valueOf2);
            } while (!bigInteger.equals(valueOf3));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    private static boolean ag$a(char c) {
        return ah$a[c] != -1;
    }

    private static boolean values(char c) {
        return toString[c] != -1;
    }

    private static int toString(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (toString(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        return (r1 - r7) - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int ag$a(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = r7
        L5:
            if (r1 >= r0) goto L37
            char r2 = r6.charAt(r1)
            r3 = 0
        Lc:
            r4 = 13
            if (r3 >= r4) goto L23
            boolean r5 = toString(r2)
            if (r5 == 0) goto L23
            if (r1 >= r0) goto L23
            int r3 = r3 + 1
            int r1 = r1 + 1
            if (r1 >= r0) goto Lc
            char r2 = r6.charAt(r1)
            goto Lc
        L23:
            if (r3 < r4) goto L28
            int r1 = r1 - r7
            int r1 = r1 - r3
            return r1
        L28:
            if (r3 > 0) goto L5
            char r2 = r6.charAt(r1)
            boolean r2 = invoke(r2)
            if (r2 == 0) goto L37
            int r1 = r1 + 1
            goto L5
        L37:
            int r1 = r1 - r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindBlob.ag$a(java.lang.CharSequence, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r1 - r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int ah$a(java.lang.String r5, int r6, java.nio.charset.Charset r7) throws com.google.zxing.WriterException {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L9:
            if (r1 >= r0) goto L57
            char r2 = r5.charAt(r1)
            r3 = 0
        L10:
            r4 = 13
            if (r3 >= r4) goto L25
            boolean r2 = toString(r2)
            if (r2 == 0) goto L25
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L25
            char r2 = r5.charAt(r2)
            goto L10
        L25:
            if (r3 < r4) goto L29
            int r1 = r1 - r6
            return r1
        L29:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L36
            int r1 = r1 + 1
            goto L9
        L36:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Non-encodable character detected: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r6 = " (Unicode: "
            r5.append(r6)
            r5.append(r2)
            r6 = 41
            r5.append(r6)
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L57:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bindBlob.ah$a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    private static void valueOf(int i, StringBuilder sb) throws WriterException {
        if (i >= 0 && i < 900) {
            sb.append((char) 927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i / 900) - 1));
            sb.append((char) (i % 900));
        } else if (i < 811800) {
            sb.append((char) 925);
            sb.append((char) (810900 - i));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i)));
        }
    }
}
