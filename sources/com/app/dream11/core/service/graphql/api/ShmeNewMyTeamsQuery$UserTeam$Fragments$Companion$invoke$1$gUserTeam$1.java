package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.GUserTeam;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes2.dex */
final class ShmeNewMyTeamsQuery$UserTeam$Fragments$Companion$invoke$1$gUserTeam$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GUserTeam> {
    public static final ShmeNewMyTeamsQuery$UserTeam$Fragments$Companion$invoke$1$gUserTeam$1 INSTANCE = new ShmeNewMyTeamsQuery$UserTeam$Fragments$Companion$invoke$1$gUserTeam$1();

    ShmeNewMyTeamsQuery$UserTeam$Fragments$Companion$invoke$1$gUserTeam$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GUserTeam invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GUserTeam.Companion.invoke(removecancellable);
    }
}
