package com.app.dream11.social;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
import o.setVibrationPattern;
/* loaded from: classes3.dex */
final class FollowFollowerLandingFragment$presenter$2 extends Lambda implements Styleable.ArcMotion<setVibrationPattern> {
    public static final FollowFollowerLandingFragment$presenter$2 INSTANCE = new FollowFollowerLandingFragment$presenter$2();

    FollowFollowerLandingFragment$presenter$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final setVibrationPattern invoke() {
        return ActionMenuItem.valueOf().requestPostMessageChannelWithExtras();
    }
}
