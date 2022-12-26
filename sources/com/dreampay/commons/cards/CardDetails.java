package com.dreampay.commons.cards;

import com.dreampay.commons.constants.Constants;
import java.io.Serializable;
import o.Visibility;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class CardDetails implements Serializable {
    private String cardNumber;
    private final String cvv;
    private final int month;
    private final String nameOnCard;
    private final String nickName;
    private final int year;

    public static /* synthetic */ CardDetails copy$default(CardDetails cardDetails, String str, String str2, int i, int i2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cardDetails.cardNumber;
        }
        if ((i3 & 2) != 0) {
            str2 = cardDetails.cvv;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            i = cardDetails.month;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = cardDetails.year;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str3 = cardDetails.nameOnCard;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            str4 = cardDetails.nickName;
        }
        return cardDetails.copy(str, str5, i4, i5, str6, str4);
    }

    public final String component1() {
        return this.cardNumber;
    }

    public final String component2() {
        return this.cvv;
    }

    public final int component3() {
        return this.month;
    }

    public final int component4() {
        return this.year;
    }

    public final String component5() {
        return this.nameOnCard;
    }

    public final String component6() {
        return this.nickName;
    }

    public final CardDetails copy(String str, String str2, int i, int i2, String str3, String str4) {
        runAnimators.ag$a(str, "cardNumber");
        runAnimators.ag$a(str2, Constants.Navigation.CVV);
        runAnimators.ag$a(str3, "nameOnCard");
        runAnimators.ag$a(str4, "nickName");
        return new CardDetails(str, str2, i, i2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardDetails) {
            CardDetails cardDetails = (CardDetails) obj;
            return runAnimators.values((Object) this.cardNumber, (Object) cardDetails.cardNumber) && runAnimators.values((Object) this.cvv, (Object) cardDetails.cvv) && this.month == cardDetails.month && this.year == cardDetails.year && runAnimators.values((Object) this.nameOnCard, (Object) cardDetails.nameOnCard) && runAnimators.values((Object) this.nickName, (Object) cardDetails.nickName);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.cardNumber.hashCode() * 31) + this.cvv.hashCode()) * 31) + this.month) * 31) + this.year) * 31) + this.nameOnCard.hashCode()) * 31) + this.nickName.hashCode();
    }

    public String toString() {
        return "CardDetails(cardNumber=" + this.cardNumber + ", cvv=" + this.cvv + ", month=" + this.month + ", year=" + this.year + ", nameOnCard=" + this.nameOnCard + ", nickName=" + this.nickName + ')';
    }

    public CardDetails(String str, String str2, int i, int i2, String str3, String str4) {
        runAnimators.ag$a(str, "cardNumber");
        runAnimators.ag$a(str2, Constants.Navigation.CVV);
        runAnimators.ag$a(str3, "nameOnCard");
        runAnimators.ag$a(str4, "nickName");
        this.cardNumber = str;
        this.cvv = str2;
        this.month = i;
        this.year = i2;
        this.nameOnCard = str3;
        this.nickName = str4;
        this.cardNumber = Visibility.Mode.toString(str, Constants.WHITE_SPACE, "", false, 4, (Object) null);
    }

    public /* synthetic */ CardDetails(String str, String str2, int i, int i2, String str3, String str4, int i3, getTargetTypes gettargettypes) {
        this(str, str2, i, i2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4);
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final void setCardNumber(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.cardNumber = str;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public final String getNameOnCard() {
        return this.nameOnCard;
    }

    public final String getNickName() {
        return this.nickName;
    }
}
