package o;

import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
import o.AbsListViewBindingAdapter;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class isOpen implements getViewHorizontalDragRange {
    private static int HaptikSDK$a = 1;
    private static char ag$a = 4;
    private static char[] ah$a = {2, 13816, 3, 13807, 13784, 13814, 13810, 13812, 13785, 13819, 5, 1, 13801, 13813, 4, 13823};
    private static int ah$b;
    private final AbsListViewBindingAdapter.OnScroll toString;
    private final notifyFirst64 valueOf;
    private final setOnClick values;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        if ((r4 != r5) != true) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0020, code lost:
        if ((r5 instanceof o.isOpen) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
        r5 = o.isOpen.ah$b + 33;
        o.isOpen.HaptikSDK$a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
        r5 = (o.isOpen) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (o.runAnimators.values(r4.valueOf, r5.valueOf) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        r5 = o.isOpen.HaptikSDK$a + 71;
        o.isOpen.ah$b = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (o.runAnimators.values(r4.toString, r5.toString) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        r0 = '3';
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        r0 = '1';
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
        if (r0 == '3') goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (o.runAnimators.values(r4.values, r5.values) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        r5 = o.isOpen.ah$b + 111;
        o.isOpen.HaptikSDK$a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
        if ((r5 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
        r5 = 19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
        r5 = '6';
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
        if (r5 == 19) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
        r5 = o.isOpen.HaptikSDK$a + 103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
        o.isOpen.ah$b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
        if ((r5 % 2) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
        r5 = org.apache.commons.codec.language.Soundex.SILENT_MARKER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
        r5 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
        if (r5 == '-') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
        return true;
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
            int r0 = o.isOpen.ah$b     // Catch: java.lang.Exception -> L8e
            int r0 = r0 + 111
            int r1 = r0 % 128
            o.isOpen.HaptikSDK$a = r1     // Catch: java.lang.Exception -> L8e
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L16
            r0 = 94
            int r0 = r0 / r2
            if (r4 != r5) goto L1e
            goto L1d
        L14:
            r5 = move-exception
            throw r5
        L16:
            if (r4 != r5) goto L1a
            r0 = 0
            goto L1b
        L1a:
            r0 = 1
        L1b:
            if (r0 == r1) goto L1e
        L1d:
            return r1
        L1e:
            boolean r0 = r5 instanceof o.isOpen
            if (r0 != 0) goto L2d
            int r5 = o.isOpen.ah$b     // Catch: java.lang.Exception -> L8e
            int r5 = r5 + 33
            int r0 = r5 % 128
            o.isOpen.HaptikSDK$a = r0     // Catch: java.lang.Exception -> L8e
            int r5 = r5 % 2
            return r2
        L2d:
            o.isOpen r5 = (o.isOpen) r5
            o.notifyFirst64 r0 = r4.valueOf
            o.notifyFirst64 r3 = r5.valueOf
            boolean r0 = o.runAnimators.values(r0, r3)
            if (r0 != 0) goto L44
            int r5 = o.isOpen.HaptikSDK$a
            int r5 = r5 + 71
            int r0 = r5 % 128
            o.isOpen.ah$b = r0
            int r5 = r5 % 2
            return r2
        L44:
            o.AbsListViewBindingAdapter$OnScroll r0 = r4.toString
            o.AbsListViewBindingAdapter$OnScroll r3 = r5.toString
            boolean r0 = o.runAnimators.values(r0, r3)
            r3 = 51
            if (r0 != 0) goto L53
            r0 = 51
            goto L55
        L53:
            r0 = 49
        L55:
            if (r0 == r3) goto L78
            o.setOnClick r0 = r4.values
            o.setOnClick r5 = r5.values
            boolean r5 = o.runAnimators.values(r0, r5)
            if (r5 != 0) goto L77
            int r5 = o.isOpen.ah$b
            int r5 = r5 + 111
            int r0 = r5 % 128
            o.isOpen.HaptikSDK$a = r0
            int r5 = r5 % 2
            r0 = 19
            if (r5 != 0) goto L72
            r5 = 19
            goto L74
        L72:
            r5 = 54
        L74:
            if (r5 == r0) goto L77
            return r2
        L77:
            return r1
        L78:
            int r5 = o.isOpen.HaptikSDK$a     // Catch: java.lang.Exception -> L8e
            int r5 = r5 + 103
            int r0 = r5 % 128
            o.isOpen.ah$b = r0     // Catch: java.lang.Exception -> L8e
            int r5 = r5 % 2
            r0 = 45
            if (r5 == 0) goto L89
            r5 = 45
            goto L8a
        L89:
            r5 = 3
        L8a:
            if (r5 == r0) goto L8d
            return r2
        L8d:
            return r1
        L8e:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isOpen.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = HaptikSDK$a + 3;
        ah$b = i % 128;
        int i2 = i % 2;
        try {
            try {
                int hashCode = (((this.valueOf.hashCode() * 31) + this.toString.hashCode()) * 31) + this.values.hashCode();
                int i3 = HaptikSDK$a + 95;
                ah$b = i3 % 128;
                int i4 = i3 % 2;
                return hashCode;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        String str = "PromoCodeAvailInitiated(_amountToAdd=" + this.valueOf + ", _offerList=" + this.toString + ", _usableCashBonus=" + this.values + ')';
        int i = HaptikSDK$a + 83;
        ah$b = i % 128;
        int i2 = i % 2;
        return str;
    }

    public isOpen(notifyFirst64 notifyfirst64, AbsListViewBindingAdapter.OnScroll onScroll, setOnClick setonclick) {
        runAnimators.ag$a(notifyfirst64, "_amountToAdd");
        runAnimators.ag$a(onScroll, "_offerList");
        runAnimators.ag$a(setonclick, "_usableCashBonus");
        this.valueOf = notifyfirst64;
        this.toString = onScroll;
        this.values = setonclick;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "PromoCodeAvailInitiated");
        hashMap.put("amountToAdd", Double.valueOf(this.valueOf.valueOf()));
        hashMap.put("offerList", this.toString.valueOf());
        hashMap.put(valueOf((byte) (94 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), new char[]{0, 15, TokenParser.CR, 5, 7, TokenParser.CR, '\t', '\n', 14, 4, 5, '\f', 11, 7, 13895}, View.MeasureSpec.makeMeasureSpec(0, 0) + 15).intern(), Double.valueOf(this.values.values()));
        int i = HaptikSDK$a + 85;
        ah$b = i % 128;
        if ((i % 2 != 0 ? '$' : TokenParser.CR) != '$') {
            return hashMap;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return hashMap;
    }

    private static String valueOf(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = ah$a;
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
