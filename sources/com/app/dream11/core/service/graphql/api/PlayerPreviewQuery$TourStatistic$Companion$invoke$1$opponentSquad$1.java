package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerPreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerPreviewQuery$TourStatistic$Companion$invoke$1$opponentSquad$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerPreviewQuery.OpponentSquad> {
    public static final PlayerPreviewQuery$TourStatistic$Companion$invoke$1$opponentSquad$1 INSTANCE = new PlayerPreviewQuery$TourStatistic$Companion$invoke$1$opponentSquad$1();

    PlayerPreviewQuery$TourStatistic$Companion$invoke$1$opponentSquad$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerPreviewQuery.OpponentSquad invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PlayerPreviewQuery.OpponentSquad.Companion.invoke(removecancellable);
    }
}
