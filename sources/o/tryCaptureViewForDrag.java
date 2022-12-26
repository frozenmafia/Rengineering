package o;

import android.view.KeyEvent;
import android.widget.ExpandableListView;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class tryCaptureViewForDrag implements getViewHorizontalDragRange {
    private static int HaptikSDK$b = 1;
    private static char ag$a = 0;
    private static int ah$b = 0;
    private static int valueOf = 0;
    private static long values = 2977097899979234298L;
    private final setCurrentTabTag ah$a;
    private final ObservableBoolean toString;

    public boolean equals(Object obj) {
        if ((this == obj ? '=' : 'F') != 'F') {
            int i = ah$b + 91;
            HaptikSDK$b = i % 128;
            return i % 2 != 0;
        } else if (!(obj instanceof tryCaptureViewForDrag)) {
            int i2 = HaptikSDK$b + 41;
            ah$b = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                super.hashCode();
                return false;
            }
            return false;
        } else {
            tryCaptureViewForDrag trycaptureviewfordrag = (tryCaptureViewForDrag) obj;
            if (runAnimators.values(this.toString, trycaptureviewfordrag.toString)) {
                return runAnimators.values(this.ah$a, trycaptureviewfordrag.ah$a);
            }
            try {
                int i3 = HaptikSDK$b + 19;
                try {
                    ah$b = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
        if ((r0 != null) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        r0 = o.tryCaptureViewForDrag.HaptikSDK$b + 59;
        o.tryCaptureViewForDrag.ah$b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        if ((r0 % 2) == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        if ((r0 != null) != true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r4 = this;
            int r0 = o.tryCaptureViewForDrag.HaptikSDK$b
            int r0 = r0 + 39
            int r1 = r0 % 128
            o.tryCaptureViewForDrag.ah$b = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1e
            o.ObservableBoolean r0 = r4.toString
            r3 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L18
            r3 = 0
            goto L19
        L18:
            r3 = 1
        L19:
            if (r3 == r2) goto L27
            goto L2c
        L1c:
            r0 = move-exception
            throw r0
        L1e:
            o.ObservableBoolean r0 = r4.toString
            if (r0 != 0) goto L24
            r3 = 0
            goto L25
        L24:
            r3 = 1
        L25:
            if (r3 == 0) goto L2c
        L27:
            int r1 = r0.hashCode()
            goto L39
        L2c:
            int r0 = o.tryCaptureViewForDrag.HaptikSDK$b
            int r0 = r0 + 59
            int r3 = r0 % 128
            o.tryCaptureViewForDrag.ah$b = r3
            int r0 = r0 % 2
            if (r0 == 0) goto L39
            r1 = 1
        L39:
            int r1 = r1 * 31
            o.setCurrentTabTag r0 = r4.ah$a
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r0 = o.tryCaptureViewForDrag.ah$b
            int r0 = r0 + 109
            int r2 = r0 % 128
            o.tryCaptureViewForDrag.HaptikSDK$b = r2
            int r0 = r0 % 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryCaptureViewForDrag.hashCode():int");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("TeamNameChangeScreenLoaded(_currentTeamName=");
            sb.append(this.toString);
            sb.append(", _source=");
            sb.append(this.ah$a);
            sb.append(')');
            String sb2 = sb.toString();
            int i = HaptikSDK$b + 69;
            ah$b = i % 128;
            int i2 = i % 2;
            return sb2;
        } catch (Exception e) {
            throw e;
        }
    }

    public tryCaptureViewForDrag(ObservableBoolean observableBoolean, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.toString = observableBoolean;
        this.ah$a = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "TeamNameChangeScreenLoaded");
        ObservableBoolean observableBoolean = this.toString;
        if ((observableBoolean != null ? ':' : '5') != '5') {
            int i = HaptikSDK$b + 11;
            ah$b = i % 128;
            int i2 = i % 2;
            hashMap.put("currentTeamName", observableBoolean.ah$a());
            int i3 = HaptikSDK$b + 1;
            ah$b = i3 % 128;
            int i4 = i3 % 2;
        }
        hashMap.put(ag$a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{32915, 15737, 33315, 9788}, new char[]{56314, 17874, 50884, 10576}, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 15491), new char[]{13023, 27568, 28553, 56298, 27191, 32429}).intern(), this.ah$a.ah$a());
        return hashMap;
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
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ values) ^ valueOf) ^ ag$a);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
