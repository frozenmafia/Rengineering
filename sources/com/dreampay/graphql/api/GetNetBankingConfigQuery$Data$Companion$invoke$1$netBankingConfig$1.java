package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetNetBankingConfigQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GetNetBankingConfigQuery$Data$Companion$invoke$1$netBankingConfig$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetNetBankingConfigQuery.NetBankingConfig> {
    public static final GetNetBankingConfigQuery$Data$Companion$invoke$1$netBankingConfig$1 INSTANCE = new GetNetBankingConfigQuery$Data$Companion$invoke$1$netBankingConfig$1();

    GetNetBankingConfigQuery$Data$Companion$invoke$1$netBankingConfig$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetNetBankingConfigQuery.NetBankingConfig invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetNetBankingConfigQuery.NetBankingConfig.Companion.invoke(removecancellable);
    }
}
