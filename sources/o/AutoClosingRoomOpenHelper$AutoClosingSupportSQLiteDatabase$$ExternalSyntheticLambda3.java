package o;

import com.google.zxing.FormatException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public abstract class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda3 extends AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda2 {
    static final int[][] ah$a;
    static final int[][] values;
    static final int[] HaptikSDK$c = {1, 1, 1};
    static final int[] valueOf = {1, 1, 1, 1, 1};
    static final int[] ag$a = {1, 1, 1, 1, 1, 1};
    private final StringBuilder toString = new StringBuilder(20);
    private final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda23 HaptikSDK$b = new Object() { // from class: o.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda23
        private static final int[] valueOf = {1, 1, 2};
        private final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda6 values = new Object() { // from class: o.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda6
            private final int[] ah$a = new int[4];
            private final StringBuilder ag$a = new StringBuilder();
        };
        private final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda4 ah$a = new Object() { // from class: o.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda4
            private static final int[] ag$a = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
            private final int[] values = new int[4];
            private final StringBuilder valueOf = new StringBuilder();
        };
    };
    private final AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda21 HaptikSDK$a = new Object() { // from class: o.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda21
        private final List<int[]> valueOf = new ArrayList();
        private final List<String> values = new ArrayList();
    };

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        values = iArr;
        int[][] iArr2 = new int[20];
        ah$a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = values[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            ah$a[i] = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ag$a(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return values(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int values(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }
}
