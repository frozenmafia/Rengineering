package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeNewMyTeamsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ShmeNewMyTeamsQuery$Match$Companion$invoke$1$userTeams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ShmeNewMyTeamsQuery.UserTeam> {
    public static final ShmeNewMyTeamsQuery$Match$Companion$invoke$1$userTeams$1 INSTANCE = new ShmeNewMyTeamsQuery$Match$Companion$invoke$1$userTeams$1();

    ShmeNewMyTeamsQuery$Match$Companion$invoke$1$userTeams$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ShmeNewMyTeamsQuery$Match$Companion$invoke$1$userTeams$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ShmeNewMyTeamsQuery.UserTeam> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ShmeNewMyTeamsQuery.UserTeam invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ShmeNewMyTeamsQuery.UserTeam.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ShmeNewMyTeamsQuery.UserTeam invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ShmeNewMyTeamsQuery.UserTeam) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
