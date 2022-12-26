package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetUpiIntentAppListQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes4.dex */
final class GetUpiIntentAppListQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends GetUpiIntentAppListQuery.UpiIntentApp>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetUpiIntentAppListQuery$Data$marshaller$1$1 INSTANCE = new GetUpiIntentAppListQuery$Data$marshaller$1$1();

    GetUpiIntentAppListQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetUpiIntentAppListQuery.UpiIntentApp> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetUpiIntentAppListQuery.UpiIntentApp>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetUpiIntentAppListQuery.UpiIntentApp> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetUpiIntentAppListQuery.UpiIntentApp upiIntentApp : list) {
            valueof.values(upiIntentApp == null ? null : upiIntentApp.marshaller());
        }
    }
}
