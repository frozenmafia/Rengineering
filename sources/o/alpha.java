package o;

import android.graphics.Color;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public final class alpha {
    private static int HaptikSDK$b = 0;
    private static int ag$a = 0;
    private static char ah$a = 0;
    private static int ah$b = 1;
    private static long valueOf = -9105883148882655027L;
    private ArrayList<Object> toString;
    private final String values;

    public alpha(String str) {
        runAnimators.ag$a(str, ag$a(Color.blue(0) + 508623249, new char[]{37216, 20729, 13598, 50590}, new char[]{18637, 26786, 26501, 33185}, (char) (Color.rgb(0, 0, 0) + 16817717), new char[]{41626, 29392, 35574, 10971, 34210}).intern());
        this.values = str;
        this.toString = new ArrayList<>();
    }

    public final String values() {
        try {
            int i = ah$b + 123;
            try {
                HaptikSDK$b = i % 128;
                if ((i % 2 != 0 ? (char) 29 : ']') != 29) {
                    return this.values;
                }
                String str = this.values;
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final ArrayList<Object> valueOf() {
        try {
            int i = ah$b + 109;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
            ArrayList<Object> arrayList = this.toString;
            int i3 = ah$b + 69;
            HaptikSDK$b = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 18 : '+') != 18) {
                return arrayList;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return arrayList;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void ag$a(Object obj) {
        try {
            int i = HaptikSDK$b + 77;
            ah$b = i % 128;
            int i2 = i % 2;
            try {
                runAnimators.ag$a(obj, "bankOption");
                this.toString.add(obj);
                int i3 = ah$b + 75;
                HaptikSDK$b = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String ag$a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ valueOf) ^ ag$a) ^ ah$a);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
