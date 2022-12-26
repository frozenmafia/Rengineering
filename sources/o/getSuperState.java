package o;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getSuperState implements getViewHorizontalDragRange {
    private static long ah$a = -1941922464405050144L;
    private static int valueOf = 0;
    private static int values = 1;
    private final processReferenceQueue ag$a;
    private final ObservableShort toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSuperState)) {
            int i = valueOf + 89;
            values = i % 128;
            int i2 = i % 2;
            return false;
        }
        try {
            getSuperState getsuperstate = (getSuperState) obj;
            if (!runAnimators.values(this.toString, getsuperstate.toString)) {
                int i3 = valueOf + 113;
                values = i3 % 128;
                return i3 % 2 == 0;
            } else if (runAnimators.values(this.ag$a, getsuperstate.ag$a)) {
                return true;
            } else {
                int i4 = values + 91;
                valueOf = i4 % 128;
                return i4 % 2 != 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public int hashCode() {
        ObservableShort observableShort = this.toString;
        int i = 0;
        if (observableShort != null) {
            i = observableShort.hashCode();
            try {
                int i2 = valueOf + 121;
                values = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i4 = valueOf + 17;
            values = i4 % 128;
            if (i4 % 2 == 0) {
            }
        }
        return (i * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("MatchCenterLoaded(_flow=");
            sb.append(this.toString);
            sb.append(", _isGroupContestFlow=");
            sb.append(this.ag$a);
            sb.append(')');
            String sb2 = sb.toString();
            int i = valueOf + 51;
            values = i % 128;
            int i2 = i % 2;
            return sb2;
        } catch (Exception e) {
            throw e;
        }
    }

    public getSuperState(ObservableShort observableShort, processReferenceQueue processreferencequeue) {
        try {
            runAnimators.ag$a(processreferencequeue, "_isGroupContestFlow");
            this.toString = observableShort;
            this.ag$a = processreferencequeue;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "MatchCenterLoaded");
        ObservableShort observableShort = this.toString;
        if (!(observableShort == null)) {
            int i = values + 121;
            valueOf = i % 128;
            hashMap.put(((i % 2 != 0 ? '<' : 'A') != '<' ? ag$a(new char[]{20981, 12740, 30088, 55199, 20883, 7496, 11303, 20808}, View.MeasureSpec.getMode(0)) : ag$a(new char[]{20981, 12740, 30088, 55199, 20883, 7496, 11303, 20808}, View.MeasureSpec.getMode(0))).intern(), observableShort.valueOf());
        }
        hashMap.put("isGroupContestFlow", Boolean.valueOf(this.ag$a.valueOf()));
        int i2 = values + 27;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        return hashMap;
    }

    private static String ag$a(char[] cArr, int i) {
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
