package o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;
/* loaded from: classes5.dex */
public abstract class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda19 implements beginTransactionWithListener {
    public int ag$a() {
        return 10;
    }

    public abstract boolean[] values(String str);

    @Override // o.beginTransactionWithListener
    public inTransaction valueOf(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        int ag$a = ag$a();
        if (map != null && map.containsKey(EncodeHintType.MARGIN)) {
            ag$a = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
        }
        return ag$a(values(str), i, i2, ag$a);
    }

    private static inTransaction ag$a(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        inTransaction intransaction = new inTransaction(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                intransaction.values(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return intransaction;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int valueOf(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }
}
