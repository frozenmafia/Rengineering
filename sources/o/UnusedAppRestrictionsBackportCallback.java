package o;

import android.text.TextUtils;
import java.util.List;
/* loaded from: classes3.dex */
public final class UnusedAppRestrictionsBackportCallback {
    private static int invoke = 1;
    private static long valueOf = -5075501400201760408L;
    private static int values;
    private final String ag$a;
    private final List<edit> ah$a;
    private final String toString;

    public boolean equals(Object obj) {
        try {
            if ((this == obj ? 'C' : '6') != '6') {
                try {
                    int i = invoke + 29;
                    values = i % 128;
                    return i % 2 == 0;
                } catch (Exception e) {
                    throw e;
                }
            }
            if (!(obj instanceof UnusedAppRestrictionsBackportCallback)) {
                int i2 = values + 65;
                invoke = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            UnusedAppRestrictionsBackportCallback unusedAppRestrictionsBackportCallback = (UnusedAppRestrictionsBackportCallback) obj;
            if (!runAnimators.values((Object) this.toString, (Object) unusedAppRestrictionsBackportCallback.toString)) {
                int i4 = values + 81;
                invoke = i4 % 128;
                return i4 % 2 == 0;
            } else if (runAnimators.values((Object) this.ag$a, (Object) unusedAppRestrictionsBackportCallback.ag$a)) {
                return (!runAnimators.values(this.ah$a, unusedAppRestrictionsBackportCallback.ah$a) ? 'W' : '!') != 'W';
            } else {
                return false;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = invoke + 107;
        values = i % 128;
        return i % 2 != 0 ? (((this.toString.hashCode() + 26) * this.ag$a.hashCode()) / 108) - this.ah$a.hashCode() : (((this.toString.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        String str = "TitleAndTagsModel(title=" + this.toString + ", emptyStateTitle=" + this.ag$a + ", teamTagList=" + this.ah$a + ")";
        int i = values + 31;
        invoke = i % 128;
        if ((i % 2 == 0 ? 'Z' : 'A') != 'Z') {
            return str;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public UnusedAppRestrictionsBackportCallback(String str, String str2, List<edit> list) {
        runAnimators.ag$a(str, valueOf(new char[]{55142, 40733, 16083, 55058, 34429, 28188, 56439, 21033, 4771}, TextUtils.indexOf("", "", 0, 0)).intern());
        runAnimators.ag$a(str2, "emptyStateTitle");
        runAnimators.ag$a(list, "teamTagList");
        this.toString = str;
        this.ag$a = str2;
        this.ah$a = list;
    }

    public final String ah$a() {
        try {
            int i = invoke + 3;
            try {
                values = i % 128;
                int i2 = i % 2;
                String str = this.ag$a;
                int i3 = values + 55;
                invoke = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final List<edit> valueOf() {
        int i = values + 47;
        invoke = i % 128;
        if (i % 2 == 0) {
            List<edit> list = this.ah$a;
            Object[] objArr = null;
            int length = objArr.length;
            return list;
        }
        return this.ah$a;
    }

    public final String values() {
        String str;
        int i = invoke + 95;
        values = i % 128;
        if (i % 2 != 0) {
            try {
                str = this.toString;
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.toString;
        }
        int i2 = values + 109;
        invoke = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(valueOf, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * valueOf));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
