package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UserTypeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UserTypeQuery$Data$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserTypeQuery.User> {
    public static final UserTypeQuery$Data$Companion$invoke$1$user$1 INSTANCE = new UserTypeQuery$Data$Companion$invoke$1$user$1();

    UserTypeQuery$Data$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserTypeQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserTypeQuery.User.Companion.invoke(removecancellable);
    }
}
