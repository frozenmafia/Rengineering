package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GrantWatchLiveSubscriptionMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GrantWatchLiveSubscriptionMutation$Data$Companion$invoke$1$grantSubscription$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GrantWatchLiveSubscriptionMutation.GrantSubscription> {
    public static final GrantWatchLiveSubscriptionMutation$Data$Companion$invoke$1$grantSubscription$1 INSTANCE = new GrantWatchLiveSubscriptionMutation$Data$Companion$invoke$1$grantSubscription$1();

    GrantWatchLiveSubscriptionMutation$Data$Companion$invoke$1$grantSubscription$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GrantWatchLiveSubscriptionMutation.GrantSubscription invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GrantWatchLiveSubscriptionMutation.GrantSubscription.Companion.invoke(removecancellable);
    }
}
