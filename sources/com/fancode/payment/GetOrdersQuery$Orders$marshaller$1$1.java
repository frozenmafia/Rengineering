package com.fancode.payment;

import com.fancode.payment.GetOrdersQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes4.dex */
final class GetOrdersQuery$Orders$marshaller$1$1 extends Lambda implements Transition<List<? extends GetOrdersQuery.valueOf>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetOrdersQuery$Orders$marshaller$1$1 INSTANCE = new GetOrdersQuery$Orders$marshaller$1$1();

    GetOrdersQuery$Orders$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetOrdersQuery.valueOf> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetOrdersQuery.valueOf>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetOrdersQuery.valueOf> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list != null) {
            for (GetOrdersQuery.valueOf valueof2 : list) {
                valueof.values(valueof2.HaptikSDK$e());
            }
        }
    }
}
