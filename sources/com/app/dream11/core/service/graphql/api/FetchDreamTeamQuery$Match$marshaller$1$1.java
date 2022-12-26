package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchDreamTeamQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FetchDreamTeamQuery$Match$marshaller$1$1 extends Lambda implements Transition<List<? extends FetchDreamTeamQuery.Squad>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FetchDreamTeamQuery$Match$marshaller$1$1 INSTANCE = new FetchDreamTeamQuery$Match$marshaller$1$1();

    FetchDreamTeamQuery$Match$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FetchDreamTeamQuery.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FetchDreamTeamQuery.Squad>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FetchDreamTeamQuery.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FetchDreamTeamQuery.Squad squad : list) {
            valueof.values(squad.marshaller());
        }
    }
}
