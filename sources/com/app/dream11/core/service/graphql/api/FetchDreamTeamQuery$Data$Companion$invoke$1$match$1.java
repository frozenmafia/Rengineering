package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchDreamTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchDreamTeamQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchDreamTeamQuery.Match> {
    public static final FetchDreamTeamQuery$Data$Companion$invoke$1$match$1 INSTANCE = new FetchDreamTeamQuery$Data$Companion$invoke$1$match$1();

    FetchDreamTeamQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchDreamTeamQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchDreamTeamQuery.Match.Companion.invoke(removecancellable);
    }
}
