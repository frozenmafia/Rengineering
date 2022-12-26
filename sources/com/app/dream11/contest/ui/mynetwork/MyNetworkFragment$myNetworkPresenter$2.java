package com.app.dream11.contest.ui.mynetwork;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.AnimatedStateListDrawableCompat;
import o.Styleable;
/* loaded from: classes2.dex */
final class MyNetworkFragment$myNetworkPresenter$2 extends Lambda implements Styleable.ArcMotion<AnimatedStateListDrawableCompat.AnimatedVectorDrawableTransition> {
    public static final MyNetworkFragment$myNetworkPresenter$2 INSTANCE = new MyNetworkFragment$myNetworkPresenter$2();

    MyNetworkFragment$myNetworkPresenter$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final AnimatedStateListDrawableCompat.AnimatedVectorDrawableTransition invoke() {
        return ActionMenuItem.valueOf().IconCompatParcelizer();
    }
}
