package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MultiTeamJoinSelectionQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class MultiTeamJoinSelectionQuery$Contest$marshaller$1$1 extends Lambda implements Transition<List<? extends MultiTeamJoinSelectionQuery.MyTeam>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final MultiTeamJoinSelectionQuery$Contest$marshaller$1$1 INSTANCE = new MultiTeamJoinSelectionQuery$Contest$marshaller$1$1();

    MultiTeamJoinSelectionQuery$Contest$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends MultiTeamJoinSelectionQuery.MyTeam> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<MultiTeamJoinSelectionQuery.MyTeam>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<MultiTeamJoinSelectionQuery.MyTeam> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (MultiTeamJoinSelectionQuery.MyTeam myTeam : list) {
            valueof.values(myTeam.marshaller());
        }
    }
}
