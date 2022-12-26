package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ClaimRewardMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ClaimRewardMutation$Data$Companion$invoke$1$claimLoyaltyReward$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ClaimRewardMutation.ClaimLoyaltyReward> {
    public static final ClaimRewardMutation$Data$Companion$invoke$1$claimLoyaltyReward$1 INSTANCE = new ClaimRewardMutation$Data$Companion$invoke$1$claimLoyaltyReward$1();

    ClaimRewardMutation$Data$Companion$invoke$1$claimLoyaltyReward$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ClaimRewardMutation.ClaimLoyaltyReward invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ClaimRewardMutation.ClaimLoyaltyReward.Companion.invoke(removecancellable);
    }
}
