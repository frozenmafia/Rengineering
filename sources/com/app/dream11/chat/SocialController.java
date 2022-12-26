package com.app.dream11.chat;

import o.getCategory;
import o.runAnimators;
import o.setIdentityTransforms;
/* loaded from: classes.dex */
public final class SocialController {
    private final setIdentityTransforms socialFeature$delegate = runAnimators.ag$a(SocialController$socialFeature$2.INSTANCE, "initializer");

    public final getCategory getSocialFeature() {
        return (getCategory) this.socialFeature$delegate.getValue();
    }

    public final String getGiphyConfigKey() {
        return getSocialFeature().HaptikSDK$c();
    }

    public final boolean isRNChatTabEnabled() {
        return getSocialFeature().extraCallbackWithResult();
    }
}
