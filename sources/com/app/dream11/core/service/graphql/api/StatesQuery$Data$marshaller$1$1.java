package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.StatesQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class StatesQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends StatesQuery.State>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final StatesQuery$Data$marshaller$1$1 INSTANCE = new StatesQuery$Data$marshaller$1$1();

    StatesQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends StatesQuery.State> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<StatesQuery.State>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<StatesQuery.State> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (StatesQuery.State state : list) {
            valueof.values(state.marshaller());
        }
    }
}
