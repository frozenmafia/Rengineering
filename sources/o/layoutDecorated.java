package o;

import java.util.Map;
/* loaded from: classes7.dex */
public class layoutDecorated {
    private static int HaptikSDK$b = 1;
    private static char ag$a = 3;
    private static int ah$a;
    private static char[] values = {4, 1, 13813, 13812, 13809, 13823, 13806, 2, 3};
    private final String toString;
    private final Map<String, Object> valueOf;

    public layoutDecorated(String str, Map<String, Object> map) {
        this.toString = str;
        this.valueOf = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if ((!r6.startsWith("gauth|") ? org.apache.http.message.TokenParser.CR : '%') != '%') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if ((!r6.startsWith("gauth|") ? 'J' : '#') != '#') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        r6 = o.layoutDecorated.HaptikSDK$b + 113;
        o.layoutDecorated.ah$a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        if ((r6 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        r6 = 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
        r6 = '4';
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r6 == 30) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        r6 = o.onAdapterChanged.ah$a(r6.substring(6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
        return new o.layoutDecorated((java.lang.String) r6.get(toString((byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23), new char[]{'\b', 0, 5, 3, 13836}, (-16777211) - android.graphics.Color.rgb(0, 0, 0)).intern()), (java.util.Map) r6.get("auth"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
        throw new java.lang.RuntimeException("Failed to parse gauth token", r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o.layoutDecorated ah$a(java.lang.String r6) {
        /*
            int r0 = o.layoutDecorated.ah$a
            int r0 = r0 + 123
            int r1 = r0 % 128
            o.layoutDecorated.HaptikSDK$b = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.String r2 = "gauth|"
            r3 = 0
            if (r0 != 0) goto L24
            boolean r0 = r6.startsWith(r2)
            r2 = 85
            int r2 = r2 / r3
            r2 = 37
            if (r0 != 0) goto L1d
            r0 = 13
            goto L1f
        L1d:
            r0 = 37
        L1f:
            if (r0 == r2) goto L4f
            goto L33
        L22:
            r6 = move-exception
            throw r6
        L24:
            boolean r0 = r6.startsWith(r2)
            r2 = 35
            if (r0 != 0) goto L2f
            r0 = 74
            goto L31
        L2f:
            r0 = 35
        L31:
            if (r0 == r2) goto L4f
        L33:
            int r6 = o.layoutDecorated.HaptikSDK$b
            int r6 = r6 + 113
            int r0 = r6 % 128
            o.layoutDecorated.ah$a = r0
            int r6 = r6 % r1
            r0 = 30
            if (r6 == 0) goto L43
            r6 = 30
            goto L45
        L43:
            r6 = 52
        L45:
            r1 = 0
            if (r6 == r0) goto L49
            return r1
        L49:
            super.hashCode()     // Catch: java.lang.Throwable -> L4d
            return r1
        L4d:
            r6 = move-exception
            throw r6
        L4f:
            r0 = 6
            java.lang.String r6 = r6.substring(r0)
            java.util.Map r6 = o.onAdapterChanged.ah$a(r6)     // Catch: java.io.IOException -> L9a
            float r0 = android.view.ViewConfiguration.getScrollFriction()     // Catch: java.io.IOException -> L9a
            r2 = 0
            r4 = 5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            int r0 = r0 + 23
            byte r0 = (byte) r0     // Catch: java.io.IOException -> L9a
            char[] r2 = new char[r4]     // Catch: java.io.IOException -> L9a
            r5 = 8
            r2[r3] = r5     // Catch: java.io.IOException -> L9a
            r5 = 1
            r2[r5] = r3     // Catch: java.io.IOException -> L9a
            r2[r1] = r4     // Catch: java.io.IOException -> L9a
            r1 = 3
            r2[r1] = r1     // Catch: java.io.IOException -> L9a
            r1 = 4
            r4 = 13836(0x360c, float:1.9388E-41)
            r2[r1] = r4     // Catch: java.io.IOException -> L9a
            r1 = -16777211(0xffffffffff000005, float:-1.7014128E38)
            int r3 = android.graphics.Color.rgb(r3, r3, r3)     // Catch: java.io.IOException -> L9a
            int r1 = r1 - r3
            java.lang.String r0 = toString(r0, r2, r1)     // Catch: java.io.IOException -> L9a
            java.lang.String r0 = r0.intern()     // Catch: java.io.IOException -> L9a
            java.lang.Object r0 = r6.get(r0)     // Catch: java.io.IOException -> L9a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L9a
            java.lang.String r1 = "auth"
            java.lang.Object r6 = r6.get(r1)     // Catch: java.io.IOException -> L9a
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.io.IOException -> L9a
            o.layoutDecorated r1 = new o.layoutDecorated     // Catch: java.io.IOException -> L9a
            r1.<init>(r0, r6)     // Catch: java.io.IOException -> L9a
            return r1
        L9a:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed to parse gauth token"
            r0.<init>(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.layoutDecorated.ah$a(java.lang.String):o.layoutDecorated");
    }

    public String values() {
        int i = HaptikSDK$b + 9;
        ah$a = i % 128;
        if (i % 2 == 0) {
            return this.toString;
        }
        int i2 = 61 / 0;
        return this.toString;
    }

    public Map<String, Object> ah$a() {
        int i = ah$a + 33;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        Map<String, Object> map = this.valueOf;
        int i3 = ah$a + 83;
        HaptikSDK$b = i3 % 128;
        if ((i3 % 2 == 0 ? 'U' : '[') != 'U') {
            return map;
        }
        int i4 = 50 / 0;
        return map;
    }

    private static String toString(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = values;
            char c = ag$a;
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
