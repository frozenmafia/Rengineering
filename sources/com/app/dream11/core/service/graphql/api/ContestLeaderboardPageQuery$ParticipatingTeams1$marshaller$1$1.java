package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestLeaderboardPageQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestLeaderboardPageQuery$ParticipatingTeams1$marshaller$1$1 extends Lambda implements Transition<List<? extends ContestLeaderboardPageQuery.Edge1>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestLeaderboardPageQuery$ParticipatingTeams1$marshaller$1$1 INSTANCE = new ContestLeaderboardPageQuery$ParticipatingTeams1$marshaller$1$1();

    ContestLeaderboardPageQuery$ParticipatingTeams1$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ContestLeaderboardPageQuery.Edge1> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ContestLeaderboardPageQuery.Edge1>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ContestLeaderboardPageQuery.Edge1> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ContestLeaderboardPageQuery.Edge1 edge1 : list) {
            valueof.values(edge1 == null ? null : edge1.marshaller());
        }
    }
}
