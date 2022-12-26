package com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class OfferDetails implements Serializable {
    private final String fullText;
    private final String highlightText;
    private final String highlightTextUrl;

    public OfferDetails(String str, String str2, String str3) {
        runAnimators.ag$a(str, "fullText");
        this.fullText = str;
        this.highlightText = str2;
        this.highlightTextUrl = str3;
    }

    public final String getFullText() {
        return this.fullText;
    }

    public final String getHighlightText() {
        return this.highlightText;
    }

    public final String getHighlightTextUrl() {
        return this.highlightTextUrl;
    }
}
