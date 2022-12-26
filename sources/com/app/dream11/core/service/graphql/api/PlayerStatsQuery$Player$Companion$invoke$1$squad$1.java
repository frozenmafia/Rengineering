package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.PlayerStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PlayerStatsQuery$Player$Companion$invoke$1$squad$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerStatsQuery.Squad> {
    public static final PlayerStatsQuery$Player$Companion$invoke$1$squad$1 INSTANCE = new PlayerStatsQuery$Player$Companion$invoke$1$squad$1();

    PlayerStatsQuery$Player$Companion$invoke$1$squad$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerStatsQuery.Squad invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return PlayerStatsQuery.Squad.Companion.invoke(removecancellable);
    }
}
