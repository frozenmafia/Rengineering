package com.app.dream11.react;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onAttachedToWindow;
import o.setupMotionViews;
/* loaded from: classes6.dex */
public final class ReactDelegateImpl$loginFeature$2 extends Lambda implements Styleable.ArcMotion<setupMotionViews> {
    public static final ReactDelegateImpl$loginFeature$2 INSTANCE = new ReactDelegateImpl$loginFeature$2();

    ReactDelegateImpl$loginFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final setupMotionViews invoke() {
        return onAttachedToWindow.values.values().extraCallback();
    }
}
