package com.app.dream11.homescreen;

import kotlin.jvm.internal.Lambda;
import o.ProxyInterface;
import o.Styleable;
import o.onAttachedToWindow;
/* loaded from: classes3.dex */
final class ReactHomeFragment$matchCentreFeature$2 extends Lambda implements Styleable.ArcMotion<ProxyInterface> {
    public static final ReactHomeFragment$matchCentreFeature$2 INSTANCE = new ReactHomeFragment$matchCentreFeature$2();

    ReactHomeFragment$matchCentreFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final ProxyInterface invoke() {
        return onAttachedToWindow.values.values().extraCallbackWithResult();
    }
}
