package o;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class notifyVerticalEdgeReached implements getViewHorizontalDragRange {
    private static int HaptikSDK$a = -140114395;
    private static int HaptikSDK$b = 0;
    private static byte[] HaptikSDK$c = {-1, -112, 99, 111, -108, 110};
    private static int ag$a = -952395211;
    private static int ah$b = 1;
    private static short[] invoke = null;
    private static int values = 7;
    private final ObservableBoolean ah$a;
    private final setCurrentTabTag toString;
    private final haveContentsChanged valueOf;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r4 == r5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        if ((r5 instanceof o.notifyVerticalEdgeReached) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0020, code lost:
        if (r0 == true) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
        r5 = (o.notifyVerticalEdgeReached) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (o.runAnimators.values(r4.ah$a, r5.ah$a) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
        if (o.runAnimators.values(r4.toString, r5.toString) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        r5 = o.notifyVerticalEdgeReached.HaptikSDK$b + 17;
        o.notifyVerticalEdgeReached.ah$b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        if ((r5 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
        r5 = '4';
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        r5 = 'a';
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
        if (r5 == 'a') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
        r5 = r5.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
        if (o.runAnimators.values(r4.valueOf, r5.valueOf) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
        r5 = o.notifyVerticalEdgeReached.ah$b + 125;
        o.notifyVerticalEdgeReached.HaptikSDK$b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
        if ((r5 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006d, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006e, code lost:
        r5 = o.notifyVerticalEdgeReached.ah$b + 71;
        o.notifyVerticalEdgeReached.HaptikSDK$b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0078, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r4 == r5) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = o.notifyVerticalEdgeReached.ah$b     // Catch: java.lang.Exception -> L79
            int r0 = r0 + 35
            int r1 = r0 % 128
            o.notifyVerticalEdgeReached.HaptikSDK$b = r1     // Catch: java.lang.Exception -> L79
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            r0 = 74
            int r0 = r0 / r2
            if (r4 != r5) goto L19
            goto L18
        L14:
            r5 = move-exception
            throw r5
        L16:
            if (r4 != r5) goto L19
        L18:
            return r1
        L19:
            boolean r0 = r5 instanceof o.notifyVerticalEdgeReached
            if (r0 != 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == r1) goto L6e
            o.notifyVerticalEdgeReached r5 = (o.notifyVerticalEdgeReached) r5
            o.ObservableBoolean r0 = r4.ah$a
            o.ObservableBoolean r3 = r5.ah$a
            boolean r0 = o.runAnimators.values(r0, r3)
            if (r0 != 0) goto L2f
            return r2
        L2f:
            o.setCurrentTabTag r0 = r4.toString
            o.setCurrentTabTag r3 = r5.toString
            boolean r0 = o.runAnimators.values(r0, r3)
            if (r0 != 0) goto L54
            int r5 = o.notifyVerticalEdgeReached.HaptikSDK$b
            int r5 = r5 + 17
            int r0 = r5 % 128
            o.notifyVerticalEdgeReached.ah$b = r0
            int r5 = r5 % 2
            r0 = 97
            if (r5 != 0) goto L4a
            r5 = 52
            goto L4c
        L4a:
            r5 = 97
        L4c:
            if (r5 == r0) goto L53
            r5 = 0
            int r5 = r5.length     // Catch: java.lang.Throwable -> L51
            return r2
        L51:
            r5 = move-exception
            throw r5
        L53:
            return r2
        L54:
            o.haveContentsChanged r0 = r4.valueOf
            o.haveContentsChanged r5 = r5.valueOf
            boolean r5 = o.runAnimators.values(r0, r5)
            if (r5 != 0) goto L6d
            int r5 = o.notifyVerticalEdgeReached.ah$b
            int r5 = r5 + 125
            int r0 = r5 % 128
            o.notifyVerticalEdgeReached.HaptikSDK$b = r0
            int r5 = r5 % 2
            if (r5 == 0) goto L6b
            goto L6c
        L6b:
            r1 = 0
        L6c:
            return r2
        L6d:
            return r1
        L6e:
            int r5 = o.notifyVerticalEdgeReached.ah$b
            int r5 = r5 + 71
            int r0 = r5 % 128
            o.notifyVerticalEdgeReached.HaptikSDK$b = r0
            int r5 = r5 % 2
            return r2
        L79:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.notifyVerticalEdgeReached.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode;
        int i = ah$b + 5;
        HaptikSDK$b = i % 128;
        if (!(i % 2 != 0)) {
            hashCode = (((this.ah$a.hashCode() * 31) + this.toString.hashCode()) * 31) + this.valueOf.hashCode();
        } else {
            try {
                hashCode = (((this.ah$a.hashCode() * 77) << this.toString.hashCode()) << 68) / this.valueOf.hashCode();
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = ah$b + 15;
        HaptikSDK$b = i2 % 128;
        int i3 = i2 % 2;
        return hashCode;
    }

    public String toString() {
        String str = "EditTeamNameBandInteracted(_currentTeamName=" + this.ah$a + ", _source=" + this.toString + ", _status=" + this.valueOf + ')';
        try {
            int i = HaptikSDK$b + 35;
            ah$b = i % 128;
            if (i % 2 == 0) {
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public notifyVerticalEdgeReached(ObservableBoolean observableBoolean, setCurrentTabTag setcurrenttabtag, haveContentsChanged havecontentschanged) {
        runAnimators.ag$a(observableBoolean, "_currentTeamName");
        runAnimators.ag$a(setcurrenttabtag, "_source");
        runAnimators.ag$a(havecontentschanged, "_status");
        this.ah$a = observableBoolean;
        this.toString = setcurrenttabtag;
        this.valueOf = havecontentschanged;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "EditTeamNameBandInteracted");
        hashMap.put("currentTeamName", this.ah$a.ah$a());
        hashMap.put(values((byte) ((-109) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) - 8, 140114509 - TextUtils.indexOf((CharSequence) "", '0', 0), (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 952395211 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), this.toString.ah$a());
        hashMap.put("status", this.valueOf.ag$a());
        int i = ah$b + 87;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        return hashMap;
    }

    private static String values(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + values;
            boolean z = i4 == -1;
            if (z) {
                if (HaptikSDK$c != null) {
                    i4 = (byte) (HaptikSDK$c[ag$a + i3] + values);
                } else {
                    i4 = (short) (invoke[ag$a + i3] + values);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + ag$a + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + HaptikSDK$a);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (HaptikSDK$c != null) {
                        byte[] bArr = HaptikSDK$c;
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
