package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UserInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UserInfoQuery$User$Companion$invoke$1$followingCount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserInfoQuery.FollowingCount> {
    public static final UserInfoQuery$User$Companion$invoke$1$followingCount$1 INSTANCE = new UserInfoQuery$User$Companion$invoke$1$followingCount$1();

    UserInfoQuery$User$Companion$invoke$1$followingCount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserInfoQuery.FollowingCount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserInfoQuery.FollowingCount.Companion.invoke(removecancellable);
    }
}
