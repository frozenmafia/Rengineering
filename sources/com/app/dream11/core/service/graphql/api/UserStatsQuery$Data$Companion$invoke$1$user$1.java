package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UserStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UserStatsQuery$Data$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserStatsQuery.User> {
    public static final UserStatsQuery$Data$Companion$invoke$1$user$1 INSTANCE = new UserStatsQuery$Data$Companion$invoke$1$user$1();

    UserStatsQuery$Data$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserStatsQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserStatsQuery.User.Companion.invoke(removecancellable);
    }
}
