package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PlayerStatsQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerStatsQuery.Match> {
    public static final PlayerStatsQuery$Data$Companion$invoke$1$match$1 INSTANCE = new PlayerStatsQuery$Data$Companion$invoke$1$match$1();

    PlayerStatsQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerStatsQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PlayerStatsQuery.Match.Companion.invoke(removecancellable);
    }
}
