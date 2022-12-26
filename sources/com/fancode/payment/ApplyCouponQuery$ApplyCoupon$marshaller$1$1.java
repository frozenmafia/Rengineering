package com.fancode.payment;

import com.fancode.payment.ApplyCouponQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class ApplyCouponQuery$ApplyCoupon$marshaller$1$1 extends Lambda implements Transition<List<? extends ApplyCouponQuery.HaptikWebView>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final ApplyCouponQuery$ApplyCoupon$marshaller$1$1 INSTANCE = new ApplyCouponQuery$ApplyCoupon$marshaller$1$1();

    ApplyCouponQuery$ApplyCoupon$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends ApplyCouponQuery.HaptikWebView> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<ApplyCouponQuery.HaptikWebView>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ApplyCouponQuery.HaptikWebView> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list != null) {
            for (ApplyCouponQuery.HaptikWebView haptikWebView : list) {
                valueof.values(haptikWebView.invoke());
            }
        }
    }
}
