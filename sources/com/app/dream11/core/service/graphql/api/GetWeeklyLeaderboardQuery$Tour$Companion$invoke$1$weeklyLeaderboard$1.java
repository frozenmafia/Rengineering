package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetWeeklyLeaderboardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetWeeklyLeaderboardQuery$Tour$Companion$invoke$1$weeklyLeaderboard$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetWeeklyLeaderboardQuery.WeeklyLeaderboard> {
    public static final GetWeeklyLeaderboardQuery$Tour$Companion$invoke$1$weeklyLeaderboard$1 INSTANCE = new GetWeeklyLeaderboardQuery$Tour$Companion$invoke$1$weeklyLeaderboard$1();

    GetWeeklyLeaderboardQuery$Tour$Companion$invoke$1$weeklyLeaderboard$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetWeeklyLeaderboardQuery.WeeklyLeaderboard invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetWeeklyLeaderboardQuery.WeeklyLeaderboard.Companion.invoke(removecancellable);
    }
}
