package com.app.dream11.react;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onAttachedToWindow;
import o.setupMotionViews;
/* loaded from: classes.dex */
final class Dream11ReactBridge$loginFeature$2 extends Lambda implements Styleable.ArcMotion<setupMotionViews> {
    public static final Dream11ReactBridge$loginFeature$2 INSTANCE = new Dream11ReactBridge$loginFeature$2();

    Dream11ReactBridge$loginFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final setupMotionViews invoke() {
        return onAttachedToWindow.values.values().extraCallback();
    }
}
