package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UserFollowFollowerListFragment$Edge$Fragments$Companion$invoke$1$userFollowFollowerData$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserFollowFollowerData> {
    public static final UserFollowFollowerListFragment$Edge$Fragments$Companion$invoke$1$userFollowFollowerData$1 INSTANCE = new UserFollowFollowerListFragment$Edge$Fragments$Companion$invoke$1$userFollowFollowerData$1();

    UserFollowFollowerListFragment$Edge$Fragments$Companion$invoke$1$userFollowFollowerData$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserFollowFollowerData invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserFollowFollowerData.Companion.invoke(removecancellable);
    }
}
