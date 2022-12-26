package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetHofUserTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetHofUserTeamQuery$Match$Companion$invoke$1$squads$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetHofUserTeamQuery.Squad> {
    public static final GetHofUserTeamQuery$Match$Companion$invoke$1$squads$1 INSTANCE = new GetHofUserTeamQuery$Match$Companion$invoke$1$squads$1();

    GetHofUserTeamQuery$Match$Companion$invoke$1$squads$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.GetHofUserTeamQuery$Match$Companion$invoke$1$squads$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetHofUserTeamQuery.Squad> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetHofUserTeamQuery.Squad invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetHofUserTeamQuery.Squad.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetHofUserTeamQuery.Squad invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetHofUserTeamQuery.Squad) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
