package com.dreampay.commons.pay_instrument;

import o.runAnimators;
/* loaded from: classes6.dex */
public final class UpiInstrument extends PaymentInstrument {
    private final String appName;
    private final String code;
    private final String iconUrl;
    private final String name;
    private final String vpa;

    public static /* synthetic */ UpiInstrument copy$default(UpiInstrument upiInstrument, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upiInstrument.name;
        }
        if ((i & 2) != 0) {
            str2 = upiInstrument.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = upiInstrument.appName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = upiInstrument.vpa;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = upiInstrument.getIconUrl();
        }
        return upiInstrument.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.appName;
    }

    public final String component4() {
        return this.vpa;
    }

    public final String component5() {
        return getIconUrl();
    }

    public final UpiInstrument copy(String str, String str2, String str3, String str4, String str5) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "code");
        return new UpiInstrument(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpiInstrument) {
            UpiInstrument upiInstrument = (UpiInstrument) obj;
            return runAnimators.values((Object) this.name, (Object) upiInstrument.name) && runAnimators.values((Object) this.code, (Object) upiInstrument.code) && runAnimators.values((Object) this.appName, (Object) upiInstrument.appName) && runAnimators.values((Object) this.vpa, (Object) upiInstrument.vpa) && runAnimators.values((Object) getIconUrl(), (Object) upiInstrument.getIconUrl());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.code.hashCode();
        String str = this.appName;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.vpa;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + (getIconUrl() != null ? getIconUrl().hashCode() : 0);
    }

    public String toString() {
        return "UpiInstrument(name=" + this.name + ", code=" + this.code + ", appName=" + ((Object) this.appName) + ", vpa=" + ((Object) this.vpa) + ", iconUrl=" + ((Object) getIconUrl()) + ')';
    }

    public final String getName() {
        return this.name;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getVpa() {
        return this.vpa;
    }

    @Override // com.dreampay.commons.pay_instrument.PaymentInstrument
    public String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UpiInstrument(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r15 = this;
            r11 = r15
            r12 = r16
            r13 = r17
            r14 = r19
            java.lang.String r0 = "name"
            o.runAnimators.ag$a(r12, r0)
            java.lang.String r0 = "code"
            o.runAnimators.ag$a(r13, r0)
            r0 = r14
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L21
            int r3 = r0.length()
            if (r3 != 0) goto L1f
            goto L21
        L1f:
            r3 = 0
            goto L22
        L21:
            r3 = 1
        L22:
            if (r3 == 0) goto L26
            r3 = r12
            goto L27
        L26:
            r3 = r14
        L27:
            if (r0 == 0) goto L31
            int r0 = r0.length()
            if (r0 != 0) goto L30
            goto L31
        L30:
            r1 = 0
        L31:
            if (r1 == 0) goto L36
            r0 = 0
            r4 = r0
            goto L38
        L36:
            r4 = r18
        L38:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 240(0xf0, float:3.36E-43)
            r10 = 0
            r0 = r15
            r1 = r3
            r2 = r16
            r3 = r4
            r4 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.name = r12
            r11.code = r13
            r0 = r18
            r11.appName = r0
            r11.vpa = r14
            r0 = r20
            r11.iconUrl = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dreampay.commons.pay_instrument.UpiInstrument.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
