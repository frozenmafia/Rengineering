package com.dreampay.commons.cards;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class SavedCardDetails implements Serializable {
    private final String cardBrand;
    private final String cardExpiryMonth;
    private final String cardExpiryYear;
    private final String cardIssuer;
    private final String cardLogoUrl;
    private final String cardNumber;
    private final String cardToken;
    private final String cardType;
    private final ConsentData consentData;
    private final boolean expired;
    private final String nameOnCard;
    private final String nickname;

    public final String component1() {
        return this.cardToken;
    }

    public final boolean component10() {
        return this.expired;
    }

    public final String component11() {
        return this.cardLogoUrl;
    }

    public final ConsentData component12() {
        return this.consentData;
    }

    public final String component2() {
        return this.cardNumber;
    }

    public final String component3() {
        return this.cardExpiryYear;
    }

    public final String component4() {
        return this.cardExpiryMonth;
    }

    public final String component5() {
        return this.cardType;
    }

    public final String component6() {
        return this.cardIssuer;
    }

    public final String component7() {
        return this.cardBrand;
    }

    public final String component8() {
        return this.nickname;
    }

    public final String component9() {
        return this.nameOnCard;
    }

    public final SavedCardDetails copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, ConsentData consentData) {
        runAnimators.ag$a(str, "cardToken");
        runAnimators.ag$a(str2, "cardNumber");
        runAnimators.ag$a(str3, "cardExpiryYear");
        runAnimators.ag$a(str4, "cardExpiryMonth");
        runAnimators.ag$a(str5, "cardType");
        runAnimators.ag$a(str7, "cardBrand");
        runAnimators.ag$a(consentData, "consentData");
        return new SavedCardDetails(str, str2, str3, str4, str5, str6, str7, str8, str9, z, str10, consentData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SavedCardDetails) {
            SavedCardDetails savedCardDetails = (SavedCardDetails) obj;
            return runAnimators.values((Object) this.cardToken, (Object) savedCardDetails.cardToken) && runAnimators.values((Object) this.cardNumber, (Object) savedCardDetails.cardNumber) && runAnimators.values((Object) this.cardExpiryYear, (Object) savedCardDetails.cardExpiryYear) && runAnimators.values((Object) this.cardExpiryMonth, (Object) savedCardDetails.cardExpiryMonth) && runAnimators.values((Object) this.cardType, (Object) savedCardDetails.cardType) && runAnimators.values((Object) this.cardIssuer, (Object) savedCardDetails.cardIssuer) && runAnimators.values((Object) this.cardBrand, (Object) savedCardDetails.cardBrand) && runAnimators.values((Object) this.nickname, (Object) savedCardDetails.nickname) && runAnimators.values((Object) this.nameOnCard, (Object) savedCardDetails.nameOnCard) && this.expired == savedCardDetails.expired && runAnimators.values((Object) this.cardLogoUrl, (Object) savedCardDetails.cardLogoUrl) && runAnimators.values(this.consentData, savedCardDetails.consentData);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.cardToken.hashCode();
        int hashCode2 = this.cardNumber.hashCode();
        int hashCode3 = this.cardExpiryYear.hashCode();
        int hashCode4 = this.cardExpiryMonth.hashCode();
        int hashCode5 = this.cardType.hashCode();
        String str = this.cardIssuer;
        int hashCode6 = str == null ? 0 : str.hashCode();
        int hashCode7 = this.cardBrand.hashCode();
        String str2 = this.nickname;
        int hashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nameOnCard;
        int hashCode9 = str3 == null ? 0 : str3.hashCode();
        boolean z = this.expired;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        String str4 = this.cardLogoUrl;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.consentData.hashCode();
    }

    public String toString() {
        return "SavedCardDetails(cardToken=" + this.cardToken + ", cardNumber=" + this.cardNumber + ", cardExpiryYear=" + this.cardExpiryYear + ", cardExpiryMonth=" + this.cardExpiryMonth + ", cardType=" + this.cardType + ", cardIssuer=" + ((Object) this.cardIssuer) + ", cardBrand=" + this.cardBrand + ", nickname=" + ((Object) this.nickname) + ", nameOnCard=" + ((Object) this.nameOnCard) + ", expired=" + this.expired + ", cardLogoUrl=" + ((Object) this.cardLogoUrl) + ", consentData=" + this.consentData + ')';
    }

    public SavedCardDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, ConsentData consentData) {
        runAnimators.ag$a(str, "cardToken");
        runAnimators.ag$a(str2, "cardNumber");
        runAnimators.ag$a(str3, "cardExpiryYear");
        runAnimators.ag$a(str4, "cardExpiryMonth");
        runAnimators.ag$a(str5, "cardType");
        runAnimators.ag$a(str7, "cardBrand");
        runAnimators.ag$a(consentData, "consentData");
        this.cardToken = str;
        this.cardNumber = str2;
        this.cardExpiryYear = str3;
        this.cardExpiryMonth = str4;
        this.cardType = str5;
        this.cardIssuer = str6;
        this.cardBrand = str7;
        this.nickname = str8;
        this.nameOnCard = str9;
        this.expired = z;
        this.cardLogoUrl = str10;
        this.consentData = consentData;
    }

    public final String getCardToken() {
        return this.cardToken;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCardExpiryYear() {
        return this.cardExpiryYear;
    }

    public final String getCardExpiryMonth() {
        return this.cardExpiryMonth;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getCardIssuer() {
        return this.cardIssuer;
    }

    public final String getCardBrand() {
        return this.cardBrand;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getNameOnCard() {
        return this.nameOnCard;
    }

    public final boolean getExpired() {
        return this.expired;
    }

    public final String getCardLogoUrl() {
        return this.cardLogoUrl;
    }

    public final ConsentData getConsentData() {
        return this.consentData;
    }
}
