package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetAllNetBankingBanksQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GetAllNetBankingBanksQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends GetAllNetBankingBanksQuery.PopularBank>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetAllNetBankingBanksQuery$Data$marshaller$1$1 INSTANCE = new GetAllNetBankingBanksQuery$Data$marshaller$1$1();

    GetAllNetBankingBanksQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetAllNetBankingBanksQuery.PopularBank> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetAllNetBankingBanksQuery.PopularBank>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetAllNetBankingBanksQuery.PopularBank> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetAllNetBankingBanksQuery.PopularBank popularBank : list) {
            valueof.values(popularBank.marshaller());
        }
    }
}
