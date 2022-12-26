package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetNetBakingBanksQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetNetBakingBanksQuery$Data$Companion$invoke$1$netbankingBanks$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetNetBakingBanksQuery.NetbankingBank> {
    public static final GetNetBakingBanksQuery$Data$Companion$invoke$1$netbankingBanks$1 INSTANCE = new GetNetBakingBanksQuery$Data$Companion$invoke$1$netbankingBanks$1();

    GetNetBakingBanksQuery$Data$Companion$invoke$1$netbankingBanks$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dreampay.graphql.api.GetNetBakingBanksQuery$Data$Companion$invoke$1$netbankingBanks$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetNetBakingBanksQuery.NetbankingBank> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetNetBakingBanksQuery.NetbankingBank invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetNetBakingBanksQuery.NetbankingBank.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetNetBakingBanksQuery.NetbankingBank invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetNetBakingBanksQuery.NetbankingBank) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
