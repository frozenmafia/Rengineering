package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.CompareTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CompareTeamQuery$Match$Companion$invoke$1$competitorTeams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, CompareTeamQuery.CompetitorTeam> {
    public static final CompareTeamQuery$Match$Companion$invoke$1$competitorTeams$1 INSTANCE = new CompareTeamQuery$Match$Companion$invoke$1$competitorTeams$1();

    CompareTeamQuery$Match$Companion$invoke$1$competitorTeams$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.CompareTeamQuery$Match$Companion$invoke$1$competitorTeams$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CompareTeamQuery.CompetitorTeam> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final CompareTeamQuery.CompetitorTeam invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return CompareTeamQuery.CompetitorTeam.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final CompareTeamQuery.CompetitorTeam invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (CompareTeamQuery.CompetitorTeam) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
