package com.app.dream11.payment.deposit.paymentoffers;

import android.graphics.Color;
import android.view.ViewConfiguration;
import java.io.Serializable;
import java.util.List;
import o.moveToFirst;
import o.runAnimators;
import org.apache.commons.codec.language.Soundex;
/* loaded from: classes3.dex */
public final class PaymentOffer implements Serializable {
    private static int HaptikSDK$a = 1;
    private static char ag$a = 35002;
    private static char ah$a = 62052;
    private static char toString = 48290;
    private static char valueOf = 45164;
    private static int values;
    private final String description;
    private final String iconUrl;
    private final String shortText;
    private final String title;
    private final List<String> tnc;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if ((r9 & 1) != 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        r4 = com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.HaptikSDK$a + 103;
        com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.values = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if ((r4 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        r4 = r3.title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        r10 = 24 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
        r4 = r3.title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        if ((r9 & 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        r5 = r3.iconUrl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
        if ((r9 & 4) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
        r5 = 27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
        r5 = '/';
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r5 == 27) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
        r6 = r3.shortText;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
        if ((r9 & 8) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0052, code lost:
        r5 = com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.HaptikSDK$a + 9;
        com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.values = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
        if ((r5 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
        r5 = r3.description;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
        r6 = 89 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
        r5 = r3.description;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0068, code lost:
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0069, code lost:
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
        if ((r9 & 16) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0070, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0071, code lost:
        if (r0 == true) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0073, code lost:
        r8 = r3.tnc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0076, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0077, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
        return r3.copy(r4, r10, r1, r2, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (((r9 | 1) != 0 ? '1' : 'R') != '1') goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.app.dream11.payment.deposit.paymentoffers.PaymentOffer copy$default(com.app.dream11.payment.deposit.paymentoffers.PaymentOffer r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.List r8, int r9, java.lang.Object r10) {
        /*
            int r10 = com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.HaptikSDK$a
            int r10 = r10 + 15
            int r0 = r10 % 128
            com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.values = r0
            int r10 = r10 % 2
            r0 = 0
            if (r10 == 0) goto L1b
            r10 = r9 | 1
            r1 = 49
            if (r10 == 0) goto L16
            r10 = 49
            goto L18
        L16:
            r10 = 82
        L18:
            if (r10 == r1) goto L1f
            goto L35
        L1b:
            r10 = r9 & 1
            if (r10 == 0) goto L35
        L1f:
            int r4 = com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.HaptikSDK$a
            int r4 = r4 + 103
            int r10 = r4 % 128
            com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.values = r10
            int r4 = r4 % 2
            if (r4 == 0) goto L33
            java.lang.String r4 = r3.title
            r10 = 24
            int r10 = r10 / r0
            goto L35
        L31:
            r3 = move-exception
            throw r3
        L33:
            java.lang.String r4 = r3.title
        L35:
            r10 = r9 & 2
            if (r10 == 0) goto L3b
            java.lang.String r5 = r3.iconUrl
        L3b:
            r10 = r5
            r5 = r9 & 4
            r1 = 27
            if (r5 == 0) goto L45
            r5 = 27
            goto L47
        L45:
            r5 = 47
        L47:
            if (r5 == r1) goto L4b
        L49:
            r1 = r6
            goto L4e
        L4b:
            java.lang.String r6 = r3.shortText
            goto L49
        L4e:
            r5 = r9 & 8
            if (r5 == 0) goto L69
            int r5 = com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.HaptikSDK$a
            int r5 = r5 + 9
            int r6 = r5 % 128
            com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.values = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L66
            java.lang.String r5 = r3.description
            r6 = 89
            int r6 = r6 / r0
            goto L68
        L64:
            r3 = move-exception
            throw r3
        L66:
            java.lang.String r5 = r3.description
        L68:
            r7 = r5
        L69:
            r2 = r7
            r5 = r9 & 16
            r6 = 1
            if (r5 == 0) goto L70
            goto L71
        L70:
            r0 = 1
        L71:
            if (r0 == r6) goto L78
            java.util.List<java.lang.String> r8 = r3.tnc     // Catch: java.lang.Exception -> L76
            goto L78
        L76:
            r3 = move-exception
            throw r3
        L78:
            r0 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r2
            r10 = r0
            com.app.dream11.payment.deposit.paymentoffers.PaymentOffer r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.copy$default(com.app.dream11.payment.deposit.paymentoffers.PaymentOffer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, java.lang.Object):com.app.dream11.payment.deposit.paymentoffers.PaymentOffer");
    }

    public final String component1() {
        int i = HaptikSDK$a + 37;
        values = i % 128;
        if ((i % 2 != 0 ? '>' : (char) 28) != '>') {
            return this.title;
        }
        int i2 = 81 / 0;
        return this.title;
    }

    public final String component2() {
        int i = values + 35;
        HaptikSDK$a = i % 128;
        if ((i % 2 == 0 ? (char) 15 : '^') != '^') {
            int i2 = 95 / 0;
            return this.iconUrl;
        }
        try {
            return this.iconUrl;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String component3() {
        int i = HaptikSDK$a + 105;
        values = i % 128;
        int i2 = i % 2;
        String str = this.shortText;
        int i3 = HaptikSDK$a + 23;
        values = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 29 : '+') != '+') {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    public final String component4() {
        String str;
        int i = values + 73;
        HaptikSDK$a = i % 128;
        if (i % 2 == 0) {
            str = this.description;
            Object obj = null;
            super.hashCode();
        } else {
            str = this.description;
        }
        int i2 = HaptikSDK$a + 81;
        values = i2 % 128;
        if (!(i2 % 2 == 0)) {
            int i3 = 55 / 0;
            return str;
        }
        return str;
    }

    public final List<String> component5() {
        List<String> list;
        int i = HaptikSDK$a + 43;
        values = i % 128;
        if ((i % 2 != 0 ? Soundex.SILENT_MARKER : 'A') != '-') {
            list = this.tnc;
        } else {
            try {
                list = this.tnc;
                int i2 = 38 / 0;
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = values + 17;
        HaptikSDK$a = i3 % 128;
        if ((i3 % 2 == 0 ? '5' : ':') != '5') {
            return list;
        }
        int i4 = 80 / 0;
        return list;
    }

    public final PaymentOffer copy(String str, String str2, String str3, String str4, List<String> list) {
        runAnimators.ag$a(str, valueOf(new char[]{42715, 46039, 22247, 49160, 22854, 43019}, Color.alpha(0) + 5).intern());
        runAnimators.ag$a(str2, "iconUrl");
        PaymentOffer paymentOffer = new PaymentOffer(str, str2, str3, str4, list);
        int i = values + 115;
        HaptikSDK$a = i % 128;
        if ((i % 2 == 0 ? 'D' : 'G') != 'D') {
            return paymentOffer;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return paymentOffer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if ((r6 == r7 ? 'Z' : '#') != 'Z') goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r6 == r7) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        if ((r7 instanceof com.app.dream11.payment.deposit.paymentoffers.PaymentOffer) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        r7 = com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.HaptikSDK$a + 59;
        com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.values = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
        r7 = (com.app.dream11.payment.deposit.paymentoffers.PaymentOffer) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (o.runAnimators.values((java.lang.Object) r6.title, (java.lang.Object) r7.title) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        r2 = '#';
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r2 == '#') goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        if (o.runAnimators.values((java.lang.Object) r6.iconUrl, (java.lang.Object) r7.iconUrl) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        r0 = '&';
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
        if (r0 == 6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
        r7 = com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.values + 103;
        com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.HaptikSDK$a = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
        if (o.runAnimators.values((java.lang.Object) r6.shortText, (java.lang.Object) r7.shortText) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
        if (o.runAnimators.values((java.lang.Object) r6.description, (java.lang.Object) r7.description) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
        r7 = com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.HaptikSDK$a + 15;
        com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.values = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
        if (o.runAnimators.values(r6.tnc, r7.tnc) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
        if (r7 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0097, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0099, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009a, code lost:
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.values
            int r0 = r0 + 69
            int r1 = r0 % 128
            com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.HaptikSDK$a = r1
            int r0 = r0 % 2
            r1 = 91
            r2 = 99
            if (r0 != 0) goto L13
            r0 = 99
            goto L15
        L13:
            r0 = 91
        L15:
            r3 = 1
            r4 = 35
            r5 = 0
            if (r0 == r2) goto L27
            r0 = 90
            if (r6 != r7) goto L22
            r1 = 90
            goto L24
        L22:
            r1 = 35
        L24:
            if (r1 == r0) goto L2a
            goto L2b
        L27:
            int r1 = r1 / r5
            if (r6 != r7) goto L2b
        L2a:
            return r3
        L2b:
            boolean r0 = r7 instanceof com.app.dream11.payment.deposit.paymentoffers.PaymentOffer
            if (r0 != 0) goto L3a
            int r7 = com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.HaptikSDK$a
            int r7 = r7 + 59
            int r0 = r7 % 128
            com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.values = r0
            int r7 = r7 % 2
            return r5
        L3a:
            com.app.dream11.payment.deposit.paymentoffers.PaymentOffer r7 = (com.app.dream11.payment.deposit.paymentoffers.PaymentOffer) r7
            java.lang.String r0 = r6.title
            java.lang.String r1 = r7.title
            boolean r0 = o.runAnimators.values(r0, r1)
            if (r0 != 0) goto L48
            r2 = 35
        L48:
            if (r2 == r4) goto L9b
            java.lang.String r0 = r6.iconUrl     // Catch: java.lang.Exception -> L99
            java.lang.String r1 = r7.iconUrl     // Catch: java.lang.Exception -> L99
            boolean r0 = o.runAnimators.values(r0, r1)     // Catch: java.lang.Exception -> L97
            r1 = 6
            if (r0 != 0) goto L58
            r0 = 38
            goto L59
        L58:
            r0 = 6
        L59:
            if (r0 == r1) goto L66
            int r7 = com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.values
            int r7 = r7 + 103
            int r0 = r7 % 128
            com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.HaptikSDK$a = r0
            int r7 = r7 % 2
            return r5
        L66:
            java.lang.String r0 = r6.shortText
            java.lang.String r1 = r7.shortText
            boolean r0 = o.runAnimators.values(r0, r1)
            if (r0 != 0) goto L71
            return r5
        L71:
            java.lang.String r0 = r6.description
            java.lang.String r1 = r7.description
            boolean r0 = o.runAnimators.values(r0, r1)
            if (r0 != 0) goto L86
            int r7 = com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.HaptikSDK$a     // Catch: java.lang.Exception -> L99
            int r7 = r7 + 15
            int r0 = r7 % 128
            com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.values = r0     // Catch: java.lang.Exception -> L99
            int r7 = r7 % 2
            return r5
        L86:
            java.util.List<java.lang.String> r0 = r6.tnc
            java.util.List<java.lang.String> r7 = r7.tnc
            boolean r7 = o.runAnimators.values(r0, r7)
            if (r7 != 0) goto L92
            r7 = 0
            goto L93
        L92:
            r7 = 1
        L93:
            if (r7 == 0) goto L96
            return r3
        L96:
            return r5
        L97:
            r7 = move-exception
            throw r7
        L99:
            r7 = move-exception
            throw r7
        L9b:
            return r5
        L9c:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.payment.deposit.paymentoffers.PaymentOffer.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.title.hashCode();
        int hashCode3 = this.iconUrl.hashCode();
        String str = this.shortText;
        int i = 0;
        int hashCode4 = !(str != null) ? 0 : str.hashCode();
        String str2 = this.description;
        if (str2 == null) {
            int i2 = HaptikSDK$a + 73;
            values = i2 % 128;
            int i3 = i2 % 2;
            hashCode = 0;
        } else {
            try {
                hashCode = str2.hashCode();
            } catch (Exception e) {
                throw e;
            }
        }
        List<String> list = this.tnc;
        if (list != null) {
            i = list.hashCode();
            try {
                int i4 = HaptikSDK$a + 45;
                values = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        }
        return (((((((hashCode2 * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode) * 31) + i;
    }

    public String toString() {
        String str = "PaymentOffer(title=" + this.title + ", iconUrl=" + this.iconUrl + ", shortText=" + this.shortText + ", description=" + this.description + ", tnc=" + this.tnc + ")";
        try {
            int i = values + 67;
            try {
                HaptikSDK$a = i % 128;
                int i2 = i % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public PaymentOffer(String str, String str2, String str3, String str4, List<String> list) {
        runAnimators.ag$a(str, valueOf(new char[]{42715, 46039, 22247, 49160, 22854, 43019}, 5 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        runAnimators.ag$a(str2, "iconUrl");
        this.title = str;
        this.iconUrl = str2;
        this.shortText = str3;
        this.description = str4;
        this.tnc = list;
    }

    public final String getTitle() {
        int i = HaptikSDK$a + 55;
        values = i % 128;
        int i2 = i % 2;
        String str = this.title;
        int i3 = values + 125;
        HaptikSDK$a = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        int i4 = 13 / 0;
        return str;
    }

    public final String getIconUrl() {
        String str;
        int i = values + 71;
        HaptikSDK$a = i % 128;
        if (!(i % 2 != 0)) {
            try {
                str = this.iconUrl;
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.iconUrl;
        }
        try {
            int i2 = values + 47;
            HaptikSDK$a = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getShortText() {
        String str;
        int i = HaptikSDK$a + 11;
        values = i % 128;
        if (i % 2 != 0) {
            str = this.shortText;
            Object obj = null;
            super.hashCode();
        } else {
            str = this.shortText;
        }
        int i2 = HaptikSDK$a + 83;
        values = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String getDescription() {
        try {
            int i = values + 63;
            HaptikSDK$a = i % 128;
            if ((i % 2 == 0 ? '!' : '\b') != '!') {
                return this.description;
            }
            String str = this.description;
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final List<String> getTnc() {
        try {
            int i = values + 125;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            List<String> list = this.tnc;
            int i3 = HaptikSDK$a + 57;
            values = i3 % 128;
            int i4 = i3 % 2;
            return list;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ah$a)) ^ ((cArr3[0] >>> 5) + ag$a)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + toString)) ^ ((cArr3[1] >>> 5) + valueOf)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
