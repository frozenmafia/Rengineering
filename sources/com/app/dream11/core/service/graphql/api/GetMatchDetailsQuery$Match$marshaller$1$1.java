package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetMatchDetailsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GetMatchDetailsQuery$Match$marshaller$1$1 extends Lambda implements Transition<List<? extends GetMatchDetailsQuery.Squad>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetMatchDetailsQuery$Match$marshaller$1$1 INSTANCE = new GetMatchDetailsQuery$Match$marshaller$1$1();

    GetMatchDetailsQuery$Match$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetMatchDetailsQuery.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetMatchDetailsQuery.Squad>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetMatchDetailsQuery.Squad> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetMatchDetailsQuery.Squad squad : list) {
            valueof.values(squad.marshaller());
        }
    }
}
