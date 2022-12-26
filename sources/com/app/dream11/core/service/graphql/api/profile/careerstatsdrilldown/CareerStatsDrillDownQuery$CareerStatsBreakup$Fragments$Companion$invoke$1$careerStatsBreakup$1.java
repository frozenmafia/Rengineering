package com.app.dream11.core.service.graphql.api.profile.careerstatsdrilldown;

import com.app.dream11.core.service.graphql.api.fragment.CareerStatsBreakup;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CareerStatsDrillDownQuery$CareerStatsBreakup$Fragments$Companion$invoke$1$careerStatsBreakup$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CareerStatsBreakup> {
    public static final CareerStatsDrillDownQuery$CareerStatsBreakup$Fragments$Companion$invoke$1$careerStatsBreakup$1 INSTANCE = new CareerStatsDrillDownQuery$CareerStatsBreakup$Fragments$Companion$invoke$1$careerStatsBreakup$1();

    CareerStatsDrillDownQuery$CareerStatsBreakup$Fragments$Companion$invoke$1$careerStatsBreakup$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CareerStatsBreakup invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CareerStatsBreakup.Companion.invoke(removecancellable);
    }
}
