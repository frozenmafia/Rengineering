package com.dreampay.commons.pay_instrument;

import o.runAnimators;
/* loaded from: classes6.dex */
public final class WalletInstrument extends PaymentInstrument {
    private final String code;
    private final String iconUrl;
    private final Boolean isLinkable;
    private final Boolean isRechargeable;
    private final String name;

    public static /* synthetic */ WalletInstrument copy$default(WalletInstrument walletInstrument, String str, String str2, Boolean bool, Boolean bool2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletInstrument.name;
        }
        if ((i & 2) != 0) {
            str2 = walletInstrument.code;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            bool = walletInstrument.isLinkable;
        }
        Boolean bool3 = bool;
        if ((i & 8) != 0) {
            bool2 = walletInstrument.isRechargeable;
        }
        Boolean bool4 = bool2;
        if ((i & 16) != 0) {
            str3 = walletInstrument.getIconUrl();
        }
        return walletInstrument.copy(str, str4, bool3, bool4, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.code;
    }

    public final Boolean component3() {
        return this.isLinkable;
    }

    public final Boolean component4() {
        return this.isRechargeable;
    }

    public final String component5() {
        return getIconUrl();
    }

    public final WalletInstrument copy(String str, String str2, Boolean bool, Boolean bool2, String str3) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "code");
        return new WalletInstrument(str, str2, bool, bool2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletInstrument) {
            WalletInstrument walletInstrument = (WalletInstrument) obj;
            return runAnimators.values((Object) this.name, (Object) walletInstrument.name) && runAnimators.values((Object) this.code, (Object) walletInstrument.code) && runAnimators.values(this.isLinkable, walletInstrument.isLinkable) && runAnimators.values(this.isRechargeable, walletInstrument.isRechargeable) && runAnimators.values((Object) getIconUrl(), (Object) walletInstrument.getIconUrl());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.code.hashCode();
        Boolean bool = this.isLinkable;
        int hashCode3 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isRechargeable;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool2 == null ? 0 : bool2.hashCode())) * 31) + (getIconUrl() != null ? getIconUrl().hashCode() : 0);
    }

    public String toString() {
        return "WalletInstrument(name=" + this.name + ", code=" + this.code + ", isLinkable=" + this.isLinkable + ", isRechargeable=" + this.isRechargeable + ", iconUrl=" + ((Object) getIconUrl()) + ')';
    }

    public final String getName() {
        return this.name;
    }

    public final String getCode() {
        return this.code;
    }

    public final Boolean isLinkable() {
        return this.isLinkable;
    }

    public final Boolean isRechargeable() {
        return this.isRechargeable;
    }

    @Override // com.dreampay.commons.pay_instrument.PaymentInstrument
    public String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletInstrument(String str, String str2, Boolean bool, Boolean bool2, String str3) {
        super(str, null, null, str3, null, false, null, null, 240, null);
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "code");
        this.name = str;
        this.code = str2;
        this.isLinkable = bool;
        this.isRechargeable = bool2;
        this.iconUrl = str3;
    }
}
