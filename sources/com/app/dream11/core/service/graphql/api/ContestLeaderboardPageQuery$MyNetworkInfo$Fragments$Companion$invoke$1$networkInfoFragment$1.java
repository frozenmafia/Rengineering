package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.NetworkInfoFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestLeaderboardPageQuery$MyNetworkInfo$Fragments$Companion$invoke$1$networkInfoFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NetworkInfoFragment> {
    public static final ContestLeaderboardPageQuery$MyNetworkInfo$Fragments$Companion$invoke$1$networkInfoFragment$1 INSTANCE = new ContestLeaderboardPageQuery$MyNetworkInfo$Fragments$Companion$invoke$1$networkInfoFragment$1();

    ContestLeaderboardPageQuery$MyNetworkInfo$Fragments$Companion$invoke$1$networkInfoFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final NetworkInfoFragment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return NetworkInfoFragment.Companion.invoke(removecancellable);
    }
}
