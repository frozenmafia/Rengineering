package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchWinningBreakupForPrivateContestQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchWinningBreakupForPrivateContestQuery$WinnerBreakup$Companion$invoke$1$amount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchWinningBreakupForPrivateContestQuery.Amount> {
    public static final FetchWinningBreakupForPrivateContestQuery$WinnerBreakup$Companion$invoke$1$amount$1 INSTANCE = new FetchWinningBreakupForPrivateContestQuery$WinnerBreakup$Companion$invoke$1$amount$1();

    FetchWinningBreakupForPrivateContestQuery$WinnerBreakup$Companion$invoke$1$amount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchWinningBreakupForPrivateContestQuery.Amount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchWinningBreakupForPrivateContestQuery.Amount.Companion.invoke(removecancellable);
    }
}
