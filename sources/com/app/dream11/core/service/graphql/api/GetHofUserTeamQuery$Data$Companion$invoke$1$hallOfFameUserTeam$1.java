package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetHofUserTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetHofUserTeamQuery$Data$Companion$invoke$1$hallOfFameUserTeam$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetHofUserTeamQuery.HallOfFameUserTeam> {
    public static final GetHofUserTeamQuery$Data$Companion$invoke$1$hallOfFameUserTeam$1 INSTANCE = new GetHofUserTeamQuery$Data$Companion$invoke$1$hallOfFameUserTeam$1();

    GetHofUserTeamQuery$Data$Companion$invoke$1$hallOfFameUserTeam$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetHofUserTeamQuery.HallOfFameUserTeam invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetHofUserTeamQuery.HallOfFameUserTeam.Companion.invoke(removecancellable);
    }
}
