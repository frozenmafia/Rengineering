package com.dreampay.commons.cards;

import com.apxor.androidsdk.core.Constants;
import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class SavedCardModel implements Serializable {
    private final String cardIcon;
    private final String cardNumber;
    private final String cardToken;
    private final String cardType;
    private final String category;
    private final String errorMessage;
    private final String expiryMonth;
    private final String expiryYear;
    private final InstrumentHealth health;
    private final Boolean isAvailable;
    private final boolean isSFAEligible;
    private final boolean isSFAEligibleForCurrentTransaction;
    private final boolean isSFAEnrolled;
    private final String issuer;
    private final double maxSFAEligibleAmount;
    private final String nameOnCard;
    private final String nickname;
    private final String promotionText;

    public final String component1() {
        return this.cardNumber;
    }

    public final String component10() {
        return this.nameOnCard;
    }

    public final Boolean component11() {
        return this.isAvailable;
    }

    public final String component12() {
        return this.errorMessage;
    }

    public final String component13() {
        return this.promotionText;
    }

    public final InstrumentHealth component14() {
        return this.health;
    }

    public final boolean component15() {
        return this.isSFAEligible;
    }

    public final boolean component16() {
        return this.isSFAEnrolled;
    }

    public final double component17() {
        return this.maxSFAEligibleAmount;
    }

    public final boolean component18() {
        return this.isSFAEligibleForCurrentTransaction;
    }

    public final String component2() {
        return this.category;
    }

    public final String component3() {
        return this.cardToken;
    }

    public final String component4() {
        return this.expiryMonth;
    }

    public final String component5() {
        return this.expiryYear;
    }

    public final String component6() {
        return this.issuer;
    }

    public final String component7() {
        return this.cardType;
    }

    public final String component8() {
        return this.cardIcon;
    }

    public final String component9() {
        return this.nickname;
    }

    public final SavedCardModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, InstrumentHealth instrumentHealth, boolean z, boolean z2, double d, boolean z3) {
        runAnimators.ag$a(str, "cardNumber");
        runAnimators.ag$a(str2, Constants.CATEGORY);
        runAnimators.ag$a(str3, "cardToken");
        runAnimators.ag$a(str4, "expiryMonth");
        runAnimators.ag$a(str5, "expiryYear");
        runAnimators.ag$a(str7, "cardType");
        runAnimators.ag$a(instrumentHealth, "health");
        return new SavedCardModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, bool, str11, str12, instrumentHealth, z, z2, d, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SavedCardModel) {
            SavedCardModel savedCardModel = (SavedCardModel) obj;
            return runAnimators.values((Object) this.cardNumber, (Object) savedCardModel.cardNumber) && runAnimators.values((Object) this.category, (Object) savedCardModel.category) && runAnimators.values((Object) this.cardToken, (Object) savedCardModel.cardToken) && runAnimators.values((Object) this.expiryMonth, (Object) savedCardModel.expiryMonth) && runAnimators.values((Object) this.expiryYear, (Object) savedCardModel.expiryYear) && runAnimators.values((Object) this.issuer, (Object) savedCardModel.issuer) && runAnimators.values((Object) this.cardType, (Object) savedCardModel.cardType) && runAnimators.values((Object) this.cardIcon, (Object) savedCardModel.cardIcon) && runAnimators.values((Object) this.nickname, (Object) savedCardModel.nickname) && runAnimators.values((Object) this.nameOnCard, (Object) savedCardModel.nameOnCard) && runAnimators.values(this.isAvailable, savedCardModel.isAvailable) && runAnimators.values((Object) this.errorMessage, (Object) savedCardModel.errorMessage) && runAnimators.values((Object) this.promotionText, (Object) savedCardModel.promotionText) && runAnimators.values(this.health, savedCardModel.health) && this.isSFAEligible == savedCardModel.isSFAEligible && this.isSFAEnrolled == savedCardModel.isSFAEnrolled && runAnimators.values(Double.valueOf(this.maxSFAEligibleAmount), Double.valueOf(savedCardModel.maxSFAEligibleAmount)) && this.isSFAEligibleForCurrentTransaction == savedCardModel.isSFAEligibleForCurrentTransaction;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.cardNumber.hashCode();
        int hashCode2 = this.category.hashCode();
        int hashCode3 = this.cardToken.hashCode();
        int hashCode4 = this.expiryMonth.hashCode();
        int hashCode5 = this.expiryYear.hashCode();
        String str = this.issuer;
        int hashCode6 = str == null ? 0 : str.hashCode();
        int hashCode7 = this.cardType.hashCode();
        String str2 = this.cardIcon;
        int hashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nickname;
        int hashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.nameOnCard;
        int hashCode10 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.isAvailable;
        int hashCode11 = bool == null ? 0 : bool.hashCode();
        String str5 = this.errorMessage;
        int hashCode12 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.promotionText;
        int hashCode13 = str6 != null ? str6.hashCode() : 0;
        int hashCode14 = this.health.hashCode();
        boolean z = this.isSFAEligible;
        int i = z ? 1 : z ? 1 : 0;
        boolean z2 = this.isSFAEnrolled;
        int i2 = z2 ? 1 : z2 ? 1 : 0;
        int doubleToLongBits = Double.doubleToLongBits(this.maxSFAEligibleAmount);
        boolean z3 = this.isSFAEligibleForCurrentTransaction;
        return (((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + i) * 31) + i2) * 31) + doubleToLongBits) * 31) + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        return "SavedCardModel(cardNumber=" + this.cardNumber + ", category=" + this.category + ", cardToken=" + this.cardToken + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", issuer=" + ((Object) this.issuer) + ", cardType=" + this.cardType + ", cardIcon=" + ((Object) this.cardIcon) + ", nickname=" + ((Object) this.nickname) + ", nameOnCard=" + ((Object) this.nameOnCard) + ", isAvailable=" + this.isAvailable + ", errorMessage=" + ((Object) this.errorMessage) + ", promotionText=" + ((Object) this.promotionText) + ", health=" + this.health + ", isSFAEligible=" + this.isSFAEligible + ", isSFAEnrolled=" + this.isSFAEnrolled + ", maxSFAEligibleAmount=" + this.maxSFAEligibleAmount + ", isSFAEligibleForCurrentTransaction=" + this.isSFAEligibleForCurrentTransaction + ')';
    }

    public SavedCardModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, InstrumentHealth instrumentHealth, boolean z, boolean z2, double d, boolean z3) {
        runAnimators.ag$a(str, "cardNumber");
        runAnimators.ag$a(str2, Constants.CATEGORY);
        runAnimators.ag$a(str3, "cardToken");
        runAnimators.ag$a(str4, "expiryMonth");
        runAnimators.ag$a(str5, "expiryYear");
        runAnimators.ag$a(str7, "cardType");
        runAnimators.ag$a(instrumentHealth, "health");
        this.cardNumber = str;
        this.category = str2;
        this.cardToken = str3;
        this.expiryMonth = str4;
        this.expiryYear = str5;
        this.issuer = str6;
        this.cardType = str7;
        this.cardIcon = str8;
        this.nickname = str9;
        this.nameOnCard = str10;
        this.isAvailable = bool;
        this.errorMessage = str11;
        this.promotionText = str12;
        this.health = instrumentHealth;
        this.isSFAEligible = z;
        this.isSFAEnrolled = z2;
        this.maxSFAEligibleAmount = d;
        this.isSFAEligibleForCurrentTransaction = z3;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCardToken() {
        return this.cardToken;
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getCardIcon() {
        return this.cardIcon;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getNameOnCard() {
        return this.nameOnCard;
    }

    public final Boolean isAvailable() {
        return this.isAvailable;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getPromotionText() {
        return this.promotionText;
    }

    public final InstrumentHealth getHealth() {
        return this.health;
    }

    public final boolean isSFAEligible() {
        return this.isSFAEligible;
    }

    public final boolean isSFAEnrolled() {
        return this.isSFAEnrolled;
    }

    public final double getMaxSFAEligibleAmount() {
        return this.maxSFAEligibleAmount;
    }

    public final boolean isSFAEligibleForCurrentTransaction() {
        return this.isSFAEligibleForCurrentTransaction;
    }
}
