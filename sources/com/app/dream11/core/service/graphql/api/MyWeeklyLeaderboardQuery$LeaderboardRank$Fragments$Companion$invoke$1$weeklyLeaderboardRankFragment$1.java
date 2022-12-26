package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.WeeklyLeaderboardRankFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MyWeeklyLeaderboardQuery$LeaderboardRank$Fragments$Companion$invoke$1$weeklyLeaderboardRankFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WeeklyLeaderboardRankFragment> {
    public static final MyWeeklyLeaderboardQuery$LeaderboardRank$Fragments$Companion$invoke$1$weeklyLeaderboardRankFragment$1 INSTANCE = new MyWeeklyLeaderboardQuery$LeaderboardRank$Fragments$Companion$invoke$1$weeklyLeaderboardRankFragment$1();

    MyWeeklyLeaderboardQuery$LeaderboardRank$Fragments$Companion$invoke$1$weeklyLeaderboardRankFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WeeklyLeaderboardRankFragment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WeeklyLeaderboardRankFragment.Companion.invoke(removecancellable);
    }
}
