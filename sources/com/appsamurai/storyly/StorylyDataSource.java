package com.appsamurai.storyly;

import com.google.android.gms.common.internal.ImagesContract;
/* loaded from: classes3.dex */
public enum StorylyDataSource {
    API("api"),
    MomentsAPI("moments_api"),
    Local(ImagesContract.LOCAL);
    
    private final String value;

    StorylyDataSource(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
