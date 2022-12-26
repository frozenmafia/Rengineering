package com.dreampay.commons.pay_instrument;

import android.view.ViewConfiguration;
import com.apxor.androidsdk.core.Constants;
import o.getWantsAllOnMoveCalls;
import o.runAnimators;
import org.apache.http.message.TokenParser;
/* loaded from: classes6.dex */
public final class CardInstrument extends PaymentInstrument {
    private static int ag$a = 0;
    private static int toString = 1;
    private static long values = -6778026180630547982L;
    private final String brandName;
    private final String category;
    private final String expiryMonth;
    private final String expiryYear;
    private final String iconUrl;
    private final boolean isExpired;
    private final String issuer;
    private final Double maxSfaEligibleAmount;
    private final String nameOnCard;
    private final String nickName;
    private final String number;
    private final Boolean sfaEligible;
    private final Boolean sfaEligibleForCurrentTxn;
    private final Boolean sfaEnrolled;
    private final String token;

    public static /* synthetic */ CardInstrument copy$default(CardInstrument cardInstrument, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, Double d, Boolean bool3, String str10, int i, Object obj) {
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Boolean bool4;
        String str16;
        String str17 = (i & 1) != 0 ? cardInstrument.number : str;
        if (((i & 2) != 0 ? '(' : (char) 6) != '(') {
            str11 = str2;
        } else {
            try {
                str11 = cardInstrument.category;
            } catch (Exception e) {
                throw e;
            }
        }
        if ((i & 4) != 0) {
            int i2 = ag$a + 17;
            toString = i2 % 128;
            int i3 = i2 % 2;
            try {
                str12 = cardInstrument.token;
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            str12 = str3;
        }
        String str18 = ((i & 8) != 0 ? 'X' : 'Z') != 'Z' ? cardInstrument.expiryYear : str4;
        String str19 = (i & 16) != 0 ? cardInstrument.expiryMonth : str5;
        boolean z2 = ((i & 32) != 0 ? '$' : (char) 28) != 28 ? cardInstrument.isExpired : z;
        if (((i & 64) != 0 ? '9' : '@') != '9') {
            str13 = str6;
        } else {
            int i4 = ag$a + 93;
            toString = i4 % 128;
            int i5 = i4 % 2;
            str13 = cardInstrument.nickName;
        }
        if (((i & 128) != 0 ? '+' : TokenParser.CR) != '+') {
            str14 = str7;
        } else {
            int i6 = toString + 101;
            ag$a = i6 % 128;
            int i7 = i6 % 2;
            str14 = cardInstrument.nameOnCard;
        }
        String str20 = ((i & 256) != 0 ? '\n' : '\b') != '\n' ? str8 : cardInstrument.issuer;
        if ((i & 512) != 0) {
            str15 = cardInstrument.brandName;
            int i8 = ag$a + 119;
            toString = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str15 = str9;
        }
        Boolean bool5 = ((i & 1024) != 0 ? (char) 16 : (char) 31) != 31 ? cardInstrument.sfaEligible : bool;
        if ((i & 2048) != 0) {
            int i10 = ag$a + 51;
            toString = i10 % 128;
            int i11 = i10 % 2;
            bool4 = cardInstrument.sfaEnrolled;
        } else {
            bool4 = bool2;
        }
        Double d2 = ((i & 4096) != 0 ? '>' : '[') != '>' ? d : cardInstrument.maxSfaEligibleAmount;
        Boolean bool6 = (i & 8192) != 0 ? cardInstrument.sfaEligibleForCurrentTxn : bool3;
        if ((i & 16384) != 0) {
            String iconUrl = cardInstrument.getIconUrl();
            int i12 = ag$a + 109;
            toString = i12 % 128;
            int i13 = i12 % 2;
            str16 = iconUrl;
        } else {
            str16 = str10;
        }
        return cardInstrument.copy(str17, str11, str12, str18, str19, z2, str13, str14, str20, str15, bool5, bool4, d2, bool6, str16);
    }

    public final String component1() {
        String str;
        int i = ag$a + 113;
        toString = i % 128;
        if (!(i % 2 != 0)) {
            str = this.number;
            Object obj = null;
            super.hashCode();
        } else {
            str = this.number;
        }
        int i2 = toString + 61;
        ag$a = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        int i3 = 98 / 0;
        return str;
    }

    public final String component10() {
        String str;
        int i = ag$a + 5;
        toString = i % 128;
        if ((i % 2 == 0 ? (char) 4 : '2') != '2') {
            try {
                str = this.brandName;
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.brandName;
        }
        int i2 = toString + 27;
        ag$a = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final Boolean component11() {
        int i = ag$a + 33;
        toString = i % 128;
        int i2 = i % 2;
        Boolean bool = this.sfaEligible;
        int i3 = ag$a + 121;
        toString = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
            return bool;
        }
        return bool;
    }

    public final Boolean component12() {
        Boolean bool;
        int i = ag$a + 37;
        toString = i % 128;
        if (i % 2 != 0) {
            bool = this.sfaEnrolled;
        } else {
            bool = this.sfaEnrolled;
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = toString + 41;
        ag$a = i2 % 128;
        if ((i2 % 2 != 0 ? TokenParser.SP : '2') != '2') {
            int i3 = 26 / 0;
            return bool;
        }
        return bool;
    }

    public final Double component13() {
        int i = ag$a + 27;
        toString = i % 128;
        int i2 = i % 2;
        Double d = this.maxSfaEligibleAmount;
        int i3 = ag$a + 95;
        toString = i3 % 128;
        if (i3 % 2 != 0) {
            return d;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return d;
    }

    public final Boolean component14() {
        try {
            int i = toString + 113;
            try {
                ag$a = i % 128;
                if (i % 2 != 0) {
                    Boolean bool = this.sfaEligibleForCurrentTxn;
                    Object obj = null;
                    super.hashCode();
                    return bool;
                }
                return this.sfaEligibleForCurrentTxn;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String component15() {
        int i = toString + 13;
        ag$a = i % 128;
        int i2 = i % 2;
        try {
            String iconUrl = getIconUrl();
            try {
                int i3 = toString + 21;
                ag$a = i3 % 128;
                if (i3 % 2 == 0) {
                    return iconUrl;
                }
                int i4 = 37 / 0;
                return iconUrl;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String component2() {
        int i = ag$a + 13;
        toString = i % 128;
        int i2 = i % 2;
        String str = this.category;
        int i3 = ag$a + 107;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String component3() {
        int i = ag$a + 47;
        toString = i % 128;
        int i2 = i % 2;
        try {
            String str = this.token;
            int i3 = ag$a + 71;
            toString = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String component4() {
        int i = ag$a + 79;
        toString = i % 128;
        if (i % 2 == 0) {
            String str = this.expiryYear;
            Object obj = null;
            super.hashCode();
            return str;
        }
        return this.expiryYear;
    }

    public final String component5() {
        try {
            int i = toString + 29;
            ag$a = i % 128;
            int i2 = i % 2;
            String str = this.expiryMonth;
            int i3 = toString + 47;
            try {
                ag$a = i3 % 128;
                if (i3 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                super.hashCode();
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final boolean component6() {
        int i = ag$a + 97;
        toString = i % 128;
        if (!(i % 2 == 0)) {
            return this.isExpired;
        }
        int i2 = 66 / 0;
        return this.isExpired;
    }

    public final String component7() {
        int i = ag$a + 57;
        toString = i % 128;
        int i2 = i % 2;
        try {
            String str = this.nickName;
            int i3 = ag$a + 61;
            toString = i3 % 128;
            if (!(i3 % 2 != 0)) {
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String component8() {
        int i = ag$a + 89;
        toString = i % 128;
        int i2 = i % 2;
        String str = this.nameOnCard;
        int i3 = toString + 73;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String component9() {
        String str;
        try {
            int i = ag$a + 63;
            toString = i % 128;
            if ((i % 2 == 0 ? 'G' : '$') != '$') {
                try {
                    str = this.issuer;
                    Object obj = null;
                    super.hashCode();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                str = this.issuer;
            }
            int i2 = ag$a + 83;
            toString = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final CardInstrument copy(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, Double d, Boolean bool3, String str10) {
        runAnimators.ag$a(str, Constants.CHUNK_NUMBER);
        runAnimators.ag$a(str2, Constants.CATEGORY);
        runAnimators.ag$a(str3, ah$a(new char[]{4340, 4224, 19636, 48449, 48425, 24270, 29407, 55122, 42860}, ViewConfiguration.getLongPressTimeout() >> 16).intern());
        runAnimators.ag$a(str4, "expiryYear");
        runAnimators.ag$a(str5, "expiryMonth");
        runAnimators.ag$a(str9, "brandName");
        CardInstrument cardInstrument = new CardInstrument(str, str2, str3, str4, str5, z, str6, str7, str8, str9, bool, bool2, d, bool3, str10);
        int i = ag$a + 5;
        toString = i % 128;
        int i2 = i % 2;
        return cardInstrument;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardInstrument) {
            CardInstrument cardInstrument = (CardInstrument) obj;
            if (runAnimators.values((Object) this.number, (Object) cardInstrument.number)) {
                if ((!runAnimators.values((Object) this.category, (Object) cardInstrument.category) ? 'G' : 'H') == 'H' && runAnimators.values((Object) this.token, (Object) cardInstrument.token) && runAnimators.values((Object) this.expiryYear, (Object) cardInstrument.expiryYear) && runAnimators.values((Object) this.expiryMonth, (Object) cardInstrument.expiryMonth) && this.isExpired == cardInstrument.isExpired) {
                    try {
                        try {
                            if (runAnimators.values((Object) this.nickName, (Object) cardInstrument.nickName) && runAnimators.values((Object) this.nameOnCard, (Object) cardInstrument.nameOnCard)) {
                                if (!runAnimators.values((Object) this.issuer, (Object) cardInstrument.issuer)) {
                                    int i = ag$a + 1;
                                    toString = i % 128;
                                    int i2 = i % 2;
                                    return false;
                                }
                                if ((!runAnimators.values((Object) this.brandName, (Object) cardInstrument.brandName) ? '*' : 'F') != 'F') {
                                    return false;
                                }
                                if (!runAnimators.values(this.sfaEligible, cardInstrument.sfaEligible)) {
                                    int i3 = toString + 51;
                                    ag$a = i3 % 128;
                                    int i4 = i3 % 2;
                                    return false;
                                } else if (runAnimators.values(this.sfaEnrolled, cardInstrument.sfaEnrolled)) {
                                    if (!runAnimators.values(this.maxSfaEligibleAmount, cardInstrument.maxSfaEligibleAmount)) {
                                        int i5 = ag$a + 45;
                                        toString = i5 % 128;
                                        return !(i5 % 2 != 0);
                                    } else if (runAnimators.values(this.sfaEligibleForCurrentTxn, cardInstrument.sfaEligibleForCurrentTxn)) {
                                        if (runAnimators.values((Object) getIconUrl(), (Object) cardInstrument.getIconUrl())) {
                                            return true;
                                        }
                                        int i6 = toString + 69;
                                        ag$a = i6 % 128;
                                        return i6 % 2 != 0;
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            }
                            return false;
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int i2;
        int hashCode3;
        int hashCode4 = this.number.hashCode();
        int hashCode5 = this.category.hashCode();
        int hashCode6 = this.token.hashCode();
        int hashCode7 = this.expiryYear.hashCode();
        int hashCode8 = this.expiryMonth.hashCode();
        boolean z = this.isExpired;
        char c = z != 0 ? TokenParser.ESCAPE : '*';
        int i3 = z;
        if (c != '*') {
            i3 = 1;
        }
        String str = this.nickName;
        if (str == null) {
            hashCode = 0;
        } else {
            try {
                hashCode = str.hashCode();
            } catch (Exception e) {
                throw e;
            }
        }
        String str2 = this.nameOnCard;
        int hashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.issuer;
        if ((str3 == null ? '>' : 'G') != '>') {
            i = str3.hashCode();
        } else {
            int i4 = toString + 85;
            ag$a = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        }
        int hashCode10 = this.brandName.hashCode();
        Boolean bool = this.sfaEligible;
        if ((bool == null ? (char) 29 : (char) 22) != 22) {
            int i6 = toString + 123;
            ag$a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = ag$a + 111;
            toString = i8 % 128;
            int i9 = i8 % 2;
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        Boolean bool2 = this.sfaEnrolled;
        int hashCode11 = bool2 != null ? bool2.hashCode() : 0;
        Double d = this.maxSfaEligibleAmount;
        if (d != null) {
            i2 = d.hashCode();
        } else {
            int i10 = ag$a + 93;
            toString = i10 % 128;
            int i11 = i10 % 2;
            int i12 = ag$a + 123;
            toString = i12 % 128;
            int i13 = i12 % 2;
            i2 = 0;
        }
        Boolean bool3 = this.sfaEligibleForCurrentTxn;
        int hashCode12 = bool3 == null ? 0 : bool3.hashCode();
        if (getIconUrl() == null) {
            int i14 = toString + 45;
            ag$a = i14 % 128;
            int i15 = i14 % 2;
            hashCode3 = 0;
        } else {
            hashCode3 = getIconUrl().hashCode();
        }
        return (((((((((((((((((((((((((((hashCode4 * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i3) * 31) + hashCode) * 31) + hashCode9) * 31) + i) * 31) + hashCode10) * 31) + hashCode2) * 31) + hashCode11) * 31) + i2) * 31) + hashCode12) * 31) + hashCode3;
    }

    public String toString() {
        String str = "CardInstrument(number=" + this.number + ", category=" + this.category + ", token=" + this.token + ", expiryYear=" + this.expiryYear + ", expiryMonth=" + this.expiryMonth + ", isExpired=" + this.isExpired + ", nickName=" + ((Object) this.nickName) + ", nameOnCard=" + ((Object) this.nameOnCard) + ", issuer=" + ((Object) this.issuer) + ", brandName=" + this.brandName + ", sfaEligible=" + this.sfaEligible + ", sfaEnrolled=" + this.sfaEnrolled + ", maxSfaEligibleAmount=" + this.maxSfaEligibleAmount + ", sfaEligibleForCurrentTxn=" + this.sfaEligibleForCurrentTxn + ", iconUrl=" + ((Object) getIconUrl()) + ')';
        try {
            int i = toString + 7;
            try {
                ag$a = i % 128;
                int i2 = i % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getNumber() {
        String str;
        int i = ag$a + 87;
        toString = i % 128;
        if (i % 2 != 0) {
            try {
                str = this.number;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.number;
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = toString + 13;
        ag$a = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String getCategory() {
        int i = ag$a + 25;
        toString = i % 128;
        int i2 = i % 2;
        String str = this.category;
        int i3 = toString + 27;
        ag$a = i3 % 128;
        if (!(i3 % 2 == 0)) {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    public final String getToken() {
        String str;
        int i = ag$a + 81;
        toString = i % 128;
        if (i % 2 == 0) {
            str = this.token;
            int i2 = 33 / 0;
        } else {
            str = this.token;
        }
        int i3 = ag$a + 83;
        toString = i3 % 128;
        if ((i3 % 2 == 0 ? '+' : TokenParser.CR) != '\r') {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    public final String getExpiryYear() {
        int i = ag$a + 93;
        toString = i % 128;
        int i2 = i % 2;
        String str = this.expiryYear;
        int i3 = ag$a + 33;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String getExpiryMonth() {
        int i = ag$a + 27;
        toString = i % 128;
        if ((i % 2 == 0 ? (char) 23 : '!') != '!') {
            int i2 = 39 / 0;
            return this.expiryMonth;
        }
        return this.expiryMonth;
    }

    public final boolean isExpired() {
        int i = ag$a + 67;
        toString = i % 128;
        int i2 = i % 2;
        boolean z = this.isExpired;
        try {
            int i3 = ag$a + 115;
            try {
                toString = i3 % 128;
                int i4 = i3 % 2;
                return z;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getNickName() {
        int i = toString + 11;
        ag$a = i % 128;
        int i2 = i % 2;
        String str = this.nickName;
        int i3 = toString + 19;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String getNameOnCard() {
        int i = toString + 57;
        ag$a = i % 128;
        if (i % 2 != 0) {
            String str = this.nameOnCard;
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return this.nameOnCard;
    }

    public final String getIssuer() {
        int i = ag$a + 95;
        toString = i % 128;
        int i2 = i % 2;
        String str = this.issuer;
        try {
            int i3 = ag$a + 121;
            toString = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getBrandName() {
        try {
            int i = toString + 13;
            ag$a = i % 128;
            int i2 = i % 2;
            try {
                String str = this.brandName;
                int i3 = ag$a + 85;
                toString = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final Boolean getSfaEligible() {
        try {
            int i = toString + 111;
            try {
                ag$a = i % 128;
                if ((i % 2 != 0 ? 'Y' : '#') != 'Y') {
                    return this.sfaEligible;
                }
                Boolean bool = this.sfaEligible;
                Object obj = null;
                super.hashCode();
                return bool;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final Boolean getSfaEnrolled() {
        try {
            int i = ag$a + 93;
            toString = i % 128;
            int i2 = i % 2;
            try {
                Boolean bool = this.sfaEnrolled;
                int i3 = toString + 101;
                ag$a = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return bool;
                }
                return bool;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final Double getMaxSfaEligibleAmount() {
        int i = toString + 23;
        ag$a = i % 128;
        int i2 = i % 2;
        Double d = this.maxSfaEligibleAmount;
        int i3 = toString + 85;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return d;
    }

    public final Boolean getSfaEligibleForCurrentTxn() {
        try {
            int i = toString + 93;
            ag$a = i % 128;
            int i2 = i % 2;
            Boolean bool = this.sfaEligibleForCurrentTxn;
            int i3 = toString + 49;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return bool;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.dreampay.commons.pay_instrument.PaymentInstrument
    public String getIconUrl() {
        int i = toString + 87;
        ag$a = i % 128;
        if (!(i % 2 != 0)) {
            return this.iconUrl;
        }
        String str = this.iconUrl;
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CardInstrument(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.Boolean r30, java.lang.Boolean r31, java.lang.Double r32, java.lang.Boolean r33, java.lang.String r34) {
        /*
            r19 = this;
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r10 = r24
            r9 = r28
            r8 = r29
            java.lang.String r0 = "number"
            o.runAnimators.ag$a(r12, r0)
            java.lang.String r0 = "category"
            o.runAnimators.ag$a(r13, r0)
            r0 = 9
            char[] r0 = new char[r0]
            r0 = {x00ce: FILL_ARRAY_DATA  , data: [4340, 4224, 19636, -17087, -17111, 24270, 29407, -10414, -22676} // fill-array
            int r1 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r1 = r1 >> 8
            java.lang.String r0 = ah$a(r0, r1)
            java.lang.String r0 = r0.intern()
            o.runAnimators.ag$a(r14, r0)
            java.lang.String r0 = "expiryYear"
            o.runAnimators.ag$a(r15, r0)
            java.lang.String r0 = "expiryMonth"
            o.runAnimators.ag$a(r10, r0)
            java.lang.String r0 = "brandName"
            o.runAnimators.ag$a(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r1 = " | "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = r0.toString()
            int r0 = r20.length()
            int r0 = r0 + (-4)
            java.lang.String r0 = r12.substring(r0)
            java.lang.String r2 = "(this as java.lang.String).substring(startIndex)"
            o.runAnimators.ah$a(r0, r2)
            java.lang.String r2 = "**** "
            java.lang.String r2 = o.runAnimators.values(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Expires "
            r0.append(r3)
            r0.append(r10)
            r3 = 47
            r0.append(r3)
            r0.append(r15)
            java.lang.String r3 = r0.toString()
            r5 = 0
            r6 = 0
            r7 = 0
            r16 = 0
            r17 = 240(0xf0, float:3.36E-43)
            r18 = 0
            r0 = r19
            r4 = r34
            r8 = r16
            r9 = r17
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.number = r12
            r11.category = r13
            r11.token = r14
            r11.expiryYear = r15
            r0 = r24
            r11.expiryMonth = r0
            r0 = r25
            r11.isExpired = r0
            r0 = r26
            r11.nickName = r0
            r0 = r27
            r11.nameOnCard = r0
            r0 = r28
            r11.issuer = r0
            r0 = r29
            r11.brandName = r0
            r0 = r30
            r11.sfaEligible = r0
            r0 = r31
            r11.sfaEnrolled = r0
            r0 = r32
            r11.maxSfaEligibleAmount = r0
            r0 = r33
            r11.sfaEligibleForCurrentTxn = r0
            r0 = r34
            r11.iconUrl = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dreampay.commons.pay_instrument.CardInstrument.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Double, java.lang.Boolean, java.lang.String):void");
    }

    private static String ah$a(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(values, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * values));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
