package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MatchLeaderBoardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchLeaderBoardQuery$ParticipatingTeams$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchLeaderBoardQuery.PageInfo> {
    public static final MatchLeaderBoardQuery$ParticipatingTeams$Companion$invoke$1$pageInfo$1 INSTANCE = new MatchLeaderBoardQuery$ParticipatingTeams$Companion$invoke$1$pageInfo$1();

    MatchLeaderBoardQuery$ParticipatingTeams$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchLeaderBoardQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchLeaderBoardQuery.PageInfo.Companion.invoke(removecancellable);
    }
}
