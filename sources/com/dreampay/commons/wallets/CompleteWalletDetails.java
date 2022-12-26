package com.dreampay.commons.wallets;

import o.runAnimators;
/* loaded from: classes6.dex */
public final class CompleteWalletDetails implements PayInstrumentItemDetails {
    private final Double balance;
    private final String code;
    private final String errorMessage;
    private final String iconUrl;
    private final boolean isLinked;
    private final Boolean linkable;
    private final String name;
    private final String promotionText;
    private final Boolean rechargeable;

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return getIconUrl();
    }

    public final Double component4() {
        return this.balance;
    }

    public final boolean component5() {
        return this.isLinked;
    }

    public final Boolean component6() {
        return this.linkable;
    }

    public final Boolean component7() {
        return this.rechargeable;
    }

    public final String component8() {
        return this.errorMessage;
    }

    public final String component9() {
        return this.promotionText;
    }

    public final CompleteWalletDetails copy(String str, String str2, String str3, Double d, boolean z, Boolean bool, Boolean bool2, String str4, String str5) {
        runAnimators.ag$a(str, "code");
        runAnimators.ag$a(str2, "name");
        return new CompleteWalletDetails(str, str2, str3, d, z, bool, bool2, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CompleteWalletDetails) {
            CompleteWalletDetails completeWalletDetails = (CompleteWalletDetails) obj;
            return runAnimators.values((Object) this.code, (Object) completeWalletDetails.code) && runAnimators.values((Object) this.name, (Object) completeWalletDetails.name) && runAnimators.values((Object) getIconUrl(), (Object) completeWalletDetails.getIconUrl()) && runAnimators.values(this.balance, completeWalletDetails.balance) && this.isLinked == completeWalletDetails.isLinked && runAnimators.values(this.linkable, completeWalletDetails.linkable) && runAnimators.values(this.rechargeable, completeWalletDetails.rechargeable) && runAnimators.values((Object) this.errorMessage, (Object) completeWalletDetails.errorMessage) && runAnimators.values((Object) this.promotionText, (Object) completeWalletDetails.promotionText);
        }
        return false;
    }

    @Override // com.dreampay.commons.wallets.PayInstrumentItemDetails
    public String getSubtitle() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.code.hashCode();
        int hashCode2 = this.name.hashCode();
        int hashCode3 = getIconUrl() == null ? 0 : getIconUrl().hashCode();
        Double d = this.balance;
        int hashCode4 = d == null ? 0 : d.hashCode();
        boolean z = this.isLinked;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        Boolean bool = this.linkable;
        int hashCode5 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.rechargeable;
        int hashCode6 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.errorMessage;
        int hashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.promotionText;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CompleteWalletDetails(code=" + this.code + ", name=" + this.name + ", iconUrl=" + ((Object) getIconUrl()) + ", balance=" + this.balance + ", isLinked=" + this.isLinked + ", linkable=" + this.linkable + ", rechargeable=" + this.rechargeable + ", errorMessage=" + ((Object) this.errorMessage) + ", promotionText=" + ((Object) this.promotionText) + ')';
    }

    public CompleteWalletDetails(String str, String str2, String str3, Double d, boolean z, Boolean bool, Boolean bool2, String str4, String str5) {
        runAnimators.ag$a(str, "code");
        runAnimators.ag$a(str2, "name");
        this.code = str;
        this.name = str2;
        this.iconUrl = str3;
        this.balance = d;
        this.isLinked = z;
        this.linkable = bool;
        this.rechargeable = bool2;
        this.errorMessage = str4;
        this.promotionText = str5;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    @Override // com.dreampay.commons.wallets.PayInstrumentItemDetails
    public String getIconUrl() {
        return this.iconUrl;
    }

    public final Double getBalance() {
        return this.balance;
    }

    public final boolean isLinked() {
        return this.isLinked;
    }

    public final Boolean getLinkable() {
        return this.linkable;
    }

    public final Boolean getRechargeable() {
        return this.rechargeable;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getPromotionText() {
        return this.promotionText;
    }

    @Override // com.dreampay.commons.wallets.PayInstrumentItemDetails
    public String getTitle() {
        return this.name;
    }

    @Override // com.dreampay.commons.wallets.PayInstrumentItemDetails
    public String getOtherInfo() {
        Double d;
        boolean z = this.isLinked;
        return !z ? "Link Now" : (!z || (d = this.balance) == null) ? "" : runAnimators.values("₹", (Object) d);
    }
}
