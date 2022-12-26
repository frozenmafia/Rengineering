package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyWeeklyLeaderboardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MyWeeklyLeaderboardQuery$Me$Companion$invoke$1$leaderboardRanks$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, MyWeeklyLeaderboardQuery.LeaderboardRank> {
    public static final MyWeeklyLeaderboardQuery$Me$Companion$invoke$1$leaderboardRanks$1 INSTANCE = new MyWeeklyLeaderboardQuery$Me$Companion$invoke$1$leaderboardRanks$1();

    MyWeeklyLeaderboardQuery$Me$Companion$invoke$1$leaderboardRanks$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.MyWeeklyLeaderboardQuery$Me$Companion$invoke$1$leaderboardRanks$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyWeeklyLeaderboardQuery.LeaderboardRank> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final MyWeeklyLeaderboardQuery.LeaderboardRank invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return MyWeeklyLeaderboardQuery.LeaderboardRank.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final MyWeeklyLeaderboardQuery.LeaderboardRank invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (MyWeeklyLeaderboardQuery.LeaderboardRank) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
