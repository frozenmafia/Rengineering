package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.JoinWithInviteCodeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class JoinWithInviteCodeQuery$LeagueDetailsFromInviteCode$Companion$invoke$1$squads$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, JoinWithInviteCodeQuery.Squad> {
    public static final JoinWithInviteCodeQuery$LeagueDetailsFromInviteCode$Companion$invoke$1$squads$1 INSTANCE = new JoinWithInviteCodeQuery$LeagueDetailsFromInviteCode$Companion$invoke$1$squads$1();

    JoinWithInviteCodeQuery$LeagueDetailsFromInviteCode$Companion$invoke$1$squads$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.JoinWithInviteCodeQuery$LeagueDetailsFromInviteCode$Companion$invoke$1$squads$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, JoinWithInviteCodeQuery.Squad> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final JoinWithInviteCodeQuery.Squad invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return JoinWithInviteCodeQuery.Squad.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final JoinWithInviteCodeQuery.Squad invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (JoinWithInviteCodeQuery.Squad) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
