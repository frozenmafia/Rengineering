package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CricketMiniScoreCardQuery$Scorecard$Companion$invoke$1$batsmen$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, CricketMiniScoreCardQuery.Batsmen> {
    public static final CricketMiniScoreCardQuery$Scorecard$Companion$invoke$1$batsmen$1 INSTANCE = new CricketMiniScoreCardQuery$Scorecard$Companion$invoke$1$batsmen$1();

    CricketMiniScoreCardQuery$Scorecard$Companion$invoke$1$batsmen$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery$Scorecard$Companion$invoke$1$batsmen$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CricketMiniScoreCardQuery.Batsmen> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final CricketMiniScoreCardQuery.Batsmen invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return CricketMiniScoreCardQuery.Batsmen.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final CricketMiniScoreCardQuery.Batsmen invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (CricketMiniScoreCardQuery.Batsmen) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
