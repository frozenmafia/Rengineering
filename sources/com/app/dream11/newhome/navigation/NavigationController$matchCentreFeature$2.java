package com.app.dream11.newhome.navigation;

import com.app.dream11.dream11.DreamApplication;
import kotlin.jvm.internal.Lambda;
import o.ProxyInterface;
import o.Styleable;
/* loaded from: classes3.dex */
public final class NavigationController$matchCentreFeature$2 extends Lambda implements Styleable.ArcMotion<ProxyInterface> {
    public static final NavigationController$matchCentreFeature$2 INSTANCE = new NavigationController$matchCentreFeature$2();

    NavigationController$matchCentreFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final ProxyInterface invoke() {
        return DreamApplication.valueOf().aj$a().extraCallbackWithResult();
    }
}
