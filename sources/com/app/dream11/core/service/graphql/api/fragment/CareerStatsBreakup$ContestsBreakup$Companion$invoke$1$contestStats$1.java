package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.CareerStatsBreakup;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CareerStatsBreakup$ContestsBreakup$Companion$invoke$1$contestStats$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, CareerStatsBreakup.ContestStat> {
    public static final CareerStatsBreakup$ContestsBreakup$Companion$invoke$1$contestStats$1 INSTANCE = new CareerStatsBreakup$ContestsBreakup$Companion$invoke$1$contestStats$1();

    CareerStatsBreakup$ContestsBreakup$Companion$invoke$1$contestStats$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.CareerStatsBreakup$ContestsBreakup$Companion$invoke$1$contestStats$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CareerStatsBreakup.ContestStat> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final CareerStatsBreakup.ContestStat invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return CareerStatsBreakup.ContestStat.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final CareerStatsBreakup.ContestStat invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (CareerStatsBreakup.ContestStat) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
