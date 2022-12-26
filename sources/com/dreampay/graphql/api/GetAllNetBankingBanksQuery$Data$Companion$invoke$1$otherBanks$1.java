package com.dreampay.graphql.api;

import com.dreampay.graphql.api.GetAllNetBankingBanksQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetAllNetBankingBanksQuery$Data$Companion$invoke$1$otherBanks$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetAllNetBankingBanksQuery.OtherBank> {
    public static final GetAllNetBankingBanksQuery$Data$Companion$invoke$1$otherBanks$1 INSTANCE = new GetAllNetBankingBanksQuery$Data$Companion$invoke$1$otherBanks$1();

    GetAllNetBankingBanksQuery$Data$Companion$invoke$1$otherBanks$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.dreampay.graphql.api.GetAllNetBankingBanksQuery$Data$Companion$invoke$1$otherBanks$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetAllNetBankingBanksQuery.OtherBank> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetAllNetBankingBanksQuery.OtherBank invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetAllNetBankingBanksQuery.OtherBank.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetAllNetBankingBanksQuery.OtherBank invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetAllNetBankingBanksQuery.OtherBank) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
