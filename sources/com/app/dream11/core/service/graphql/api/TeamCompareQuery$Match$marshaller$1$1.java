package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.TeamCompareQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class TeamCompareQuery$Match$marshaller$1$1 extends Lambda implements Transition<List<? extends TeamCompareQuery.SpecialPlayer>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final TeamCompareQuery$Match$marshaller$1$1 INSTANCE = new TeamCompareQuery$Match$marshaller$1$1();

    TeamCompareQuery$Match$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends TeamCompareQuery.SpecialPlayer> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<TeamCompareQuery.SpecialPlayer>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<TeamCompareQuery.SpecialPlayer> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (TeamCompareQuery.SpecialPlayer specialPlayer : list) {
            valueof.values(specialPlayer.marshaller());
        }
    }
}
