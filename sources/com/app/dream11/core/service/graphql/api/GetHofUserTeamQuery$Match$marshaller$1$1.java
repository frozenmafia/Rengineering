package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetHofUserTeamQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GetHofUserTeamQuery$Match$marshaller$1$1 extends Lambda implements Transition<List<? extends GetHofUserTeamQuery.Squad>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetHofUserTeamQuery$Match$marshaller$1$1 INSTANCE = new GetHofUserTeamQuery$Match$marshaller$1$1();

    GetHofUserTeamQuery$Match$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetHofUserTeamQuery.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetHofUserTeamQuery.Squad>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetHofUserTeamQuery.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetHofUserTeamQuery.Squad squad : list) {
            valueof.values(squad.marshaller());
        }
    }
}
