package o;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
import o.TextViewBindingAdapter;
/* loaded from: classes4.dex */
public final class isOverScrolled implements getViewHorizontalDragRange {
    private static short[] HaptikSDK$a = null;
    private static int HaptikSDK$b = -409246838;
    private static int HaptikSDK$c = -1680082420;
    private static int HaptikSDK$e = 0;
    private static int HaptikWebView = 1;
    private static int ah$b = 71;
    private static byte[] invoke = {81, -8, 81, 77, 75, 0};
    private final TextViewBindingAdapter.OnTextChanged ag$a;
    private final DataBinderMapper ah$a;
    private final TextViewBindingAdapter.AnonymousClass1 toString;
    private final TextViewBindingAdapter.BeforeTextChanged valueOf;
    private final method values;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r5 == r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        r6 = o.isOverScrolled.HaptikSDK$e + 11;
        o.isOverScrolled.HaptikWebView = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        if ((r6 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        r1 = '(';
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r1 == '(') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        r6 = 53 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
        if ((r6 instanceof o.isOverScrolled) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
        if (r0 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
        r6 = (o.isOverScrolled) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
        if (o.runAnimators.values(r5.values, r6.values) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
        if (o.runAnimators.values(r5.ah$a, r6.ah$a) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0051, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
        if (o.runAnimators.values(r5.valueOf, r6.valueOf) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
        r6 = o.isOverScrolled.HaptikSDK$e + 35;
        o.isOverScrolled.HaptikWebView = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
        if (o.runAnimators.values(r5.toString, r6.toString) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
        if (o.runAnimators.values(r5.ag$a, r6.ag$a) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0080, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0081, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r5 == r6) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = o.isOverScrolled.HaptikWebView
            int r0 = r0 + 13
            int r1 = r0 % 128
            o.isOverScrolled.HaptikSDK$e = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L16
            r0 = 72
            int r0 = r0 / r3
            if (r5 != r6) goto L31
            goto L18
        L14:
            r6 = move-exception
            throw r6
        L16:
            if (r5 != r6) goto L31
        L18:
            int r6 = o.isOverScrolled.HaptikSDK$e
            int r6 = r6 + 11
            int r0 = r6 % 128
            o.isOverScrolled.HaptikWebView = r0
            int r6 = r6 % r1
            r0 = 40
            if (r6 != 0) goto L26
            goto L28
        L26:
            r1 = 40
        L28:
            if (r1 == r0) goto L30
            r6 = 53
            int r6 = r6 / r3
            return r2
        L2e:
            r6 = move-exception
            throw r6
        L30:
            return r2
        L31:
            boolean r0 = r6 instanceof o.isOverScrolled
            if (r0 != 0) goto L37
            r0 = 0
            goto L38
        L37:
            r0 = 1
        L38:
            if (r0 == 0) goto L81
            o.isOverScrolled r6 = (o.isOverScrolled) r6
            o.method r0 = r5.values
            o.method r4 = r6.values
            boolean r0 = o.runAnimators.values(r0, r4)
            if (r0 != 0) goto L47
            return r3
        L47:
            o.DataBinderMapper r0 = r5.ah$a     // Catch: java.lang.Exception -> L7f
            o.DataBinderMapper r4 = r6.ah$a     // Catch: java.lang.Exception -> L7f
            boolean r0 = o.runAnimators.values(r0, r4)     // Catch: java.lang.Exception -> L7f
            if (r0 != 0) goto L52
            return r3
        L52:
            o.TextViewBindingAdapter$BeforeTextChanged r0 = r5.valueOf     // Catch: java.lang.Exception -> L7d
            o.TextViewBindingAdapter$BeforeTextChanged r4 = r6.valueOf     // Catch: java.lang.Exception -> L7d
            boolean r0 = o.runAnimators.values(r0, r4)     // Catch: java.lang.Exception -> L7d
            if (r0 != 0) goto L66
            int r6 = o.isOverScrolled.HaptikSDK$e
            int r6 = r6 + 35
            int r0 = r6 % 128
            o.isOverScrolled.HaptikWebView = r0
            int r6 = r6 % r1
            return r3
        L66:
            o.TextViewBindingAdapter$1 r0 = r5.toString
            o.TextViewBindingAdapter$1 r1 = r6.toString
            boolean r0 = o.runAnimators.values(r0, r1)
            if (r0 != 0) goto L71
            return r3
        L71:
            o.TextViewBindingAdapter$OnTextChanged r0 = r5.ag$a
            o.TextViewBindingAdapter$OnTextChanged r6 = r6.ag$a
            boolean r6 = o.runAnimators.values(r0, r6)
            if (r6 != 0) goto L7c
            return r3
        L7c:
            return r2
        L7d:
            r6 = move-exception
            throw r6
        L7f:
            r6 = move-exception
            throw r6
        L81:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isOverScrolled.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = HaptikWebView + 61;
        HaptikSDK$e = i % 128;
        int i2 = i % 2;
        try {
            int hashCode = (((((((this.values.hashCode() * 31) + this.ah$a.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.toString.hashCode()) * 31) + this.ag$a.hashCode();
            int i3 = HaptikSDK$e + 77;
            HaptikWebView = i3 % 128;
            int i4 = i3 % 2;
            return hashCode;
        } catch (Exception e) {
            throw e;
        }
    }

    public String toString() {
        String str = "DownloadInvoiceTapped(_amount=" + this.values + ", _buttonType=" + this.ah$a + ", _transactionDate=" + this.valueOf + ", _transactionId=" + this.toString + ", _transactionType=" + this.ag$a + ')';
        try {
            int i = HaptikWebView + 61;
            HaptikSDK$e = i % 128;
            if ((i % 2 != 0 ? (char) 11 : 'W') != 11) {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public isOverScrolled(method methodVar, DataBinderMapper dataBinderMapper, TextViewBindingAdapter.BeforeTextChanged beforeTextChanged, TextViewBindingAdapter.AnonymousClass1 anonymousClass1, TextViewBindingAdapter.OnTextChanged onTextChanged) {
        runAnimators.ag$a(methodVar, "_amount");
        runAnimators.ag$a(dataBinderMapper, "_buttonType");
        runAnimators.ag$a(beforeTextChanged, "_transactionDate");
        runAnimators.ag$a(anonymousClass1, "_transactionId");
        runAnimators.ag$a(onTextChanged, "_transactionType");
        this.values = methodVar;
        this.ah$a = dataBinderMapper;
        this.valueOf = beforeTextChanged;
        this.toString = anonymousClass1;
        this.ag$a = onTextChanged;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "DownloadInvoiceTapped");
        hashMap.put(values((byte) (Color.argb(0, 0, 0, 0) - 86), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 65, 1680082517 - TextUtils.getOffsetBefore("", 0), (short) (92 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 409246838 - View.MeasureSpec.getMode(0)).intern(), Double.valueOf(this.values.ah$a()));
        hashMap.put("buttonType", this.ah$a.ah$a());
        hashMap.put("transactionDate", this.valueOf.ah$a());
        hashMap.put("transactionId", this.toString.valueOf());
        hashMap.put("transactionType", this.ag$a.ah$a());
        int i = HaptikWebView + 3;
        HaptikSDK$e = i % 128;
        int i2 = i % 2;
        return hashMap;
    }

    private static String values(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + ah$b;
            boolean z = i4 == -1;
            if (z) {
                if (invoke != null) {
                    i4 = (byte) (invoke[HaptikSDK$b + i3] + ah$b);
                } else {
                    i4 = (short) (HaptikSDK$a[HaptikSDK$b + i3] + ah$b);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + HaptikSDK$b + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + HaptikSDK$c);
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
                        short[] sArr = HaptikSDK$a;
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
