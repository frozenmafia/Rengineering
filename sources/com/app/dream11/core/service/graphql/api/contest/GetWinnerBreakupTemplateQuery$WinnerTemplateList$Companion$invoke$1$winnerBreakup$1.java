package com.app.dream11.core.service.graphql.api.contest;

import com.app.dream11.core.service.graphql.api.contest.GetWinnerBreakupTemplateQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetWinnerBreakupTemplateQuery$WinnerTemplateList$Companion$invoke$1$winnerBreakup$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetWinnerBreakupTemplateQuery.WinnerBreakup> {
    public static final GetWinnerBreakupTemplateQuery$WinnerTemplateList$Companion$invoke$1$winnerBreakup$1 INSTANCE = new GetWinnerBreakupTemplateQuery$WinnerTemplateList$Companion$invoke$1$winnerBreakup$1();

    GetWinnerBreakupTemplateQuery$WinnerTemplateList$Companion$invoke$1$winnerBreakup$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.contest.GetWinnerBreakupTemplateQuery$WinnerTemplateList$Companion$invoke$1$winnerBreakup$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetWinnerBreakupTemplateQuery.WinnerBreakup> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetWinnerBreakupTemplateQuery.WinnerBreakup invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetWinnerBreakupTemplateQuery.WinnerBreakup.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetWinnerBreakupTemplateQuery.WinnerBreakup invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetWinnerBreakupTemplateQuery.WinnerBreakup) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
