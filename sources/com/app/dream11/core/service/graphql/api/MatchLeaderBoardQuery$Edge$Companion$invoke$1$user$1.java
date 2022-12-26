package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MatchLeaderBoardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchLeaderBoardQuery$Edge$Companion$invoke$1$user$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchLeaderBoardQuery.User> {
    public static final MatchLeaderBoardQuery$Edge$Companion$invoke$1$user$1 INSTANCE = new MatchLeaderBoardQuery$Edge$Companion$invoke$1$user$1();

    MatchLeaderBoardQuery$Edge$Companion$invoke$1$user$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchLeaderBoardQuery.User invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchLeaderBoardQuery.User.Companion.invoke(removecancellable);
    }
}
