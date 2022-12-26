package o;

import android.os.Process;
import android.text.TextUtils;
import com.app.dream11.core.event.EventType;
import com.app.dream11.model.FeatureUpdate;
/* loaded from: classes.dex */
public final class getActivityThreadClass extends FeatureUpdate {
    private static int ag$a = 1;
    private static char ah$a = 3;
    private static char[] toString = {2, 13813, 1, 13800, 13823, 3, 13801, 13807, 13817};
    private static int values;
    private final String valueOf;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
        if ((r4 == r5 ? 'I' : '\t') != '\t') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
        if (r4 == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
        if ((r5 instanceof o.getActivityThreadClass) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
        r0 = '2';
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
        r0 = 'L';
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
        if (r0 == '2') goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
        if (o.runAnimators.values((java.lang.Object) r4.valueOf, (java.lang.Object) ((o.getActivityThreadClass) r5).valueOf) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
        r5 = o.getActivityThreadClass.values + 83;
        o.getActivityThreadClass.ag$a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
        if ((r5 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
        r5 = o.getActivityThreadClass.values + 99;
        o.getActivityThreadClass.ag$a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
        r5 = o.getActivityThreadClass.ag$a + 103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
        o.getActivityThreadClass.values = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = o.getActivityThreadClass.ag$a     // Catch: java.lang.Exception -> L67
            int r0 = r0 + 45
            int r1 = r0 % 128
            o.getActivityThreadClass.values = r1     // Catch: java.lang.Exception -> L65
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 == 0) goto L1f
            r0 = 9
            if (r4 != r5) goto L1a
            r3 = 73
            goto L1c
        L1a:
            r3 = 9
        L1c:
            if (r3 == r0) goto L26
            goto L25
        L1f:
            r0 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L63
            if (r4 != r5) goto L26
        L25:
            return r2
        L26:
            boolean r0 = r5 instanceof o.getActivityThreadClass
            r3 = 50
            if (r0 != 0) goto L2f
            r0 = 50
            goto L31
        L2f:
            r0 = 76
        L31:
            if (r0 == r3) goto L58
            o.getActivityThreadClass r5 = (o.getActivityThreadClass) r5
            java.lang.String r0 = r4.valueOf
            java.lang.String r5 = r5.valueOf
            boolean r5 = o.runAnimators.values(r0, r5)
            if (r5 != 0) goto L4d
            int r5 = o.getActivityThreadClass.values
            int r5 = r5 + 83
            int r0 = r5 % 128
            o.getActivityThreadClass.ag$a = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L4c
            r1 = 1
        L4c:
            return r1
        L4d:
            int r5 = o.getActivityThreadClass.values
            int r5 = r5 + 99
            int r0 = r5 % 128
            o.getActivityThreadClass.ag$a = r0
            int r5 = r5 % 2
            return r2
        L58:
            int r5 = o.getActivityThreadClass.ag$a     // Catch: java.lang.Exception -> L65
            int r5 = r5 + 103
            int r0 = r5 % 128
            o.getActivityThreadClass.values = r0     // Catch: java.lang.Exception -> L65
            int r5 = r5 % 2
            return r1
        L63:
            r5 = move-exception
            throw r5
        L65:
            r5 = move-exception
            throw r5
        L67:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getActivityThreadClass.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = values + 53;
        ag$a = i % 128;
        int i2 = i % 2;
        int hashCode = this.valueOf.hashCode();
        int i3 = values + 77;
        ag$a = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 4 : 'H') != 'H') {
            int i4 = 11 / 0;
            return hashCode;
        }
        return hashCode;
    }

    public String toString() {
        String str = "PerformRefreshEvent(source=" + this.valueOf + ")";
        int i = values + 7;
        ag$a = i % 128;
        int i2 = i % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getActivityThreadClass(String str) {
        super(EventType.PERFORM_REFRESH);
        runAnimators.ag$a(str, ag$a((byte) (75 - TextUtils.getTrimmedLength("")), new char[]{7, 0, 6, 4, 7, 5}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 5).intern());
        this.valueOf = str;
    }

    public final String ah$a() {
        int i = values + 115;
        ag$a = i % 128;
        int i2 = i % 2;
        String str = this.valueOf;
        try {
            int i3 = values + 43;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String ag$a(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = toString;
            char c = ah$a;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}
