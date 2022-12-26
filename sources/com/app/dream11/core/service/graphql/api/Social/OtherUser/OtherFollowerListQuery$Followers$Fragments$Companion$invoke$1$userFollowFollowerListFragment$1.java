package com.app.dream11.core.service.graphql.api.Social.OtherUser;

import com.app.dream11.core.service.graphql.api.fragment.UserFollowFollowerListFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes2.dex */
final class OtherFollowerListQuery$Followers$Fragments$Companion$invoke$1$userFollowFollowerListFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserFollowFollowerListFragment> {
    public static final OtherFollowerListQuery$Followers$Fragments$Companion$invoke$1$userFollowFollowerListFragment$1 INSTANCE = new OtherFollowerListQuery$Followers$Fragments$Companion$invoke$1$userFollowFollowerListFragment$1();

    OtherFollowerListQuery$Followers$Fragments$Companion$invoke$1$userFollowFollowerListFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserFollowFollowerListFragment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserFollowFollowerListFragment.Companion.invoke(removecancellable);
    }
}
