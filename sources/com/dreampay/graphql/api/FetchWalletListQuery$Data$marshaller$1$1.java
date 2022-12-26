package com.dreampay.graphql.api;

import com.dreampay.graphql.api.FetchWalletListQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
final class FetchWalletListQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends FetchWalletListQuery.WalletList>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final FetchWalletListQuery$Data$marshaller$1$1 INSTANCE = new FetchWalletListQuery$Data$marshaller$1$1();

    FetchWalletListQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends FetchWalletListQuery.WalletList> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<FetchWalletListQuery.WalletList>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FetchWalletListQuery.WalletList> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (FetchWalletListQuery.WalletList walletList : list) {
            valueof.values(walletList.marshaller());
        }
    }
}
