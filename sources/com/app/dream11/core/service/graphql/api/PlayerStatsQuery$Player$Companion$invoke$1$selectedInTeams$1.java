package com.app.dream11.core.service.graphql.api;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class PlayerStatsQuery$Player$Companion$invoke$1$selectedInTeams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, Integer> {
    public static final PlayerStatsQuery$Player$Companion$invoke$1$selectedInTeams$1 INSTANCE = new PlayerStatsQuery$Player$Companion$invoke$1$selectedInTeams$1();

    PlayerStatsQuery$Player$Companion$invoke$1$selectedInTeams$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Integer invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return Integer.valueOf(valuesVar.values());
    }
}
