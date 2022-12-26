package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.AllowTeamNameChangeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AllowTeamNameChangeQuery$Data$Companion$invoke$1$me$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, AllowTeamNameChangeQuery.Me> {
    public static final AllowTeamNameChangeQuery$Data$Companion$invoke$1$me$1 INSTANCE = new AllowTeamNameChangeQuery$Data$Companion$invoke$1$me$1();

    AllowTeamNameChangeQuery$Data$Companion$invoke$1$me$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final AllowTeamNameChangeQuery.Me invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return AllowTeamNameChangeQuery.Me.Companion.invoke(removecancellable);
    }
}
