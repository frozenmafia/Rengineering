package com.facebook.share.internal;

import java.util.Arrays;
import o.addAddedFragments;
/* loaded from: classes4.dex */
public enum ShareDialogFeature implements addAddedFragments {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);
    
    private final int minVersion;

    @Override // o.addAddedFragments
    public String getAction() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    ShareDialogFeature(int i) {
        this.minVersion = i;
    }

    @Override // o.addAddedFragments
    public int getMinVersion() {
        return this.minVersion;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ShareDialogFeature[] valuesCustom() {
        ShareDialogFeature[] valuesCustom = values();
        return (ShareDialogFeature[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
