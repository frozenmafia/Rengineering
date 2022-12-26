package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestsPostLockQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestsPostLockQuery$MyTeam$Companion$invoke$1$winningAmount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestsPostLockQuery.WinningAmount> {
    public static final ContestsPostLockQuery$MyTeam$Companion$invoke$1$winningAmount$1 INSTANCE = new ContestsPostLockQuery$MyTeam$Companion$invoke$1$winningAmount$1();

    ContestsPostLockQuery$MyTeam$Companion$invoke$1$winningAmount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestsPostLockQuery.WinningAmount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestsPostLockQuery.WinningAmount.Companion.invoke(removecancellable);
    }
}
