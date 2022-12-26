package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MultiTeamJoinSelectionQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MultiTeamJoinSelectionQuery$Match$Companion$invoke$1$userTeams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, MultiTeamJoinSelectionQuery.UserTeam> {
    public static final MultiTeamJoinSelectionQuery$Match$Companion$invoke$1$userTeams$1 INSTANCE = new MultiTeamJoinSelectionQuery$Match$Companion$invoke$1$userTeams$1();

    MultiTeamJoinSelectionQuery$Match$Companion$invoke$1$userTeams$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.MultiTeamJoinSelectionQuery$Match$Companion$invoke$1$userTeams$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MultiTeamJoinSelectionQuery.UserTeam> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final MultiTeamJoinSelectionQuery.UserTeam invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return MultiTeamJoinSelectionQuery.UserTeam.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final MultiTeamJoinSelectionQuery.UserTeam invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (MultiTeamJoinSelectionQuery.UserTeam) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
