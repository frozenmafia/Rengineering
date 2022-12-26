package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FetchContestQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchContestQuery$Contest$Companion$invoke$1$entryFee$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchContestQuery.EntryFee> {
    public static final FetchContestQuery$Contest$Companion$invoke$1$entryFee$1 INSTANCE = new FetchContestQuery$Contest$Companion$invoke$1$entryFee$1();

    FetchContestQuery$Contest$Companion$invoke$1$entryFee$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchContestQuery.EntryFee invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FetchContestQuery.EntryFee.Companion.invoke(removecancellable);
    }
}
