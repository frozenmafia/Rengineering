package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MatchLeaderBoardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchLeaderBoardQuery$Data$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchLeaderBoardQuery.Match> {
    public static final MatchLeaderBoardQuery$Data$Companion$invoke$1$match$1 INSTANCE = new MatchLeaderBoardQuery$Data$Companion$invoke$1$match$1();

    MatchLeaderBoardQuery$Data$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchLeaderBoardQuery.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchLeaderBoardQuery.Match.Companion.invoke(removecancellable);
    }
}
