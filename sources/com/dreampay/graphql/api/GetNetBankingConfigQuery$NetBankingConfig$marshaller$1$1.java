package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetNetBankingConfigQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes4.dex */
final class GetNetBankingConfigQuery$NetBankingConfig$marshaller$1$1 extends Lambda implements Transition<List<? extends GetNetBankingConfigQuery.NetBankingPaymentPage>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetNetBankingConfigQuery$NetBankingConfig$marshaller$1$1 INSTANCE = new GetNetBankingConfigQuery$NetBankingConfig$marshaller$1$1();

    GetNetBankingConfigQuery$NetBankingConfig$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetNetBankingConfigQuery.NetBankingPaymentPage> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetNetBankingConfigQuery.NetBankingPaymentPage>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetNetBankingConfigQuery.NetBankingPaymentPage> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetNetBankingConfigQuery.NetBankingPaymentPage netBankingPaymentPage : list) {
            valueof.values(netBankingPaymentPage.marshaller());
        }
    }
}
