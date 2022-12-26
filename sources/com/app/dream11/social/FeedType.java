package com.app.dream11.social;

import o.runAnimators;
/* loaded from: classes6.dex */
public enum FeedType {
    FeedContest("FeedContest"),
    FeedUserTeam("FeedUserTeam"),
    FeedGeneral("FeedGeneral"),
    FeedFreeText("FreeText"),
    FeedPoll("FeedPoll"),
    FeedVideo("FeedVideo");
    
    private String value;

    FeedType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.value = str;
    }
}
