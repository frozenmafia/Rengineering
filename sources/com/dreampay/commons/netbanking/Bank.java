package com.dreampay.commons.netbanking;

import o.runAnimators;
/* loaded from: classes6.dex */
public final class Bank {
    private final String code;
    private final Boolean isAvailable;
    private final String logoUrl;
    private final String name;
    private final String promotionText;

    public static /* synthetic */ Bank copy$default(Bank bank, String str, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bank.name;
        }
        if ((i & 2) != 0) {
            str2 = bank.code;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bank.logoUrl;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = bank.promotionText;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            bool = bank.isAvailable;
        }
        return bank.copy(str, str5, str6, str7, bool);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.logoUrl;
    }

    public final String component4() {
        return this.promotionText;
    }

    public final Boolean component5() {
        return this.isAvailable;
    }

    public final Bank copy(String str, String str2, String str3, String str4, Boolean bool) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "code");
        return new Bank(str, str2, str3, str4, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Bank) {
            Bank bank = (Bank) obj;
            return runAnimators.values((Object) this.name, (Object) bank.name) && runAnimators.values((Object) this.code, (Object) bank.code) && runAnimators.values((Object) this.logoUrl, (Object) bank.logoUrl) && runAnimators.values((Object) this.promotionText, (Object) bank.promotionText) && runAnimators.values(this.isAvailable, bank.isAvailable);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.code.hashCode();
        String str = this.logoUrl;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.promotionText;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isAvailable;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "Bank(name=" + this.name + ", code=" + this.code + ", logoUrl=" + ((Object) this.logoUrl) + ", promotionText=" + ((Object) this.promotionText) + ", isAvailable=" + this.isAvailable + ')';
    }

    public Bank(String str, String str2, String str3, String str4, Boolean bool) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "code");
        this.name = str;
        this.code = str2;
        this.logoUrl = str3;
        this.promotionText = str4;
        this.isAvailable = bool;
    }

    public final String getName() {
        return this.name;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getPromotionText() {
        return this.promotionText;
    }

    public final Boolean isAvailable() {
        return this.isAvailable;
    }
}
