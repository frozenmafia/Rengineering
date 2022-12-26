package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestsPostLockQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestsPostLockQuery$AsMatch$Companion$invoke$1$joinedContestPaginated$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestsPostLockQuery.JoinedContestPaginated> {
    public static final ContestsPostLockQuery$AsMatch$Companion$invoke$1$joinedContestPaginated$1 INSTANCE = new ContestsPostLockQuery$AsMatch$Companion$invoke$1$joinedContestPaginated$1();

    ContestsPostLockQuery$AsMatch$Companion$invoke$1$joinedContestPaginated$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestsPostLockQuery.JoinedContestPaginated invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestsPostLockQuery.JoinedContestPaginated.Companion.invoke(removecancellable);
    }
}
