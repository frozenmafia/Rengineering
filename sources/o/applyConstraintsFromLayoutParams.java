package o;

import android.graphics.Color;
import java.util.ArrayList;
import org.apache.commons.codec.language.bm.Languages;
/* loaded from: classes3.dex */
public final class applyConstraintsFromLayoutParams {
    private static int HaptikSDK$a = 1;
    private static char HaptikSDK$b = 7947;
    private static char HaptikSDK$c = 49841;
    private static char ag$a = 20652;
    private static int invoke = 0;
    private static char valueOf = 19005;
    private final int ah$a;
    private final String toString;
    private ArrayList<Object> values;

    public applyConstraintsFromLayoutParams(String str, int i) {
        runAnimators.ag$a(str, toString(new char[]{22850, 39912, 65051, 24545, 37480, 12731}, Color.argb(0, 0, 0, 0) + 5).intern());
        this.toString = str;
        this.ah$a = i;
        this.values = new ArrayList<>();
    }

    public final String ah$a() {
        int i = invoke + 81;
        HaptikSDK$a = i % 128;
        if ((i % 2 == 0 ? (char) 31 : (char) 7) != 31) {
            return this.toString;
        }
        String str = this.toString;
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public final int valueOf() {
        int i;
        try {
            int i2 = HaptikSDK$a + 35;
            invoke = i2 % 128;
            if (i2 % 2 != 0) {
                i = this.ah$a;
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                i = this.ah$a;
            }
            int i3 = HaptikSDK$a + 31;
            invoke = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 5 : 'N') != 'N') {
                int i4 = 46 / 0;
                return i;
            }
            return i;
        } catch (Exception e) {
            throw e;
        }
    }

    public final ArrayList<Object> values() {
        try {
            int i = HaptikSDK$a + 15;
            invoke = i % 128;
            int i2 = i % 2;
            ArrayList<Object> arrayList = this.values;
            int i3 = invoke + 95;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
            return arrayList;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void ah$a(Object obj) {
        int i = invoke + 59;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        runAnimators.ag$a(obj, Languages.ANY);
        this.values.add(obj);
        int i3 = invoke + 97;
        HaptikSDK$a = i3 % 128;
        int i4 = i3 % 2;
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + HaptikSDK$c)) ^ ((cArr3[0] >>> 5) + HaptikSDK$b)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + ag$a)) ^ ((cArr3[1] >>> 5) + valueOf)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
