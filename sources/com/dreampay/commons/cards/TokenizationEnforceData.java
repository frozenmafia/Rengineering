package com.dreampay.commons.cards;

import java.util.List;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class TokenizationEnforceData {
    private final List<String> bulletPointers;
    private final String finalAppealMessage;
    private final String finalAppealTitle;
    private final String headerText;
    private final String iconUrl;
    private final boolean isFinalAppealEnabled;
    private final List<String> longMessages;

    public static /* synthetic */ TokenizationEnforceData copy$default(TokenizationEnforceData tokenizationEnforceData, String str, List list, List list2, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenizationEnforceData.headerText;
        }
        List<String> list3 = list;
        if ((i & 2) != 0) {
            list3 = tokenizationEnforceData.longMessages;
        }
        List list4 = list3;
        List<String> list5 = list2;
        if ((i & 4) != 0) {
            list5 = tokenizationEnforceData.bulletPointers;
        }
        List list6 = list5;
        if ((i & 8) != 0) {
            str2 = tokenizationEnforceData.iconUrl;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            z = tokenizationEnforceData.isFinalAppealEnabled;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str3 = tokenizationEnforceData.finalAppealTitle;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            str4 = tokenizationEnforceData.finalAppealMessage;
        }
        return tokenizationEnforceData.copy(str, list4, list6, str5, z2, str6, str4);
    }

    public final String component1() {
        return this.headerText;
    }

    public final List<String> component2() {
        return this.longMessages;
    }

    public final List<String> component3() {
        return this.bulletPointers;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final boolean component5() {
        return this.isFinalAppealEnabled;
    }

    public final String component6() {
        return this.finalAppealTitle;
    }

    public final String component7() {
        return this.finalAppealMessage;
    }

    public final TokenizationEnforceData copy(String str, List<String> list, List<String> list2, String str2, boolean z, String str3, String str4) {
        runAnimators.ag$a(str, "headerText");
        return new TokenizationEnforceData(str, list, list2, str2, z, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenizationEnforceData) {
            TokenizationEnforceData tokenizationEnforceData = (TokenizationEnforceData) obj;
            return runAnimators.values((Object) this.headerText, (Object) tokenizationEnforceData.headerText) && runAnimators.values(this.longMessages, tokenizationEnforceData.longMessages) && runAnimators.values(this.bulletPointers, tokenizationEnforceData.bulletPointers) && runAnimators.values((Object) this.iconUrl, (Object) tokenizationEnforceData.iconUrl) && this.isFinalAppealEnabled == tokenizationEnforceData.isFinalAppealEnabled && runAnimators.values((Object) this.finalAppealTitle, (Object) tokenizationEnforceData.finalAppealTitle) && runAnimators.values((Object) this.finalAppealMessage, (Object) tokenizationEnforceData.finalAppealMessage);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.headerText.hashCode();
        List<String> list = this.longMessages;
        int hashCode2 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.bulletPointers;
        int hashCode3 = list2 == null ? 0 : list2.hashCode();
        String str = this.iconUrl;
        int hashCode4 = str == null ? 0 : str.hashCode();
        boolean z = this.isFinalAppealEnabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        String str2 = this.finalAppealTitle;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.finalAppealMessage;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + hashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "TokenizationEnforceData(headerText=" + this.headerText + ", longMessages=" + this.longMessages + ", bulletPointers=" + this.bulletPointers + ", iconUrl=" + ((Object) this.iconUrl) + ", isFinalAppealEnabled=" + this.isFinalAppealEnabled + ", finalAppealTitle=" + ((Object) this.finalAppealTitle) + ", finalAppealMessage=" + ((Object) this.finalAppealMessage) + ')';
    }

    public TokenizationEnforceData(String str, List<String> list, List<String> list2, String str2, boolean z, String str3, String str4) {
        runAnimators.ag$a(str, "headerText");
        this.headerText = str;
        this.longMessages = list;
        this.bulletPointers = list2;
        this.iconUrl = str2;
        this.isFinalAppealEnabled = z;
        this.finalAppealTitle = str3;
        this.finalAppealMessage = str4;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final List<String> getLongMessages() {
        return this.longMessages;
    }

    public final List<String> getBulletPointers() {
        return this.bulletPointers;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final boolean isFinalAppealEnabled() {
        return this.isFinalAppealEnabled;
    }

    public final String getFinalAppealTitle() {
        return this.finalAppealTitle;
    }

    public final String getFinalAppealMessage() {
        return this.finalAppealMessage;
    }
}
