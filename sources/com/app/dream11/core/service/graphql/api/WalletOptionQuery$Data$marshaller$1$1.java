package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WalletOptionQuery;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.hasEnabledCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
final class WalletOptionQuery$Data$marshaller$1$1 extends Lambda implements Transition<List<? extends WalletOptionQuery.WalletAccount>, hasEnabledCallbacks.valueOf, setAnimationMatrix> {
    public static final WalletOptionQuery$Data$marshaller$1$1 INSTANCE = new WalletOptionQuery$Data$marshaller$1$1();

    WalletOptionQuery$Data$marshaller$1$1() {
        super(2);
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends WalletOptionQuery.WalletAccount> list, hasEnabledCallbacks.valueOf valueof) {
        invoke2((List<WalletOptionQuery.WalletAccount>) list, valueof);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<WalletOptionQuery.WalletAccount> list, hasEnabledCallbacks.valueOf valueof) {
        runAnimators.ag$a(valueof, "listItemWriter");
        if (list == null) {
            return;
        }
        for (WalletOptionQuery.WalletAccount walletAccount : list) {
            valueof.values(walletAccount.marshaller());
        }
    }
}
