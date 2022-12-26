package o;

import java.util.Arrays;
import okio.ByteString;
/* loaded from: classes5.dex */
public final class SplitPlaceholderRule {
    private static final byte[] ag$a = ByteString.Companion.ag$a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
    private static final byte[] toString = ByteString.Companion.ag$a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();

    public static final byte[] ah$a() {
        return toString;
    }

    public static final byte[] ag$a(String str) {
        int i;
        char charAt;
        runAnimators.ag$a(str, "$this$decodeBase64ToArray");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt2 = str.charAt(i6);
            if ('A' <= charAt2 && 'Z' >= charAt2) {
                i = charAt2 - 'A';
            } else if ('a' <= charAt2 && 'z' >= charAt2) {
                i = charAt2 - 'G';
            } else if ('0' <= charAt2 && '9' >= charAt2) {
                i = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                int i7 = i5 + 1;
                bArr[i5] = (byte) (i4 >> 16);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (i4 >> 8);
                bArr[i8] = (byte) i4;
                i5 = i8 + 1;
            }
        }
        int i9 = i3 % 4;
        if (i9 != 1) {
            if (i9 == 2) {
                bArr[i5] = (byte) ((i4 << 12) >> 16);
                i5++;
            } else if (i9 == 3) {
                int i10 = i4 << 6;
                int i11 = i5 + 1;
                bArr[i5] = (byte) (i10 >> 16);
                i5 = i11 + 1;
                bArr[i11] = (byte) (i10 >> 8);
            }
            if (i5 == i2) {
                return bArr;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i5);
            runAnimators.ah$a(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            return copyOf;
        }
        return null;
    }

    public static /* synthetic */ String ah$a(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = ag$a;
        }
        return ah$a(bArr, bArr2);
    }

    public static final String ah$a(byte[] bArr, byte[] bArr2) {
        runAnimators.ag$a(bArr, "$this$encodeBase64");
        runAnimators.ag$a(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b2 = bArr[i];
            int i4 = i3 + 1;
            byte b3 = bArr[i3];
            byte b4 = bArr[i4];
            int i5 = i2 + 1;
            bArr3[i2] = bArr2[(b2 & 255) >> 2];
            int i6 = i5 + 1;
            bArr3[i5] = bArr2[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i2 = i7 + 1;
            bArr3[i7] = bArr2[b4 & 63];
            i = i4 + 1;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b5 = bArr[i];
            int i8 = i2 + 1;
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            int i9 = i8 + 1;
            bArr3[i8] = bArr2[(b5 & 3) << 4];
            byte b6 = (byte) 61;
            bArr3[i9] = b6;
            bArr3[i9 + 1] = b6;
        } else if (length2 == 2) {
            byte b7 = bArr[i];
            byte b8 = bArr[i + 1];
            int i10 = i2 + 1;
            bArr3[i2] = bArr2[(b7 & 255) >> 2];
            int i11 = i10 + 1;
            bArr3[i10] = bArr2[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            bArr3[i11] = bArr2[(b8 & 15) << 2];
            bArr3[i11 + 1] = (byte) 61;
        }
        return SplitRule.toString(bArr3);
    }
}
