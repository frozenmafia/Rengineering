package com.app.dream11.core.service.graphql.api.Social.Me;

import com.app.dream11.core.service.graphql.api.Social.Me.FollowingsListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FollowingsListQuery$Me$Companion$invoke$1$followingCount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FollowingsListQuery.FollowingCount> {
    public static final FollowingsListQuery$Me$Companion$invoke$1$followingCount$1 INSTANCE = new FollowingsListQuery$Me$Companion$invoke$1$followingCount$1();

    FollowingsListQuery$Me$Companion$invoke$1$followingCount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FollowingsListQuery.FollowingCount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FollowingsListQuery.FollowingCount.Companion.invoke(removecancellable);
    }
}
