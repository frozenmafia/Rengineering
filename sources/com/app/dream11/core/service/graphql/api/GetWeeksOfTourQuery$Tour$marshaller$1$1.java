package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetWeeksOfTourQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GetWeeksOfTourQuery$Tour$marshaller$1$1 extends Lambda implements Transition<List<? extends GetWeeksOfTourQuery.Week>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetWeeksOfTourQuery$Tour$marshaller$1$1 INSTANCE = new GetWeeksOfTourQuery$Tour$marshaller$1$1();

    GetWeeksOfTourQuery$Tour$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetWeeksOfTourQuery.Week> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetWeeksOfTourQuery.Week>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetWeeksOfTourQuery.Week> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetWeeksOfTourQuery.Week week : list) {
            valueof.values(week.marshaller());
        }
    }
}
