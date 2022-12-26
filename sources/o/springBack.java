package o;

import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class springBack implements getViewHorizontalDragRange {
    private static int HaptikSDK$b = 1;
    private static short[] HaptikSDK$c = null;
    private static int ag$a = -383239392;
    private static int ah$b = 0;
    private static byte[] invoke = {-30, 113, -126, -114, 117, -113};
    private static int toString = -1975001114;
    private static int valueOf = 36;
    private final setCurrentTabTag ah$a;
    private final haveContentsChanged values;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r4 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
        r5 = o.springBack.ah$b + 113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
        o.springBack.HaptikSDK$b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
        if ((r5 instanceof o.springBack) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0033, code lost:
        r0 = '<';
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0036, code lost:
        r0 = ',';
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
        if (r0 == '<') goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
        r5 = (o.springBack) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
        if (o.runAnimators.values(r4.ah$a, r5.ah$a) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
        if (o.runAnimators.values(r4.values, r5.values) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
        r5 = o.springBack.HaptikSDK$b + 57;
        o.springBack.ah$b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005d, code lost:
        r5 = o.springBack.HaptikSDK$b + 115;
        o.springBack.ah$b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        if ((r4 == r5) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = o.springBack.ah$b
            int r0 = r0 + 97
            int r1 = r0 % 128
            o.springBack.HaptikSDK$b = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1c
            r0 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L1a
            if (r4 != r5) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L2d
            goto L1e
        L1a:
            r5 = move-exception
            throw r5
        L1c:
            if (r4 != r5) goto L2d
        L1e:
            int r5 = o.springBack.ah$b     // Catch: java.lang.Exception -> L2b
            int r5 = r5 + 113
            int r0 = r5 % 128
            o.springBack.HaptikSDK$b = r0     // Catch: java.lang.Exception -> L29
            int r5 = r5 % 2
            return r1
        L29:
            r5 = move-exception
            throw r5
        L2b:
            r5 = move-exception
            throw r5
        L2d:
            boolean r0 = r5 instanceof o.springBack
            r3 = 60
            if (r0 != 0) goto L36
            r0 = 60
            goto L38
        L36:
            r0 = 44
        L38:
            if (r0 == r3) goto L5d
            o.springBack r5 = (o.springBack) r5
            o.setCurrentTabTag r0 = r4.ah$a
            o.setCurrentTabTag r3 = r5.ah$a
            boolean r0 = o.runAnimators.values(r0, r3)
            if (r0 != 0) goto L47
            return r2
        L47:
            o.haveContentsChanged r0 = r4.values
            o.haveContentsChanged r5 = r5.values
            boolean r5 = o.runAnimators.values(r0, r5)
            if (r5 != 0) goto L5c
            int r5 = o.springBack.HaptikSDK$b
            int r5 = r5 + 57
            int r0 = r5 % 128
            o.springBack.ah$b = r0
            int r5 = r5 % 2
            return r2
        L5c:
            return r1
        L5d:
            int r5 = o.springBack.HaptikSDK$b
            int r5 = r5 + 115
            int r0 = r5 % 128
            o.springBack.ah$b = r0
            int r5 = r5 % 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.springBack.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        try {
            int i = HaptikSDK$b + 53;
            ah$b = i % 128;
            if ((i % 2 != 0 ? '>' : ']') != ']') {
                return (this.ah$a.hashCode() >>> 9) - this.values.hashCode();
            }
            try {
                return (this.ah$a.hashCode() * 31) + this.values.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("EditTeamNameBandLoaded(_source=");
            try {
                sb.append(this.ah$a);
                sb.append(", _status=");
                sb.append(this.values);
                sb.append(')');
                String sb2 = sb.toString();
                int i = HaptikSDK$b + 113;
                ah$b = i % 128;
                if (!(i % 2 != 0)) {
                    return sb2;
                }
                Object obj = null;
                super.hashCode();
                return sb2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public springBack(setCurrentTabTag setcurrenttabtag, haveContentsChanged havecontentschanged) {
        runAnimators.ag$a(setcurrenttabtag, "_source");
        runAnimators.ag$a(havecontentschanged, "_status");
        this.ah$a = setcurrenttabtag;
        this.values = havecontentschanged;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "EditTeamNameBandLoaded");
        hashMap.put(ah$a((byte) (115 - ((Process.getThreadPriority(0) + 20) >> 6)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 38, 1975001228 - MotionEvent.axisFromString(""), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 383239392).intern(), this.ah$a.ah$a());
        hashMap.put("status", this.values.ag$a());
        int i = ah$b + 65;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        return hashMap;
    }

    private static String ah$a(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + valueOf;
            boolean z = i4 == -1;
            if (z) {
                if (invoke != null) {
                    i4 = (byte) (invoke[ag$a + i3] + valueOf);
                } else {
                    i4 = (short) (HaptikSDK$c[ag$a + i3] + valueOf);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + ag$a + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + toString);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (invoke != null) {
                        byte[] bArr = invoke;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = HaptikSDK$c;
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
