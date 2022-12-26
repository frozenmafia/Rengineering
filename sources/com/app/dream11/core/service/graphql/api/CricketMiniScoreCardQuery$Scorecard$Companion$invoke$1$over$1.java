package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CricketMiniScoreCardQuery$Scorecard$Companion$invoke$1$over$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CricketMiniScoreCardQuery.Over> {
    public static final CricketMiniScoreCardQuery$Scorecard$Companion$invoke$1$over$1 INSTANCE = new CricketMiniScoreCardQuery$Scorecard$Companion$invoke$1$over$1();

    CricketMiniScoreCardQuery$Scorecard$Companion$invoke$1$over$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CricketMiniScoreCardQuery.Over invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CricketMiniScoreCardQuery.Over.Companion.invoke(removecancellable);
    }
}
