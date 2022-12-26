package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchMatchConditionsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class FetchMatchConditionsQuery$MatchConditions$marshaller$1$1 extends Lambda implements Transition<List<? extends FetchMatchConditionsQuery.Stat>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FetchMatchConditionsQuery$MatchConditions$marshaller$1$1 INSTANCE = new FetchMatchConditionsQuery$MatchConditions$marshaller$1$1();

    FetchMatchConditionsQuery$MatchConditions$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FetchMatchConditionsQuery.Stat> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FetchMatchConditionsQuery.Stat>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FetchMatchConditionsQuery.Stat> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FetchMatchConditionsQuery.Stat stat : list) {
            valueof.values(stat == null ? null : stat.marshaller());
        }
    }
}
