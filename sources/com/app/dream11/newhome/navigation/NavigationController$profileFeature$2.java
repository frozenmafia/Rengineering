package com.app.dream11.newhome.navigation;

import com.app.dream11.dream11.DreamApplication;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.addCentering;
/* loaded from: classes3.dex */
public final class NavigationController$profileFeature$2 extends Lambda implements Styleable.ArcMotion<addCentering> {
    public static final NavigationController$profileFeature$2 INSTANCE = new NavigationController$profileFeature$2();

    NavigationController$profileFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final addCentering invoke() {
        return DreamApplication.valueOf().aj$a().ICustomTabsCallback$Stub();
    }
}
