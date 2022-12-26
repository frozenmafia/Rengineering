package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.fragment.GRecentPerformance;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CareerStatsMyProfileQuery$RecentMatches$Fragments$Companion$invoke$1$gRecentPerformance$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GRecentPerformance> {
    public static final CareerStatsMyProfileQuery$RecentMatches$Fragments$Companion$invoke$1$gRecentPerformance$1 INSTANCE = new CareerStatsMyProfileQuery$RecentMatches$Fragments$Companion$invoke$1$gRecentPerformance$1();

    CareerStatsMyProfileQuery$RecentMatches$Fragments$Companion$invoke$1$gRecentPerformance$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GRecentPerformance invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GRecentPerformance.Companion.invoke(removecancellable);
    }
}
