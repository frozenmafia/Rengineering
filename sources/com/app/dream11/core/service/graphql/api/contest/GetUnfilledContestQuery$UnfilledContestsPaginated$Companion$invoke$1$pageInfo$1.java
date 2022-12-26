package com.app.dream11.core.service.graphql.api.contest;

import com.app.dream11.core.service.graphql.api.contest.GetUnfilledContestQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetUnfilledContestQuery$UnfilledContestsPaginated$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUnfilledContestQuery.PageInfo> {
    public static final GetUnfilledContestQuery$UnfilledContestsPaginated$Companion$invoke$1$pageInfo$1 INSTANCE = new GetUnfilledContestQuery$UnfilledContestsPaginated$Companion$invoke$1$pageInfo$1();

    GetUnfilledContestQuery$UnfilledContestsPaginated$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUnfilledContestQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUnfilledContestQuery.PageInfo.Companion.invoke(removecancellable);
    }
}
