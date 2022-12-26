package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UserStatsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class UserStatsQuery$TourLeaderboardRounds$marshaller$1$1 extends Lambda implements Transition<List<? extends UserStatsQuery.UserRoundPoint>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final UserStatsQuery$TourLeaderboardRounds$marshaller$1$1 INSTANCE = new UserStatsQuery$TourLeaderboardRounds$marshaller$1$1();

    UserStatsQuery$TourLeaderboardRounds$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends UserStatsQuery.UserRoundPoint> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<UserStatsQuery.UserRoundPoint>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<UserStatsQuery.UserRoundPoint> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (UserStatsQuery.UserRoundPoint userRoundPoint : list) {
            valueof.values(userRoundPoint.marshaller());
        }
    }
}
