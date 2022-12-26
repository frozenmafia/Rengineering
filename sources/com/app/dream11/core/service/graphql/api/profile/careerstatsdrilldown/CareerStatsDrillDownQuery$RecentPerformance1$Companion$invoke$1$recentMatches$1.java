package com.app.dream11.core.service.graphql.api.profile.careerstatsdrilldown;

import com.app.dream11.core.service.graphql.api.profile.careerstatsdrilldown.CareerStatsDrillDownQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CareerStatsDrillDownQuery$RecentPerformance1$Companion$invoke$1$recentMatches$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, CareerStatsDrillDownQuery.RecentMatches1> {
    public static final CareerStatsDrillDownQuery$RecentPerformance1$Companion$invoke$1$recentMatches$1 INSTANCE = new CareerStatsDrillDownQuery$RecentPerformance1$Companion$invoke$1$recentMatches$1();

    CareerStatsDrillDownQuery$RecentPerformance1$Companion$invoke$1$recentMatches$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final CareerStatsDrillDownQuery.RecentMatches1 invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return CareerStatsDrillDownQuery.RecentMatches1.Companion.invoke(removecancellable);
    }
}
