package com.app.dream11.core.service.graphql.api.Social.Me;

import com.app.dream11.core.service.graphql.api.Social.Me.FollowFollowingUserInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FollowFollowingUserInfoQuery$Me$Companion$invoke$1$loyalty$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FollowFollowingUserInfoQuery.Loyalty> {
    public static final FollowFollowingUserInfoQuery$Me$Companion$invoke$1$loyalty$1 INSTANCE = new FollowFollowingUserInfoQuery$Me$Companion$invoke$1$loyalty$1();

    FollowFollowingUserInfoQuery$Me$Companion$invoke$1$loyalty$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FollowFollowingUserInfoQuery.Loyalty invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FollowFollowingUserInfoQuery.Loyalty.Companion.invoke(removecancellable);
    }
}
