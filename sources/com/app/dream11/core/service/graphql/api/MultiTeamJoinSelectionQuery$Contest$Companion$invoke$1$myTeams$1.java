package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MultiTeamJoinSelectionQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MultiTeamJoinSelectionQuery$Contest$Companion$invoke$1$myTeams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, MultiTeamJoinSelectionQuery.MyTeam> {
    public static final MultiTeamJoinSelectionQuery$Contest$Companion$invoke$1$myTeams$1 INSTANCE = new MultiTeamJoinSelectionQuery$Contest$Companion$invoke$1$myTeams$1();

    MultiTeamJoinSelectionQuery$Contest$Companion$invoke$1$myTeams$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.MultiTeamJoinSelectionQuery$Contest$Companion$invoke$1$myTeams$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MultiTeamJoinSelectionQuery.MyTeam> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final MultiTeamJoinSelectionQuery.MyTeam invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return MultiTeamJoinSelectionQuery.MyTeam.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final MultiTeamJoinSelectionQuery.MyTeam invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (MultiTeamJoinSelectionQuery.MyTeam) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
