package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UserInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UserInfoQuery$User$Companion$invoke$1$followersCount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserInfoQuery.FollowersCount> {
    public static final UserInfoQuery$User$Companion$invoke$1$followersCount$1 INSTANCE = new UserInfoQuery$User$Companion$invoke$1$followersCount$1();

    UserInfoQuery$User$Companion$invoke$1$followersCount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserInfoQuery.FollowersCount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserInfoQuery.FollowersCount.Companion.invoke(removecancellable);
    }
}
