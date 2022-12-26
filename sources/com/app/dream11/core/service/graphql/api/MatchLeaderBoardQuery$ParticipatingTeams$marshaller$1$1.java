package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MatchLeaderBoardQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class MatchLeaderBoardQuery$ParticipatingTeams$marshaller$1$1 extends Lambda implements Transition<List<? extends MatchLeaderBoardQuery.Edge>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MatchLeaderBoardQuery$ParticipatingTeams$marshaller$1$1 INSTANCE = new MatchLeaderBoardQuery$ParticipatingTeams$marshaller$1$1();

    MatchLeaderBoardQuery$ParticipatingTeams$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MatchLeaderBoardQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MatchLeaderBoardQuery.Edge>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MatchLeaderBoardQuery.Edge> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MatchLeaderBoardQuery.Edge edge : list) {
            valueof.values(edge == null ? null : edge.marshaller());
        }
    }
}
