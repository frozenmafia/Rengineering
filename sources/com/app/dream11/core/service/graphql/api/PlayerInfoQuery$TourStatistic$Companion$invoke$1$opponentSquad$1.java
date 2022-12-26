package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerInfoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerInfoQuery$TourStatistic$Companion$invoke$1$opponentSquad$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerInfoQuery.OpponentSquad> {
    public static final PlayerInfoQuery$TourStatistic$Companion$invoke$1$opponentSquad$1 INSTANCE = new PlayerInfoQuery$TourStatistic$Companion$invoke$1$opponentSquad$1();

    PlayerInfoQuery$TourStatistic$Companion$invoke$1$opponentSquad$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerInfoQuery.OpponentSquad invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PlayerInfoQuery.OpponentSquad.Companion.invoke(removecancellable);
    }
}
