package com.app.dream11.core.service.graphql.bayonet;

import com.app.dream11.core.service.graphql.bayonet.OnLeaderBoardEventSubscription;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OnLeaderBoardEventSubscription$Data$Companion$invoke$1$leaderBoard$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, OnLeaderBoardEventSubscription.LeaderBoard> {
    public static final OnLeaderBoardEventSubscription$Data$Companion$invoke$1$leaderBoard$1 INSTANCE = new OnLeaderBoardEventSubscription$Data$Companion$invoke$1$leaderBoard$1();

    OnLeaderBoardEventSubscription$Data$Companion$invoke$1$leaderBoard$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final OnLeaderBoardEventSubscription.LeaderBoard invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return OnLeaderBoardEventSubscription.LeaderBoard.Companion.invoke(removecancellable);
    }
}
