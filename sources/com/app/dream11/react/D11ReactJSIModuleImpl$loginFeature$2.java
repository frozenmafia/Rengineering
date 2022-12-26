package com.app.dream11.react;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onAttachedToWindow;
import o.setupMotionViews;
/* loaded from: classes.dex */
final class D11ReactJSIModuleImpl$loginFeature$2 extends Lambda implements Styleable.ArcMotion<setupMotionViews> {
    public static final D11ReactJSIModuleImpl$loginFeature$2 INSTANCE = new D11ReactJSIModuleImpl$loginFeature$2();

    D11ReactJSIModuleImpl$loginFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final setupMotionViews invoke() {
        return onAttachedToWindow.values.values().extraCallback();
    }
}
