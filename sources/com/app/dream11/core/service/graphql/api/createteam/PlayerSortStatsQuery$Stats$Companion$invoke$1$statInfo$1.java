package com.app.dream11.core.service.graphql.api.createteam;

import com.app.dream11.core.service.graphql.api.createteam.PlayerSortStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class PlayerSortStatsQuery$Stats$Companion$invoke$1$statInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, PlayerSortStatsQuery.StatInfo> {
    public static final PlayerSortStatsQuery$Stats$Companion$invoke$1$statInfo$1 INSTANCE = new PlayerSortStatsQuery$Stats$Companion$invoke$1$statInfo$1();

    PlayerSortStatsQuery$Stats$Companion$invoke$1$statInfo$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.createteam.PlayerSortStatsQuery$Stats$Companion$invoke$1$statInfo$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, PlayerSortStatsQuery.StatInfo> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final PlayerSortStatsQuery.StatInfo invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return PlayerSortStatsQuery.StatInfo.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final PlayerSortStatsQuery.StatInfo invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (PlayerSortStatsQuery.StatInfo) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
