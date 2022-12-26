package com.app.dream11.core.service.graphql.api.Social.OtherUser;

import com.app.dream11.core.service.graphql.api.Social.OtherUser.OtherFollowingListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OtherFollowingListQuery$Data$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, OtherFollowingListQuery.User> {
    public static final OtherFollowingListQuery$Data$Companion$invoke$1$user$1 INSTANCE = new OtherFollowingListQuery$Data$Companion$invoke$1$user$1();

    OtherFollowingListQuery$Data$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final OtherFollowingListQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return OtherFollowingListQuery.User.Companion.invoke(removecancellable);
    }
}
