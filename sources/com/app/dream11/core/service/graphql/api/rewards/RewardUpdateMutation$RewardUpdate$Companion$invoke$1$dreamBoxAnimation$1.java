package com.app.dream11.core.service.graphql.api.rewards;

import com.app.dream11.core.service.graphql.api.rewards.RewardUpdateMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RewardUpdateMutation$RewardUpdate$Companion$invoke$1$dreamBoxAnimation$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, RewardUpdateMutation.DreamBoxAnimation> {
    public static final RewardUpdateMutation$RewardUpdate$Companion$invoke$1$dreamBoxAnimation$1 INSTANCE = new RewardUpdateMutation$RewardUpdate$Companion$invoke$1$dreamBoxAnimation$1();

    RewardUpdateMutation$RewardUpdate$Companion$invoke$1$dreamBoxAnimation$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final RewardUpdateMutation.DreamBoxAnimation invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return RewardUpdateMutation.DreamBoxAnimation.Companion.invoke(removecancellable);
    }
}
