package com.app.dream11.social.profilerecommendation;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
import o.generateActionButton;
/* loaded from: classes6.dex */
final class FollowUnFollowComponent$followUnFollowPresenter$2 extends Lambda implements Styleable.ArcMotion<generateActionButton> {
    public static final FollowUnFollowComponent$followUnFollowPresenter$2 INSTANCE = new FollowUnFollowComponent$followUnFollowPresenter$2();

    FollowUnFollowComponent$followUnFollowPresenter$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final generateActionButton invoke() {
        return ActionMenuItem.valueOf().updateVisuals();
    }
}
