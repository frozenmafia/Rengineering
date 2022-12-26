package com.dreampay.commons.cards;

import o.runAnimators;
/* loaded from: classes4.dex */
public final class ConsentData {
    private final String backgroundColor;
    private final String consentInfoText;
    private final String consentMessage;
    private final ConsentType consentType;
    private final String disableMessage;
    private final String pennyDropMessage;
    private boolean preSelectConsent;
    private final String textColor;
    private final TokenizationEnforceData tokenisationEnforceData;
    private final TokenizationKnowMoreData tokenisationKnowMoreData;

    public final ConsentType component1() {
        return this.consentType;
    }

    public final boolean component10() {
        return this.preSelectConsent;
    }

    public final String component2() {
        return this.consentMessage;
    }

    public final String component3() {
        return this.consentInfoText;
    }

    public final String component4() {
        return this.disableMessage;
    }

    public final String component5() {
        return this.pennyDropMessage;
    }

    public final String component6() {
        return this.backgroundColor;
    }

    public final String component7() {
        return this.textColor;
    }

    public final TokenizationKnowMoreData component8() {
        return this.tokenisationKnowMoreData;
    }

    public final TokenizationEnforceData component9() {
        return this.tokenisationEnforceData;
    }

    public final ConsentData copy(ConsentType consentType, String str, String str2, String str3, String str4, String str5, String str6, TokenizationKnowMoreData tokenizationKnowMoreData, TokenizationEnforceData tokenizationEnforceData, boolean z) {
        runAnimators.ag$a(consentType, "consentType");
        return new ConsentData(consentType, str, str2, str3, str4, str5, str6, tokenizationKnowMoreData, tokenizationEnforceData, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentData) {
            ConsentData consentData = (ConsentData) obj;
            return this.consentType == consentData.consentType && runAnimators.values((Object) this.consentMessage, (Object) consentData.consentMessage) && runAnimators.values((Object) this.consentInfoText, (Object) consentData.consentInfoText) && runAnimators.values((Object) this.disableMessage, (Object) consentData.disableMessage) && runAnimators.values((Object) this.pennyDropMessage, (Object) consentData.pennyDropMessage) && runAnimators.values((Object) this.backgroundColor, (Object) consentData.backgroundColor) && runAnimators.values((Object) this.textColor, (Object) consentData.textColor) && runAnimators.values(this.tokenisationKnowMoreData, consentData.tokenisationKnowMoreData) && runAnimators.values(this.tokenisationEnforceData, consentData.tokenisationEnforceData) && this.preSelectConsent == consentData.preSelectConsent;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.consentType.hashCode();
        String str = this.consentMessage;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.consentInfoText;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.disableMessage;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.pennyDropMessage;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.backgroundColor;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.textColor;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        TokenizationKnowMoreData tokenizationKnowMoreData = this.tokenisationKnowMoreData;
        int hashCode8 = tokenizationKnowMoreData == null ? 0 : tokenizationKnowMoreData.hashCode();
        TokenizationEnforceData tokenizationEnforceData = this.tokenisationEnforceData;
        int hashCode9 = tokenizationEnforceData != null ? tokenizationEnforceData.hashCode() : 0;
        boolean z = this.preSelectConsent;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public String toString() {
        return "ConsentData(consentType=" + this.consentType + ", consentMessage=" + ((Object) this.consentMessage) + ", consentInfoText=" + ((Object) this.consentInfoText) + ", disableMessage=" + ((Object) this.disableMessage) + ", pennyDropMessage=" + ((Object) this.pennyDropMessage) + ", backgroundColor=" + ((Object) this.backgroundColor) + ", textColor=" + ((Object) this.textColor) + ", tokenisationKnowMoreData=" + this.tokenisationKnowMoreData + ", tokenisationEnforceData=" + this.tokenisationEnforceData + ", preSelectConsent=" + this.preSelectConsent + ')';
    }

    public ConsentData(ConsentType consentType, String str, String str2, String str3, String str4, String str5, String str6, TokenizationKnowMoreData tokenizationKnowMoreData, TokenizationEnforceData tokenizationEnforceData, boolean z) {
        runAnimators.ag$a(consentType, "consentType");
        this.consentType = consentType;
        this.consentMessage = str;
        this.consentInfoText = str2;
        this.disableMessage = str3;
        this.pennyDropMessage = str4;
        this.backgroundColor = str5;
        this.textColor = str6;
        this.tokenisationKnowMoreData = tokenizationKnowMoreData;
        this.tokenisationEnforceData = tokenizationEnforceData;
        this.preSelectConsent = z;
    }

    public final String getConsentInfoText() {
        return this.consentInfoText;
    }

    public final String getConsentMessage() {
        return this.consentMessage;
    }

    public final ConsentType getConsentType() {
        return this.consentType;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getDisableMessage() {
        return this.disableMessage;
    }

    public final String getPennyDropMessage() {
        return this.pennyDropMessage;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final TokenizationEnforceData getTokenisationEnforceData() {
        return this.tokenisationEnforceData;
    }

    public final TokenizationKnowMoreData getTokenisationKnowMoreData() {
        return this.tokenisationKnowMoreData;
    }

    public final boolean getPreSelectConsent() {
        return this.preSelectConsent;
    }

    public final void setPreSelectConsent(boolean z) {
        this.preSelectConsent = z;
    }
}
