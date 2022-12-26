package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.TeamCompareQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TeamCompareQuery$Match$Companion$invoke$1$differentPlayers$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, TeamCompareQuery.DifferentPlayer> {
    public static final TeamCompareQuery$Match$Companion$invoke$1$differentPlayers$1 INSTANCE = new TeamCompareQuery$Match$Companion$invoke$1$differentPlayers$1();

    TeamCompareQuery$Match$Companion$invoke$1$differentPlayers$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.TeamCompareQuery$Match$Companion$invoke$1$differentPlayers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TeamCompareQuery.DifferentPlayer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final TeamCompareQuery.DifferentPlayer invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return TeamCompareQuery.DifferentPlayer.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final TeamCompareQuery.DifferentPlayer invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (TeamCompareQuery.DifferentPlayer) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
