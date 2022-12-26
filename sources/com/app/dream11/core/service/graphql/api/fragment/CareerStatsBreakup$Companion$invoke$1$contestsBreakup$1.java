package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.CareerStatsBreakup;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CareerStatsBreakup$Companion$invoke$1$contestsBreakup$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CareerStatsBreakup.ContestsBreakup> {
    public static final CareerStatsBreakup$Companion$invoke$1$contestsBreakup$1 INSTANCE = new CareerStatsBreakup$Companion$invoke$1$contestsBreakup$1();

    CareerStatsBreakup$Companion$invoke$1$contestsBreakup$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CareerStatsBreakup.ContestsBreakup invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CareerStatsBreakup.ContestsBreakup.Companion.invoke(removecancellable);
    }
}
