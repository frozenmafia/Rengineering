package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.TeamCompareQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TeamCompareQuery$Match$Companion$invoke$1$specialPlayers$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, TeamCompareQuery.SpecialPlayer> {
    public static final TeamCompareQuery$Match$Companion$invoke$1$specialPlayers$1 INSTANCE = new TeamCompareQuery$Match$Companion$invoke$1$specialPlayers$1();

    TeamCompareQuery$Match$Companion$invoke$1$specialPlayers$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.TeamCompareQuery$Match$Companion$invoke$1$specialPlayers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TeamCompareQuery.SpecialPlayer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final TeamCompareQuery.SpecialPlayer invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return TeamCompareQuery.SpecialPlayer.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final TeamCompareQuery.SpecialPlayer invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (TeamCompareQuery.SpecialPlayer) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
