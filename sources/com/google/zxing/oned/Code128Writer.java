package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.ArrayList;
import java.util.Map;
import o.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda11;
import o.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda19;
import o.inTransaction;
/* loaded from: classes5.dex */
public final class Code128Writer extends AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda19 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    @Override // o.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda19, o.beginTransactionWithListener
    public inTransaction valueOf(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.CODE_128) {
            throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
        }
        return super.valueOf(str, barcodeFormat, i, i2, map);
    }

    @Override // o.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda19
    public boolean[] values(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt <= 127) {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = 103;
            if (i3 < length) {
                int code128Writer = toString(str, i3, i5);
                int i8 = 100;
                if (code128Writer == i5) {
                    switch (str.charAt(i3)) {
                        case 241:
                            i8 = 102;
                            break;
                        case 242:
                            i8 = 97;
                            break;
                        case 243:
                            i8 = 96;
                            break;
                        case 244:
                            if (i5 == 101) {
                                i8 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i5 != 100) {
                                if (i5 != 101) {
                                    i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                    break;
                                } else {
                                    i8 = str.charAt(i3) - ' ';
                                    if (i8 < 0) {
                                        i8 += 96;
                                        break;
                                    }
                                }
                            } else {
                                i8 = str.charAt(i3) - ' ';
                                break;
                            }
                            break;
                    }
                    i3++;
                } else {
                    if (i5 != 0) {
                        i7 = code128Writer;
                    } else if (code128Writer == 100) {
                        i7 = 104;
                    } else if (code128Writer != 101) {
                        i7 = 105;
                    }
                    i8 = i7;
                    i5 = code128Writer;
                }
                arrayList.add(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda11.ag$a[i8]);
                i4 += i8 * i6;
                if (i3 != 0) {
                    i6++;
                }
            } else {
                arrayList.add(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda11.ag$a[i4 % 103]);
                arrayList.add(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda11.ag$a[106]);
                int i9 = 0;
                for (int[] iArr : arrayList) {
                    for (int i10 : iArr) {
                        i9 += i10;
                    }
                }
                boolean[] zArr = new boolean[i9];
                for (int[] iArr2 : arrayList) {
                    i += valueOf(zArr, i, iArr2, true);
                }
                return zArr;
            }
        }
    }

    private static CType ag$a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return CType.ONE_DIGIT;
        }
        return CType.TWO_DIGITS;
    }

    private static int toString(CharSequence charSequence, int i, int i2) {
        CType ag$a;
        CType ag$a2;
        char charAt;
        CType ag$a3 = ag$a(charSequence, i);
        if (ag$a3 == CType.ONE_DIGIT) {
            return 100;
        }
        if (ag$a3 == CType.UNCODABLE) {
            return (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || charAt >= '`'))) ? 100 : 101;
        } else if (i2 == 99) {
            return 99;
        } else {
            if (i2 == 100) {
                if (ag$a3 == CType.FNC_1 || (ag$a = ag$a(charSequence, i + 2)) == CType.UNCODABLE || ag$a == CType.ONE_DIGIT) {
                    return 100;
                }
                if (ag$a == CType.FNC_1) {
                    return ag$a(charSequence, i + 3) == CType.TWO_DIGITS ? 99 : 100;
                }
                int i3 = i + 4;
                while (true) {
                    ag$a2 = ag$a(charSequence, i3);
                    if (ag$a2 != CType.TWO_DIGITS) {
                        break;
                    }
                    i3 += 2;
                }
                return ag$a2 == CType.ONE_DIGIT ? 100 : 99;
            }
            if (ag$a3 == CType.FNC_1) {
                ag$a3 = ag$a(charSequence, i + 1);
            }
            return ag$a3 == CType.TWO_DIGITS ? 99 : 100;
        }
    }
}
