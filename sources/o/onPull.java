package o;

import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class onPull implements getViewHorizontalDragRange {
    private static int HaptikSDK$a = 0;
    private static char HaptikSDK$c = 0;
    private static int invoke = 1;
    private static long valueOf = -5608807068863642937L;
    private static int values;
    private final getRawType ag$a;
    private final ObservableLong ah$a;
    private final setCurrentTabTag toString;

    public onPull() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
        if (r4 == r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
        r5 = o.onPull.invoke + 97;
        o.onPull.HaptikSDK$a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
        if ((r5 instanceof o.onPull) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
        r5 = (o.onPull) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (o.runAnimators.values(r4.ag$a, r5.ag$a) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
        if (r0 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (o.runAnimators.values(r4.ah$a, r5.ah$a) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
        if (o.runAnimators.values(r4.toString, r5.toString) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
        if (r5 == true) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
        r5 = o.onPull.HaptikSDK$a + 61;
        o.onPull.invoke = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
        if ((r5 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
        if (r2 == true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0062, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
        r5 = r5.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0065, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0068, code lost:
        r5 = o.onPull.invoke + 11;
        o.onPull.HaptikSDK$a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
        r5 = o.onPull.invoke + 29;
        o.onPull.HaptikSDK$a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007d, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r4 == r5) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = o.onPull.invoke     // Catch: java.lang.Exception -> L80
            int r0 = r0 + 95
            int r1 = r0 % 128
            o.onPull.HaptikSDK$a = r1     // Catch: java.lang.Exception -> L7e
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            r0 = 65
            int r0 = r0 / r2
            if (r4 != r5) goto L23
            goto L18
        L14:
            r5 = move-exception
            throw r5
        L16:
            if (r4 != r5) goto L23
        L18:
            int r5 = o.onPull.invoke
            int r5 = r5 + 97
            int r0 = r5 % 128
            o.onPull.HaptikSDK$a = r0
            int r5 = r5 % 2
            return r1
        L23:
            boolean r0 = r5 instanceof o.onPull
            if (r0 != 0) goto L28
            return r2
        L28:
            o.onPull r5 = (o.onPull) r5
            o.getRawType r0 = r4.ag$a
            o.getRawType r3 = r5.ag$a
            boolean r0 = o.runAnimators.values(r0, r3)
            if (r0 != 0) goto L36
            r0 = 0
            goto L37
        L36:
            r0 = 1
        L37:
            if (r0 == 0) goto L73
            o.ObservableLong r0 = r4.ah$a
            o.ObservableLong r3 = r5.ah$a
            boolean r0 = o.runAnimators.values(r0, r3)
            if (r0 != 0) goto L44
            return r2
        L44:
            o.setCurrentTabTag r0 = r4.toString
            o.setCurrentTabTag r5 = r5.toString
            boolean r5 = o.runAnimators.values(r0, r5)
            if (r5 != 0) goto L50
            r5 = 1
            goto L51
        L50:
            r5 = 0
        L51:
            if (r5 == r1) goto L68
            int r5 = o.onPull.HaptikSDK$a
            int r5 = r5 + 61
            int r0 = r5 % 128
            o.onPull.invoke = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L60
            r2 = 1
        L60:
            if (r2 == r1) goto L63
            return r1
        L63:
            r5 = 0
            int r5 = r5.length     // Catch: java.lang.Throwable -> L66
            return r1
        L66:
            r5 = move-exception
            throw r5
        L68:
            int r5 = o.onPull.invoke
            int r5 = r5 + 11
            int r0 = r5 % 128
            o.onPull.HaptikSDK$a = r0
            int r5 = r5 % 2
            return r2
        L73:
            int r5 = o.onPull.invoke
            int r5 = r5 + 29
            int r0 = r5 % 128
            o.onPull.HaptikSDK$a = r0
            int r5 = r5 % 2
            return r2
        L7e:
            r5 = move-exception
            throw r5
        L80:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onPull.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if ((r0 == null ? '9' : 26) != '9') goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
        if (r0 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
        r2 = o.onPull.invoke + 27;
        o.onPull.HaptikSDK$a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        r2 = r5.ah$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r2 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
        r2 = r2.hashCode();
        r3 = o.onPull.invoke + 69;
        o.onPull.HaptikSDK$a = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
        r3 = r5.toString;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
        if (r3 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
        r1 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        return (((r0 * 31) + r2) * 31) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            int r0 = o.onPull.HaptikSDK$a
            int r0 = r0 + 19
            int r1 = r0 % 128
            o.onPull.invoke = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L22
            o.getRawType r0 = r5.ag$a     // Catch: java.lang.Exception -> L20
            r2 = 57
            if (r0 != 0) goto L1b
            r3 = 57
            goto L1d
        L1b:
            r3 = 26
        L1d:
            if (r3 == r2) goto L26
            goto L28
        L20:
            r0 = move-exception
            goto L5c
        L22:
            o.getRawType r0 = r5.ag$a
            if (r0 != 0) goto L28
        L26:
            r0 = 0
            goto L36
        L28:
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L20
            int r2 = o.onPull.invoke
            int r2 = r2 + 27
            int r3 = r2 % 128
            o.onPull.HaptikSDK$a = r3
            int r2 = r2 % 2
        L36:
            o.ObservableLong r2 = r5.ah$a     // Catch: java.lang.Exception -> L5a
            if (r2 != 0) goto L3c
            r2 = 0
            goto L4a
        L3c:
            int r2 = r2.hashCode()
            int r3 = o.onPull.invoke
            int r3 = r3 + 69
            int r4 = r3 % 128
            o.onPull.HaptikSDK$a = r4
            int r3 = r3 % 2
        L4a:
            o.setCurrentTabTag r3 = r5.toString
            if (r3 != 0) goto L4f
            goto L53
        L4f:
            int r1 = r3.hashCode()
        L53:
            int r0 = r0 * 31
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r0 = r0 + r1
            return r0
        L5a:
            r0 = move-exception
            throw r0
        L5c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onPull.hashCode():int");
    }

    public String toString() {
        String str = "AppBackgroundCompleted(_screenName=" + this.ag$a + ", _event=" + this.ah$a + ", _source=" + this.toString + ')';
        int i = HaptikSDK$a + 29;
        invoke = i % 128;
        int i2 = i % 2;
        return str;
    }

    public onPull(getRawType getrawtype, ObservableLong observableLong, setCurrentTabTag setcurrenttabtag) {
        this.ag$a = getrawtype;
        this.ah$a = observableLong;
        this.toString = setcurrenttabtag;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ onPull(o.getRawType r3, o.ObservableLong r4, o.setCurrentTabTag r5, int r6, o.getTargetTypes r7) {
        /*
            r2 = this;
            r7 = r6 & 1
            r0 = 43
            if (r7 == 0) goto L9
            r7 = 43
            goto Lb
        L9:
            r7 = 35
        Lb:
            r1 = 0
            if (r7 == r0) goto Lf
            goto L1a
        Lf:
            int r3 = o.onPull.HaptikSDK$a
            int r3 = r3 + 81
            int r7 = r3 % 128
            o.onPull.invoke = r7
            int r3 = r3 % 2
            r3 = r1
        L1a:
            r7 = r6 & 2
            if (r7 == 0) goto L20
            r7 = 1
            goto L21
        L20:
            r7 = 0
        L21:
            if (r7 == 0) goto L31
            int r4 = o.onPull.HaptikSDK$a     // Catch: java.lang.Exception -> L2f
            int r4 = r4 + 69
            int r7 = r4 % 128
            o.onPull.invoke = r7     // Catch: java.lang.Exception -> L2f
            int r4 = r4 % 2
            r4 = r1
            goto L31
        L2f:
            r3 = move-exception
            throw r3
        L31:
            r6 = r6 & 4
            if (r6 == 0) goto L43
            int r5 = o.onPull.invoke     // Catch: java.lang.Exception -> L41
            int r5 = r5 + 61
            int r6 = r5 % 128
            o.onPull.HaptikSDK$a = r6     // Catch: java.lang.Exception -> L41
            int r5 = r5 % 2
            r5 = r1
            goto L43
        L41:
            r3 = move-exception
            throw r3
        L43:
            r2.<init>(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onPull.<init>(o.getRawType, o.ObservableLong, o.setCurrentTabTag, int, o.getTargetTypes):void");
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "AppBackgroundCompleted");
        getRawType getrawtype = this.ag$a;
        if (getrawtype != null) {
            hashMap.put("ScreenName", getrawtype.ag$a());
        }
        ObservableLong observableLong = this.ah$a;
        if (observableLong != null) {
            int i = invoke + 107;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            hashMap.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, observableLong.values());
        }
        setCurrentTabTag setcurrenttabtag = this.toString;
        if ((setcurrenttabtag != null ? 'L' : 'W') == 'L') {
            hashMap.put(valueOf(1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{38059, 46948, 53105, 26528}, new char[]{49863, 1710, 33712, 45609}, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41166), new char[]{41188, 32618, 48916, 39862, 29900, 10177}).intern(), setcurrenttabtag.ah$a());
            int i3 = invoke + 29;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
        }
        return hashMap;
    }

    private static String valueOf(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
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
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ valueOf) ^ values) ^ HaptikSDK$c);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
