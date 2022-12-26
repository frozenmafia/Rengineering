package o;

import android.os.Process;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsamurai.storyly.StoryComponentType;
import java.util.List;
import o.PathParser;
import org.apache.http.message.TokenParser;
/* loaded from: classes3.dex */
public final class nodesToPath extends PathParser.ExtractFloatResult {
    private static int HaptikSDK$a = 0;
    private static char[] HaptikSDK$c = {13822, 13827, 13811, 13814, 13824, 13806, 13825, 13826, 13823};
    private static int ah$b = 1;
    private static char invoke = 3;
    private final int ag$a;
    private final String ah$a;
    private final String toString;
    private final String valueOf;
    private final List<String> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nodesToPath(String str, String str2, List<String> list, int i, String str3) {
        super(str, StoryComponentType.Poll);
        runAnimators.ag$a(str, ag$a((byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 65), new char[]{0, 1}, 2 - ExpandableListView.getPackedPositionGroup(0L)).intern());
        runAnimators.ag$a(str2, ag$a((byte) ((Process.myTid() >> 22) + 12), new char[]{'\b', 5, 3, 4, 13835}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 5).intern());
        runAnimators.ag$a(list, "options");
        this.ah$a = str;
        this.valueOf = str2;
        this.values = list;
        this.ag$a = i;
        this.toString = str3;
    }

    public final int HaptikSDK$a() {
        int i = HaptikSDK$a + 111;
        ah$b = i % 128;
        int i2 = i % 2;
        try {
            int i3 = this.ag$a;
            int i4 = ah$b + 51;
            HaptikSDK$a = i4 % 128;
            if ((i4 % 2 != 0 ? '(' : 'U') != '(') {
                return i3;
            }
            Object obj = null;
            super.hashCode();
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String HaptikSDK$c() {
        try {
            int i = ah$b + 117;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            try {
                String str = this.valueOf;
                int i3 = HaptikSDK$a + 85;
                ah$b = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // o.PathParser.ExtractFloatResult
    public String ag$a() {
        String str;
        int i = HaptikSDK$a + 121;
        ah$b = i % 128;
        if ((i % 2 == 0 ? TokenParser.CR : (char) 22) != '\r') {
            str = this.ah$a;
        } else {
            str = this.ah$a;
            Object obj = null;
            super.hashCode();
        }
        int i2 = ah$b + 33;
        HaptikSDK$a = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final List<String> ah$a() {
        int i = ah$b + 115;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        try {
            List<String> list = this.values;
            int i3 = ah$b + 67;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
            return list;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            int i = HaptikSDK$a + 123;
            ah$b = i % 128;
            int i2 = i % 2;
            return true;
        }
        try {
            if ((!(obj instanceof nodesToPath) ? '6' : (char) 22) != 22) {
                int i3 = ah$b + 83;
                HaptikSDK$a = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            nodesToPath nodestopath = (nodesToPath) obj;
            if (runAnimators.values((Object) ag$a(), (Object) nodestopath.ag$a()) && runAnimators.values((Object) this.valueOf, (Object) nodestopath.valueOf)) {
                try {
                    if (!runAnimators.values(this.values, nodestopath.values)) {
                        int i5 = ah$b + 115;
                        HaptikSDK$a = i5 % 128;
                        int i6 = i5 % 2;
                        return false;
                    } else if (this.ag$a == nodestopath.ag$a) {
                        return (!runAnimators.values((Object) this.toString, (Object) nodestopath.toString) ? '/' : (char) 15) == 15;
                    } else {
                        int i7 = ah$b + 83;
                        HaptikSDK$a = i7 % 128;
                        return i7 % 2 != 0;
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            return false;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        if ((r4 == null ? '9' : 'S') != '9') goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r4 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        r4 = 0;
        r5 = o.nodesToPath.HaptikSDK$a + 59;
        o.nodesToPath.ah$b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        r4 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        r5 = o.nodesToPath.HaptikSDK$a + 101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
        o.nodesToPath.ah$b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            int r0 = o.nodesToPath.HaptikSDK$a
            int r0 = r0 + 81
            int r1 = r0 % 128
            o.nodesToPath.ah$b = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L34
            java.lang.String r0 = r7.ag$a()
            int r0 = r0.hashCode()
            java.lang.String r1 = r7.valueOf
            int r1 = r1.hashCode()
            java.util.List<java.lang.String> r2 = r7.values
            int r2 = r2.hashCode()
            int r3 = r7.ag$a
            java.lang.String r4 = r7.toString
            r5 = 0
            int r5 = r5.length     // Catch: java.lang.Throwable -> L32
            r5 = 57
            if (r4 != 0) goto L2d
            r6 = 57
            goto L2f
        L2d:
            r6 = 83
        L2f:
            if (r6 == r5) goto L4e
            goto L5a
        L32:
            r0 = move-exception
            throw r0
        L34:
            java.lang.String r0 = r7.ag$a()     // Catch: java.lang.Exception -> L77
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L77
            java.lang.String r1 = r7.valueOf     // Catch: java.lang.Exception -> L77
            int r1 = r1.hashCode()     // Catch: java.lang.Exception -> L77
            java.util.List<java.lang.String> r2 = r7.values     // Catch: java.lang.Exception -> L77
            int r2 = r2.hashCode()     // Catch: java.lang.Exception -> L77
            int r3 = r7.ag$a     // Catch: java.lang.Exception -> L77
            java.lang.String r4 = r7.toString     // Catch: java.lang.Exception -> L77
            if (r4 != 0) goto L5a
        L4e:
            r4 = 0
            int r5 = o.nodesToPath.HaptikSDK$a
            int r5 = r5 + 59
            int r6 = r5 % 128
            o.nodesToPath.ah$b = r6
            int r5 = r5 % 2
            goto L68
        L5a:
            int r4 = r4.hashCode()
            int r5 = o.nodesToPath.HaptikSDK$a     // Catch: java.lang.Exception -> L75
            int r5 = r5 + 101
            int r6 = r5 % 128
            o.nodesToPath.ah$b = r6     // Catch: java.lang.Exception -> L75
            int r5 = r5 % 2
        L68:
            int r0 = r0 * 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r0 = r0 + r3
            int r0 = r0 * 31
            int r0 = r0 + r4
            return r0
        L75:
            r0 = move-exception
            throw r0
        L77:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.nodesToPath.hashCode():int");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("StoryPollComponent(id=");
            sb.append(ag$a());
            sb.append(", title=");
            sb.append(this.valueOf);
            sb.append(", options=");
            sb.append(this.values);
            sb.append(", selectedOptionIndex=");
            sb.append(this.ag$a);
            sb.append(", customPayload=");
            sb.append((Object) this.toString);
            sb.append(')');
            String sb2 = sb.toString();
            int i = ah$b + 71;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            return sb2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String valueOf() {
        String str;
        int i = ah$b + 103;
        HaptikSDK$a = i % 128;
        if (i % 2 == 0) {
            str = this.toString;
        } else {
            str = this.toString;
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = ah$b + 11;
        HaptikSDK$a = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static String ag$a(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = HaptikSDK$c;
            char c = invoke;
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
