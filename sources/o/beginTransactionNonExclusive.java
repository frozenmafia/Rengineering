package o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
/* loaded from: classes5.dex */
public final class beginTransactionNonExclusive implements beginTransactionWithListener {
    @Override // o.beginTransactionWithListener
    public inTransaction valueOf(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        Charset charset;
        int i3;
        int i4;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        if (map != null) {
            if (map.containsKey(EncodeHintType.CHARACTER_SET)) {
                charset2 = Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString());
            }
            r1 = map.containsKey(EncodeHintType.ERROR_CORRECTION) ? Integer.parseInt(map.get(EncodeHintType.ERROR_CORRECTION).toString()) : 33;
            if (map.containsKey(EncodeHintType.AZTEC_LAYERS)) {
                i4 = Integer.parseInt(map.get(EncodeHintType.AZTEC_LAYERS).toString());
                charset = charset2;
                i3 = r1;
                return ah$a(str, barcodeFormat, i, i2, charset, i3, i4);
            }
        }
        charset = charset2;
        i3 = r1;
        i4 = 0;
        return ah$a(str, barcodeFormat, i, i2, charset, i3, i4);
    }

    private static inTransaction ah$a(String str, BarcodeFormat barcodeFormat, int i, int i2, Charset charset, int i3, int i4) {
        if (barcodeFormat != BarcodeFormat.AZTEC) {
            throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
        }
        return values(endTransaction.valueOf(str.getBytes(charset), i3, i4), i, i2);
    }

    private static inTransaction values(lambda$update$6 lambda_update_6, int i, int i2) {
        inTransaction values = lambda_update_6.values();
        if (values == null) {
            throw new IllegalStateException();
        }
        int ag$a = values.ag$a();
        int values2 = values.values();
        int max = Math.max(i, ag$a);
        int max2 = Math.max(i2, values2);
        int min = Math.min(max / ag$a, max2 / values2);
        int i3 = (max - (ag$a * min)) / 2;
        int i4 = (max2 - (values2 * min)) / 2;
        inTransaction intransaction = new inTransaction(max, max2);
        int i5 = 0;
        while (i5 < values2) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < ag$a) {
                if (values.ah$a(i7, i5)) {
                    intransaction.values(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return intransaction;
    }
}
