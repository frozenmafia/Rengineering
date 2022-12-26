package com.dreampay.commons.pay_instrument;

import android.view.View;
import android.view.ViewConfiguration;
import com.dreampay.commons.cards.InstrumentHealth;
import java.util.List;
import o.isLast;
import o.runAnimators;
import org.apache.http.message.TokenParser;
/* loaded from: classes6.dex */
public final class Element {
    private static boolean ag$a = true;
    private static int ah$a = 0;
    private static int ah$b = 1;
    private static char[] toString = {323, 312, 315, 308};
    private static boolean valueOf = true;
    private static int values = 207;
    private final String errorMessage;
    private final InstrumentHealth health;
    private final String iconUrl;
    private final InstrumentType instrumentType;
    private final boolean isAvailable;
    private final List<PaymentInstrument> paymentInstruments;
    private final String promotionText;
    private final String subtitle;
    private final String title;
    private final InstrumentViewType viewType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Element copy$default(Element element, String str, String str2, String str3, String str4, String str5, boolean z, InstrumentViewType instrumentViewType, InstrumentHealth instrumentHealth, InstrumentType instrumentType, List list, int i, Object obj) {
        String str6;
        String str7;
        String str8;
        boolean z2;
        InstrumentHealth instrumentHealth2;
        InstrumentType instrumentType2;
        List<PaymentInstrument> list2;
        if (!((i & 1) != 0)) {
            str6 = str;
        } else {
            str6 = element.title;
            int i2 = ah$a + 79;
            ah$b = i2 % 128;
            int i3 = i2 % 2;
        }
        String str9 = ((i & 2) != 0 ? (char) 4 : '4') != 4 ? str2 : element.subtitle;
        String str10 = (i & 4) != 0 ? element.iconUrl : str3;
        if ((i & 8) != 0) {
            int i4 = ah$b + 75;
            ah$a = i4 % 128;
            int i5 = i4 % 2;
            str7 = element.errorMessage;
        } else {
            str7 = str4;
        }
        Object[] objArr = null;
        if ((i & 16) != 0) {
            try {
                int i6 = ah$a + 107;
                ah$b = i6 % 128;
                if (i6 % 2 == 0) {
                    try {
                        str8 = element.promotionText;
                        int length = objArr.length;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    str8 = element.promotionText;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            str8 = str5;
        }
        if ((i & 32) == 0) {
            z2 = z;
        } else {
            z2 = element.isAvailable;
            int i7 = ah$a + 61;
            ah$b = i7 % 128;
            int i8 = i7 % 2;
        }
        InstrumentViewType instrumentViewType2 = !((i & 64) == 0) ? element.viewType : instrumentViewType;
        if ((i & 128) != 0) {
            int i9 = ah$a + 119;
            ah$b = i9 % 128;
            int i10 = i9 % 2;
            instrumentHealth2 = element.health;
        } else {
            instrumentHealth2 = instrumentHealth;
        }
        if ((i & 256) != 0) {
            int i11 = ah$a + 51;
            ah$b = i11 % 128;
            if (i11 % 2 == 0) {
                instrumentType2 = element.instrumentType;
                super.hashCode();
            } else {
                instrumentType2 = element.instrumentType;
            }
        } else {
            instrumentType2 = instrumentType;
        }
        if ((i & 512) != 0) {
            int i12 = ah$b + 59;
            ah$a = i12 % 128;
            if (i12 % 2 != 0) {
                list2 = element.paymentInstruments;
                super.hashCode();
            } else {
                list2 = element.paymentInstruments;
            }
        } else {
            list2 = list;
        }
        return element.copy(str6, str9, str10, str7, str8, z2, instrumentViewType2, instrumentHealth2, instrumentType2, list2);
    }

    public final String component1() {
        int i = ah$b + 29;
        ah$a = i % 128;
        if ((i % 2 != 0 ? 'I' : '0') != '0') {
            try {
                String str = this.title;
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            } catch (Exception e) {
                throw e;
            }
        }
        return this.title;
    }

    public final List<PaymentInstrument> component10() {
        int i = ah$b + 21;
        ah$a = i % 128;
        if (!(i % 2 == 0)) {
            List<PaymentInstrument> list = this.paymentInstruments;
            Object obj = null;
            super.hashCode();
            return list;
        }
        return this.paymentInstruments;
    }

    public final String component2() {
        int i = ah$b + 125;
        ah$a = i % 128;
        if ((i % 2 != 0 ? '%' : 'G') != '%') {
            return this.subtitle;
        }
        String str = this.subtitle;
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public final String component3() {
        int i = ah$a + 13;
        ah$b = i % 128;
        int i2 = i % 2;
        String str = this.iconUrl;
        int i3 = ah$a + 123;
        ah$b = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return str;
    }

    public final String component4() {
        try {
            int i = ah$b + 123;
            ah$a = i % 128;
            int i2 = i % 2;
            String str = this.errorMessage;
            int i3 = ah$a + 93;
            ah$b = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String component5() {
        int i = ah$a + 25;
        ah$b = i % 128;
        int i2 = i % 2;
        String str = this.promotionText;
        try {
            int i3 = ah$b + 103;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean component6() {
        int i = ah$b + 37;
        ah$a = i % 128;
        int i2 = i % 2;
        boolean z = this.isAvailable;
        int i3 = ah$b + 109;
        ah$a = i3 % 128;
        if (i3 % 2 == 0) {
            return z;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return z;
    }

    public final InstrumentViewType component7() {
        int i = ah$a + 103;
        ah$b = i % 128;
        int i2 = i % 2;
        InstrumentViewType instrumentViewType = this.viewType;
        try {
            int i3 = ah$b + 117;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return instrumentViewType;
        } catch (Exception e) {
            throw e;
        }
    }

    public final InstrumentHealth component8() {
        int i = ah$b + 51;
        ah$a = i % 128;
        int i2 = i % 2;
        try {
            InstrumentHealth instrumentHealth = this.health;
            int i3 = ah$b + 97;
            try {
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                return instrumentHealth;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final InstrumentType component9() {
        try {
            int i = ah$a + 87;
            ah$b = i % 128;
            if (!(i % 2 != 0)) {
                InstrumentType instrumentType = this.instrumentType;
                Object obj = null;
                super.hashCode();
                return instrumentType;
            }
            return this.instrumentType;
        } catch (Exception e) {
            throw e;
        }
    }

    public final Element copy(String str, String str2, String str3, String str4, String str5, boolean z, InstrumentViewType instrumentViewType, InstrumentHealth instrumentHealth, InstrumentType instrumentType, List<? extends PaymentInstrument> list) {
        runAnimators.ag$a(str, ag$a(null, null, 127 - View.getDefaultSize(0, 0), new byte[]{-124, -125, -127, -126, -127}).intern());
        runAnimators.ag$a(instrumentViewType, "viewType");
        runAnimators.ag$a(instrumentType, "instrumentType");
        Element element = new Element(str, str2, str3, str4, str5, z, instrumentViewType, instrumentHealth, instrumentType, list);
        int i = ah$b + 125;
        ah$a = i % 128;
        int i2 = i % 2;
        return element;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Element)) {
            int i = ah$a + 23;
            ah$b = i % 128;
            int i2 = i % 2;
            return false;
        }
        Element element = (Element) obj;
        if (!runAnimators.values((Object) this.title, (Object) element.title)) {
            int i3 = ah$b + 33;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!(runAnimators.values((Object) this.subtitle, (Object) element.subtitle))) {
            return false;
        }
        if ((!runAnimators.values((Object) this.iconUrl, (Object) element.iconUrl) ? '<' : (char) 4) == '<') {
            int i5 = ah$b + 61;
            ah$a = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        try {
            if ((!runAnimators.values((Object) this.errorMessage, (Object) element.errorMessage) ? '#' : '*') != '#') {
                if (!(!runAnimators.values((Object) this.promotionText, (Object) element.promotionText))) {
                    if (this.isAvailable != element.isAvailable) {
                        int i7 = ah$b + 101;
                        ah$a = i7 % 128;
                        return (i7 % 2 != 0 ? 'H' : 'a') == 'H';
                    }
                    try {
                        if (this.viewType != element.viewType) {
                            int i8 = ah$a + 123;
                            ah$b = i8 % 128;
                            int i9 = i8 % 2;
                            return false;
                        } else if (runAnimators.values(this.health, element.health)) {
                            return this.instrumentType == element.instrumentType && runAnimators.values(this.paymentInstruments, element.paymentInstruments);
                        } else {
                            int i10 = ah$a + 71;
                            ah$b = i10 % 128;
                            int i11 = i10 % 2;
                            return false;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
            }
            return false;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        r1 = r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r1 == null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r11 = this;
            int r0 = com.dreampay.commons.pay_instrument.Element.ah$a
            int r0 = r0 + 113
            int r1 = r0 % 128
            com.dreampay.commons.pay_instrument.Element.ah$b = r1
            int r0 = r0 % 2
            r1 = 35
            if (r0 != 0) goto L11
            r0 = 61
            goto L13
        L11:
            r0 = 35
        L13:
            r2 = 0
            if (r0 == r1) goto L21
            java.lang.String r0 = r11.title
            int r0 = r0.hashCode()
            java.lang.String r1 = r11.subtitle
            if (r1 != 0) goto L2d
            goto L2b
        L21:
            java.lang.String r0 = r11.title
            int r0 = r0.hashCode()
            java.lang.String r1 = r11.subtitle
            if (r1 != 0) goto L2d
        L2b:
            r1 = 0
            goto L31
        L2d:
            int r1 = r1.hashCode()
        L31:
            java.lang.String r3 = r11.iconUrl
            if (r3 != 0) goto L37
            r3 = 0
            goto L3b
        L37:
            int r3 = r3.hashCode()
        L3b:
            java.lang.String r4 = r11.errorMessage
            r5 = 1
            if (r4 != 0) goto L42
            r6 = 1
            goto L43
        L42:
            r6 = 0
        L43:
            if (r6 == r5) goto L4a
            int r4 = r4.hashCode()
            goto L4b
        L4a:
            r4 = 0
        L4b:
            java.lang.String r6 = r11.promotionText     // Catch: java.lang.Exception -> Lac
            if (r6 != 0) goto L5d
            int r6 = com.dreampay.commons.pay_instrument.Element.ah$b     // Catch: java.lang.Exception -> L5b
            int r6 = r6 + 11
            int r7 = r6 % 128
            com.dreampay.commons.pay_instrument.Element.ah$a = r7     // Catch: java.lang.Exception -> L5b
            int r6 = r6 % 2
            r6 = 0
            goto L61
        L5b:
            r0 = move-exception
            goto Lab
        L5d:
            int r6 = r6.hashCode()     // Catch: java.lang.Exception -> Lac
        L61:
            boolean r7 = r11.isAvailable     // Catch: java.lang.Exception -> L5b
            if (r7 == 0) goto L66
            goto L67
        L66:
            r5 = r7
        L67:
            com.dreampay.commons.pay_instrument.InstrumentViewType r7 = r11.viewType
            int r7 = r7.hashCode()
            com.dreampay.commons.cards.InstrumentHealth r8 = r11.health
            r9 = 45
            if (r8 != 0) goto L76
            r10 = 8
            goto L78
        L76:
            r10 = 45
        L78:
            if (r10 == r9) goto L7c
            r8 = 0
            goto L80
        L7c:
            int r8 = r8.hashCode()
        L80:
            com.dreampay.commons.pay_instrument.InstrumentType r9 = r11.instrumentType
            int r9 = r9.hashCode()
            java.util.List<com.dreampay.commons.pay_instrument.PaymentInstrument> r10 = r11.paymentInstruments
            if (r10 != 0) goto L8b
            goto L8f
        L8b:
            int r2 = r10.hashCode()
        L8f:
            int r0 = r0 * 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r0 = r0 + r3
            int r0 = r0 * 31
            int r0 = r0 + r4
            int r0 = r0 * 31
            int r0 = r0 + r6
            int r0 = r0 * 31
            int r0 = r0 + r5
            int r0 = r0 * 31
            int r0 = r0 + r7
            int r0 = r0 * 31
            int r0 = r0 + r8
            int r0 = r0 * 31
            int r0 = r0 + r9
            int r0 = r0 * 31
            int r0 = r0 + r2
            return r0
        Lab:
            throw r0
        Lac:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dreampay.commons.pay_instrument.Element.hashCode():int");
    }

    public String toString() {
        String str = "Element(title=" + this.title + ", subtitle=" + ((Object) this.subtitle) + ", iconUrl=" + ((Object) this.iconUrl) + ", errorMessage=" + ((Object) this.errorMessage) + ", promotionText=" + ((Object) this.promotionText) + ", isAvailable=" + this.isAvailable + ", viewType=" + this.viewType + ", health=" + this.health + ", instrumentType=" + this.instrumentType + ", paymentInstruments=" + this.paymentInstruments + ')';
        int i = ah$b + 63;
        ah$a = i % 128;
        if ((i % 2 != 0 ? (char) 4 : 'M') != 4) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Element(String str, String str2, String str3, String str4, String str5, boolean z, InstrumentViewType instrumentViewType, InstrumentHealth instrumentHealth, InstrumentType instrumentType, List<? extends PaymentInstrument> list) {
        runAnimators.ag$a(str, ag$a(null, null, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, new byte[]{-124, -125, -127, -126, -127}).intern());
        runAnimators.ag$a(instrumentViewType, "viewType");
        runAnimators.ag$a(instrumentType, "instrumentType");
        this.title = str;
        this.subtitle = str2;
        this.iconUrl = str3;
        this.errorMessage = str4;
        this.promotionText = str5;
        this.isAvailable = z;
        this.viewType = instrumentViewType;
        this.health = instrumentHealth;
        this.instrumentType = instrumentType;
        this.paymentInstruments = list;
    }

    public final String getTitle() {
        int i = ah$a + 53;
        ah$b = i % 128;
        int i2 = i % 2;
        String str = this.title;
        try {
            int i3 = ah$a + 11;
            try {
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

    public final String getSubtitle() {
        try {
            int i = ah$a + 103;
            ah$b = i % 128;
            int i2 = i % 2;
            String str = this.subtitle;
            try {
                int i3 = ah$b + 101;
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getIconUrl() {
        try {
            int i = ah$a + 37;
            ah$b = i % 128;
            int i2 = i % 2;
            String str = this.iconUrl;
            int i3 = ah$b + 29;
            ah$a = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 27 : (char) 19) != 19) {
                int i4 = 89 / 0;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getErrorMessage() {
        String str;
        int i = ah$a + 87;
        ah$b = i % 128;
        Object obj = null;
        if (i % 2 != 0) {
            str = this.errorMessage;
        } else {
            str = this.errorMessage;
            super.hashCode();
        }
        int i2 = ah$a + 113;
        ah$b = i2 % 128;
        if ((i2 % 2 == 0 ? '>' : '&') != '&') {
            super.hashCode();
            return str;
        }
        return str;
    }

    public final String getPromotionText() {
        int i = ah$b + 81;
        ah$a = i % 128;
        int i2 = i % 2;
        try {
            String str = this.promotionText;
            int i3 = ah$b + 99;
            ah$a = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 14 : '\b') != 14) {
                return str;
            }
            int i4 = 32 / 0;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean isAvailable() {
        int i = ah$a + 55;
        ah$b = i % 128;
        int i2 = i % 2;
        boolean z = this.isAvailable;
        try {
            int i3 = ah$a + 117;
            ah$b = i3 % 128;
            if ((i3 % 2 == 0 ? 'M' : (char) 14) != 14) {
                Object obj = null;
                super.hashCode();
                return z;
            }
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    public final InstrumentViewType getViewType() {
        InstrumentViewType instrumentViewType;
        int i = ah$b + 25;
        ah$a = i % 128;
        if (!(i % 2 != 0)) {
            instrumentViewType = this.viewType;
        } else {
            instrumentViewType = this.viewType;
            Object obj = null;
            super.hashCode();
        }
        int i2 = ah$b + 17;
        ah$a = i2 % 128;
        if ((i2 % 2 != 0 ? 'F' : 'J') != 'F') {
            return instrumentViewType;
        }
        int i3 = 53 / 0;
        return instrumentViewType;
    }

    public final InstrumentHealth getHealth() {
        int i = ah$b + 77;
        ah$a = i % 128;
        int i2 = i % 2;
        InstrumentHealth instrumentHealth = this.health;
        int i3 = ah$a + 47;
        ah$b = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 28 : (char) 21) != 21) {
            Object[] objArr = null;
            int length = objArr.length;
            return instrumentHealth;
        }
        return instrumentHealth;
    }

    public final InstrumentType getInstrumentType() {
        int i = ah$b + 43;
        ah$a = i % 128;
        int i2 = i % 2;
        try {
            InstrumentType instrumentType = this.instrumentType;
            int i3 = ah$a + 11;
            ah$b = i3 % 128;
            if ((i3 % 2 == 0 ? '>' : 'O') != 'O') {
                Object[] objArr = null;
                int length = objArr.length;
                return instrumentType;
            }
            return instrumentType;
        } catch (Exception e) {
            throw e;
        }
    }

    public final List<PaymentInstrument> getPaymentInstruments() {
        int i = ah$a + 99;
        ah$b = i % 128;
        int i2 = i % 2;
        List<PaymentInstrument> list = this.paymentInstruments;
        int i3 = ah$b + 109;
        ah$a = i3 % 128;
        if ((i3 % 2 != 0 ? TokenParser.CR : 'K') != 'K') {
            int i4 = 71 / 0;
            return list;
        }
        return list;
    }

    private static String ag$a(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = toString;
            int i2 = values;
            if (valueOf) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (ag$a) {
                int length2 = cArr.length;
                isLast.values = length2;
                char[] cArr4 = new char[length2];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr4);
            } else {
                int length3 = iArr.length;
                isLast.values = length3;
                char[] cArr5 = new char[length3];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr5);
            }
        }
    }
}
