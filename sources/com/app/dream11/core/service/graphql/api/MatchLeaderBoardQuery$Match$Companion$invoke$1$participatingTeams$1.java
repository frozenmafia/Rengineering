package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MatchLeaderBoardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchLeaderBoardQuery$Match$Companion$invoke$1$participatingTeams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchLeaderBoardQuery.ParticipatingTeams> {
    public static final MatchLeaderBoardQuery$Match$Companion$invoke$1$participatingTeams$1 INSTANCE = new MatchLeaderBoardQuery$Match$Companion$invoke$1$participatingTeams$1();

    MatchLeaderBoardQuery$Match$Companion$invoke$1$participatingTeams$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchLeaderBoardQuery.ParticipatingTeams invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchLeaderBoardQuery.ParticipatingTeams.Companion.invoke(removecancellable);
    }
}
