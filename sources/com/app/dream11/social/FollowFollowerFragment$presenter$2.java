package com.app.dream11.social;

import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.NotificationChannelGroupCompat;
import o.Styleable;
/* loaded from: classes3.dex */
final class FollowFollowerFragment$presenter$2 extends Lambda implements Styleable.ArcMotion<NotificationChannelGroupCompat.Builder> {
    public static final FollowFollowerFragment$presenter$2 INSTANCE = new FollowFollowerFragment$presenter$2();

    FollowFollowerFragment$presenter$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final NotificationChannelGroupCompat.Builder invoke() {
        return ActionMenuItem.valueOf().validateRelationship();
    }
}
