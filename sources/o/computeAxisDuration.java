package o;

import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class computeAxisDuration implements getViewHorizontalDragRange {
    private static int HaptikSDK$b = 1;
    private static long ah$a = 7954175180108452623L;
    private static int invoke;
    private static int toString;
    private static char values;
    private final setCurrentTabTag ag$a;
    private final DataBindingComponent valueOf;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if ((r6 instanceof o.computeAxisDuration) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
        r6 = (o.computeAxisDuration) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (o.runAnimators.values(r5.valueOf, r6.valueOf) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        r0 = 'Y';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        r0 = 'S';
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r0 == 'S') goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        r6 = o.computeAxisDuration.HaptikSDK$b + 25;
        o.computeAxisDuration.invoke = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (o.runAnimators.values(r5.ag$a, r6.ag$a) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
        if (r6 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
        r6 = o.computeAxisDuration.invoke + 91;
        o.computeAxisDuration.HaptikSDK$b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        if ((r6 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        r6 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r5 == r6) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r5 == r6) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = o.computeAxisDuration.invoke
            int r0 = r0 + 75
            int r1 = r0 % 128
            o.computeAxisDuration.HaptikSDK$b = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L16
            super.hashCode()     // Catch: java.lang.Throwable -> L14
            if (r5 != r6) goto L19
            goto L18
        L14:
            r6 = move-exception
            throw r6
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r0 = r6 instanceof o.computeAxisDuration     // Catch: java.lang.Exception -> L60
            r3 = 0
            if (r0 != 0) goto L1f
            return r3
        L1f:
            o.computeAxisDuration r6 = (o.computeAxisDuration) r6
            o.DataBindingComponent r0 = r5.valueOf
            o.DataBindingComponent r4 = r6.valueOf
            boolean r0 = o.runAnimators.values(r0, r4)
            r4 = 83
            if (r0 != 0) goto L30
            r0 = 89
            goto L32
        L30:
            r0 = 83
        L32:
            if (r0 == r4) goto L3f
            int r6 = o.computeAxisDuration.HaptikSDK$b
            int r6 = r6 + 25
            int r0 = r6 % 128
            o.computeAxisDuration.invoke = r0
            int r6 = r6 % 2
            return r3
        L3f:
            o.setCurrentTabTag r0 = r5.ag$a
            o.setCurrentTabTag r6 = r6.ag$a
            boolean r6 = o.runAnimators.values(r0, r6)
            if (r6 != 0) goto L4b
            r6 = 0
            goto L4c
        L4b:
            r6 = 1
        L4c:
            if (r6 == 0) goto L5f
            int r6 = o.computeAxisDuration.invoke
            int r6 = r6 + 91
            int r0 = r6 % 128
            o.computeAxisDuration.HaptikSDK$b = r0
            int r6 = r6 % 2
            if (r6 != 0) goto L5e
            int r6 = r1.length     // Catch: java.lang.Throwable -> L5c
            return r2
        L5c:
            r6 = move-exception
            throw r6
        L5e:
            return r2
        L5f:
            return r3
        L60:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.computeAxisDuration.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2 = invoke + 63;
        HaptikSDK$b = i2 % 128;
        int i3 = i2 % 2;
        int hashCode = this.valueOf.hashCode();
        setCurrentTabTag setcurrenttabtag = this.ag$a;
        if ((setcurrenttabtag == null ? '/' : 'V') != '/') {
            i = setcurrenttabtag.hashCode();
        } else {
            int i4 = invoke + 111;
            HaptikSDK$b = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        }
        return (hashCode * 31) + i;
    }

    public String toString() {
        String str = "ReactionMenuDismissed(_channelUrl=" + this.valueOf + ", _source=" + this.ag$a + ')';
        try {
            int i = HaptikSDK$b + 77;
            try {
                invoke = i % 128;
                if (!(i % 2 != 0)) {
                    return str;
                }
                Object obj = null;
                super.hashCode();
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public computeAxisDuration(DataBindingComponent dataBindingComponent, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(dataBindingComponent, "_channelUrl");
        this.valueOf = dataBindingComponent;
        this.ag$a = setcurrenttabtag;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ computeAxisDuration(o.DataBindingComponent r1, o.setCurrentTabTag r2, int r3, o.getTargetTypes r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            r4 = 12
            if (r3 == 0) goto L9
            r3 = 84
            goto Lb
        L9:
            r3 = 12
        Lb:
            if (r3 == r4) goto L22
            int r2 = o.computeAxisDuration.HaptikSDK$b
            int r2 = r2 + 35
            int r3 = r2 % 128
            o.computeAxisDuration.invoke = r3
            int r2 = r2 % 2
            r2 = 0
            int r3 = o.computeAxisDuration.invoke
            int r3 = r3 + 51
            int r4 = r3 % 128
            o.computeAxisDuration.HaptikSDK$b = r4
            int r3 = r3 % 2
        L22:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.computeAxisDuration.<init>(o.DataBindingComponent, o.setCurrentTabTag, int, o.getTargetTypes):void");
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ReactionMenuDismissed");
        hashMap.put("channelUrl", this.valueOf.ah$a());
        setCurrentTabTag setcurrenttabtag = this.ag$a;
        if (!(setcurrenttabtag == null)) {
            hashMap.put(ag$a(ViewConfiguration.getScrollBarSize() >> 8, new char[]{39408, 48075, 48902, 8976}, new char[]{54031, 60311, 59438, 28258}, (char) (AndroidCharacter.getMirror('0') + 4239), new char[]{2097, 37629, 34757, 42318, 64538, 22807}).intern(), setcurrenttabtag.ah$a());
            int i = invoke + 39;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
        }
        int i3 = HaptikSDK$b + 53;
        invoke = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            return hashMap;
        }
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
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ah$a) ^ toString) ^ values);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
