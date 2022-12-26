package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class isEdgeTouched implements getViewHorizontalDragRange {
    private static char[] ag$a = {'s', 32604, 65043, 32235, 64687, 31642};
    private static long toString = -5132587120796401869L;
    private static int valueOf = 1;
    private static int values;
    private final setCurrentTabTag ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            int i = values + 109;
            valueOf = i % 128;
            int i2 = i % 2;
            int i3 = values + 93;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if ((!(obj instanceof isEdgeTouched) ? 'Z' : 'V') == 'Z') {
            int i5 = valueOf + 123;
            values = i5 % 128;
            return i5 % 2 != 0;
        }
        try {
            try {
                if (runAnimators.values(this.ah$a, ((isEdgeTouched) obj).ah$a)) {
                    return true;
                }
                int i6 = valueOf + 83;
                values = i6 % 128;
                if (i6 % 2 != 0) {
                }
                return false;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = values + 59;
        valueOf = i % 128;
        int i2 = i % 2;
        int hashCode = this.ah$a.hashCode();
        try {
            int i3 = values + 121;
            valueOf = i3 % 128;
            if ((i3 % 2 == 0 ? 'O' : '^') != '^') {
                Object obj = null;
                super.hashCode();
                return hashCode;
            }
            return hashCode;
        } catch (Exception e) {
            throw e;
        }
    }

    public String toString() {
        String str = "SideDrawerSelected(_source=" + this.ah$a + ')';
        try {
            int i = values + 25;
            valueOf = i % 128;
            if (!(i % 2 == 0)) {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public isEdgeTouched(setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.ah$a = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        try {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("eventName", "SideDrawerSelected");
                hashMap.put(ah$a(TextUtils.indexOf("", "") + 6, (-1) - ImageFormat.getBitsPerPixel(0), (char) Color.argb(0, 0, 0, 0)).intern(), this.ah$a.ah$a());
                int i = valueOf + 81;
                values = i % 128;
                int i2 = i % 2;
                return hashMap;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String ah$a(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((ag$a[move.values + i2] ^ (move.values * toString)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
