package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestsPostLockQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestsPostLockQuery$JoinedContestPaginated$Companion$invoke$1$pageInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestsPostLockQuery.PageInfo> {
    public static final ContestsPostLockQuery$JoinedContestPaginated$Companion$invoke$1$pageInfo$1 INSTANCE = new ContestsPostLockQuery$JoinedContestPaginated$Companion$invoke$1$pageInfo$1();

    ContestsPostLockQuery$JoinedContestPaginated$Companion$invoke$1$pageInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestsPostLockQuery.PageInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestsPostLockQuery.PageInfo.Companion.invoke(removecancellable);
    }
}
