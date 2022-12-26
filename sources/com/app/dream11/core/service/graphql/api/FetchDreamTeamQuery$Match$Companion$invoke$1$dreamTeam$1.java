package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchDreamTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchDreamTeamQuery$Match$Companion$invoke$1$dreamTeam$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchDreamTeamQuery.DreamTeam> {
    public static final FetchDreamTeamQuery$Match$Companion$invoke$1$dreamTeam$1 INSTANCE = new FetchDreamTeamQuery$Match$Companion$invoke$1$dreamTeam$1();

    FetchDreamTeamQuery$Match$Companion$invoke$1$dreamTeam$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchDreamTeamQuery.DreamTeam invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchDreamTeamQuery.DreamTeam.Companion.invoke(removecancellable);
    }
}
