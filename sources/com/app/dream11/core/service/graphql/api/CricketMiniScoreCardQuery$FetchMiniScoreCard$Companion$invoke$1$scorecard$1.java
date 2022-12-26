package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CricketMiniScoreCardQuery$FetchMiniScoreCard$Companion$invoke$1$scorecard$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CricketMiniScoreCardQuery.Scorecard> {
    public static final CricketMiniScoreCardQuery$FetchMiniScoreCard$Companion$invoke$1$scorecard$1 INSTANCE = new CricketMiniScoreCardQuery$FetchMiniScoreCard$Companion$invoke$1$scorecard$1();

    CricketMiniScoreCardQuery$FetchMiniScoreCard$Companion$invoke$1$scorecard$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CricketMiniScoreCardQuery.Scorecard invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CricketMiniScoreCardQuery.Scorecard.Companion.invoke(removecancellable);
    }
}
