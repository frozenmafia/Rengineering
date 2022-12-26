package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.RematchContestHomeQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class RematchContestHomeQuery$AsContest$marshaller$1$1 extends Lambda implements Transition<List<? extends RematchContestHomeQuery.MyTeam>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final RematchContestHomeQuery$AsContest$marshaller$1$1 INSTANCE = new RematchContestHomeQuery$AsContest$marshaller$1$1();

    RematchContestHomeQuery$AsContest$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends RematchContestHomeQuery.MyTeam> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<RematchContestHomeQuery.MyTeam>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<RematchContestHomeQuery.MyTeam> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (RematchContestHomeQuery.MyTeam myTeam : list) {
            valueof.values(myTeam.marshaller());
        }
    }
}
