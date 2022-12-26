package com.sendbird.android.log;

import com.sendbird.android.constant.StringSet;
/* loaded from: classes5.dex */
public enum Tag {
    DEFAULT(StringSet.SendBird),
    CONNECTION("CONNECTION"),
    PINGER("PINGER");
    
    private final String tag;

    Tag(String str) {
        this.tag = str;
    }

    public String tag() {
        return this.tag;
    }
}
