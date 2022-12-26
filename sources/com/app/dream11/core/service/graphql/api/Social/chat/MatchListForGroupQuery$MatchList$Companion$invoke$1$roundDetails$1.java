package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.MatchListForGroupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchListForGroupQuery$MatchList$Companion$invoke$1$roundDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchListForGroupQuery.RoundDetails> {
    public static final MatchListForGroupQuery$MatchList$Companion$invoke$1$roundDetails$1 INSTANCE = new MatchListForGroupQuery$MatchList$Companion$invoke$1$roundDetails$1();

    MatchListForGroupQuery$MatchList$Companion$invoke$1$roundDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchListForGroupQuery.RoundDetails invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchListForGroupQuery.RoundDetails.Companion.invoke(removecancellable);
    }
}
