package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.RolewisePreviewQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RolewisePreviewQuery$TourStatistic$Companion$invoke$1$opponentSquad$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, RolewisePreviewQuery.OpponentSquad> {
    public static final RolewisePreviewQuery$TourStatistic$Companion$invoke$1$opponentSquad$1 INSTANCE = new RolewisePreviewQuery$TourStatistic$Companion$invoke$1$opponentSquad$1();

    RolewisePreviewQuery$TourStatistic$Companion$invoke$1$opponentSquad$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final RolewisePreviewQuery.OpponentSquad invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return RolewisePreviewQuery.OpponentSquad.Companion.invoke(removecancellable);
    }
}
