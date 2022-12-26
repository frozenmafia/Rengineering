package com.dreampay.commons.pay_instrument;

import o.runAnimators;
/* loaded from: classes6.dex */
public final class NetBankingInstrument extends PaymentInstrument {
    private final String code;
    private final String iconUrl;
    private final String name;

    public static /* synthetic */ NetBankingInstrument copy$default(NetBankingInstrument netBankingInstrument, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = netBankingInstrument.name;
        }
        if ((i & 2) != 0) {
            str2 = netBankingInstrument.code;
        }
        if ((i & 4) != 0) {
            str3 = netBankingInstrument.getIconUrl();
        }
        return netBankingInstrument.copy(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return getIconUrl();
    }

    public final NetBankingInstrument copy(String str, String str2, String str3) {
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "code");
        return new NetBankingInstrument(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NetBankingInstrument) {
            NetBankingInstrument netBankingInstrument = (NetBankingInstrument) obj;
            return runAnimators.values((Object) this.name, (Object) netBankingInstrument.name) && runAnimators.values((Object) this.code, (Object) netBankingInstrument.code) && runAnimators.values((Object) getIconUrl(), (Object) netBankingInstrument.getIconUrl());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode();
        return (((hashCode * 31) + this.code.hashCode()) * 31) + (getIconUrl() == null ? 0 : getIconUrl().hashCode());
    }

    public String toString() {
        return "NetBankingInstrument(name=" + this.name + ", code=" + this.code + ", iconUrl=" + ((Object) getIconUrl()) + ')';
    }

    public final String getName() {
        return this.name;
    }

    public final String getCode() {
        return this.code;
    }

    @Override // com.dreampay.commons.pay_instrument.PaymentInstrument
    public String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetBankingInstrument(String str, String str2, String str3) {
        super(str, null, null, str3, null, false, null, null, 240, null);
        runAnimators.ag$a(str, "name");
        runAnimators.ag$a(str2, "code");
        this.name = str;
        this.code = str2;
        this.iconUrl = str3;
    }
}
