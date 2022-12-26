package o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;
import o.AutoClosingRoomOpenHelper;
/* loaded from: classes5.dex */
public final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda17 extends AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement {
    @Override // o.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda19, o.beginTransactionWithListener
    public inTransaction valueOf(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.EAN_13) {
            throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
        }
        return super.valueOf(str, barcodeFormat, i, i2, map);
    }

    @Override // o.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda19
    public boolean[] values(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda3.values(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 13) {
            try {
                if (!AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda3.ag$a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        int i = AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda15.toString[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int valueOf = valueOf(zArr, 0, AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda3.HaptikSDK$c, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            valueOf += valueOf(zArr, valueOf, AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda3.ah$a[digit], false);
        }
        int valueOf2 = valueOf + valueOf(zArr, valueOf, AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda3.valueOf, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            valueOf2 += valueOf(zArr, valueOf2, AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda3.values[Character.digit(str.charAt(i3), 10)], true);
        }
        valueOf(zArr, valueOf2, AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda3.HaptikSDK$c, true);
        return zArr;
    }
}
