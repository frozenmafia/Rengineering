package com.app.dream11.core.service.graphql.api.Social.OtherUser;

import com.app.dream11.core.service.graphql.api.Social.OtherUser.OtherFollowerListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OtherFollowerListQuery$User$Companion$invoke$1$followersCount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, OtherFollowerListQuery.FollowersCount> {
    public static final OtherFollowerListQuery$User$Companion$invoke$1$followersCount$1 INSTANCE = new OtherFollowerListQuery$User$Companion$invoke$1$followersCount$1();

    OtherFollowerListQuery$User$Companion$invoke$1$followersCount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final OtherFollowerListQuery.FollowersCount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return OtherFollowerListQuery.FollowersCount.Companion.invoke(removecancellable);
    }
}
