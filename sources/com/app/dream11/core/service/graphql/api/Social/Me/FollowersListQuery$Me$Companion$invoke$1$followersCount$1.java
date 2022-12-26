package com.app.dream11.core.service.graphql.api.Social.Me;

import com.app.dream11.core.service.graphql.api.Social.Me.FollowersListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FollowersListQuery$Me$Companion$invoke$1$followersCount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FollowersListQuery.FollowersCount> {
    public static final FollowersListQuery$Me$Companion$invoke$1$followersCount$1 INSTANCE = new FollowersListQuery$Me$Companion$invoke$1$followersCount$1();

    FollowersListQuery$Me$Companion$invoke$1$followersCount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FollowersListQuery.FollowersCount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FollowersListQuery.FollowersCount.Companion.invoke(removecancellable);
    }
}
