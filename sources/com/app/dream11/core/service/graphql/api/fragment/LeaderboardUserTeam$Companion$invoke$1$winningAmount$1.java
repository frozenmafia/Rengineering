package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.LeaderboardUserTeam;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LeaderboardUserTeam$Companion$invoke$1$winningAmount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, LeaderboardUserTeam.WinningAmount> {
    public static final LeaderboardUserTeam$Companion$invoke$1$winningAmount$1 INSTANCE = new LeaderboardUserTeam$Companion$invoke$1$winningAmount$1();

    LeaderboardUserTeam$Companion$invoke$1$winningAmount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final LeaderboardUserTeam.WinningAmount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return LeaderboardUserTeam.WinningAmount.Companion.invoke(removecancellable);
    }
}
