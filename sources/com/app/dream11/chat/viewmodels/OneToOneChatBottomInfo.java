package com.app.dream11.chat.viewmodels;

import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class OneToOneChatBottomInfo {
    private final int backgroundColor;
    private final Integer ctaColor;
    private final String ctaText;
    private final String messageText;
    private final int messageTextColor;
    private final Styleable.ArcMotion<setAnimationMatrix> onCTAClicked;

    public OneToOneChatBottomInfo(String str, int i, String str2, Integer num, Styleable.ArcMotion<setAnimationMatrix> arcMotion, int i2) {
        runAnimators.ag$a(str, "messageText");
        this.messageText = str;
        this.messageTextColor = i;
        this.ctaText = str2;
        this.ctaColor = num;
        this.onCTAClicked = arcMotion;
        this.backgroundColor = i2;
    }

    public final String getMessageText() {
        return this.messageText;
    }

    public final int getMessageTextColor() {
        return this.messageTextColor;
    }

    public final Integer getCtaColor() {
        return this.ctaColor;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getOnCTAClicked() {
        return this.onCTAClicked;
    }

    public final boolean getShouldShowCTA() {
        return (this.ctaText == null || this.ctaColor == null) ? false : true;
    }
}
