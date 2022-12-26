package com.app.dream11.core.service.graphql.api.contest;

import com.app.dream11.core.service.graphql.api.contest.GetUnfilledContestQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetUnfilledContestQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUnfilledContestQuery.Match> {
    public static final GetUnfilledContestQuery$Data$Companion$invoke$1$match$1 INSTANCE = new GetUnfilledContestQuery$Data$Companion$invoke$1$match$1();

    GetUnfilledContestQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUnfilledContestQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUnfilledContestQuery.Match.Companion.invoke(removecancellable);
    }
}
