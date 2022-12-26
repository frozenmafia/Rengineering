package com.app.dream11.core.service.graphql.api.Social.OtherUser;

import com.app.dream11.core.service.graphql.api.Social.OtherUser.OtherFollowingListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OtherFollowingListQuery$User$Companion$invoke$1$followingCount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, OtherFollowingListQuery.FollowingCount> {
    public static final OtherFollowingListQuery$User$Companion$invoke$1$followingCount$1 INSTANCE = new OtherFollowingListQuery$User$Companion$invoke$1$followingCount$1();

    OtherFollowingListQuery$User$Companion$invoke$1$followingCount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final OtherFollowingListQuery.FollowingCount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return OtherFollowingListQuery.FollowingCount.Companion.invoke(removecancellable);
    }
}
