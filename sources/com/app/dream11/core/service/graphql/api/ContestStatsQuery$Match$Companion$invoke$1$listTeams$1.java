package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestStatsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestStatsQuery$Match$Companion$invoke$1$listTeams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ContestStatsQuery.ListTeam> {
    public static final ContestStatsQuery$Match$Companion$invoke$1$listTeams$1 INSTANCE = new ContestStatsQuery$Match$Companion$invoke$1$listTeams$1();

    ContestStatsQuery$Match$Companion$invoke$1$listTeams$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ContestStatsQuery$Match$Companion$invoke$1$listTeams$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestStatsQuery.ListTeam> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ContestStatsQuery.ListTeam invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ContestStatsQuery.ListTeam.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestStatsQuery.ListTeam invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ContestStatsQuery.ListTeam) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
