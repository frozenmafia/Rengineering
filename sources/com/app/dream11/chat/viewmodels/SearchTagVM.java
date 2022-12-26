package com.app.dream11.chat.viewmodels;

import o.runAnimators;
/* loaded from: classes.dex */
public final class SearchTagVM {
    private final String tagName;

    public static /* synthetic */ SearchTagVM copy$default(SearchTagVM searchTagVM, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchTagVM.tagName;
        }
        return searchTagVM.copy(str);
    }

    public final String component1() {
        return this.tagName;
    }

    public final SearchTagVM copy(String str) {
        runAnimators.ag$a(str, "tagName");
        return new SearchTagVM(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchTagVM) && runAnimators.values((Object) this.tagName, (Object) ((SearchTagVM) obj).tagName);
    }

    public int hashCode() {
        return this.tagName.hashCode();
    }

    public String toString() {
        String str = this.tagName;
        return "SearchTagVM(tagName=" + str + ")";
    }

    public SearchTagVM(String str) {
        runAnimators.ag$a(str, "tagName");
        this.tagName = str;
    }

    public final String getTagName() {
        return this.tagName;
    }
}
