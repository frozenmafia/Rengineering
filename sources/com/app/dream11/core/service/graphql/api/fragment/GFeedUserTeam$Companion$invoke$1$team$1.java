package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GFeedUserTeam;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GFeedUserTeam$Companion$invoke$1$team$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedUserTeam.Team> {
    public static final GFeedUserTeam$Companion$invoke$1$team$1 INSTANCE = new GFeedUserTeam$Companion$invoke$1$team$1();

    GFeedUserTeam$Companion$invoke$1$team$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedUserTeam.Team invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedUserTeam.Team.Companion.invoke(removecancellable);
    }
}
