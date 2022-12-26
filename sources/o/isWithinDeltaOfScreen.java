package o;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class isWithinDeltaOfScreen implements getViewHorizontalDragRange {
    private static int HaptikSDK$a = 1;
    private static byte[] HaptikSDK$b = {2, -11, 6, 10, -15, 11};
    private static int HaptikSDK$c = 0;
    private static int ag$a = 1063204496;
    private static int ah$a = 4;
    private static short[] invoke = null;
    private static int valueOf = -1460180931;
    private final emit toString;
    private final setCurrentTabTag values;

    public boolean equals(Object obj) {
        if ((this == obj ? '+' : 'Y') != 'Y') {
            return true;
        }
        try {
            if ((!(obj instanceof isWithinDeltaOfScreen) ? '8' : '(') != '(') {
                int i = HaptikSDK$c + 41;
                HaptikSDK$a = i % 128;
                int i2 = i % 2;
                return false;
            }
            isWithinDeltaOfScreen iswithindeltaofscreen = (isWithinDeltaOfScreen) obj;
            if (runAnimators.values(this.toString, iswithindeltaofscreen.toString)) {
                if ((!runAnimators.values(this.values, iswithindeltaofscreen.values) ? '9' : 'c') != 'c') {
                    int i3 = HaptikSDK$c + 33;
                    HaptikSDK$a = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                return true;
            }
            int i5 = HaptikSDK$a + 17;
            HaptikSDK$c = i5 % 128;
            int i6 = i5 % 2;
            try {
                int i7 = HaptikSDK$c + 55;
                HaptikSDK$a = i7 % 128;
                int i8 = i7 % 2;
                return false;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        if ((r1 == null ? '<' : '>') != '<') goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        r1 = o.isWithinDeltaOfScreen.HaptikSDK$c + 105;
        o.isWithinDeltaOfScreen.HaptikSDK$a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        if ((r1 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
        r2 = r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
        r1 = o.isWithinDeltaOfScreen.HaptikSDK$c + 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        o.isWithinDeltaOfScreen.HaptikSDK$a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            int r0 = o.isWithinDeltaOfScreen.HaptikSDK$c
            int r0 = r0 + 107
            int r1 = r0 % 128
            o.isWithinDeltaOfScreen.HaptikSDK$a = r1
            int r0 = r0 % 2
            r1 = 10
            if (r0 != 0) goto L11
            r0 = 8
            goto L13
        L11:
            r0 = 10
        L13:
            r2 = 0
            if (r0 == r1) goto L2f
            o.emit r0 = r5.toString
            int r0 = r0.hashCode()
            o.setCurrentTabTag r1 = r5.values
            r3 = 27
            int r3 = r3 / r2
            r3 = 60
            if (r1 != 0) goto L28
            r4 = 60
            goto L2a
        L28:
            r4 = 62
        L2a:
            if (r4 == r3) goto L39
            goto L4b
        L2d:
            r0 = move-exception
            throw r0
        L2f:
            o.emit r0 = r5.toString
            int r0 = r0.hashCode()
            o.setCurrentTabTag r1 = r5.values
            if (r1 != 0) goto L4b
        L39:
            int r1 = o.isWithinDeltaOfScreen.HaptikSDK$c     // Catch: java.lang.Exception -> L49
            int r1 = r1 + 105
            int r3 = r1 % 128
            o.isWithinDeltaOfScreen.HaptikSDK$a = r3     // Catch: java.lang.Exception -> L49
            int r1 = r1 % 2
            if (r1 != 0) goto L47
            r1 = 1
            goto L59
        L47:
            r1 = 0
            goto L59
        L49:
            r0 = move-exception
            goto L5f
        L4b:
            int r2 = r1.hashCode()
            int r1 = o.isWithinDeltaOfScreen.HaptikSDK$c     // Catch: java.lang.Exception -> L49
            int r1 = r1 + 37
            int r3 = r1 % 128
            o.isWithinDeltaOfScreen.HaptikSDK$a = r3     // Catch: java.lang.Exception -> L5d
            int r1 = r1 % 2
        L59:
            int r0 = r0 * 31
            int r0 = r0 + r2
            return r0
        L5d:
            r0 = move-exception
            throw r0
        L5f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isWithinDeltaOfScreen.hashCode():int");
    }

    public String toString() {
        String str = "ChatTabFabClicked(_noOfChannels=" + this.toString + ", _source=" + this.values + ')';
        int i = HaptikSDK$c + 65;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        return str;
    }

    public isWithinDeltaOfScreen(emit emitVar, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(emitVar, "_noOfChannels");
        this.toString = emitVar;
        this.values = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ChatTabFabClicked");
        hashMap.put("noOfChannels", Integer.valueOf(this.toString.ag$a()));
        setCurrentTabTag setcurrenttabtag = this.values;
        if ((setcurrenttabtag != null ? '^' : '\"') == '^') {
            int i = HaptikSDK$c + 95;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            hashMap.put(valueOf((byte) ((-9) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (-5) - Drawable.resolveOpacity(0, 0), 1460181046 - TextUtils.getTrimmedLength(""), (short) ExpandableListView.getPackedPositionGroup(0L), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1063204497).intern(), setcurrenttabtag.ah$a());
            int i3 = HaptikSDK$c + 91;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
        }
        return hashMap;
    }

    private static String valueOf(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + ah$a;
            boolean z = i4 == -1;
            if (z) {
                if (HaptikSDK$b != null) {
                    i4 = (byte) (HaptikSDK$b[ag$a + i3] + ah$a);
                } else {
                    i4 = (short) (invoke[ag$a + i3] + ah$a);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + ag$a + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + valueOf);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (HaptikSDK$b != null) {
                        byte[] bArr = HaptikSDK$b;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = invoke;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
