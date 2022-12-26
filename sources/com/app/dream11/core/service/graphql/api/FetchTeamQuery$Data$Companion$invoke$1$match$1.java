package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchTeamQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchTeamQuery.Match> {
    public static final FetchTeamQuery$Data$Companion$invoke$1$match$1 INSTANCE = new FetchTeamQuery$Data$Companion$invoke$1$match$1();

    FetchTeamQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchTeamQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchTeamQuery.Match.Companion.invoke(removecancellable);
    }
}
