package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UserStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class UserStatsQuery$Data$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UserStatsQuery.Tour> {
    public static final UserStatsQuery$Data$Companion$invoke$1$tour$1 INSTANCE = new UserStatsQuery$Data$Companion$invoke$1$tour$1();

    UserStatsQuery$Data$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UserStatsQuery.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UserStatsQuery.Tour.Companion.invoke(removecancellable);
    }
}
