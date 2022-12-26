package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.ContestTeams;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestTeams$Companion$invoke$1$winningAmount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestTeams.WinningAmount> {
    public static final ContestTeams$Companion$invoke$1$winningAmount$1 INSTANCE = new ContestTeams$Companion$invoke$1$winningAmount$1();

    ContestTeams$Companion$invoke$1$winningAmount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestTeams.WinningAmount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestTeams.WinningAmount.Companion.invoke(removecancellable);
    }
}
