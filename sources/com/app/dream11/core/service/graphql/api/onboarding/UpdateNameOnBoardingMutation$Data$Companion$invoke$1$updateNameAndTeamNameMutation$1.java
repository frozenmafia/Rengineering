package com.app.dream11.core.service.graphql.api.onboarding;

import com.app.dream11.core.service.graphql.api.onboarding.UpdateNameOnBoardingMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UpdateNameOnBoardingMutation$Data$Companion$invoke$1$updateNameAndTeamNameMutation$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UpdateNameOnBoardingMutation.UpdateNameAndTeamNameMutation> {
    public static final UpdateNameOnBoardingMutation$Data$Companion$invoke$1$updateNameAndTeamNameMutation$1 INSTANCE = new UpdateNameOnBoardingMutation$Data$Companion$invoke$1$updateNameAndTeamNameMutation$1();

    UpdateNameOnBoardingMutation$Data$Companion$invoke$1$updateNameAndTeamNameMutation$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UpdateNameOnBoardingMutation.UpdateNameAndTeamNameMutation invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UpdateNameOnBoardingMutation.UpdateNameAndTeamNameMutation.Companion.invoke(removecancellable);
    }
}
