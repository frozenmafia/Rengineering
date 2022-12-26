package o;

import android.view.View;
import org.apache.http.message.TokenParser;
/* loaded from: classes3.dex */
public final class isRateLimitingActive {
    private static int toString = 0;
    private static long valueOf = 7801758066218300978L;
    private static int values = 1;
    private final androidx.databinding.ObservableField<String> ag$a;
    private final androidx.databinding.ObservableField<Integer> ah$a;

    public isRateLimitingActive(int i, String str) {
        runAnimators.ag$a(str, ag$a(new char[]{63046, 34780, 5448, 41675, 12363}, View.resolveSize(0, 0) + 29063).intern());
        this.ah$a = new androidx.databinding.ObservableField<>(Integer.valueOf(i));
        this.ag$a = new androidx.databinding.ObservableField<>(str);
    }

    public final androidx.databinding.ObservableField<Integer> ag$a() {
        int i = values + 123;
        toString = i % 128;
        if ((i % 2 != 0 ? '8' : TokenParser.ESCAPE) != '8') {
            return this.ah$a;
        }
        int i2 = 98 / 0;
        return this.ah$a;
    }

    public final androidx.databinding.ObservableField<String> ah$a() {
        androidx.databinding.ObservableField<String> observableField;
        int i = toString + 1;
        values = i % 128;
        if ((i % 2 == 0 ? (char) 26 : 'A') != 26) {
            observableField = this.ag$a;
        } else {
            observableField = this.ag$a;
            int i2 = 6 / 0;
        }
        int i3 = toString + 95;
        values = i3 % 128;
        if ((i3 % 2 == 0 ? ',' : 'M') != 'M') {
            Object obj = null;
            super.hashCode();
            return observableField;
        }
        return observableField;
    }

    private static String ag$a(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ valueOf);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
