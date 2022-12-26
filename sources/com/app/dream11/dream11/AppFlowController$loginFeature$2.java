package com.app.dream11.dream11;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setupMotionViews;
/* loaded from: classes3.dex */
public final class AppFlowController$loginFeature$2 extends Lambda implements Styleable.ArcMotion<setupMotionViews> {
    public static final AppFlowController$loginFeature$2 INSTANCE = new AppFlowController$loginFeature$2();

    AppFlowController$loginFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final setupMotionViews invoke() {
        return DreamApplication.valueOf().aj$a().extraCallback();
    }
}
