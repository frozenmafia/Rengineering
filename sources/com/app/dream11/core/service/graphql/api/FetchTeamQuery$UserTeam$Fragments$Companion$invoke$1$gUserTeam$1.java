package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.GUserTeam;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FetchTeamQuery$UserTeam$Fragments$Companion$invoke$1$gUserTeam$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GUserTeam> {
    public static final FetchTeamQuery$UserTeam$Fragments$Companion$invoke$1$gUserTeam$1 INSTANCE = new FetchTeamQuery$UserTeam$Fragments$Companion$invoke$1$gUserTeam$1();

    FetchTeamQuery$UserTeam$Fragments$Companion$invoke$1$gUserTeam$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GUserTeam invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GUserTeam.Companion.invoke(removecancellable);
    }
}
