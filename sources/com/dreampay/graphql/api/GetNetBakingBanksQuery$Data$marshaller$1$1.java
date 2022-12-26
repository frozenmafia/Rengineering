package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetNetBakingBanksQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class GetNetBakingBanksQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends GetNetBakingBanksQuery.NetbankingBank>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final GetNetBakingBanksQuery$Data$marshaller$1$1 INSTANCE = new GetNetBakingBanksQuery$Data$marshaller$1$1();

    GetNetBakingBanksQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends GetNetBakingBanksQuery.NetbankingBank> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<GetNetBakingBanksQuery.NetbankingBank>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetNetBakingBanksQuery.NetbankingBank> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (GetNetBakingBanksQuery.NetbankingBank netbankingBank : list) {
            valueof.values(netbankingBank.marshaller());
        }
    }
}
