package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.CompareTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CompareTeamQuery$Match$Companion$invoke$1$commonPlayers$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CompareTeamQuery.CommonPlayers> {
    public static final CompareTeamQuery$Match$Companion$invoke$1$commonPlayers$1 INSTANCE = new CompareTeamQuery$Match$Companion$invoke$1$commonPlayers$1();

    CompareTeamQuery$Match$Companion$invoke$1$commonPlayers$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CompareTeamQuery.CommonPlayers invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CompareTeamQuery.CommonPlayers.Companion.invoke(removecancellable);
    }
}
