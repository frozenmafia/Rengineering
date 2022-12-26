package com.app.dream11.core.service.graphql.api.rewards;

import com.app.dream11.core.service.graphql.api.rewards.DreamBoxAnimShownMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DreamBoxAnimShownMutation$Data$Companion$invoke$1$updateMysteryBoxStatus$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DreamBoxAnimShownMutation.UpdateMysteryBoxStatus> {
    public static final DreamBoxAnimShownMutation$Data$Companion$invoke$1$updateMysteryBoxStatus$1 INSTANCE = new DreamBoxAnimShownMutation$Data$Companion$invoke$1$updateMysteryBoxStatus$1();

    DreamBoxAnimShownMutation$Data$Companion$invoke$1$updateMysteryBoxStatus$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final DreamBoxAnimShownMutation.UpdateMysteryBoxStatus invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return DreamBoxAnimShownMutation.UpdateMysteryBoxStatus.Companion.invoke(removecancellable);
    }
}
