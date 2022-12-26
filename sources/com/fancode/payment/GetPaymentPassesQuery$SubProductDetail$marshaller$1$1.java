package com.fancode.payment;

import com.fancode.payment.GetPaymentPassesQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GetPaymentPassesQuery$SubProductDetail$marshaller$1$1 extends Lambda implements Transition<List<? extends GetPaymentPassesQuery.getInitSettings>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetPaymentPassesQuery$SubProductDetail$marshaller$1$1 INSTANCE = new GetPaymentPassesQuery$SubProductDetail$marshaller$1$1();

    GetPaymentPassesQuery$SubProductDetail$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetPaymentPassesQuery.getInitSettings> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetPaymentPassesQuery.getInitSettings>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetPaymentPassesQuery.getInitSettings> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list != null) {
            for (GetPaymentPassesQuery.getInitSettings getinitsettings : list) {
                valueof.values(getinitsettings.HaptikSDK$c());
            }
        }
    }
}
