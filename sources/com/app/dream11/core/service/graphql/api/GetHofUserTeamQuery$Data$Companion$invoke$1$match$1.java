package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetHofUserTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetHofUserTeamQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetHofUserTeamQuery.Match> {
    public static final GetHofUserTeamQuery$Data$Companion$invoke$1$match$1 INSTANCE = new GetHofUserTeamQuery$Data$Companion$invoke$1$match$1();

    GetHofUserTeamQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetHofUserTeamQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetHofUserTeamQuery.Match.Companion.invoke(removecancellable);
    }
}
