package com.app.dream11.core.service.graphql.api.contest;

import com.app.dream11.core.service.graphql.api.contest.GetUnfilledContestQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetUnfilledContestQuery$Match$Companion$invoke$1$unfilledContestsPaginated$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUnfilledContestQuery.UnfilledContestsPaginated> {
    public static final GetUnfilledContestQuery$Match$Companion$invoke$1$unfilledContestsPaginated$1 INSTANCE = new GetUnfilledContestQuery$Match$Companion$invoke$1$unfilledContestsPaginated$1();

    GetUnfilledContestQuery$Match$Companion$invoke$1$unfilledContestsPaginated$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUnfilledContestQuery.UnfilledContestsPaginated invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUnfilledContestQuery.UnfilledContestsPaginated.Companion.invoke(removecancellable);
    }
}
