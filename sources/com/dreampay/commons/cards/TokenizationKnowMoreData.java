package com.dreampay.commons.cards;

import java.util.List;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class TokenizationKnowMoreData {
    private final List<String> bulletPointers;
    private final String headerText;
    private final String iconUrl;
    private final List<String> longMessages;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TokenizationKnowMoreData copy$default(TokenizationKnowMoreData tokenizationKnowMoreData, String str, List list, List list2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenizationKnowMoreData.headerText;
        }
        if ((i & 2) != 0) {
            list = tokenizationKnowMoreData.longMessages;
        }
        if ((i & 4) != 0) {
            list2 = tokenizationKnowMoreData.bulletPointers;
        }
        if ((i & 8) != 0) {
            str2 = tokenizationKnowMoreData.iconUrl;
        }
        return tokenizationKnowMoreData.copy(str, list, list2, str2);
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

    public final TokenizationKnowMoreData copy(String str, List<String> list, List<String> list2, String str2) {
        runAnimators.ag$a(str, "headerText");
        return new TokenizationKnowMoreData(str, list, list2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenizationKnowMoreData) {
            TokenizationKnowMoreData tokenizationKnowMoreData = (TokenizationKnowMoreData) obj;
            return runAnimators.values((Object) this.headerText, (Object) tokenizationKnowMoreData.headerText) && runAnimators.values(this.longMessages, tokenizationKnowMoreData.longMessages) && runAnimators.values(this.bulletPointers, tokenizationKnowMoreData.bulletPointers) && runAnimators.values((Object) this.iconUrl, (Object) tokenizationKnowMoreData.iconUrl);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.headerText.hashCode();
        List<String> list = this.longMessages;
        int hashCode2 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.bulletPointers;
        int hashCode3 = list2 == null ? 0 : list2.hashCode();
        String str = this.iconUrl;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TokenizationKnowMoreData(headerText=" + this.headerText + ", longMessages=" + this.longMessages + ", bulletPointers=" + this.bulletPointers + ", iconUrl=" + ((Object) this.iconUrl) + ')';
    }

    public TokenizationKnowMoreData(String str, List<String> list, List<String> list2, String str2) {
        runAnimators.ag$a(str, "headerText");
        this.headerText = str;
        this.longMessages = list;
        this.bulletPointers = list2;
        this.iconUrl = str2;
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
}
