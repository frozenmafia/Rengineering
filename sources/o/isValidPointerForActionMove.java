package o;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class isValidPointerForActionMove implements getViewHorizontalDragRange {
    private static int ag$a = 0;
    private static int toString = 1;
    private static long valueOf = 8054471468267965175L;
    private final setCurrentTabTag ah$a;
    private final setCheckedButton values;

    public boolean equals(Object obj) {
        try {
            int i = toString + 43;
            ag$a = i % 128;
            int i2 = i % 2;
            if ((this == obj ? 'W' : '.') != '.') {
                return true;
            }
            if (!(obj instanceof isValidPointerForActionMove)) {
                int i3 = toString + 97;
                ag$a = i3 % 128;
                return i3 % 2 != 0;
            }
            isValidPointerForActionMove isvalidpointerforactionmove = (isValidPointerForActionMove) obj;
            if (!runAnimators.values(this.values, isvalidpointerforactionmove.values)) {
                int i4 = toString + 25;
                ag$a = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            try {
                if ((!runAnimators.values(this.ah$a, isvalidpointerforactionmove.ah$a) ? (char) 5 : '(') == 5) {
                    int i6 = ag$a + 113;
                    toString = i6 % 128;
                    return i6 % 2 == 0;
                }
                int i7 = toString + 71;
                ag$a = i7 % 128;
                int i8 = i7 % 2;
                return true;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int hashCode;
        try {
            int i = ag$a + 91;
            toString = i % 128;
            int i2 = i % 2;
            int hashCode2 = this.values.hashCode();
            setCurrentTabTag setcurrenttabtag = this.ah$a;
            if ((setcurrenttabtag == null ? (char) 6 : ':') != ':') {
                int i3 = ag$a + 75;
                toString = i3 % 128;
                hashCode = (i3 % 2 == 0 ? TokenParser.ESCAPE : 'G') != 'G' ? 1 : 0;
            } else {
                hashCode = setcurrenttabtag.hashCode();
            }
            int i4 = (hashCode2 * 31) + hashCode;
            int i5 = ag$a + 23;
            toString = i5 % 128;
            if (!(i5 % 2 != 0)) {
                Object obj = null;
                super.hashCode();
                return i4;
            }
            return i4;
        } catch (Exception e) {
            throw e;
        }
    }

    public String toString() {
        String str = "RequestCenterOpened(_request_count=" + this.values + ", _source=" + this.ah$a + ')';
        int i = ag$a + 21;
        toString = i % 128;
        int i2 = i % 2;
        return str;
    }

    public isValidPointerForActionMove(setCheckedButton setcheckedbutton, setCurrentTabTag setcurrenttabtag) {
        try {
            runAnimators.ag$a(setcheckedbutton, "_request_count");
            this.values = setcheckedbutton;
            this.ah$a = setcurrenttabtag;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "RequestCenterOpened");
        hashMap.put("request_count", Integer.valueOf(this.values.valueOf()));
        setCurrentTabTag setcurrenttabtag = this.ah$a;
        if ((setcurrenttabtag != null ? '/' : '\f') == '/') {
            int i = ag$a + 109;
            toString = i % 128;
            hashMap.put(((i % 2 == 0 ? '(' : 'Q') != '(' ? valueOf(new char[]{35460, 60841, 17632, 48918, 5712, 35175}, KeyEvent.getDeadChar(0, 0) + 26417) : valueOf(new char[]{35460, 60841, 17632, 48918, 5712, 35175}, 32361 >> KeyEvent.getDeadChar(0, 0))).intern(), setcurrenttabtag.ah$a());
            int i2 = ag$a + 75;
            toString = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = ag$a + 67;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return hashMap;
    }

    private static String valueOf(char[] cArr, int i) {
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
