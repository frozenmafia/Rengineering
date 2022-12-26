package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetWeeklyLeaderboardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetWeeklyLeaderboardQuery$WeeklyLeaderboard$Companion$invoke$1$users$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetWeeklyLeaderboardQuery.Users> {
    public static final GetWeeklyLeaderboardQuery$WeeklyLeaderboard$Companion$invoke$1$users$1 INSTANCE = new GetWeeklyLeaderboardQuery$WeeklyLeaderboard$Companion$invoke$1$users$1();

    GetWeeklyLeaderboardQuery$WeeklyLeaderboard$Companion$invoke$1$users$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetWeeklyLeaderboardQuery.Users invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetWeeklyLeaderboardQuery.Users.Companion.invoke(removecancellable);
    }
}
