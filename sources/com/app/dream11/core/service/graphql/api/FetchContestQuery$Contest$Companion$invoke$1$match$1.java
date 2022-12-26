package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchContestQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchContestQuery$Contest$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchContestQuery.Match> {
    public static final FetchContestQuery$Contest$Companion$invoke$1$match$1 INSTANCE = new FetchContestQuery$Contest$Companion$invoke$1$match$1();

    FetchContestQuery$Contest$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchContestQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchContestQuery.Match.Companion.invoke(removecancellable);
    }
}
