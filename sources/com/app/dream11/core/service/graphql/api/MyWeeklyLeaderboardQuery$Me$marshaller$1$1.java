package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyWeeklyLeaderboardQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class MyWeeklyLeaderboardQuery$Me$marshaller$1$1 extends Lambda implements Transition<List<? extends MyWeeklyLeaderboardQuery.LeaderboardRank>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MyWeeklyLeaderboardQuery$Me$marshaller$1$1 INSTANCE = new MyWeeklyLeaderboardQuery$Me$marshaller$1$1();

    MyWeeklyLeaderboardQuery$Me$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MyWeeklyLeaderboardQuery.LeaderboardRank> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MyWeeklyLeaderboardQuery.LeaderboardRank>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MyWeeklyLeaderboardQuery.LeaderboardRank> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MyWeeklyLeaderboardQuery.LeaderboardRank leaderboardRank : list) {
            valueof.values(leaderboardRank.marshaller());
        }
    }
}
