package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchWinningBreakupForPrivateContestQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchWinningBreakupForPrivateContestQuery$Data$Companion$invoke$1$winnerBreakUpTemplates$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, FetchWinningBreakupForPrivateContestQuery.WinnerBreakUpTemplate> {
    public static final FetchWinningBreakupForPrivateContestQuery$Data$Companion$invoke$1$winnerBreakUpTemplates$1 INSTANCE = new FetchWinningBreakupForPrivateContestQuery$Data$Companion$invoke$1$winnerBreakUpTemplates$1();

    FetchWinningBreakupForPrivateContestQuery$Data$Companion$invoke$1$winnerBreakUpTemplates$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.FetchWinningBreakupForPrivateContestQuery$Data$Companion$invoke$1$winnerBreakUpTemplates$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchWinningBreakupForPrivateContestQuery.WinnerBreakUpTemplate> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final FetchWinningBreakupForPrivateContestQuery.WinnerBreakUpTemplate invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return FetchWinningBreakupForPrivateContestQuery.WinnerBreakUpTemplate.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchWinningBreakupForPrivateContestQuery.WinnerBreakUpTemplate invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (FetchWinningBreakupForPrivateContestQuery.WinnerBreakUpTemplate) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
