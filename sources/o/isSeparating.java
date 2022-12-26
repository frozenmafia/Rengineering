package o;

import o.FoldingFeature;
/* loaded from: classes5.dex */
final class isSeparating {
    static final isSeparating[] ag$a = {new isSeparating("", 0, ""), new isSeparating("", 0, com.dreampay.commons.constants.Constants.WHITE_SPACE), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 0, com.dreampay.commons.constants.Constants.WHITE_SPACE), new isSeparating("", 12, ""), new isSeparating("", 10, com.dreampay.commons.constants.Constants.WHITE_SPACE), new isSeparating("", 0, " the "), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 0, ""), new isSeparating("s ", 0, com.dreampay.commons.constants.Constants.WHITE_SPACE), new isSeparating("", 0, " of "), new isSeparating("", 10, ""), new isSeparating("", 0, " and "), new isSeparating("", 13, ""), new isSeparating("", 1, ""), new isSeparating(", ", 0, com.dreampay.commons.constants.Constants.WHITE_SPACE), new isSeparating("", 0, ", "), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 10, com.dreampay.commons.constants.Constants.WHITE_SPACE), new isSeparating("", 0, " in "), new isSeparating("", 0, " to "), new isSeparating("e ", 0, com.dreampay.commons.constants.Constants.WHITE_SPACE), new isSeparating("", 0, "\""), new isSeparating("", 0, "."), new isSeparating("", 0, "\">"), new isSeparating("", 0, "\n"), new isSeparating("", 3, ""), new isSeparating("", 0, "]"), new isSeparating("", 0, " for "), new isSeparating("", 14, ""), new isSeparating("", 2, ""), new isSeparating("", 0, " a "), new isSeparating("", 0, " that "), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 10, ""), new isSeparating("", 0, ". "), new isSeparating(".", 0, ""), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 0, ", "), new isSeparating("", 15, ""), new isSeparating("", 0, " with "), new isSeparating("", 0, "'"), new isSeparating("", 0, " from "), new isSeparating("", 0, " by "), new isSeparating("", 16, ""), new isSeparating("", 17, ""), new isSeparating(" the ", 0, ""), new isSeparating("", 4, ""), new isSeparating("", 0, ". The "), new isSeparating("", 11, ""), new isSeparating("", 0, " on "), new isSeparating("", 0, " as "), new isSeparating("", 0, " is "), new isSeparating("", 7, ""), new isSeparating("", 1, "ing "), new isSeparating("", 0, "\n\t"), new isSeparating("", 0, ":"), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 0, ". "), new isSeparating("", 0, "ed "), new isSeparating("", 20, ""), new isSeparating("", 18, ""), new isSeparating("", 6, ""), new isSeparating("", 0, "("), new isSeparating("", 10, ", "), new isSeparating("", 8, ""), new isSeparating("", 0, " at "), new isSeparating("", 0, "ly "), new isSeparating(" the ", 0, " of "), new isSeparating("", 5, ""), new isSeparating("", 9, ""), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 10, ", "), new isSeparating("", 10, "\""), new isSeparating(".", 0, "("), new isSeparating("", 11, com.dreampay.commons.constants.Constants.WHITE_SPACE), new isSeparating("", 10, "\">"), new isSeparating("", 0, "=\""), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 0, "."), new isSeparating(".com/", 0, ""), new isSeparating(" the ", 0, " of the "), new isSeparating("", 10, "'"), new isSeparating("", 0, ". This "), new isSeparating("", 0, ","), new isSeparating(".", 0, com.dreampay.commons.constants.Constants.WHITE_SPACE), new isSeparating("", 10, "("), new isSeparating("", 10, "."), new isSeparating("", 0, " not "), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 0, "=\""), new isSeparating("", 0, "er "), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 11, com.dreampay.commons.constants.Constants.WHITE_SPACE), new isSeparating("", 0, "al "), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 11, ""), new isSeparating("", 0, "='"), new isSeparating("", 11, "\""), new isSeparating("", 10, ". "), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 0, "("), new isSeparating("", 0, "ful "), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 10, ". "), new isSeparating("", 0, "ive "), new isSeparating("", 0, "less "), new isSeparating("", 11, "'"), new isSeparating("", 0, "est "), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 10, "."), new isSeparating("", 11, "\">"), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 0, "='"), new isSeparating("", 10, ","), new isSeparating("", 0, "ize "), new isSeparating("", 11, "."), new isSeparating("Â ", 0, ""), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 0, ","), new isSeparating("", 10, "=\""), new isSeparating("", 11, "=\""), new isSeparating("", 0, "ous "), new isSeparating("", 11, ", "), new isSeparating("", 10, "='"), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 10, ","), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 11, "=\""), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 11, ", "), new isSeparating("", 11, ","), new isSeparating("", 11, "("), new isSeparating("", 11, ". "), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 11, "."), new isSeparating("", 11, "='"), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 11, ". "), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 10, "=\""), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 11, "='"), new isSeparating(com.dreampay.commons.constants.Constants.WHITE_SPACE, 10, "='")};
    private final byte[] toString;
    private final byte[] valueOf;
    private final int values;

    isSeparating(String str, int i, String str2) {
        this.toString = values(str);
        this.values = i;
        this.valueOf = values(str2);
    }

    static byte[] values(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int ah$a(byte[] bArr, int i, byte[] bArr2, int i2, int i3, isSeparating isseparating) {
        int i4 = i;
        for (byte b2 : isseparating.toString) {
            bArr[i4] = b2;
            i4++;
        }
        int i5 = isseparating.values;
        int ah$a = FoldingFeature.OcclusionType.ah$a(i5);
        if (ah$a > i3) {
            ah$a = i3;
        }
        int i6 = i2 + ah$a;
        int occlusionType = (i3 - ah$a) - FoldingFeature.OcclusionType.toString(i5);
        int i7 = occlusionType;
        while (i7 > 0) {
            bArr[i4] = bArr2[i6];
            i7--;
            i4++;
            i6++;
        }
        if (i5 == 11 || i5 == 10) {
            int i8 = i4 - occlusionType;
            if (i5 == 10) {
                occlusionType = 1;
            }
            while (occlusionType > 0) {
                int i9 = bArr[i8] & 255;
                if (i9 < 192) {
                    if (i9 >= 97 && i9 <= 122) {
                        bArr[i8] = (byte) (bArr[i8] ^ 32);
                    }
                    i8++;
                    occlusionType--;
                } else if (i9 < 224) {
                    int i10 = i8 + 1;
                    bArr[i10] = (byte) (bArr[i10] ^ 32);
                    i8 += 2;
                    occlusionType -= 2;
                } else {
                    int i11 = i8 + 2;
                    bArr[i11] = (byte) (bArr[i11] ^ 5);
                    i8 += 3;
                    occlusionType -= 3;
                }
            }
        }
        for (byte b3 : isseparating.valueOf) {
            bArr[i4] = b3;
            i4++;
        }
        return i4 - i;
    }
}
