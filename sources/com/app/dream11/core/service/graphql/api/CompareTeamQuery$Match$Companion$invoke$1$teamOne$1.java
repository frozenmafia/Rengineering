package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.CompareTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CompareTeamQuery$Match$Companion$invoke$1$teamOne$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CompareTeamQuery.TeamOne> {
    public static final CompareTeamQuery$Match$Companion$invoke$1$teamOne$1 INSTANCE = new CompareTeamQuery$Match$Companion$invoke$1$teamOne$1();

    CompareTeamQuery$Match$Companion$invoke$1$teamOne$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CompareTeamQuery.TeamOne invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CompareTeamQuery.TeamOne.Companion.invoke(removecancellable);
    }
}
