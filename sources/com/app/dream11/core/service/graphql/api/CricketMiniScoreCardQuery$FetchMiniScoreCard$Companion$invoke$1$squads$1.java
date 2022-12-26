package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CricketMiniScoreCardQuery$FetchMiniScoreCard$Companion$invoke$1$squads$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, CricketMiniScoreCardQuery.Squad> {
    public static final CricketMiniScoreCardQuery$FetchMiniScoreCard$Companion$invoke$1$squads$1 INSTANCE = new CricketMiniScoreCardQuery$FetchMiniScoreCard$Companion$invoke$1$squads$1();

    CricketMiniScoreCardQuery$FetchMiniScoreCard$Companion$invoke$1$squads$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery$FetchMiniScoreCard$Companion$invoke$1$squads$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CricketMiniScoreCardQuery.Squad> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final CricketMiniScoreCardQuery.Squad invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return CricketMiniScoreCardQuery.Squad.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final CricketMiniScoreCardQuery.Squad invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (CricketMiniScoreCardQuery.Squad) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
