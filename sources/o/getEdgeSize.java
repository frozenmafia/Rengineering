package o;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getEdgeSize implements getViewHorizontalDragRange {
    private static long ah$a = -5149680188798953757L;
    private static int ah$b = 1;
    private static int valueOf;
    private final setCurrentTabTag ag$a;
    private final canWrite toString;
    private final findLastMatching values;

    public boolean equals(Object obj) {
        if ((this == obj ? 'E' : '[') != '[') {
            return true;
        }
        if (obj instanceof getEdgeSize) {
            getEdgeSize getedgesize = (getEdgeSize) obj;
            if (!runAnimators.values(this.toString, getedgesize.toString)) {
                int i = ah$b + 85;
                valueOf = i % 128;
                return i % 2 != 0;
            }
            if ((!runAnimators.values(this.values, getedgesize.values) ? '#' : 'N') == '#') {
                int i2 = valueOf + 95;
                ah$b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 33 / 0;
                    return false;
                }
                return false;
            }
            try {
                try {
                    if (!runAnimators.values(this.ag$a, getedgesize.ag$a)) {
                        int i4 = valueOf + 55;
                        ah$b = i4 % 128;
                        if ((i4 % 2 == 0 ? 'c' : '<') != 'c') {
                            return false;
                        }
                    }
                    return true;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = valueOf + 23;
        ah$b = i % 128;
        if (i % 2 == 0) {
            hashCode = (((this.toString.hashCode() / 24) >> this.values.hashCode()) % 27) >> this.ag$a.hashCode();
        } else {
            try {
                hashCode = (((this.toString.hashCode() * 31) + this.values.hashCode()) * 31) + this.ag$a.hashCode();
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = ah$b + 115;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            return hashCode;
        }
        return hashCode;
    }

    public String toString() {
        String str = "ShareAppPermission(_aLLOWED=" + this.toString + ", _installedApps=" + this.values + ", _source=" + this.ag$a + ')';
        int i = valueOf + 63;
        ah$b = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return str;
    }

    public getEdgeSize(canWrite canwrite, findLastMatching findlastmatching, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(canwrite, "_aLLOWED");
        runAnimators.ag$a(findlastmatching, "_installedApps");
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.toString = canwrite;
        this.values = findlastmatching;
        this.ag$a = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ShareAppPermission");
        hashMap.put("ALLOWED", Boolean.valueOf(this.toString.ah$a()));
        hashMap.put("installedApps", this.values.ag$a());
        hashMap.put(ah$a(new char[]{35472, 7780, 35555, 35048, 34316, 43967, 10888, 61011, 53631, 60526}, -TextUtils.lastIndexOf("", '0')).intern(), this.ag$a.ah$a());
        int i = ah$b + 45;
        valueOf = i % 128;
        int i2 = i % 2;
        return hashMap;
    }

    private static String ah$a(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(ah$a, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * ah$a));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
