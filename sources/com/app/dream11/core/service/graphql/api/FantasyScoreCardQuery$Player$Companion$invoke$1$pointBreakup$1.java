package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FantasyScoreCardQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FantasyScoreCardQuery$Player$Companion$invoke$1$pointBreakup$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, List<? extends FantasyScoreCardQuery.PointBreakup>> {
    public static final FantasyScoreCardQuery$Player$Companion$invoke$1$pointBreakup$1 INSTANCE = new FantasyScoreCardQuery$Player$Companion$invoke$1$pointBreakup$1();

    FantasyScoreCardQuery$Player$Companion$invoke$1$pointBreakup$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.FantasyScoreCardQuery$Player$Companion$invoke$1$pointBreakup$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, FantasyScoreCardQuery.PointBreakup> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.app.dream11.core.service.graphql.api.FantasyScoreCardQuery$Player$Companion$invoke$1$pointBreakup$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02351 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FantasyScoreCardQuery.PointBreakup> {
            public static final C02351 INSTANCE = new C02351();

            C02351() {
                super(1);
            }

            @Override // o.Styleable.ChangeBounds
            public final FantasyScoreCardQuery.PointBreakup invoke(removeCancellable removecancellable) {
                runAnimators.ag$a(removecancellable, "reader");
                return FantasyScoreCardQuery.PointBreakup.Companion.invoke(removecancellable);
            }
        }

        @Override // o.Styleable.ChangeBounds
        public final FantasyScoreCardQuery.PointBreakup invoke(removeCancellable.values valuesVar) {
            runAnimators.ag$a(valuesVar, "reader");
            return (FantasyScoreCardQuery.PointBreakup) valuesVar.ag$a(C02351.INSTANCE);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final List<FantasyScoreCardQuery.PointBreakup> invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        List<FantasyScoreCardQuery.PointBreakup> values = valuesVar.values(AnonymousClass1.INSTANCE);
        ArrayList arrayList = new ArrayList(runAnimators.ag$a(values, "<this>"));
        for (FantasyScoreCardQuery.PointBreakup pointBreakup : values) {
            runAnimators.toString(pointBreakup);
            arrayList.add(pointBreakup);
        }
        return arrayList;
    }
}
