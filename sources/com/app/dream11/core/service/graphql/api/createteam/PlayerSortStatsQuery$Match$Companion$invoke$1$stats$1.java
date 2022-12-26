package com.app.dream11.core.service.graphql.api.createteam;

import com.app.dream11.core.service.graphql.api.createteam.PlayerSortStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerSortStatsQuery$Match$Companion$invoke$1$stats$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerSortStatsQuery.Stats> {
    public static final PlayerSortStatsQuery$Match$Companion$invoke$1$stats$1 INSTANCE = new PlayerSortStatsQuery$Match$Companion$invoke$1$stats$1();

    PlayerSortStatsQuery$Match$Companion$invoke$1$stats$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerSortStatsQuery.Stats invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PlayerSortStatsQuery.Stats.Companion.invoke(removecancellable);
    }
}
