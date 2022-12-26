package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchDreamTeamQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchDreamTeamQuery$Player$Companion$invoke$1$squad$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchDreamTeamQuery.Squad1> {
    public static final FetchDreamTeamQuery$Player$Companion$invoke$1$squad$1 INSTANCE = new FetchDreamTeamQuery$Player$Companion$invoke$1$squad$1();

    FetchDreamTeamQuery$Player$Companion$invoke$1$squad$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchDreamTeamQuery.Squad1 invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchDreamTeamQuery.Squad1.Companion.invoke(removecancellable);
    }
}
