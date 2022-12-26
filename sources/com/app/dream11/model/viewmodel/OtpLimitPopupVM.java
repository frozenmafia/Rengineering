package com.app.dream11.model.viewmodel;

import o.MotionLayout;
/* loaded from: classes6.dex */
public class OtpLimitPopupVM extends BasePageVM {
    private String clickableText;
    private MotionLayout.TransitionListener handler;
    private String messageText;

    public OtpLimitPopupVM(MotionLayout.TransitionListener transitionListener, String str, String str2) {
        this.handler = transitionListener;
        this.messageText = str;
        this.clickableText = str2;
    }

    public MotionLayout.TransitionListener getHandler() {
        return this.handler;
    }

    public void setHandler(MotionLayout.TransitionListener transitionListener) {
        this.handler = transitionListener;
    }

    public String getMessageText() {
        return this.messageText;
    }

    public void setMessageText(String str) {
        this.messageText = str;
    }

    public String getClickableText() {
        return this.clickableText;
    }

    public void setClickableText(String str) {
        this.clickableText = str;
    }
}
