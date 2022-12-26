package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.LeaderboardUsersTeam;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RematchContestHomeQuery$Edge1$Fragments$Companion$invoke$1$leaderboardUsersTeam$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, LeaderboardUsersTeam> {
    public static final RematchContestHomeQuery$Edge1$Fragments$Companion$invoke$1$leaderboardUsersTeam$1 INSTANCE = new RematchContestHomeQuery$Edge1$Fragments$Companion$invoke$1$leaderboardUsersTeam$1();

    RematchContestHomeQuery$Edge1$Fragments$Companion$invoke$1$leaderboardUsersTeam$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final LeaderboardUsersTeam invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return LeaderboardUsersTeam.Companion.invoke(removecancellable);
    }
}
