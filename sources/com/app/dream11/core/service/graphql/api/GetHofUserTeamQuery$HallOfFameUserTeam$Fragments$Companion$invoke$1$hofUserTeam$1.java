package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.HofUserTeam;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetHofUserTeamQuery$HallOfFameUserTeam$Fragments$Companion$invoke$1$hofUserTeam$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HofUserTeam> {
    public static final GetHofUserTeamQuery$HallOfFameUserTeam$Fragments$Companion$invoke$1$hofUserTeam$1 INSTANCE = new GetHofUserTeamQuery$HallOfFameUserTeam$Fragments$Companion$invoke$1$hofUserTeam$1();

    GetHofUserTeamQuery$HallOfFameUserTeam$Fragments$Companion$invoke$1$hofUserTeam$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HofUserTeam invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HofUserTeam.Companion.invoke(removecancellable);
    }
}
