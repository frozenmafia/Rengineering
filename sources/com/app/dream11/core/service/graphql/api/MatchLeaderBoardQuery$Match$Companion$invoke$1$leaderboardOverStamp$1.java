package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MatchLeaderBoardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchLeaderBoardQuery$Match$Companion$invoke$1$leaderboardOverStamp$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchLeaderBoardQuery.LeaderboardOverStamp> {
    public static final MatchLeaderBoardQuery$Match$Companion$invoke$1$leaderboardOverStamp$1 INSTANCE = new MatchLeaderBoardQuery$Match$Companion$invoke$1$leaderboardOverStamp$1();

    MatchLeaderBoardQuery$Match$Companion$invoke$1$leaderboardOverStamp$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchLeaderBoardQuery.LeaderboardOverStamp invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchLeaderBoardQuery.LeaderboardOverStamp.Companion.invoke(removecancellable);
    }
}
