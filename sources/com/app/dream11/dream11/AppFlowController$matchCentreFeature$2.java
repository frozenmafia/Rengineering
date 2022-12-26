package com.app.dream11.dream11;

import kotlin.jvm.internal.Lambda;
import o.ProxyInterface;
import o.Styleable;
/* loaded from: classes3.dex */
public final class AppFlowController$matchCentreFeature$2 extends Lambda implements Styleable.ArcMotion<ProxyInterface> {
    public static final AppFlowController$matchCentreFeature$2 INSTANCE = new AppFlowController$matchCentreFeature$2();

    AppFlowController$matchCentreFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final ProxyInterface invoke() {
        return DreamApplication.valueOf().aj$a().extraCallbackWithResult();
    }
}
