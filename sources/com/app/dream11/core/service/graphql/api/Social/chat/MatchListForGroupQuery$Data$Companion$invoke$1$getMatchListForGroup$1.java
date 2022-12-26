package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.MatchListForGroupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchListForGroupQuery$Data$Companion$invoke$1$getMatchListForGroup$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchListForGroupQuery.GetMatchListForGroup> {
    public static final MatchListForGroupQuery$Data$Companion$invoke$1$getMatchListForGroup$1 INSTANCE = new MatchListForGroupQuery$Data$Companion$invoke$1$getMatchListForGroup$1();

    MatchListForGroupQuery$Data$Companion$invoke$1$getMatchListForGroup$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchListForGroupQuery.GetMatchListForGroup invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchListForGroupQuery.GetMatchListForGroup.Companion.invoke(removecancellable);
    }
}
