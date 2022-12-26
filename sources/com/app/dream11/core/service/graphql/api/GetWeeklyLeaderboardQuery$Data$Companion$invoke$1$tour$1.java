package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetWeeklyLeaderboardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetWeeklyLeaderboardQuery$Data$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetWeeklyLeaderboardQuery.Tour> {
    public static final GetWeeklyLeaderboardQuery$Data$Companion$invoke$1$tour$1 INSTANCE = new GetWeeklyLeaderboardQuery$Data$Companion$invoke$1$tour$1();

    GetWeeklyLeaderboardQuery$Data$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetWeeklyLeaderboardQuery.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetWeeklyLeaderboardQuery.Tour.Companion.invoke(removecancellable);
    }
}
