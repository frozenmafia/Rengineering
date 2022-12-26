package com.app.dream11.newhome.navigation;

import com.app.dream11.dream11.DreamApplication;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getCategory;
/* loaded from: classes3.dex */
public final class NavigationController$socialFeature$2 extends Lambda implements Styleable.ArcMotion<getCategory> {
    public static final NavigationController$socialFeature$2 INSTANCE = new NavigationController$socialFeature$2();

    NavigationController$socialFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final getCategory invoke() {
        return DreamApplication.valueOf().aj$a().postMessage();
    }
}
