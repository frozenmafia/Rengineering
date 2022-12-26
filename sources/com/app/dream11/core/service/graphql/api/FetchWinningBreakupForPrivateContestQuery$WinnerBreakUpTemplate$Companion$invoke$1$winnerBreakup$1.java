package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchWinningBreakupForPrivateContestQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchWinningBreakupForPrivateContestQuery$WinnerBreakUpTemplate$Companion$invoke$1$winnerBreakup$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, FetchWinningBreakupForPrivateContestQuery.WinnerBreakup> {
    public static final FetchWinningBreakupForPrivateContestQuery$WinnerBreakUpTemplate$Companion$invoke$1$winnerBreakup$1 INSTANCE = new FetchWinningBreakupForPrivateContestQuery$WinnerBreakUpTemplate$Companion$invoke$1$winnerBreakup$1();

    FetchWinningBreakupForPrivateContestQuery$WinnerBreakUpTemplate$Companion$invoke$1$winnerBreakup$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.FetchWinningBreakupForPrivateContestQuery$WinnerBreakUpTemplate$Companion$invoke$1$winnerBreakup$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchWinningBreakupForPrivateContestQuery.WinnerBreakup> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final FetchWinningBreakupForPrivateContestQuery.WinnerBreakup invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return FetchWinningBreakupForPrivateContestQuery.WinnerBreakup.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchWinningBreakupForPrivateContestQuery.WinnerBreakup invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (FetchWinningBreakupForPrivateContestQuery.WinnerBreakup) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
