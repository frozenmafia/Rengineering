package com.app.dream11.newhome.navigation;

import com.app.dream11.dream11.DreamApplication;
import kotlin.jvm.internal.Lambda;
import o.ConstraintWidget;
import o.Styleable;
/* loaded from: classes3.dex */
public final class NavigationController$notificationFeature$2 extends Lambda implements Styleable.ArcMotion<ConstraintWidget.AnonymousClass1> {
    public static final NavigationController$notificationFeature$2 INSTANCE = new NavigationController$notificationFeature$2();

    NavigationController$notificationFeature$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final ConstraintWidget.AnonymousClass1 invoke() {
        return DreamApplication.valueOf().aj$a().onPostMessage();
    }
}
