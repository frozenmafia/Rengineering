package com.facebook.share.internal;

import java.util.Arrays;
import o.addAddedFragments;
/* loaded from: classes4.dex */
public enum ShareStoryFeature implements addAddedFragments {
    SHARE_STORY_ASSET(20170417);
    
    private final int minVersion;

    @Override // o.addAddedFragments
    public String getAction() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }

    ShareStoryFeature(int i) {
        this.minVersion = i;
    }

    @Override // o.addAddedFragments
    public int getMinVersion() {
        return this.minVersion;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ShareStoryFeature[] valuesCustom() {
        ShareStoryFeature[] valuesCustom = values();
        return (ShareStoryFeature[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
