package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerInfoQuery$TourStatistic$Companion$invoke$1$matchPointsBreakup$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, PlayerInfoQuery.MatchPointsBreakup> {
    public static final PlayerInfoQuery$TourStatistic$Companion$invoke$1$matchPointsBreakup$1 INSTANCE = new PlayerInfoQuery$TourStatistic$Companion$invoke$1$matchPointsBreakup$1();

    PlayerInfoQuery$TourStatistic$Companion$invoke$1$matchPointsBreakup$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.PlayerInfoQuery$TourStatistic$Companion$invoke$1$matchPointsBreakup$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerInfoQuery.MatchPointsBreakup> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final PlayerInfoQuery.MatchPointsBreakup invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return PlayerInfoQuery.MatchPointsBreakup.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerInfoQuery.MatchPointsBreakup invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (PlayerInfoQuery.MatchPointsBreakup) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
