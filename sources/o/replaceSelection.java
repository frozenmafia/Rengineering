package o;

import android.widget.ExpandableListView;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class replaceSelection implements getViewHorizontalDragRange {
    private static boolean HaptikSDK$a = true;
    private static int HaptikSDK$b = 0;
    private static int ah$b = 1;
    private static boolean invoke = true;
    private static int valueOf = 3;
    private static char[] values = {'v', 'r', 'x', 'u', 'f', 'h'};
    private final ObservableInt ag$a;
    private final setContentPaddingBottom ah$a;
    private final setCurrentTabTag toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if ((!(obj instanceof replaceSelection) ? 'V' : '&') == 'V') {
                int i = ah$b + 115;
                HaptikSDK$b = i % 128;
                int i2 = i % 2;
                return false;
            }
            replaceSelection replaceselection = (replaceSelection) obj;
            if (runAnimators.values(this.ag$a, replaceselection.ag$a)) {
                if (!(!runAnimators.values(this.ah$a, replaceselection.ah$a))) {
                    try {
                        return runAnimators.values(this.toString, replaceselection.toString);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                return false;
            }
            int i3 = HaptikSDK$b + 85;
            ah$b = i3 % 128;
            int i4 = i3 % 2;
            int i5 = HaptikSDK$b + 87;
            ah$b = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            super.hashCode();
            return false;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            int r0 = o.replaceSelection.HaptikSDK$b
            int r0 = r0 + 37
            int r1 = r0 % 128
            o.replaceSelection.ah$b = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L16
            o.ObservableInt r0 = r6.ag$a
            if (r0 != 0) goto L14
            r0 = 1
            goto L21
        L14:
            r1 = 1
            goto L31
        L16:
            o.ObservableInt r0 = r6.ag$a
            if (r0 != 0) goto L1d
            r3 = 56
            goto L1e
        L1d:
            r3 = 1
        L1e:
            if (r3 == r2) goto L31
            r0 = 0
        L21:
            int r3 = o.replaceSelection.HaptikSDK$b
            int r3 = r3 + 29
            int r4 = r3 % 128
            o.replaceSelection.ah$b = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L2e
            goto L2f
        L2e:
            r1 = 1
        L2f:
            r1 = r1 ^ r2
            goto L38
        L31:
            int r0 = r0.hashCode()
            r5 = r1
            r1 = r0
            r0 = r5
        L38:
            o.setContentPaddingBottom r2 = r6.ah$a
            if (r2 != 0) goto L3d
            goto L41
        L3d:
            int r0 = r2.hashCode()
        L41:
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            o.setCurrentTabTag r0 = r6.toString
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.replaceSelection.hashCode():int");
    }

    public String toString() {
        String str = "GlobalSearchClicked(_discoverability_status=" + this.ag$a + ", _phonebook_sync_status=" + this.ah$a + ", _source=" + this.toString + ')';
        int i = ah$b + 41;
        HaptikSDK$b = i % 128;
        if (i % 2 != 0) {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    public replaceSelection(ObservableInt observableInt, setContentPaddingBottom setcontentpaddingbottom, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.ag$a = observableInt;
        this.ah$a = setcontentpaddingbottom;
        this.toString = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "GlobalSearchClicked");
        ObservableInt observableInt = this.ag$a;
        if ((observableInt != null ? 'E' : 'O') == 'E') {
            int i = ah$b + 123;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
            hashMap.put("discoverability_status", Integer.valueOf(observableInt.ag$a()));
        }
        setContentPaddingBottom setcontentpaddingbottom = this.ah$a;
        if (!(setcontentpaddingbottom == null)) {
            int i3 = HaptikSDK$b + 91;
            ah$b = i3 % 128;
            int i4 = i3 % 2;
            hashMap.put("phonebook_sync_status", Integer.valueOf(setcontentpaddingbottom.values()));
        }
        hashMap.put(values(null, null, 126 - ExpandableListView.getPackedPositionChild(0L), new byte[]{-122, -123, -124, -125, -126, -127}).intern(), this.toString.ah$a());
        return hashMap;
    }

    private static String values(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = values;
            int i2 = valueOf;
            if (HaptikSDK$a) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (invoke) {
                int length2 = cArr.length;
                isLast.values = length2;
                char[] cArr4 = new char[length2];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr4);
            } else {
                int length3 = iArr.length;
                isLast.values = length3;
                char[] cArr5 = new char[length3];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr5);
            }
        }
    }
}
