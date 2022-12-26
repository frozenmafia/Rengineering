package com.app.dream11.core.service.graphql.api.Social.OtherUser;

import com.app.dream11.core.service.graphql.api.Social.OtherUser.OtherUserInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OtherUserInfoQuery$Data$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, OtherUserInfoQuery.User> {
    public static final OtherUserInfoQuery$Data$Companion$invoke$1$user$1 INSTANCE = new OtherUserInfoQuery$Data$Companion$invoke$1$user$1();

    OtherUserInfoQuery$Data$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final OtherUserInfoQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return OtherUserInfoQuery.User.Companion.invoke(removecancellable);
    }
}
