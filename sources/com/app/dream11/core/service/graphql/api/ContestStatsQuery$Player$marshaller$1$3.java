package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestStatsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class ContestStatsQuery$Player$marshaller$1$3 extends Lambda implements Transition<List<? extends ContestStatsQuery.RolesInTeam>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ContestStatsQuery$Player$marshaller$1$3 INSTANCE = new ContestStatsQuery$Player$marshaller$1$3();

    ContestStatsQuery$Player$marshaller$1$3() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ContestStatsQuery.RolesInTeam> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ContestStatsQuery.RolesInTeam>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ContestStatsQuery.RolesInTeam> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (ContestStatsQuery.RolesInTeam rolesInTeam : list) {
            valueof.values(rolesInTeam.marshaller());
        }
    }
}
