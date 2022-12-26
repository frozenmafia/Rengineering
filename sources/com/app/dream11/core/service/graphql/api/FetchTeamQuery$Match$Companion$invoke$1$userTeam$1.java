package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchTeamQuery$Match$Companion$invoke$1$userTeam$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchTeamQuery.UserTeam> {
    public static final FetchTeamQuery$Match$Companion$invoke$1$userTeam$1 INSTANCE = new FetchTeamQuery$Match$Companion$invoke$1$userTeam$1();

    FetchTeamQuery$Match$Companion$invoke$1$userTeam$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchTeamQuery.UserTeam invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchTeamQuery.UserTeam.Companion.invoke(removecancellable);
    }
}
