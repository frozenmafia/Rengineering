package com.app.dream11.core.service.graphql.api.createteam;

import com.app.dream11.core.service.graphql.api.createteam.PlayerSortStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerSortStatsQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerSortStatsQuery.Match> {
    public static final PlayerSortStatsQuery$Data$Companion$invoke$1$match$1 INSTANCE = new PlayerSortStatsQuery$Data$Companion$invoke$1$match$1();

    PlayerSortStatsQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerSortStatsQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PlayerSortStatsQuery.Match.Companion.invoke(removecancellable);
    }
}
