package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetTransactionOptionsQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class GetTransactionOptionsQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends GetTransactionOptionsQuery.RecentTxnOption>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetTransactionOptionsQuery$Data$marshaller$1$1 INSTANCE = new GetTransactionOptionsQuery$Data$marshaller$1$1();

    GetTransactionOptionsQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetTransactionOptionsQuery.RecentTxnOption> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetTransactionOptionsQuery.RecentTxnOption>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetTransactionOptionsQuery.RecentTxnOption> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetTransactionOptionsQuery.RecentTxnOption recentTxnOption : list) {
            valueof.values(recentTxnOption.marshaller());
        }
    }
}
