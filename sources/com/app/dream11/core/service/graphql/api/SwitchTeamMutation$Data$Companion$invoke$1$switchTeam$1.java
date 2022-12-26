package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.SwitchTeamMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SwitchTeamMutation$Data$Companion$invoke$1$switchTeam$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, SwitchTeamMutation.SwitchTeam> {
    public static final SwitchTeamMutation$Data$Companion$invoke$1$switchTeam$1 INSTANCE = new SwitchTeamMutation$Data$Companion$invoke$1$switchTeam$1();

    SwitchTeamMutation$Data$Companion$invoke$1$switchTeam$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final SwitchTeamMutation.SwitchTeam invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return SwitchTeamMutation.SwitchTeam.Companion.invoke(removecancellable);
    }
}
