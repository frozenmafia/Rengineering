package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestLeaderboardPageQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestLeaderboardPageQuery$Contest$Companion$invoke$1$asContest$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestLeaderboardPageQuery.AsContest> {
    public static final ContestLeaderboardPageQuery$Contest$Companion$invoke$1$asContest$1 INSTANCE = new ContestLeaderboardPageQuery$Contest$Companion$invoke$1$asContest$1();

    ContestLeaderboardPageQuery$Contest$Companion$invoke$1$asContest$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestLeaderboardPageQuery.AsContest invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestLeaderboardPageQuery.AsContest.Companion.invoke(removecancellable);
    }
}
