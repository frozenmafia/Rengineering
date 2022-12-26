package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UserInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UserInfoQuery$Data$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserInfoQuery.User> {
    public static final UserInfoQuery$Data$Companion$invoke$1$user$1 INSTANCE = new UserInfoQuery$Data$Companion$invoke$1$user$1();

    UserInfoQuery$Data$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserInfoQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserInfoQuery.User.Companion.invoke(removecancellable);
    }
}
