package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.CompareTeamQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class CompareTeamQuery$Match$marshaller$1$1 extends Lambda implements Transition<List<? extends CompareTeamQuery.UserTeam>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final CompareTeamQuery$Match$marshaller$1$1 INSTANCE = new CompareTeamQuery$Match$marshaller$1$1();

    CompareTeamQuery$Match$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends CompareTeamQuery.UserTeam> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<CompareTeamQuery.UserTeam>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<CompareTeamQuery.UserTeam> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (CompareTeamQuery.UserTeam userTeam : list) {
            valueof.values(userTeam.marshaller());
        }
    }
}
