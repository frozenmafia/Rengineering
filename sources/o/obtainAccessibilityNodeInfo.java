package o;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import o.ViewGroupBindingAdapter;
/* loaded from: classes4.dex */
public final class obtainAccessibilityNodeInfo implements getViewHorizontalDragRange {
    private static int HaptikSDK$b = 0;
    private static char ag$a = 3;
    private static int invoke = 1;
    private static char[] valueOf = {13807, 13808, 13823, 13801, 13817, 13813, 13800, 13810, 13809};
    private final setCurrentTabTag ah$a;
    private final ViewGroupBindingAdapter.AnonymousClass2 toString;
    private final onItemRangeInserted values;

    public boolean equals(Object obj) {
        if ((this == obj ? '9' : (char) 21) == '9') {
            int i = invoke + 49;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
            return true;
        } else if (obj instanceof obtainAccessibilityNodeInfo) {
            obtainAccessibilityNodeInfo obtainaccessibilitynodeinfo = (obtainAccessibilityNodeInfo) obj;
            if (!(!runAnimators.values(this.values, obtainaccessibilitynodeinfo.values))) {
                if (!runAnimators.values(this.ah$a, obtainaccessibilitynodeinfo.ah$a)) {
                    int i3 = invoke + 17;
                    HaptikSDK$b = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (!runAnimators.values(this.toString, obtainaccessibilitynodeinfo.toString)) {
                    int i5 = invoke + 57;
                    HaptikSDK$b = i5 % 128;
                    if (!(i5 % 2 != 0)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if ((r4 == null) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r4 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        r4 = o.obtainAccessibilityNodeInfo.HaptikSDK$b + 101;
        o.obtainAccessibilityNodeInfo.invoke = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        if ((r4 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        r2 = r4.hashCode();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            int r0 = o.obtainAccessibilityNodeInfo.HaptikSDK$b
            int r0 = r0 + 41
            int r1 = r0 % 128
            o.obtainAccessibilityNodeInfo.invoke = r1
            int r0 = r0 % 2
            r1 = 70
            if (r0 != 0) goto L11
            r0 = 70
            goto L13
        L11:
            r0 = 67
        L13:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L2d
            o.onItemRangeInserted r0 = r6.values
            int r0 = r0.hashCode()
            o.setCurrentTabTag r1 = r6.ah$a
            int r1 = r1.hashCode()
            o.ViewGroupBindingAdapter$2 r4 = r6.toString
            if (r4 != 0) goto L29
            r5 = 1
            goto L2a
        L29:
            r5 = 0
        L2a:
            if (r5 == 0) goto L4e
            goto L3f
        L2d:
            o.onItemRangeInserted r0 = r6.values
            int r0 = r0.hashCode()
            o.setCurrentTabTag r1 = r6.ah$a
            int r1 = r1.hashCode()
            o.ViewGroupBindingAdapter$2 r4 = r6.toString
            r5 = 0
            int r5 = r5.length     // Catch: java.lang.Throwable -> L59
            if (r4 != 0) goto L4e
        L3f:
            int r4 = o.obtainAccessibilityNodeInfo.HaptikSDK$b
            int r4 = r4 + 101
            int r5 = r4 % 128
            o.obtainAccessibilityNodeInfo.invoke = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L4c
            goto L52
        L4c:
            r2 = 0
            goto L52
        L4e:
            int r2 = r4.hashCode()
        L52:
            int r0 = r0 * 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r0 = r0 + r2
            return r0
        L59:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.obtainAccessibilityNodeInfo.hashCode():int");
    }

    public String toString() {
        String str = "OTPError(_errorMessage=" + this.values + ", _source=" + this.ah$a + ", _variant=" + this.toString + ')';
        try {
            int i = HaptikSDK$b + 39;
            invoke = i % 128;
            int i2 = i % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public obtainAccessibilityNodeInfo(onItemRangeInserted onitemrangeinserted, setCurrentTabTag setcurrenttabtag, ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2) {
        runAnimators.ag$a(onitemrangeinserted, "_errorMessage");
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.values = onitemrangeinserted;
        this.ah$a = setcurrenttabtag;
        this.toString = anonymousClass2;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "OTPError");
        hashMap.put("errorMessage", this.values.values());
        hashMap.put(values((byte) (53 - TextUtils.getOffsetAfter("", 0)), new char[]{4, 3, 3, 0, 5, 1}, 5 - ImageFormat.getBitsPerPixel(0)).intern(), this.ah$a.ah$a());
        ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2 = this.toString;
        if ((anonymousClass2 != null ? 'X' : '\f') == 'X') {
            int i = HaptikSDK$b + 49;
            invoke = i % 128;
            if (i % 2 == 0) {
                hashMap.put(com.facebook.hermes.intl.Constants.SENSITIVITY_VARIANT, anonymousClass2.ah$a());
                int i2 = 52 / 0;
            } else {
                hashMap.put(com.facebook.hermes.intl.Constants.SENSITIVITY_VARIANT, anonymousClass2.ah$a());
            }
        }
        int i3 = HaptikSDK$b + 97;
        invoke = i3 % 128;
        int i4 = i3 % 2;
        return hashMap;
    }

    private static String values(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = valueOf;
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
