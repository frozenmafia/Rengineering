package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestLeaderboardPageQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestLeaderboardPageQuery$AsContest$Companion$invoke$1$entryFee$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestLeaderboardPageQuery.EntryFee> {
    public static final ContestLeaderboardPageQuery$AsContest$Companion$invoke$1$entryFee$1 INSTANCE = new ContestLeaderboardPageQuery$AsContest$Companion$invoke$1$entryFee$1();

    ContestLeaderboardPageQuery$AsContest$Companion$invoke$1$entryFee$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestLeaderboardPageQuery.EntryFee invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestLeaderboardPageQuery.EntryFee.Companion.invoke(removecancellable);
    }
}