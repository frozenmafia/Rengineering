package com.dreampay.commons.pay_instrument;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;
import o.getShort;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PaymentSection {
    private static int ag$a = 0;
    private static int ah$a = 0;
    private static char toString = 59961;
    private static int valueOf = 1;
    private static long values;
    private final List<Element> elements;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentSection copy$default(PaymentSection paymentSection, String str, List list, int i, Object obj) {
        if (((i & 1) != 0 ? '\'' : 'E') != 'E') {
            str = paymentSection.title;
            try {
                int i2 = ah$a + 117;
                try {
                    valueOf = i2 % 128;
                    int i3 = i2 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        if (!((i & 2) == 0)) {
            int i4 = valueOf + 61;
            ah$a = i4 % 128;
            int i5 = i4 % 2;
            list = paymentSection.elements;
            int i6 = valueOf + 37;
            ah$a = i6 % 128;
            int i7 = i6 % 2;
        }
        return paymentSection.copy(str, list);
    }

    public final String component1() {
        String str;
        int i = ah$a + 103;
        valueOf = i % 128;
        Object[] objArr = null;
        if (i % 2 == 0) {
            str = this.title;
            super.hashCode();
        } else {
            str = this.title;
        }
        int i2 = valueOf + 109;
        ah$a = i2 % 128;
        if ((i2 % 2 != 0 ? (char) 14 : ';') != 14) {
            return str;
        }
        int length = objArr.length;
        return str;
    }

    public final List<Element> component2() {
        List<Element> list;
        int i = ah$a + 113;
        valueOf = i % 128;
        if ((i % 2 == 0 ? 'M' : (char) 22) != 22) {
            list = this.elements;
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            list = this.elements;
        }
        int i2 = ah$a + 5;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        return list;
    }

    public final PaymentSection copy(String str, List<Element> list) {
        runAnimators.ag$a(str, toString((-1365552857) - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{9986, 39761, 17070, 4453}, new char[]{0, 0, 0, 0}, (char) (25922 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), new char[]{27639, 27191, 54828, 56751, 10010}).intern());
        runAnimators.ag$a(list, "elements");
        PaymentSection paymentSection = new PaymentSection(str, list);
        int i = valueOf + 105;
        ah$a = i % 128;
        int i2 = i % 2;
        return paymentSection;
    }

    public boolean equals(Object obj) {
        try {
            try {
                if (this == obj) {
                    int i = valueOf + 91;
                    ah$a = i % 128;
                    boolean z = !(i % 2 != 0);
                    int i2 = ah$a + 91;
                    valueOf = i2 % 128;
                    int i3 = i2 % 2;
                    return z;
                }
                if ((!(obj instanceof PaymentSection) ? (char) 14 : 'D') == 14) {
                    int i4 = valueOf + 33;
                    ah$a = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                PaymentSection paymentSection = (PaymentSection) obj;
                if (runAnimators.values((Object) this.title, (Object) paymentSection.title)) {
                    if (runAnimators.values(this.elements, paymentSection.elements)) {
                        return true;
                    }
                    int i6 = valueOf + 27;
                    ah$a = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = valueOf + 57;
                    ah$a = i8 % 128;
                    if ((i8 % 2 != 0 ? (char) 5 : '[') != 5) {
                        return false;
                    }
                    Object[] objArr = null;
                    int length = objArr.length;
                    return false;
                }
                return false;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int i = ah$a + 109;
        valueOf = i % 128;
        return (i % 2 == 0 ? '6' : '@') != '@' ? (this.title.hashCode() >>> 79) - this.elements.hashCode() : (this.title.hashCode() * 31) + this.elements.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("PaymentSection(title=");
            sb.append(this.title);
            sb.append(", elements=");
            sb.append(this.elements);
            sb.append(')');
            String sb2 = sb.toString();
            int i = valueOf + 119;
            ah$a = i % 128;
            int i2 = i % 2;
            return sb2;
        } catch (Exception e) {
            throw e;
        }
    }

    public PaymentSection(String str, List<Element> list) {
        runAnimators.ag$a(str, toString((-1365552858) - TextUtils.lastIndexOf("", '0', 0), new char[]{9986, 39761, 17070, 4453}, new char[]{0, 0, 0, 0}, (char) (ExpandableListView.getPackedPositionType(0L) + 25922), new char[]{27639, 27191, 54828, 56751, 10010}).intern());
        runAnimators.ag$a(list, "elements");
        this.title = str;
        this.elements = list;
    }

    public final List<Element> getElements() {
        int i = ah$a + 63;
        valueOf = i % 128;
        int i2 = i % 2;
        List<Element> list = this.elements;
        int i3 = ah$a + 47;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
            return list;
        }
        return list;
    }

    public final String getTitle() {
        int i = ah$a + 85;
        valueOf = i % 128;
        if (!(i % 2 != 0)) {
            String str = this.title;
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return this.title;
    }

    private static String toString(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
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
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ values) ^ ag$a) ^ toString);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
