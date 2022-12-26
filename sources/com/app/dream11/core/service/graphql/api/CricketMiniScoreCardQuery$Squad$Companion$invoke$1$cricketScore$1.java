package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CricketMiniScoreCardQuery$Squad$Companion$invoke$1$cricketScore$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, CricketMiniScoreCardQuery.CricketScore> {
    public static final CricketMiniScoreCardQuery$Squad$Companion$invoke$1$cricketScore$1 INSTANCE = new CricketMiniScoreCardQuery$Squad$Companion$invoke$1$cricketScore$1();

    CricketMiniScoreCardQuery$Squad$Companion$invoke$1$cricketScore$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.CricketMiniScoreCardQuery$Squad$Companion$invoke$1$cricketScore$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CricketMiniScoreCardQuery.CricketScore> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final CricketMiniScoreCardQuery.CricketScore invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return CricketMiniScoreCardQuery.CricketScore.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final CricketMiniScoreCardQuery.CricketScore invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (CricketMiniScoreCardQuery.CricketScore) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
