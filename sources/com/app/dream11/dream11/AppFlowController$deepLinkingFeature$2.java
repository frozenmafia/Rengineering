package com.app.dream11.dream11;

import kotlin.jvm.internal.Lambda;
import o.RoundRectDrawable;
import o.Styleable;
/* loaded from: classes3.dex */
public final class AppFlowController$deepLinkingFeature$2 extends Lambda implements Styleable.ArcMotion<RoundRectDrawable> {
    public static final AppFlowController$deepLinkingFeature$2 INSTANCE = new AppFlowController$deepLinkingFeature$2();

    AppFlowController$deepLinkingFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final RoundRectDrawable invoke() {
        return DreamApplication.valueOf().aj$a().HaptikSDK$e();
    }
}
