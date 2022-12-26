package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetAllNetBankingBanksQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GetAllNetBankingBanksQuery$Data$marshaller$1$2 extends Lambda implements Transition<List<? extends GetAllNetBankingBanksQuery.OtherBank>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetAllNetBankingBanksQuery$Data$marshaller$1$2 INSTANCE = new GetAllNetBankingBanksQuery$Data$marshaller$1$2();

    GetAllNetBankingBanksQuery$Data$marshaller$1$2() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetAllNetBankingBanksQuery.OtherBank> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetAllNetBankingBanksQuery.OtherBank>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetAllNetBankingBanksQuery.OtherBank> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetAllNetBankingBanksQuery.OtherBank otherBank : list) {
            valueof.values(otherBank.marshaller());
        }
    }
}
