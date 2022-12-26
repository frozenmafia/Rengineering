package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.internal.ago;
/* loaded from: classes4.dex */
public enum FriendlyObstructionPurpose {
    VIDEO_CONTROLS,
    CLOSE_AD,
    NOT_VISIBLE,
    OTHER;

    public ago getOmidPurpose() {
        return (ago) ago.valueOf(ago.class, name());
    }
}
