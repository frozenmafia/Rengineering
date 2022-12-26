package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.TeamCompareMeta;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TeamCompareMeta$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TeamCompareMeta.User> {
    public static final TeamCompareMeta$Companion$invoke$1$user$1 INSTANCE = new TeamCompareMeta$Companion$invoke$1$user$1();

    TeamCompareMeta$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final TeamCompareMeta.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return TeamCompareMeta.User.Companion.invoke(removecancellable);
    }
}
