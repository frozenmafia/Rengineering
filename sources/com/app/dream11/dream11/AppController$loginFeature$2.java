package com.app.dream11.dream11;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setupMotionViews;
/* loaded from: classes3.dex */
public final class AppController$loginFeature$2 extends Lambda implements Styleable.ArcMotion<setupMotionViews> {
    public static final AppController$loginFeature$2 INSTANCE = new AppController$loginFeature$2();

    AppController$loginFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final setupMotionViews invoke() {
        return DreamApplication.valueOf().aj$a().extraCallback();
    }
}
