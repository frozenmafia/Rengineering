package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestLeaderboardPageQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestLeaderboardPageQuery$AsContest$Companion$invoke$1$myTeams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ContestLeaderboardPageQuery.MyTeam> {
    public static final ContestLeaderboardPageQuery$AsContest$Companion$invoke$1$myTeams$1 INSTANCE = new ContestLeaderboardPageQuery$AsContest$Companion$invoke$1$myTeams$1();

    ContestLeaderboardPageQuery$AsContest$Companion$invoke$1$myTeams$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ContestLeaderboardPageQuery$AsContest$Companion$invoke$1$myTeams$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestLeaderboardPageQuery.MyTeam> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ContestLeaderboardPageQuery.MyTeam invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ContestLeaderboardPageQuery.MyTeam.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestLeaderboardPageQuery.MyTeam invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ContestLeaderboardPageQuery.MyTeam) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
