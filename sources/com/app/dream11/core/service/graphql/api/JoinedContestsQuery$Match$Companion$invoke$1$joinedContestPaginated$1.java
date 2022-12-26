package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.JoinedContestsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class JoinedContestsQuery$Match$Companion$invoke$1$joinedContestPaginated$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, JoinedContestsQuery.JoinedContestPaginated> {
    public static final JoinedContestsQuery$Match$Companion$invoke$1$joinedContestPaginated$1 INSTANCE = new JoinedContestsQuery$Match$Companion$invoke$1$joinedContestPaginated$1();

    JoinedContestsQuery$Match$Companion$invoke$1$joinedContestPaginated$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final JoinedContestsQuery.JoinedContestPaginated invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return JoinedContestsQuery.JoinedContestPaginated.Companion.invoke(removecancellable);
    }
}
