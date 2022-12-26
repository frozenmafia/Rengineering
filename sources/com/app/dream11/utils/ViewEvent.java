package com.app.dream11.utils;

import o.runAnimators;
/* loaded from: classes3.dex */
public enum ViewEvent {
    ACTION_VERIFY_OTP_COMPLETED("VERIFY_OTP_COMPLETED"),
    FLOW_STATE_RES_VERIFICATION_HOME("VERIFICATION_HOME");
    
    private String event;

    ViewEvent(String str) {
        this.event = str;
    }

    public final String getEvent$app_proProdRelease() {
        return this.event;
    }

    public final void setEvent$app_proProdRelease(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.event = str;
    }
}
